import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMax < E extends Comparable<E>> {

    E firstParameter, secondParameter, thirdParameter, fourthParameter, fifthParameter , sixthParameter;
    FindMax(E firstParameter ,E secondParameter ,E thirdParameter,E fourthParameter, E fifthParameter , E sixthParameter){
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
        this.thirdParameter = thirdParameter;
        this.fourthParameter = fourthParameter;
        this.fifthParameter = fifthParameter;
        this.sixthParameter = sixthParameter;
    }


    public static  <E extends Comparable <E>> E findMaximumGeneric( E firstParameter, E  secondParameter, E thirdParameter ,E fourthParameter, E fifthParameter , E sixthParameter) {

        List<E> testList = new ArrayList<>();
        testList.add(firstParameter);
        testList.add(secondParameter);
        testList.add(thirdParameter);
        testList.add(fourthParameter);
        testList.add(fifthParameter);
        testList.add(sixthParameter);

        Collections.sort(testList, (E n1, E n2) -> n1.compareTo(n2));
        return testList.get(5);
    }

    public  E findMaximum(){
        return FindMax.findMaximumGeneric(firstParameter,secondParameter,thirdParameter,fourthParameter,fifthParameter,sixthParameter);
    }

    public void printMaximum(){

        System.out.println("THE MAXIMUM OF :"+firstParameter+" , "+secondParameter+" , "+thirdParameter+" , "+fourthParameter+" , "+fifthParameter+" , "+sixthParameter+" IS :");
        System.out.println(findMaximumGeneric(firstParameter,secondParameter,thirdParameter,fourthParameter,fifthParameter,sixthParameter));

    }

    public static void main(String[] args) {
        new FindMax(12.2678,12.2679,12.2677,12.789,12.2675,12.2673).printMaximum();
        new FindMax("Shreyas Iyyer","Prithvi Shaw","Rishbah Pant","Jadeza","Kohli","ABD").printMaximum();
    }

}