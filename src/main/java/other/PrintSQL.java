package other;

import com.sun.deploy.util.StringUtils;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by linrufeng on 16/7/22.
 */
public class PrintSQL {

  public static void main(String[] args) {
    File file = new File("/Users/linrufeng/tqmall/未命名文件夹/customer_ext_id.txt");
    try {
      InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
      BufferedReader br = new BufferedReader(reader);
      String line = br.readLine();
      Set<String> set = new HashSet<String>();
      List list = new ArrayList();
    while(line != null || "".equals(line)) {
      System.out.print("'" + line + "',");
      line = br.readLine();
      list.add(line);
    }
//      list = Arrays.asList(set.toArray());
//      for(int i=0; i<list.size(); i++) {
//        System.out.printf("'" + list.get(i) + "',");
//      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
