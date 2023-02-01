package JavaOOPSconcepts;

import org.junit.Test;

public class AT03_Encapsulation01 {
    @Test
    public void encMethod01(int i, int j){
        int m = i+j;
        System.out.println("added total is : "+ m);
    }
    @Test
    public int encMethod02(int l ,int n){
        int k = l+n;
        return k;

    }
}
