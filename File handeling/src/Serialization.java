import java.io.*;
import java.time.LocalDate;

public class Serialization implements Serializable {
    transient String name;
    int age;
    int id;
    int salary;
    LocalDate date_of_join;

    public Serialization(String name, int age, int id, int salary,LocalDate date_of_join) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.date_of_join=date_of_join;
    }
    static void deSerial() throws IOException{
        FileInputStream fin =null;
        ObjectInputStream ois=null;
        try {
            fin=new FileInputStream("C:/Users/DELL/IdeaProjects/Exception/File handeling/object.txt");
            ois=new ObjectInputStream(fin);
            Serialization f=(Serialization)ois.readObject();
            System.out.println("State of returned object is: "+f);
            System.out.println(f.name);
            System.out.println(f.age);
            System.out.println(f.id);
            System.out.println(f.salary);
            System.out.println(f.date_of_join);
        }
        catch (Exception a){
            System.out.println("Error while reading");
        }
        finally {
            if(ois!=null){
                ois.close();
            }
            if(fin!=null){
                fin.close();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Serialization e=new Serialization("Rahul",23,11011,25000,LocalDate.of(2017,7,1));
        FileOutputStream fout=null;
        ObjectOutputStream oos=null;
        try {
            System.out.println("State of object is: "+e);
            fout=new FileOutputStream("C:/Users/DELL/IdeaProjects/Exception/File handeling/object.txt");
            oos=new ObjectOutputStream(fout);
            oos.writeObject(e);
        }
        catch (IOException a){
            System.out.println("Error");
        }
        finally {
            if (oos!=null){
                oos.close();
            }
            if (fout!=null){
                fout.close();
            }
        }
        deSerial();
    }

}

