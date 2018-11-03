// import edu.princeton.cs.algs4.*;
import java.util.Arrays;
/**.
 * Class for page rank.
 */
class PageRank {
    /**.
     * { var_description }
     */
    private Digraph graphObj;
    PageRank(final Digraph digraph) {
        this.graphObj = digraph;
    }
}
/**.
 * Class for web search.
 */
class WebSearch {
}
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
        // read the first line of the input to get the number of vertices

        int vertexCount = Integer.parseInt(StdIn.readLine());
        // iterate count of vertices times
        // to read the adjacency list from std input
        // and build the graph
        Digraph digraphObj = new Digraph(vertexCount);
        for (int i = 0; i < vertexCount; i++) {
            String[] edges = StdIn.readLine().split(" ");
            for (int k = 1; k < edges.length; k++) {
                digraphObj.addEdge(Integer.parseInt(
                    edges[0]), Integer.parseInt(edges[k]));
            }
        }
        System.out.println(digraphObj);
        // Create page rank object and pass the
        //digraphObj object to the constructor
        PageRank pageRankObj = new PageRank(digraphObj);
        // print the page rank object
        // This part is only for the final test case
        // File path to the web content
        String file = "WebContent.txt";
    }
}
