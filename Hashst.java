import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Hashst {
    public static void main(String[] args){

        Set<String> days = new HashSet<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        //days.add("Monday"); ignores duplicate values by Set
        System.out.println("Days :"+days);

        Set<String> i = new HashSet<>();
        i.add("Christmas");
        i.add("Easter");
        i.add("Diwali");
        i.add("Sunburn");

        //Set<String> set = new HashSet<>(days);
        days.addAll(i);
        System.out.println("Days : "+days);

        //boolean isRemoved = set.remove("Wednesday");
        //System.out.println("Set : "+set);

        //Set<Integer> se = new HashSet<>()
        //days.remove("Sunburn");
        //days.removeAll(days);
        //days.removeIf(l -> l.startsWith("S"));


        System.out.println("Days : "+days);

    }
}
