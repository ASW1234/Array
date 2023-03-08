public class Seven_Array {
    public static void main(String[] args) {
        Seven_Array my = new Seven_Array();
        my.placing_last();

    }

    private void placing_last() {
        int rupee[] = {10,20,50,100,500};
        int amount = 100;
        int count = rupee.length;
        for(int i=0;i<rupee.length;i++){
            if(count -1 ==i){
                rupee[i] = amount;

            }
            System.out.println(rupee[i]);
        }
    }

}
