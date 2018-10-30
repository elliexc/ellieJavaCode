import java.awt.SystemTray;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * author: zhanghongtao
 * date  : 2018-10-19 10:59 AM
 * email : zhtxcster@gmail.com
 */
public class hashMapBasic {
    public static void main(String []args) {
        Map<String, String> m = new HashMap<String,String>(); // 声明Map对象，其中key和value的类型为String
        m.put("name", "Anna");
        m.put("QQ", "2378387378");
        m.put("age", "23");

        String val = m.get("name");
        System.out.println("the value from get is : " + val);

        if(m.containsKey("age")) {
            System.out.println("age key is available.");
        } else {
            System.out.println("age key is available.");
        }
        if(m.containsValue("name")) {
            System.out.println("name value is available.");
        } else {
            System.out.println("name value is not available.");
        }

        //输出全部的key
        Set<String> keys = m.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()) {
            String str = iter.next();
            System.out.println(str + "/");
        }

        //输出全部的value
        Collection<String> values = m.values(); // 得到全部的value
        Iterator<String> iterVal = ((Collection) values).iterator();
        while(iterVal.hasNext()) {
            String str = iterVal.next();
            System.out.println(str + " ");
        }

        Map<String,String> tree = new TreeMap<String,String>();
        tree.put("A, mldn", "the first value");
        tree.put("E, sld", "the fifth value");
        tree.put("B, dld", "the second value");

        Set<String> keysT = tree.keySet();
        Iterator<String > iterT = keysT.iterator();
        while (iterT.hasNext()) {
            String strT = iterT.next();
            System.out.println(strT + " --> " + tree.get(strT)); // 取出内容

        }

        Collection<String> collT = tree.values();
        Iterator<String> iterCollT = collT.iterator();
        while (iterCollT.hasNext()) {
            String  strCollT = iterCollT.next();
            System.out.print(strCollT + " ");
        }
        System.out.println(tree);
    }
}
