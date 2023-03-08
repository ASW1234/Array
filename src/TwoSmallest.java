public class TwoSmallest {
    public static void main(String[] args) {
        TwoSmallest my = new TwoSmallest();
        my.twoSmallest();


    }

    private void twoSmallest() {
        int array[] = {28,15,16,18,29,30};
        int smallest = array[0];
        int smallestsecond = array[1];
        for(int i = 0;i<array.length;i++){
            if(array[i]<smallest){
                smallestsecond = smallest;
                smallest = array[i];
            }
            else if(array[i]<smallestsecond){
                smallestsecond = array[i];
            }
        }
        System.out.println(smallest);
        System.out.println(smallestsecond);
    }
}
