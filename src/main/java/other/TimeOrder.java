import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TimeOrder {

  public static void main(String[] args) throws ParseException {
    // TODO Auto-generated method stub
    List<String> list =new ArrayList<String>();
    list.add("2014-09-04 10:34:41");
    list.add("2013-08-04 13:42:19");
    list.add("2014-09-04 16:46:49");
    list.add("2010-01-04 12:32:00");
    list.add("2004-04-04 10:34:41");
    list.add("2009-05-14  23:42:19");
    list.add("2014-12-04  06:08:49");
    list.add("2010-01-24  01:32:00");

    List<String> descList=sortListDesc(list);
    System.out.println(descList.toString());
    System.out.println("最近的时间为："+descList.get(0));


  }

  public static List<String> sortListDesc(List<String> list) throws ParseException{
    List<String> retStr=new ArrayList<String>();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Map<Long,String> map = new TreeMap<Long,String>();
    for(int i=0;i<list.size();i++){
      String dateStr = list.get(i);
      map.put(sdf.parse(dateStr).getTime(), dateStr);
    }
    Collection<String> coll=map.values();
    retStr.addAll(coll);
    Collections.reverse(retStr);
    return retStr;
  }

}
