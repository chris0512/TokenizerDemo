import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("D:\\Dev\\Java\\CoreJava\\TokenizerDemo\\src\\Data.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);

        String data = new String(b);

        // String data = "name=Vijay address=delhi country=india dept=cse";

        StringTokenizer stk = new StringTokenizer(data,",");

        String s;
        ArrayList<Integer> al = new ArrayList<Integer>();

        while(stk.hasMoreTokens()){
            s = stk.nextToken();
            al.add(Integer.valueOf(s));
        }
        System.out.println(al);
    }
}
