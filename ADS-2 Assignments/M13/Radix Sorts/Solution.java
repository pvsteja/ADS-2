import java.util.Scanner;
final class Solution {
	private Solution() {

	}
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
