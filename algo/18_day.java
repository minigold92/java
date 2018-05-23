import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    int days = sc.nextInt();
    int[] md = {3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
    String[] weeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

    for (int i = 0;i<month-1 ;i++ ) {
      days += md[i];
    }
    System.out.println(weeks[days%7]);
  }
}
