// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class CollectionApi {
   
   
    /**
     * @param args
     * @param string
     */
    public static void main(String[] args, String string) {

        // List examples
        // List<Integer> l=new ArrayList<Integer>();
        // l.add(2);
        // l.add(8);
        // l.add(3);
        // l.add(1);

        // System.out.println(l.remove(2));
        // System.out.println(l);

        // for(Object n:l){
        // int num=(Integer)n;

        // System.out.println(num);
        // }

        
       // Set<Integer> ss = new HashSet<Integer>();
        Set<Integer> ss = new TreeSet<Integer>();
        ss.add(36);
        ss.add(54);
        ss.add(78);
        ss.add(15);
        ss.add(26);

        for (Object n : ss) {
            int num = (Integer) n;

            System.out.println(num);
        }
        //  Map  stud =new HashMap <>();
        //  stud.put("ravi", 46);
        //  stud.put("shivam", 78);
        //  stud.put("priyan", 45);
        //  stud.put(string, 12);
      
        //  System.out.println(stud);




    }
}
