public class Bodlogo5 {
  public static void main(String[] args) {
    int[] arr = {12, 45, 2, 5, 600, 7, 98, 54};
    int max = arr[0];
    for (int i : arr) {
      if(max < i) max = i;
    }
    System.out.println(max);
  }
}
