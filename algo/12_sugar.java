import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int result = n/5;
    int remainder = n%5;

    if(remainder == 0){

    }else if (remainder ==1 && result >= 1) {
      result += 1;
    }else if (remainder == 2 && result>=2) {
      result += 2;
    }else if (remainder == 3) {
      result += 1;
    }else if (remainder == 4 && result>=1) {
      result += 2;
    }else{
      result = -1;
    }
    System.out.print(result);
  }
}
