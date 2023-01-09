import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        ex-1
        Scanner input =new Scanner(System.in);
        System.out.println("inter first number : ");
        int  first_number = input.nextInt();
        System.out.println("inter first number : ");
        int second_number = input.nextInt() ;

        int add =first_number + second_number;
        System.out.println(add);
        int subtract =first_number - second_number;
        System.out.println(subtract);
        int multiply =first_number * second_number;
        System.out.println(multiply);
        int divide =first_number / second_number;
        System.out.println(divide);
        int remainder =first_number / second_number;
        System.out.println(remainder);

//        ex-2
        String text =" THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(text.toLowerCase());

//        ex-3
//        String data=" The quick brown fox";
//        System.out.println(data.replace());

//        ex-4

        System.out.println( "inter number") ;
        int number = input.nextInt();
        if(number%2==1){
            System.out.println( 0) ;
        }else
            System.out.println( 1 );


//        ex-5
        System.out.println( "inter your role :") ;
        String role = input.nextLine();
        if(role.equals("admin") ) {
            System.out.println( "welcome admin");
        } else if(role.equals("superuser")){
            System.out.println( "welcome superuser");
        }else
            System.out.println( " welcome user");

//        ex-6
        System.out.println( "inter number 1 :") ;
        int num1 = input.nextInt();
        System.out.println( "inter number 2 :") ;
        int num2 = input.nextInt();
        System.out.println( "inter number 3 :") ;
        int num3 = input.nextInt();
        System.out.println( num1+num2) ;
        if(num1+num2==num3)
        System.out.println( true) ;
        else
            System.out.println( false) ;

//        ex-7



        int _1st = input.nextInt();
        System.out.println( "inter number 2 :") ;
        int _2nd = input.nextInt();
        System.out.println( "inter number 3 :") ;
        int _3rd = input.nextInt();
        if(_1st>_2nd &&_1st>_3rd){
            System.out.println( _1st);
        }else if(_2nd >_1st&& _2nd>_3rd){
            System.out.println( _2nd);
    }else if(_3rd>_1st&&_3rd>_2nd)
            System.out.println(_3rd);

//        ex-8
        System.out.println( "inter number :") ;
        int day_number = input.nextInt();

         if(day_number== 0){
             System.out.println( "sunday") ;
         }else if (day_number== 1){
             System.out.println( "monday");
         }else if(day_number== 2){
             System.out.println( "tuesday");
         } else if(day_number== 3){
             System.out.println( "wednesday");
         }else if(day_number== 4){
             System.out.println( "thursday");
         } else if (day_number== 5) {
             System.out.println( "friday");
         }else if(day_number== 6)
             System.out.println( "saturday");

    }}