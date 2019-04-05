class FizzBuzz {
    private final static String FIZZBUZZ="FizzBuzz";
    private final static String FIZZ="Fizz";
    private final static String BUZZ="Buzz";
    static String fizzBuzz(int number){
        boolean isFizz=number%3==0;
        boolean isBuzz=number%5==0;
        if(isFizz&&isBuzz)
            return FIZZBUZZ;

        if(isFizz)
            return FIZZ;

        if(isBuzz)
            return BUZZ;

        return number + "";
    }
}
