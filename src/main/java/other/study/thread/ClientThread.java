package other.study.thread;

/**
 * Created by linrufeng on 16/8/15.
 */
public class ClientThread extends Thread {

  private Sequence sequence;

  public ClientThread(Sequence sequence) {
    this.sequence = sequence;
  }

  public void run() {
    for (int i=0; i<3; i++) {
      System.out.println(Thread.currentThread().getName() + " =>" + sequence.getNumber());
    }
  }
}
