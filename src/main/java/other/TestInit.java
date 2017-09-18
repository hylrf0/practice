package other;

import lombok.Data;

/**
 * Created by Administrator on 2017/2/21 0021.
 */
@Data
public class TestInit {

    private Integer id;

    public void init() {
        this.id = 20;
    }

    public static void main(String[] args) {
        TestInit testInit = new TestInit();
        System.out.println(testInit.id);
    }
}
