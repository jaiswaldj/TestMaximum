public class FindMax {
    public static void main(String[] args) {

    }

    public  Integer findMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber){
        if(firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0)
            return firstNumber;
        if(secondNumber.compareTo(thirdNumber) > 0)
            return secondNumber;
        return thirdNumber;
    }
    public  Double findMaximum(Double firstNumber, Double secondNUmber, Double thirdNumber){
        if(firstNumber.compareTo(secondNUmber) > 0.0 && firstNumber.compareTo(thirdNumber) > 0.0)
            return firstNumber;
        if(secondNUmber.compareTo(thirdNumber) > 0.0)
            return secondNUmber;
        return thirdNumber;
    }
}
