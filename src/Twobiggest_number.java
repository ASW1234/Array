public class Twobiggest_number {
    public static void main(String[] args) {
        Twobiggest_number my = new Twobiggest_number();
        my.twobiggest();
    }

    private void twobiggest() {
        int[]array = {45,65,77,99,88,50};
        int biggest = array[0];
        int biggestsecond = array[1];
        for(int i = 1;i<array.length;i++){
            if(array[i]>biggest){
                biggestsecond = biggest;
                biggest = array[i];

            }
            else if(array[i]>biggestsecond){
                biggestsecond = array[i];
            }
        }
        System.out.println(biggest);
        System.out.println(biggestsecond);
    }
}
