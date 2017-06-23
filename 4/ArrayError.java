public class ArrayError {
    public static void main(String args[]) {
        // array[array.length]は範囲外
        int array[] = new int[32];
        for (int i = 0; i <= array.length; i++) {
            array[i] = i;
        }
    }
}
