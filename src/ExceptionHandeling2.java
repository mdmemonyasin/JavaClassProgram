public class ExceptionHandeling2 {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        int a1[]=new int[5];
        try{
            int z = a/b;
            a1[6] = 50;
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("You try to access the element of array of index greater than length of array.");
        }
        catch (Exception e){
            System.out.println("Something went wrong!!!");
        }finally {
            System.out.println("Execution completed.");
        }
    }

}
