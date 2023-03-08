public class Array1 {
    public static void main(String[] args) {

        Array1 my = new Array1();
        my.non_repeat_values();
    }

    private void non_repeat_values() {
        int [] values = {5,5,5,10};
        boolean[] appeared = new boolean[values.length];
        int count = 1;
        for (int j = 0;j < values.length;j++){
            int first = values[j];
            if (appeared[j] == false){
                appeared[j] = true;

            }
            for(int i = j+1;i< values.length;i++){
                if (first == values[j]){
                    appeared[i] = true;
                    count++;
                }
            }
            System.out.println("non repeated values"+ first + "appared"+count+"times");
        }
    }

}