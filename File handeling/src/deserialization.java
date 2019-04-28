import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class deserialization {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=null;
        FileOutputStream fout=null;
        try {
            File file;
            int c=0;
            fout=new FileOutputStream("C:/Users/DELL/IdeaProjects/Exception/File handeling/result.txt",true);
            fin =new FileInputStream("C:/Users/DELL/IdeaProjects/Exception/File handeling/yasin.txt");

            while (c!=-1){
                c=fin.read();
            }
            fout.write(c);
        }
        catch (IOException e){
            System.out.println("Error");
        }
        finally {
            if (fin!=null){
                fin.close();
            }
            if (fout!=null){
                fout.close();
            }
        }
    }

}
