import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * author: zhanghongtao
 * date  : 2018-10-19 2:30 PM
 * email : zhtxcster@gmail.com
 */
class IterateOverHashMap {
    public static void main(String []args) {
        Map<String, Double> employeeSalary = new HashMap<>();
        employeeSalary.put("David", 76000.00);
        employeeSalary.put("John", 120000.00);
        employeeSalary.put("Mark", 95000.00);
        employeeSalary.put("Steven", 134000.00);

        Set<Map.Entry<String,Double>> employeeSalaryEntries = employeeSalary.entrySet();
        Iterator<Map.Entry<String,Double>> employeeSalaryIterator = ((Set) employeeSalaryEntries).iterator();
        while (employeeSalaryIterator.hasNext()) {
            Map.Entry<String,Double> entry = employeeSalaryIterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
