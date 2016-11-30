package other.study.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by linrufeng on 16/8/12.
 */
public class DynamicProxy implements InvocationHandler {

  private Object target;

  public DynamicProxy(Object target) {
    this.target = target;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Long time = before();
    Object result = method.invoke(target, args);
    after(time);
    return result;
  }

  private Long before() {
    return System.currentTimeMillis();
  }

  private void after(Long time) {
    System.out.println("耗时:" + (System.currentTimeMillis() - time));
  }

  @SuppressWarnings("unchecked")
  public <T> T getProxy() {
      return (T) Proxy.newProxyInstance(
          target.getClass().getClassLoader(),
          target.getClass().getInterfaces(),
          this
    );
  }
}
