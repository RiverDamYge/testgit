package test1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.zip.InflaterOutputStream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
       Reader reader=null;
       InputStream is =null;
       Writer writer=null;
       try {
          File filereader=new File("C:/Users/RiverDamSN/Desktop/123.txt");
          File filewriter=new File("C:/Users/RiverDamSN/Desktop/456.txt");
           is=new FileInputStream(filereader);
           writer=new FileWriter(filewriter);
           reader =new InputStreamReader(is,"GBK");
          char[] cf=new char[(int) filereader.length()];
          int size=reader.read(cf);
          writer.write(new String(cf));
          System.out.println(new String(cf));
       }catch (Exception e){
           e.printStackTrace();
       }

        SpringApplication.run(Application.class,args);
    }

}
