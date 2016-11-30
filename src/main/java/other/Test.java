package other;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by linrufeng on 16/5/9.
 */
public class Test {

  public Object testt(Class<?> cls, Map<String, Object> map, Map<String, Class<?>> classMap) {
    Field[] fields = cls.getDeclaredFields();
    try {
      Object object = cls.newInstance();
      for(String string : map.keySet()) {
        for(Field field : fields) {
          if(string.equals(field.getName())) {
            String methodName = "set" + string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
            Method method = cls.getMethod(methodName, classMap.get(string));
            method.invoke(object, map.get(string));
          }
        }
      }
      return object;
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void main(String[] args) {
    Test test = new Test();
    Map<String, Object> map = new HashMap<>();
    map.put("name", "hehe");
    map.put("id", 11);
    Map<String, Class<?>> classMap = new HashMap<>();
    classMap.put("name", String.class);
    classMap.put("id", int.class);
    User user = (User) test.testt(User.class, map, classMap);
    System.out.println(user.getName());
    System.out.println(user.getId());
  }
}
