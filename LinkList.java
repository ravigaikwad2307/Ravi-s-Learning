import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Coconut");

        //System.out.println("Initial Linked list "+list);

        list.add(2,"Watermelon");
       // System.out.println("After add(2, \"D\") : " +list);
        list.addFirst("Strawberry");
        list.addLast("Orange");
        //System.out.println("Linked list "+list);

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Tomato");
        list1.add("grapes");
        list1.add("Pyrus");

        list.addAll(list1);
        //System.out.println("New Linked List "+list);

        /*String firstElement = list.getFirst();
        System.out.println("First element "+firstElement);

        String lastElement = list.getLast();
        System.out.println("Last Elelement "+lastElement);

        String Element = list.get(3);
        System.out.println("Element at 3 "+Element);
        System.out.print("List : ");
        for(int i = 0; i<list.size(); i++){
            System.out.print(" "+list.get(i));
        }
        /*for(String i : list){
            System.out.println(list);
        }
        list.forEach( element -> {
            System.out.print(" "+element);
        });*/

        /*System.out.println("Linked List : "+list);

        String li = list.removeFirst();
        System.out.println("Removed First "+li);
        System.out.println("List : "+list);
        String lil = list.removeLast();
        System.out.println("Removed last "+lil);
        System.out.println("List : "+list);

        boolean isRemoved = list.remove("banana");
        if(isRemoved){
            System.out.println("List : "+list);
        }
        boolean o = list.removeIf(lis -> lis.startsWith("O"));
        System.out.println("List : "+list);

        list.clear();
        System.out.println("list is cleared "+list);*/

        //Searching

        /*System.out.println("Does list contains \"banana\"? "+list.contains("banana"));

        System.out.println("Index of Banana "+list.indexOf("Banana"));
        System.out.println("Index of Mango "+list.indexOf("Mango"));

        System.out.println("Last Index of Pyrus "+list.lastIndexOf("Pyrus"));
        System.out.println("last Index of Tomato "+list.lastIndexOf("Tomato"));
        */

        //Iterator<String> li = list.iterator();
        //System.out.print("List : ");
       /* while(li.hasNext()){
            String li2 = li.next();
            System.out.print(" "+li2);
        }*/
        System.out.println();
        ListIterator<String> li = list.listIterator(list.size());
        System.out.print("List : ");
        while(li.hasPrevious()){
            String l = li.previous();
            System.out.print(" "+l);
        }

       /* ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            String speciesName = listIterator.previous();
            System.out.print(" "+speciesName);
        }*/
    }
}
