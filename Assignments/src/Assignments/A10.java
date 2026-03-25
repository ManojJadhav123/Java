package Assignments;

public class A10 {

//    public A10(String []args){ // question 1
//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
//        int c = a + b;
//        System.out.println("sum is " + c);
//    }

//    public A10(String []args){ // question 2
//        int sum = 0;
//        for (int i = 0; i<args.length; i++){
//            sum += Integer.parseInt(args[i]);
//        }
//        System.out.println("sum is " + sum);
//    }

//    public A10(String []args){ // question 2
//        for (int i = 0; i<args.length; i++){
//            System.out.println(args[i]);
//        }
//    }
//    public A10(String []args){ // question 2
//        for (int i = 0; i<args.length; i++){
//            int a = Integer.parseInt(args[0]);
//            int b = Integer.parseInt(args[1]);
//            int L ;
//            for(L = a>b ? a : b; L <= a*b; L++){
//                if(L%a ==0 && L%b == 0){
//                    break;
//                }
//                System.out.println(L);
//            }
//        }
//    }

    public A10(String []args){ // question 2

            int a = Integer.parseInt(args[0]);
            int i;
            for (i = 2; i<a ;i++){
                if(a%2 == 0){
                    break;
                }
                if(i == a){
                    System.out.println("prime");
                }
                else System.out.println("not prime");
            }
    }



    public void driver(){

    }

}
