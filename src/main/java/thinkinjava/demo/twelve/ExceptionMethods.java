package thinkinjava.demo.twelve;

/**
 * Created by linrufeng on 16/6/16.
 * P257
 * 各种打印异常的办法
 */
public class ExceptionMethods {

  public static void main(String[] args) {
    try{
      throw new Exception("My Exception");
    } catch (Exception e) {
      System.out.println("Caught Exception");
      System.out.println("getMessage():" + e.getMessage());
      System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());
      System.out.println("toString():" + e.toString());
      System.out.println("printStackTrace():");
      e.printStackTrace(System.out);
    }
  }
}
