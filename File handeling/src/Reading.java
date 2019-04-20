import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Reading {
    public static void main(String[] args) throws IOException {
        FileInputStream fp=null;
        try {
            File file;
            fp=new FileInputStream("C:/Users/DELL/IdeaProjects/Exception/File handeling/yasin.txt");
            int c=0;
            while (c!=-1){
                c=fp.read();
                if(c==-1){
                    break;
                }
                System.out.println((char)c);
            }
        }
        catch (IOException e){
            System.out.println("Error ");
        }
        finally {
            if (fp!=null){
                fp.close();
            }
        }
    }
}
