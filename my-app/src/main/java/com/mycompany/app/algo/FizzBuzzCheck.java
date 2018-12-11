package algo;

public class FizzBuzzCheck {



    public static void excuteFizzBuzz(){

        StringBuilder result = new StringBuilder();
        int five = 5;
        int three = 3;
        int total = 100;
        String Fizz = "Fizzz ";
        String Buzz = "Buz ";
        String FizzBuzz = "FizzBuzz ";
        for(int i=0;i<=total;i++){
            int a=i%three;
            int b=i%five;
            if(a==0 && b==0){
                result.append(FizzBuzz);
            }else if(a==0){
                result.append(Fizz);
            }else if(b==0){
                result.append(Buzz);
            }else{
                result.append(i+" ");
            }
        }
        System.out.println(result);
    }


}

