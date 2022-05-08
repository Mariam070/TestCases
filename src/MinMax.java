public class MinMax {
    public int Max(int[] x){
        int max_no=x[0];
        for(int i=0; i<x.length; i++){
            if(x[i]>max_no){
                max_no=x[i];
            }
        }
        return max_no;
    }
    public int Min(int[] x){
        int min_no=x[0];
        for(int i=0; i<x.length; i++){
            if(x[i]<min_no){
                min_no=x[i];
            }
        }
        return min_no;
    }
}
