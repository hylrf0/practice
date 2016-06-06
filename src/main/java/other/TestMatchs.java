package other;

public class TestMatchs{
  public static void main(String args[]){
    String Str = new String("1.5868101952E10");
    String pattern = "[1][.][0-9]{10,}[E][1][0-9]";

//    System.out.print("Return Value :" );
//    System.out.println(Str.matches("(.*)Tutorials(.*)"));
//
//    System.out.print("Return Value :" );
//    System.out.println(Str.matches("Tutorials"));
//
    System.out.print("Return Value :" );
    System.out.println(Str.matches(pattern));
  }
}