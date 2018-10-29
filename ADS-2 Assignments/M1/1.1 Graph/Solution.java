import java.util.Scanner;
/** . class for Solution
 */
public final class Solution {
    /**
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
        String type = scan.nextLine();
        int v = scan.nextInt();
        int e = scan.nextInt();
        scan.nextLine();
        LinearProbingHashST<Integer, String> hashst = new
        LinearProbingHashST<>();
        String[] places = scan.nextLine().split(",");
        for (int i = 0; i < places.length; i++) {
            hashst.put(i, places[i]);
        }
        switch (type) {
        case "List":
            Graph graph = new Graph(v);
            while (scan.hasNext()) {
                String[] tokens = scan.nextLine().split(" ");
                graph.addEdge(Integer.parseInt(tokens[0]
                    ), Integer.parseInt(tokens[1]));
            }

            System.out.println(
              graph.V() + " v, " + graph.E() + " e");
            if (graph.E() == 0) {
                System.out.println("No e");
                break;
            }
            for (int i = 0; i < graph.V(); i++) {
                StringBuffer str = new StringBuffer();
                str.append(hashst.get(i) + ": ");
                for (int w : graph.adj(i)) {
                    str.append(hashst.get(w) + " ");
                }
                System.out.println(str.toString());
            }
        }
    }
}
