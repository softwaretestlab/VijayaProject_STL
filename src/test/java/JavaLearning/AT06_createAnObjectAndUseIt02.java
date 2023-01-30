package JavaLearning;

import org.junit.Test;

public class AT06_createAnObjectAndUseIt02 {

    @Test
    public void test10() {
        AT02_JunitMethods obj = new AT02_JunitMethods();
        obj.test01();
        obj.test02();

        AT03_StringInt obj1= new AT03_StringInt();
        obj1.test03();
        obj1.test04();
    }

}
