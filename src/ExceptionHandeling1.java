public class ExceptionHandeling1 {
    //Arithatic exception
    //Array Index out of bouns exception
    //NumberFormatException
    //NullPointerException
    //IOException
    public static void main(String[] args) {
        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Devided by 0");
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Array out of bound");

        }

    }

}
