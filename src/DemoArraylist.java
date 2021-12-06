import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArraylist {
    public static void main (String[]args ){

        List arrayList = new ArrayList();
        // we can also use generic collection data type.
        // ArrayList<String> arrayList = new ArrayList<String>();
        // this is gerneric is type safety also better used for type safe operation.
        System.out.println(arrayList);
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add(10);// here 10 is object as the (10 interger is convereted into object called as
        // auto conversion.
        arrayList.add(1);
        System.out.println(arrayList);
        ArrayList arrayList1 = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add("hi");
        arrayList2.add("hello");
        arrayList2.add(2,45);// index gives the positoin and
        // 45 is the elements.
        System.out.println(arrayList2);
        System.out.println(arrayList2.isEmpty());//method used to check
        //wheather it is empty or not
        System.out.println(arrayList.size());// gives size
        System.out.println(arrayList.contains("hello"));// checks weather this contain element "hello or not
        System.out.println(arrayList2.get(4));
        //this methods gets the element 4 fro the arratList2 object.
        // we use this arrayList2.removeAll(arrayList);
        arrayList2.retainAll(arrayList);
        System.out.println(arrayList2);

        // taking elemenets from collection using the for loop
        //for (int i = 0; i<arrayList2.size();i++)
       // {
        //    System.out.println(arrayList2.get(i));
        //}
        //for each loop using for the exactraction of the elemeent in the collection
        //for(Object i:arrayList2);
        //System.out.println(i);

        //using the iterator methods to extract the elements from the collection
        Iterator u = arrayList2.iterator();
        while (u.hasNext()){
            Object object= (Object) u.next();
            System.out.println(object);
        }


        }



    }

