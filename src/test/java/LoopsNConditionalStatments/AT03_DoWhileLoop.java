package LoopsNConditionalStatments;

import org.junit.Test;

public class AT03_DoWhileLoop {
    @Test
    public void DoWhileLoopLearn() {
        int TicketNum=40;
        do{
            System.out.println("Ticket Number is : " + TicketNum);
            TicketNum++;
        }while(TicketNum<=45);
    }

}
