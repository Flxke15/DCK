import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Bob","11111");
        map.put("Flxke","22222");
        map.put("Pang","33333");

        System.out.println("Pang " + map.get("Pang"));
        System.out.println("Bob " + map.get("Bob"));
        System.out.println("Flxke " + map.get("Flxke"));
    }
}
