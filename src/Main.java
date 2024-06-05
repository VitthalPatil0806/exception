//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

//        try{
//            System.out.println(a/b);
//        }
//        catch (ArithmeticException e){ // need to show which type of exception is
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }

//        try{
//            System.out.println(a/b);
//        }
//        catch (ArithmeticException e){ // need to show which type of exception is
//            System.out.println(e.getMessage()+" "+"exception is found so:");
//            System.out.println(a/2+" "+"is modification of code");
//        }

        String val = Main.getLower("Hello Vitthal");
        System.out.println(val);

    }

    public static String getLower(String data){
        return data.toLowerCase();
    }
}