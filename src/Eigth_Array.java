public class Eigth_Array {
    public static void main(String[] args) {
        Eigth_Array my = new Eigth_Array();
        my.Find_Biggest();
    }

    private void Find_Biggest() {
        int array[] ={30,31,38,29,34,23};
        int big = array[0];
        int big1 = array[1];
        for(int i =1 ;i<array.length;i++){
            if(array[i]>big){
                big1 = big;
                big = array[i];
            }
            else if(array[i]>big1){
                big1 =array[i];

            }
            System.out.println(big);
            System.out.println(big1);
        }
    }
}
