import java.util.ArrayList;

public class Program2 {
    void list(){
        ArrayList al=new ArrayList();
        ArrayList al1=new ArrayList();
        al.add("george");
        al.add("jim");
        al.add("john");
        al.add("blake");
        al.add("kevin");
        al.add("Michel");
        al1.add("george");
        al1.add("Ketty");
        al1.add("kevin");
        al1.add("michel");
        al1.add("miyan");
        al.retainAll(al1);//for intersection
        System.out.println("Intersaction is : "+al);
        al.addAll(al1);//for union

        System.out.println("Union is : "+al);
        //al.remove(al1);
        //System.out.println("diffrence  is : "+al);


    }

    public static void main(String[] args) {
        Program2 p=new Program2();
        p.list();
    }
}
