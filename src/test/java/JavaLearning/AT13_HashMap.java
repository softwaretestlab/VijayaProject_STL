package JavaLearning;

import org.junit.Test;

import java.util.HashMap;

public class AT13_HashMap {
    @Test
    public void test16() {
        // here we created an object of Hashmap and this hashmap takes Stringer and Integer as Key:Value
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("Ricky",11);
        map.put("Bianca",8);
        map.put("Jasper",10);
        System.out.println("Print data in the map on the console : "+ map);
        int mapSize=map.size();
        System.out.println("hasmap size is : "+mapSize); //3

        if(map.containsKey("Jasper")){
           int KeyVal= map.get("Jasper");
            System.out.println(" KeyVal : "+KeyVal);
        }
    }
}
