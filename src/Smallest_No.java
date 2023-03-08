public class Smallest_No {
    public static void main(String[] args) {
        Smallest_No my = new Smallest_No();
        my.smallestArray();
    }

    private void smallestArray() {
        int a[] ={23,15,46,34,31};
        //sum is equal to int a[0]
        int sum = a[0];
        //for loop uses i ;
        for(int i = 0;i<a.length;i++){
            //
            if(a[i]<sum){
                sum = a[i];
            }
        }
        //printing the "sum" value is
        System.out.println(sum);
    }
}
