public class stats<T extends Number> {
    T A1;
    T A2;

    public stats(T a1, T a2) {
        A1 = a1;
        A2 = a2;
    }

    void sameAvg(){
        float a=A1.floatValue()+A2.floatValue();
    }
}
