public class Fun_Demo2 {
    public static void main(String[] args) {
        int a=343;
        int b=234;
        add(a,b);
        sub(a,b);

        int re=add2(a,b);
        System.out.println(re);
    }

    public static void add(int a,int b){
        System.out.println(a+b);
    }

    public static void sub(int a,int b){
        System.out.println(a-b);
    }

    public static int add2(int a,int b){
        return a+b;
    }
}
