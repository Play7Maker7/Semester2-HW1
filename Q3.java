public class Q3 {
    public static void main(String[] args) {
        int[] x = {1 , 2 , 3 };
        int[] y = {4 , 5};
        int[] z = new int[5];
        System.arraycopy(x, 0, z, 0, x.length);
        System.arraycopy(y, 0,z,3,y.length);
        for (int i : z) {
            System.out.println(i);
        }
    }
}
