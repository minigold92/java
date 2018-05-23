import java.util.*;
import java.io.*;
class Main{
  public static void main(String [] args)throws Exception{
    Reader reader = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(reader);
    Writer writer = new OutputStreamWriter(System.out);
    BufferedWriter bw = new BufferedWriter(writer);

    int n = Integer.parseInt(br.readLine());
    if(n>=90 && n<=100){
      bw.write("A\n");
    }else if (n<90&&n>=80) {
      bw.write("B\n");
    }else if (n<80&&n>=70) {
      bw.write("C\n");
    }else if (n<70&&n>=60) {
      bw.write("D\n");
    }else{
      bw.write("F\n");
    }
    bw.flush();
    bw.close();
    br.close();
  }
}
