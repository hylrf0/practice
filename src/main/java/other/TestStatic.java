package other;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * Created by linrufeng on 16/10/18.
 */
@Data
public class TestStatic {

  private String name;
  public List<innerClass> innerClasses;


  public static class innerClass {
    public String sex = "";
    public void setSex(String sex){
      this.sex=sex;
    }
    public String geSex(){
      return sex;
    }
  }

//  public static void main(String[] args) {
//    TestStatic testStatic = new TestStatic();
//    testStatic.innerClasses = new ArrayList<>();
//    testStatic.innerClasses.add(new innerClass());
//    testStatic.innerClasses.get(0).setSex("xxx");
//    System.out.println(testStatic.innerClasses.get(0).sex);
//  }
}
