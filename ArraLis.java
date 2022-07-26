import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraLis {
    public static void main(String[] args) {
        /*ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add("Ram");
        al.add("a");
        al.add(23);
        al.add(23.23);
        al.add(true);

        System.out.println("al : "+al);

        /*System.out.println("al : "+al);
        System.out.println(al.size());
        System.out.println(al.get(2));
        System.out.println(al.isEmpty());
        System.out.println(al.indexOf(23));
        System.out.println(al.contains("Ram"));
        System.out.println(al.remove(2));
        System.out.println("al : "+al);
        System.out.println(al.contains("Ram"));
        System.out.println(al.indexOf("Ram"));
        al.clear();
        System.out.println("al : "+al);
        System.out.println(al.isEmpty());

        ArrayList al1 = new ArrayList();

        al1.add(10);
        //al1.add(0);
        al1.add("Ram");
        al1.add("ab");
        al1.add(237);
        al1.add(23.2323);
        al1.add(true);
        //System.out.println("al1 : "+al1);

        //System.out.println(al.containsAll(al1)); //finding al1's all element is present in al or not and returns true or false
        //System.out.println(al.removeAll(al1));//removing common element from current object
        //System.out.println(al.retainAll(al1)); //removing uncommon element from current object


        al.add(al1);
        al.add(2,al1);
        al.addAll(al1);
        al.addAll(1,al1);
        System.out.println(al);*/

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        System.out.println("al : "+al);

        Integer []ia = new Integer[al.size()];
        al.toArray(ia);
        System.out.print("ia : ");
        for(int i = 0; i<ia.length;i++){
            System.out.print(ia[i]+" ");
        }
        System.out.println();
        Integer []a = {11,22,33,44,55};
        List<Integer> li = Arrays.asList(a);
        System.out.println("li : "+li);

    }
}
