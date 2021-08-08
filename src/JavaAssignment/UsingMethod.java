package JavaAssignment;

public class UsingMethod {
    private int Value1;
    private int Value2;
    private int Result;

    public int getValue1() {
        return Value1;
    }

    public void setValue1(int value1) {
        Value1 = value1;
    }

    public int getValue2() {
        return Value2;
    }

    public void setValue2(int value2) {
        Value2 = value2;
    }
    public int getsumResult(){
        return getValue1()+getValue2();
    }
    public int getminusResult(){
        return getValue1()-getValue2();
    }
    public int getrankResult(){
        return getValue1()/getValue2();
    }
    public int getEverageResult(){
        return getValue1()*getValue2();
    }
}
