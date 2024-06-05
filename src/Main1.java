public class Main1 {
    public static void main(String args[]){

        int a = 10;
        int b = 0;
        int array[] = {2,3,4,5};

        try{
            try{
                System.out.println(a/b);
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }

            try{
                System.out.println(array[7]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage()+" "+"exception handlled successfully");
        }
    }
}