package other.test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.Data;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Administrator on 2017/3/14 0014.
 */
public class Test {
    public static void main(String[] args) {
        encode(1158567);
//        overflowNum();
//        decode(new StringBuffer("1094432419"));
//        System.out.println((1015654903 ^ 1136593273) / (float)397);
//        Calendar now =Calendar.getInstance();
//        now.setTime(new Date());
//        now.set(Calendar.DATE,now.get(Calendar.DATE)+30);
//        System.out.println(now.getTime());
//        Random random = new Random();
//        for (int i=0 ; i<1000 ; i++) {
//            splitStrings(random.nextInt(1050));
//        }
//        Random random = new Random();
//        while (true) {
//            String s = "asdf" + random.nextInt(99999999);
//            s.intern();
//            System.out.println(s);
//        }

//        Tttt tttt = new Tttt<String, Integer>("abc", 123);
//        System.out.println(tttt.getA());
//        System.out.println(tttt.getB());

//        String a = "【黄财祯】【15770800094】【ios-】【2103502865】【已关锁，系统提示还在骑行】【2017-06-17 21:52:01】【广东省广州市增城市府佑西路,广州市增城区荔城街荔星大道299号】";
//        System.out.println(a.length());
//        String b = "您的故障上报编号【1572709】已受理，多出的骑行费用小鸣单车会返还，请放心使用。如果小鸣APP还在计费，请清理手机后台运行程序。";
//        System.out.println(b.length());
    }


    public static StringBuffer encode(Integer id) {
        Integer uid = (id * 397) ^ 1136593273;
        System.out.println(uid);
        StringBuffer sb = new StringBuffer(uid.toString());
//        for (int i = 1, j = sb.length() - 1; i < sb.length() >>> 1; i++, j--) {
//            char temp = sb.charAt(i);
//            sb.setCharAt(i, sb.charAt(j));
//            sb.setCharAt(j, temp);
//        }
        return sb;
    }

    public static Float decode(StringBuffer sb) {
//        for (int i = 1, j = sb.length() - 1; i < sb.length() >>> 1; i++, j--) {
//            char temp = sb.charAt(i);
//            sb.setCharAt(i, sb.charAt(j));
//            sb.setCharAt(j, temp);
//        }
        Float uid = (Integer.parseInt(sb.toString()) ^ 1136593273) / (float)397;
        System.out.println(uid);
        return uid;
    }

    public static void overflowNum() {
        Integer hitCount = 0;
        Integer normalCount = 0;
        StringBuffer s = new StringBuffer("(");
        for (int i=1; i<=3500000; i++) {
            Integer uid = (i * 397) ^ 1136593273;
            StringBuffer sb = new StringBuffer(uid.toString());
            if (sb.toString().length() < 8 && Integer.parseInt(sb.toString()) > 0 && Integer.parseInt(sb.toString()) < 3500000) {
                s.append(sb.toString()).append(",");
            }
        }
        s.append(")");
        System.out.println(s.toString());
    }

    public static void splitStrings(Integer credit) {
        Long start = System.nanoTime();
        //等级：等级名称：等级分值：勋章图片：透支额度
        String value = "[{\"level\":0,\"levelName\":\"小黑屋\",\"minCredit\":0,\"maxCredit\":80,\"picUrl\":\"0.jpg\",\"overdraft\":0},{\"level\":1,\"levelName\":\"VIP1\",\"minCredit\":80,\"maxCredit\":120,\"picUrl\":\"1.jpg\",\"overdraft\":20},{\"level\":2,\"levelName\":\"VIP2\",\"minCredit\":120,\"maxCredit\":200,\"picUrl\":\"2.jpg\",\"overdraft\":25},{\"level\":3,\"levelName\":\"VIP3\",\"minCredit\":200,\"maxCredit\":440,\"picUrl\":\"3.jpg\",\"overdraft\":30},{\"level\":4,\"levelName\":\"VIP4\",\"minCredit\":440,\"maxCredit\":1000,\"picUrl\":\"4.jpg\",\"overdraft\":35},{\"level\":5,\"levelName\":\"VIP5\",\"minCredit\":1000,\"maxCredit\":2147483647,\"picUrl\":\"5.jpg\",\"overdraft\":40}]";
        Gson gson = new Gson();
        List<CreditLevel> creditLevelList = gson.fromJson(value, new TypeToken<List<CreditLevel>>(){}.getType());
        for (CreditLevel creditLevel : creditLevelList) {
            if (credit >= creditLevel.getMinCredit() && credit < creditLevel.getMaxCredit()) {
                System.out.println("分数：" + credit + "，等级：" + creditLevel.getLevelName());
            } else {
                continue;
            }
        }
        System.out.println("耗时：" + (System.nanoTime() - start) / (float)100000000);
    }

    @Data
    private class CreditLevel {

        private Integer level;

        private String levelName;

        private Integer minCredit;

        private Integer maxCredit;

        private String picUrl;

        private BigDecimal overdraft;
    }
}

@Data
class Tttt<A, B>{
    private A a;

    private B b;

    public Tttt(A a, B b) {
        this.a = a;
        this.b = b;
    }
}