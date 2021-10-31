import java.util.Random;

public class Bodlogo4 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      Random random = new Random();
      int randomInt = random.nextInt();
      arr[i] = randomInt;
    }
    int max = arr[0];
    for (int i : arr) {
      if(max < i) max = i;
    }
    System.out.println(max);
  }
}
