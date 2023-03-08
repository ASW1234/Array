public class Duplicate_number {
    public static void main(String[] args) {
        Duplicate_number my = new Duplicate_number();
        my.duplicate_number();
    }

    private void duplicate_number() {
        int array[] = {10,17,9,22,11,11,12,11};
        int count = 0;
        int num = 11;
        for(int i = 0;i<array.length;i++){
            if(array[i]== num){
                count++;
            }
        }
        System.out.println(num+""+"the number count is "+count);
    }
}
