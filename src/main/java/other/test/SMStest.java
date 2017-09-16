package other.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by linrufeng on 2017/8/22.
 */
public class SMStest {

    public static void main(String[] args) {
        try {
            String postData = "sname=DL-zhaojb12&spwd=abobo123456&scorpid=&sprdid=1012818&sdst=15868130504&smsg="+java.net.URLEncoder.encode("44566","utf-8");
            //out.println(PostData);
            String postUrl = "http://cf.51welink.com/submitdata/Service.asmx/g_Submit";
            //发送POST请求
            URL url = new URL(postUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setUseCaches(false);
            conn.setDoOutput(true);

            conn.setRequestProperty("Content-Length", "" + postData.length());
            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            out.write(postData);
            out.flush();
            out.close();

            //获取响应状态
            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                System.out.println("connect failed!");
//                return "";
            }
            //获取响应内容体
            String line, result = "";
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            while ((line = in.readLine()) != null) {
                result += line + "\n";
            }
            in.close();
//            return result;
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
//        return "";
    }
}
