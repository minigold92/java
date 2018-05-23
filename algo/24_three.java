import java.util.*;
import java.io.*;
class Main{
  public static void main(String [] args)throws Exception{
    Reader reader = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(reader);
    Writer writer = new OutputStreamWriter(System.out);
    BufferedWriter bw = new BufferedWriter(writer);

    String [] str = br.readLine().split(" ");
    int [] iarr = {Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2])};
    Arrays.sort(iarr);
    // if(a>b&&a>c){
    //
    // }else if (b>a&&b>c) {
    //
    // }else if (c>a&&c>b) {
    //
    // }
    bw.write(iarr[1]+"");
    bw.flush();
    bw.close();
    br.close();
  }
}
