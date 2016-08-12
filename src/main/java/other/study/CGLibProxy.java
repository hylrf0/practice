package other.study;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by linrufeng on 16/8/12.
 */
public class CGLibProxy implements MethodInterceptor {

  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
      throws Throwable {
    return null;
  }
}
