import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writing {

    public static void main(String[] args) throws IOException {
        FileInputStream fin=null;
        FileOutputStream fout=null;
        try {
            File file;
            fin=new FileInputStream("C:/Users/DELL/IdeaProjects/Exception/File handeling/yasin.txt");
            fout=new FileOutputStream("C:/Users/DELL/IdeaProjects/Exception/File handeling/reasult.txt");
            int c=0;
            while (c!=-1){
                c=fin.read();
                if (c==-1){
                    break;
                }
                fout.write(c);
            }
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
