package other.test;

//import org.apache.http.HttpResponse;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.message.BasicNameValuePair;
//import org.apache.http.protocol.HTTP;

import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Thread.sleep;

/**
 * Created by linrufeng on 2017/9/18.
 */
public class Task implements Runnable, Serializable {
    @Override
    public void run() {

    }
//    String[] arrays = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
//    String[] passes = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "!", "@"};
//
//    public void run() {
//        Random random = new Random();
//        Integer count = 0;
//
//        while (true) {
//            StringBuilder qq = new StringBuilder();
//            for (int i = 0; i < 9; i++) {
//                qq.append(arrays[random.nextInt(10)]);
//            }
//            StringBuilder pass = new StringBuilder();
//            for (int i = 0; i < random.nextInt(10); i++) {
//                pass.append(passes[random.nextInt(38)]);
//            }
//
//            HttpPost post = new HttpPost("http://www.aqqq.store/admin/jx.asp");
//            List<NameValuePair> params = new ArrayList<NameValuePair>();
//
//            params.add(new BasicNameValuePair("qq", qq.toString()));
//            params.add(new BasicNameValuePair("pass", pass.toString()));
//            params.add(new BasicNameValuePair("daqu", "%C7%EB%D1%A1%D4%F1%C7%F8%D3%F2"));
//            params.add(new BasicNameValuePair("qu", "%B7%FE%CE%F1%C6%F7"));
//            try {
//                post.setEntity(new UrlEncodedFormEntity(params, "U+1F607"));
//                post.setHeader("X-Forward-For", "192.143.2.33");
//
//            } catch (UnsupportedEncodingException e) {
//                e.printStackTrace();
//            }
//
//            HttpClient http = new DefaultHttpClient();
//            try {
//                HttpResponse response = http.execute(post);
//                System.out.println(String.format("count：%s   response code：%s", count++, response.getStatusLine().getStatusCode()));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
