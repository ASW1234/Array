public class Fourth_Array {
    public static void main(String[] args) {
        Fourth_Array ob = new Fourth_Array();
        ob.linear_Search();
    }

    private void linear_Search() {
        int array[] = {2,3,4,1,9,0};
        int count = 23;
        boolean present = false;
        for (int i = 0;i< array.length;i++){
            //linear search element  in
            if(array[i] == count){
                System.out.println("the number is "+count+"the present in the array");
                present = true;
                break;
            }
            if(present == false){
                System.out.println("the number is "+count+"not present in the array");
                break;
            }
        }
    }
}
