package JavaOOPSconcepts;

public class AT16_Interface02 implements AT15_Interface01{
    /*
    A Java interface contains static constants and
   abstract methods.
    */
    public void add(){
        int y = 20 + x;
        System.out.println("value of y is : " + y); //20+50= 70
    }
    public void sub(){
        System.out.println("This is sub method");
    }
    public void div(){
        System.out.println("This is div method");
        //static value
        System.out.println("static value is : " + x); //x =50
    }
    //selenium

}
