import java.util.Random;

public class Bodlogo2 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      Random rand = new Random();
      int int_random = rand.nextInt(51);
      arr[i] = int_random;
    }
    for (int i : arr) {
      System.out.println(i);
    }
  }
}
