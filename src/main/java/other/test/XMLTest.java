package other.test;

import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * Created by linrufeng on 2017/8/22.
 */
public class XMLTest {

    public static void main(String[] args) {
        try {
            String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                    "<CSubmitState xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns=\"http://tempuri.org/\">\n" +
                    "  <State>0</State>\n" +
                    "  <MsgID>1708221914360599812</MsgID>\n" +
                    "  <MsgState>提交成功</MsgState>\n" +
                    "  <Reserve>1</Reserve>\n" +
                    "</CSubmitState>";

            String xml1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<RESULT>\n" +
                    "<VALUE>\n" +
                    "    <NO>A1234</NO>\n" +
                    "    <ADDR>四川省XX县XX镇XX路X段XX号</ADDR>\n" +
                    "</VALUE>\n" +
                    "<VALUE>\n" +
                    "    <NO>B1234</NO>\n" +
                    "    <ADDR>四川省XX市XX乡XX村XX组</ADDR>\n" +
                    "</VALUE>\n" +
                    "</RESULT>";


            SAXReader sax = new SAXReader();
            Document document = sax.read(new ByteArrayInputStream(xml.getBytes("UTF-8")));
            Element element = document.getRootElement();
            for (Iterator i = element.elementIterator(); i.hasNext();) {
                Element child = (Element)i.next();
                System.out.println(child.getName());
                System.out.println(child.getStringValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
