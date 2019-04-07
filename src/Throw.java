import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Throw {
    //it is used for explicit exception throwing
    //throw(Exception obj);
    //throws is used for methode
    //type methode-name(parameter-list throws exception-list{ }
    public void show(int i) throws Myexception{
        if(i>100){
            throw new Myexception(i);
        }
        else {
            System.out.println("OK");
        }
    }

    public static void main(String[] args) {
        int i=Integer.parseInt(args[0]);
        int j=Integer.parseInt(args[1]);
        Throw t=new Throw();
        try {
            t.show(i);
            t.show(j);
        }
        catch (Throwable e){
            System.out.println("catched exception is"+e);
        }
    }


}
class Myexception extends Throwable{
    public Myexception(int i){
        System.out.println("you have entered "+i+"it exceeding the limit");
    }
}
