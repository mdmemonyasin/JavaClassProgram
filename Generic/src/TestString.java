import java.util.Scanner;

public class TestString {
    String a;
    void read() throws Myexception {
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        if ((a.length()<6)){
            throw new Myexception();
        }
        else {
            System.out.println("OK");
        }

    }

    public static void main(String[] args) {
        TestString t=new TestString();
        try {
            t.read();
        }
        catch (Throwable e){
            System.out.println("Catched exception is "+" "+e);
        }
    }
}
class Myexception extends Throwable{
    public Myexception(){
        System.out.println("Invalid");
    }
}