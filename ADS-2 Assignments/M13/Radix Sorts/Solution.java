import java.util.Scanner;
/**.
 * { item_description }
 */
// Time constant for Solution class is N
final class Solution {
  /**.
   * Constructs the object.
   */
  private Solution() {

  }
  /**.
   * { function_description }
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = Integer.parseInt(scan.nextLine());
    String[] arr = new String[num];
    for (int i = 0; i < num; i++) {
      arr[i] = scan.nextLine();
    }
    int len = arr[0].length();
    LSD sorting = new LSD();
    sorting.sort(arr, len);
    System.out.println(sorting);
  }
}
