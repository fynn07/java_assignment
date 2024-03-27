public class Arithmetic <T extends Number>{

    private T firstNumber;
    private T secondNumber;

    public Arithmetic(T firstNumber, T secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void getType(){
        System.out.println(firstNumber.getClass());
        System.out.println(secondNumber.getClass());
    }

    public Number add(){
        return firstNumber.floatValue() + secondNumber.floatValue();
    }

    public Number subtract(){
        return firstNumber.floatValue() - secondNumber.floatValue();
    }

    public Number multiply(){
        return firstNumber.floatValue() * secondNumber.floatValue();
    }

    public Number divide(){
        return firstNumber.floatValue() / secondNumber.floatValue();
    }

    public Number getMin(){
        return (firstNumber.floatValue() < secondNumber.floatValue()) ? firstNumber : secondNumber;
    }

    public Number getMax(){
        return (firstNumber.floatValue() > secondNumber.floatValue()) ? firstNumber : secondNumber;
    }

}
