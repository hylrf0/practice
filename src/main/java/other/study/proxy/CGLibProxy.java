package other.study.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by linrufeng on 16/8/12.
 */
public class CGLibProxy implements MethodInterceptor {

  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
      throws Throwable {
    before();
    Object result = methodProxy.invokeSuper(o, objects);
    after();
    return result;
  }

  private void after() {
    System.out.println("after");
  }

  private void before() {
    System.out.println("before");
  }

  public <T> T getProxy(Class<T> cls) {
    return (T) Enhancer.create(cls, this);
  }
}
