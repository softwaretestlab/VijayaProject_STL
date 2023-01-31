package JavaLearning;

import org.junit.Test;

import java.util.ArrayList;



    public class AT11_ArrayList {
        @Test
        public void ArrayList() {
            //syntax of arraylist
            ArrayList<String> ListOfCars =  new ArrayList<String>();
            // let add items into arraylist
            ListOfCars.add("BMW");
            ListOfCars.add("Toyota");
            ListOfCars.add("Benz");
            ListOfCars.add("RangeRover");
            System.out.println("cars inside Array list are : "+ ListOfCars);
            //count
            int CarsCount = ListOfCars.size(); //4
            System.out.println("CarsCount : "+CarsCount);
            for(int i=0;i<CarsCount;i++){
                System.out.println("Array index : "+i+" and its value is : "+ListOfCars.get(i));
            }

        }
}
