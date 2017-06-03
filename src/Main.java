import java.util.HashMap;
import java.util.Map;

/**
 * Created by Şeyma Yılmaz on 4.6.2017.
 */
public class Main {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        hashMap.put(123, "Şeyma");
        hashMap.put(345, "Burak");
        hashMap.put(675, "Berkan");
        hashMap.put(675, "Umut");
        
        System.out.println();

        HashMap<String, Person> hashMap1 = new HashMap<>();
        Person person1 = new Person("Şeyma Yılmaz", 22);
        hashMap1.put("123456", person1);
        Person person2 = new Person("Burak Köken", 22);
        hashMap1.put("232312", person2);

        Person p = hashMap1.get("232312");
        System.out.println(p.getName() + ", " + p.getAge());
    }
}
