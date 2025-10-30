//by mschro67

package h3;

public class h3_main {
    public static void main(String[] args) {
        int i = 25, j = 30, k;
        //System.out.println("i: " + i + ", j: " + j);
        boolean A1 = (i > j), A2 = (i > 200), A3 = (j > 100);
        if (A1 && !A2 && !A3) {
            k = 1;
        } else if (A1 && A2 && !A3) {
            k = 2;
        } else if (A1 && A2 && A3) {
            k = 3;
        } else if (!A1 && !A2 && !A3) {
            k = 4;
        } else {
            k = -10;
        }
        System.out.println("i: "+i+", j: "+j+", k: " + k);
    }
}