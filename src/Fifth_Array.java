public class Fifth_Array {
    public static void main(String[] args) {
        Fifth_Array by = new Fifth_Array();
        by.index_element();
    }

    //finding the index element value ..
    private void index_element() {
        int marks[] ={85,43,56,77,76};
        for(int i=0;i<=marks.length;i++){
            //i : value means index element  ..
            System.out.println("the finding the index element "+i+"is"+marks[i]);

        }
    }
}
