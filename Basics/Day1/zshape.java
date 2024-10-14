package Day1;

public class zshape {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i ++){
            for(int j=0; j<n; j ++){
                if(i == 0 || i == n-1) {
                    System.out.print("*");
                }else if(j == n-1-i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
