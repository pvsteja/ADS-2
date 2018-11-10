import java.util.ArrayList;
import java.util.Scanner;
/**.
 * Class for solution.
 */
public class Solution {
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // Self loops are not allowed...
        // Parallel Edges are allowed...
        // Take the Graph input here...
        Scanner scan = new Scanner(System.in);
        int vertices = Integer.parseInt(scan.nextLine());
        int edges = Integer.parseInt(scan.nextLine());
        EdgeWeightedGraph ewg = new EdgeWeightedGraph(vertices);
        for (int i = 0; i < edges; i++) {
          String[] inputs = scan.nextLine().split(" ");
          int v = Integer.parseInt(inputs[0]);
          int w = Integer.parseInt(inputs[1]);
          double wt = Double.parseDouble(inputs[2]);
          Edge e = new Edge(v, w, wt);
          ewg.addEdge(e);
        }
        String caseToGo = scan.nextLine();
        switch (caseToGo) {
        case "Graph":
          System.out.println(ewg);
          break;
        case "DirectedPaths":
            // Handle the case of DirectedPaths,where two integers are given.
            // First is the src and second is the destination.
            // If the path exists print the distance between them.
            // Other wise print "No Path Found."
            String[] inputs = scan.nextLine().split(" ");
            int src = Integer.parseInt(inputs[0]);
            int dist = Integer.parseInt(inputs[1]);
            DijkstraUndirectedSP dusp = new DijkstraUndirectedSP(ewg, src);
            if (dusp.hasPathTo(dist)) {
                System.out.println(dusp.distTo(dist));
            } else {
                System.out.println("No Path Found.");
            }
            break;

        case "ViaPaths":
            // Handle the case of ViaPaths, where three integers are given.
            // First is the source and second is the via is the one
            // where path should pass throuh.
            // third is the destination.
            // If the path exists print the distance between them.
            // Other wise print "No Path Found."
            String[] input = scan.nextLine().split(" ");
            int src1 = Integer.parseInt(input[0]);
            int via = Integer.parseInt(input[1]);
            int dist1 = Integer.parseInt(input[2]);
            DijkstraUndirectedSP dusp1 = new DijkstraUndirectedSP(ewg, src1);
            if (dusp1.hasPathTo(dist1)) {
                for (Edge onPath: dusp1.pathTo(dist1)) {
                    System.out.println(onPath);
                }
            } else {
                System.out.println("No Path Found.");
            }
            break;
        default:
            break;
        }

    }
}
