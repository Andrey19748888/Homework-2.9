import java.util.HashMap;
import java.util.Map;

public class StringMain {

    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        map.put("str1",5);
        map.put("str2",7);
        map.put("str3",3);

        System.out.println( map);

        try {
            addString("str5",8);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            addString("str1", 5);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            addString("str3",10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(map);

    }

    public static void addString(String key, Integer value) throws Exception {




        if (map.containsKey(key) && map.containsValue(value)) {
            throw new Exception(" Такой ключ уже есть и значения совпадают");
        } else {
            map.put(key, value);
        }
    }
}
