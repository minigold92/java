import java.util.*;
import java.io.*;

class Main {
  public static void main(String [] args) throws Exception{
    Reader reader = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(reader);


    Writer writer = new OutputStreamWriter(System.out);
    BufferedWriter bw = new BufferedWriter(writer);

    //byte [] datas = new byte[100];
    //char [] datas = new char[100];
    //int n = br.read() - '0';//space 32, cr 13, lf 10
    //while(br.read() == 13){}//flush
    String st = br.readLine();
    int n = Integer.parseInt(st);
    for(int i=0; i<n;i++){
      String str = br.readLine();
      String [] s = str.split(" ");
      int a = Integer.parseInt(s[0]);
      int b = Integer.parseInt(s[1]);
      //int sum = a+b;
      //System.out.println(sum);
      bw.write((a+b)+"\n");
    }
    bw.flush();
    bw.close();br.close();
  }
}
/*//strTokenizer 써보기
import java.util.*;
import java.io.*;

class Main {
  public static void main(String [] args) throws Exception{
    Reader reader = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(reader);
    Writer writer = new OutputStreamWriter(System.out);
    BufferedWriter bw = new BufferedWriter(writer);

    int n = Integer.parseInt(br.readLine());
    for(int i=0; i<n;i++){
      String [] str = br.readLine().split(" ");
      int a = Integer.parseInt(str[0]);
      int b = Integer.parseInt(str[1]);
      bw.write((a+b)+"\n");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}
*/
