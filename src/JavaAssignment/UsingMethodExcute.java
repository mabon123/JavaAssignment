package JavaAssignment;

public class UsingMethodExcute {
    public static void main(String[] args) {
        UsingMethod usingMethod=new UsingMethod();
        usingMethod.setValue1(20);
        usingMethod.setValue2(10);
        System.out.println("Sum Of:" + usingMethod.getValue1() + " + " + usingMethod.getValue2() + " = " + usingMethod.getsumResult());
        System.out.println("Minus Of:" + usingMethod.getValue1() + " - " + usingMethod.getValue2() + " = " + usingMethod.getminusResult());
        System.out.println("Rank Of:" + usingMethod.getValue1() + " / " + usingMethod.getValue2() + " = " + usingMethod.getrankResult());
        System.out.println("Average Of:" + usingMethod.getValue1() + " x " + usingMethod.getValue2() + " = " + usingMethod.getEverageResult());
    }
}
