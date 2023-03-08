public class Third_Array {
    public static void main(String[] args) {
        Third_Array num = new Third_Array();
        num.reverse_Order();

    }

    private void reverse_Order() {
        int [] a = {1,2,3,5,7};
        for(int i = a.length-1; i>=0;i--){
            System.out.print(a[i]+"");
        }
    }
}
