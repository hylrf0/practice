package other.test;

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/14 0014.
 */
public class Test {

    public static void main(String[] args) {
//        encode(1158567);
//        CreditLevel creditLevel = new CreditLevel();
//
//        Test test = new Test();
//        test.t(creditLevel);
//        System.out.println(creditLevel.getLevelName());

        String a = "a";
        String b = new String("a");
        String c = "a";
        System.out.println(a == b);
        System.out.println(a == c);

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

//    public static void splitStrings(Integer credit) {
//        Long start = System.nanoTime();
//        //等级：等级名称：等级分值：勋章图片：透支额度
//        String value = "[{\"level\":0,\"levelName\":\"小黑屋\",\"minCredit\":0,\"maxCredit\":80,\"picUrl\":\"0.jpg\",\"overdraft\":0},{\"level\":1,\"levelName\":\"VIP1\",\"minCredit\":80,\"maxCredit\":120,\"picUrl\":\"1.jpg\",\"overdraft\":20},{\"level\":2,\"levelName\":\"VIP2\",\"minCredit\":120,\"maxCredit\":200,\"picUrl\":\"2.jpg\",\"overdraft\":25},{\"level\":3,\"levelName\":\"VIP3\",\"minCredit\":200,\"maxCredit\":440,\"picUrl\":\"3.jpg\",\"overdraft\":30},{\"level\":4,\"levelName\":\"VIP4\",\"minCredit\":440,\"maxCredit\":1000,\"picUrl\":\"4.jpg\",\"overdraft\":35},{\"level\":5,\"levelName\":\"VIP5\",\"minCredit\":1000,\"maxCredit\":2147483647,\"picUrl\":\"5.jpg\",\"overdraft\":40}]";
//        Gson gson = new Gson();
//        List<CreditLevel> creditLevelList = gson.fromJson(value, new TypeToken<List<CreditLevel>>(){}.getType());
//        for (CreditLevel creditLevel : creditLevelList) {
//            if (credit >= creditLevel.getMinCredit() && credit < creditLevel.getMaxCredit()) {
//                System.out.println("分数：" + credit + "，等级：" + creditLevel.getLevelName());
//            } else {
//                continue;
//            }
//        }
//        System.out.println("耗时：" + (System.nanoTime() - start) / (float)100000000);
//    }

    public void t(CreditLevel creditLevel) {
        creditLevel.setLevelName("通天塔");
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