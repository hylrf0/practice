package other.test;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

import java.net.URL;

/**
 * Created by linrufeng on 2017/7/11.
 */
public class EmailTest {

  public static void main(String[] args) {
    try {
      // Create the attachment
      EmailAttachment attachment = new EmailAttachment();
      attachment.setURL(new URL("http://localhost:8090/api/third/exportChargeOrderInfo?accountDate=2017-7-3"));
      attachment.setDisposition(EmailAttachment.ATTACHMENT);
      attachment.setDescription("对账文件");
      attachment.setName("对账文件");

      // Create the email message
      MultiPartEmail email = new MultiPartEmail();
      email.setHostName("smtp.mingbikes.com");
      email.setSmtpPort(465);
      email.setAuthenticator(new DefaultAuthenticator("linrufeng@mingbikes.com", "4225137L!n"));
      email.setSSLOnConnect(true);
      email.addTo("linrufeng@mingbikes.com");
      email.setFrom("linrufeng@mingbikes.com");
      email.setSubject("对账文件");
      email.setMsg("附件是对账文件。（本邮件是程序自动下发的，请勿回复！）");

      // add the attachment
      email.attach(attachment);

      // send the email
      email.send();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
