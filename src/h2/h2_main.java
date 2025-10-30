//by mschro67

package h2;

public class h2_main{
    public static void main(String[] args){
        int i=3,j=67,k=21;
        System.out.println("i: "+i+", j: "+j+", k: "+k);
        int min=i, max=i;
        if (j<min){
            min=j;
        }
        if (k<min){
            min=j;
        }
        if (j>max){
            max=j;
        }
        if (k>max){
            max=k;
        }
        System.out.println("min: "+min+", max: "+max);
    }
}