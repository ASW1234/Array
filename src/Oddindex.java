public class Oddindex {
    public static void main(String[] args) {
        Oddindex my = new Oddindex();
        my.oddindex();
    }

    private void oddindex() {
        int array[] = {77,88,55,66,77,88,88};
        int total = 0;
        for(int i = 0 ; i< array.length;i=i+2){
            total = total + array[i];
        }
        System.out.println(total);
    }
}
