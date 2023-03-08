public class First_array {
    public static void main(String[] args) {
        First_array number = new First_array();
        number.printing_first();
    }

    private void printing_first() {
        //Declare and initialize and array
        int [] marks = {77,89,96,93,96,99};

        for(int i = 0; i < marks.length;i++){
            System.out.println(marks[i]);
        }



    }
}
