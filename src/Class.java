import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a!=b){
            if(a<b) {
                System.out.println(a);
                a++;
            } else if (b<a){
            System.out.println(a);
            a--;
                System.out.println("123456");
            }
        }
        System.out.println(a);
    }
}
