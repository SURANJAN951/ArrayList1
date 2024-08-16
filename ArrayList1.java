import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(100);//ham yha integer add kar rhe hai but ye object ke form me store hoga
        a1.add(100);//duplicates are allowed means both type of data hetero and homo
        a1.add("pw");
        a1.add(1.1);//In sabka return type boolean hota hai
        a1.add("L");
        System.out.println(a1);
        System.out.println("************************************");
        ArrayList a2 = new ArrayList();
        a2.add(1);
        a2.add(2);
        a2.add(4);
        a2.add(2,11);// this will add 11 at index 2
        a2.addAll(a1);//this will add all the data of a1 in a2
        System.out.println(a2);

    }
}
