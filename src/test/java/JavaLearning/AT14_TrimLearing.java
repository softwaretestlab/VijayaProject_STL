package JavaLearning;

import org.junit.Test;

public class AT14_TrimLearing {
    @Test
    public void trimlearn() {

        String MyName = "        TestLab          ";
        System.out.println("MyName is:" + MyName);
        //Trim will remove front and back spaces
        System.out.println("MyName is:" + MyName.trim());

    }

}
