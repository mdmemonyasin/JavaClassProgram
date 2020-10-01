public class ExceptionHandeling {
    int x=20;
    int y=10;
    void display(){
        try {
            int z=x/y;
            System.out.println(z);
        }
        catch (ArithmeticException e){
           System.out.println("You cannot divide any number by zero!!!");
        }
        finally {
            System.out.println("File closed!!!");
        }

    }

    public static void main(String[] args) {
        ExceptionHandeling e=new ExceptionHandeling();
        e.display();
    }
}
