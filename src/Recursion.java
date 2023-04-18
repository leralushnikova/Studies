public class Recursion {
    public static void main(String[] args) {
        recursion(6, 2);
    }
    public static void recursion(int A, int B){
        System.out.println(A);
        if(A==B) return;
        if(A < B){
            recursion(A+1, B);
        }
        if(A > B){
            recursion(A-1, B);
        }
    }
}
