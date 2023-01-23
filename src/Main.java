public class Main {
    public static void main(String[] args) {
        System.out.println(myMethod());
    }

    public static int myMethod(){
        int a = 1;
        int counter = 0;
        while (a<100){
        if (a%3==0&&a%4==0&&a%5==0){
            counter+=a;
        }
        a++;
        }
        return counter;
    }

}