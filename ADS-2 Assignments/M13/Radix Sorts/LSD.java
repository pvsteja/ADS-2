public class LSD {
    private static final int BITS_PER_BYTE = 8;

    // do not instantiate
    public LSD() { }
    private static String[] output;

   /**
     * Rearranges the array of W-character strings in ascending order.
     *
     * @param a the array to be sorted
     * @param w the number of characters per string
     */
   //Time complexity of LSD is N
    public static void sort(String[] a, int w) {
        int n = a.length;
        int R = 256;   // extend ASCII alphabet size
        String[] aux = new String[n];

        for (int d = w-1; d >= 0; d--) {
            // sort by key-indexed counting on dth character

            // compute frequency counts
            int[] count = new int[R+1];
            for (int i = 0; i < n; i++)
                count[a[i].charAt(d) + 1]++;

            // compute cumulates
            for (int r = 0; r < R; r++)
                count[r+1] += count[r];

            // move data
            for (int i = 0; i < n; i++)
                aux[count[a[i].charAt(d)]++] = a[i];

            // copy back
            for (int i = 0; i < n; i++)
                a[i] = aux[i];
            output = a;
        }
    }
    //time complexity for toString NW
    // N means number of elements in String array.
    // W means leangth of the string.
        public String toString() {
            String s = "[";
            for (int i = 0; i < output.length - 1; i++) {
                s += output[i] + ", ";
            }
            s += output[output.length - 1] + "]";
            return s;
        }
}