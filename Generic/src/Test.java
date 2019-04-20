class GEN<T extends Number,V extends Number> {
    T A1;
    V A2;

    // restriction as a bounded type in parameterized type
    GEN(T A1, V A2) {
        this.A1 = A1;
        this.A2 = A2;

    }

    void calculation() {
        if(A1 instanceof Integer){
            int c= (A1.intValue()+ A2.intValue())/2;
            System.out.println(c);
        }
        else {
            float c=(A1.floatValue()+ A2.floatValue())/2;
            System.out.println(c);
        }
    }
}
public class Test{
    public static void main(String[] args) {

        GEN<Float,Float> a= new GEN<Float, Float>(20f,20.5f);
        a.calculation();
    }

    }


