public class ExceptionHandeling2 {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        int a1[]=new int[5];
        try{
            int z=a/b;
            a1[6]=50;
        }
        catch (ArithmeticException e1){
            System.out.println(
                    "0000"
            );
        }
        catch (Exception e){
            System.out.println("Devided by 0");
        }

    }

}
