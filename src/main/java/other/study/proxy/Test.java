package other.study.proxy;

/**
 * Created by linrufeng on 16/8/12.
 */
public class Test {

  public static void main(String[] args) {
    Hello hello = new HelloImpl();

    DynamicProxy dynamicProxy = new DynamicProxy(hello);
    CGLibProxy cgLibProxy = new CGLibProxy();
//    Hello helloProxy = cgLibProxy.getProxy(HelloImpl.class);


    Hello helloProxy = dynamicProxy.getProxy();

    helloProxy.say("Jack");
  }
}
