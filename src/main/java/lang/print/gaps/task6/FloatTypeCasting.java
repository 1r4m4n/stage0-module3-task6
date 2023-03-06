package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int result = (int) numberToBeRounded + (int) (numberToBeRounded - (int) numberToBeRounded + 0.5);
        System.out.println(result);
    }

}