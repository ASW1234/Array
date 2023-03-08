public class Sixth_Array {
    public static void main(String[] args) {
        Sixth_Array my = new Sixth_Array();
        my.remove_array();

    }
    //remove value given number
     private void remove_array() {
        int [] mark ={88,55,67,54,76,77};
        int hide = 76; // to remove the index of given an element
        for(int i =0;i<mark.length;i++){
            //use if condition
            //if condition mark[i] is given but it show it will take hide the value..
              if(mark[i]== hide){

                  i++;
              }
            System.out.println("the element number is remove value"+mark[i]);
        }

    }


}
