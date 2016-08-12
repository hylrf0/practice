package other.study;

import com.sun.deploy.net.proxy.DynamicProxyManager;

import java.lang.reflect.Proxy;

/**
 * Created by linrufeng on 16/8/12.
 */
public class Test {

  public static void main(String[] args) {
    Hello hello = new HelloImpl();

    DynamicProxy dynamicProxy = new DynamicProxy(hello);


    Hello helloProxy = dynamicProxy.getProxy();

    helloProxy.say("Jack");
  }
}
