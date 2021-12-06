import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Emp {
    String name, cmpname;
    int age;

    Emp(String name, String cmpname, int age) {
        this.name = name;
        this.age = age;
        this.cmpname = cmpname;
    }
    public String toString(){
        return name +" "+cmpname+" "+age;

    }
}
public class UserDefinedClass {

    public static void main (String[]args){
        ArrayList<Emp>arrayList = new ArrayList<>();
        Emp e1 = new Emp("surya","plasma",56);
        Emp e2 = new Emp("surya2","plasma2",56);
        Emp e3 = new Emp("surya3","plasma3",56);

        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        System.out.println(arrayList);

       Iterator <Emp>iterator= arrayList.iterator();
       while(iterator.hasNext()){
           Emp emp = (Emp)iterator.next();
            System.out.println(emp.age+ " "+emp.name+" "+emp.cmpname);
        }
        // this is lamda expression.
        //systax for lamda expression is
        // (argument-list) -> (body)
        // below lamda expression (ag)->(body)
         //arrayList.forEach((a)->System.out.println(a));
         System.out.println("List Iterator in forward direction.");
        ListIterator <Emp>listIterator=arrayList.listIterator();

        while (listIterator.hasNext()){
            Emp type = (Emp) listIterator.next();
        }
        System.out.println("List Iterator in backward direction...");
        while (listIterator.hasPrevious()){
            Emp type = (Emp)listIterator.previous();
        }
    }
}

