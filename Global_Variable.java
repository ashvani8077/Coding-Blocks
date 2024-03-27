public class Global_Variable {
    static int val=100;
    public static void main(String[] args) {
        System.out.println("Hey");
        int x=60;
        System.out.println(val );
        fun(x);
        System.out.println(val);
    }

    public static void fun(int x){
        int a=90;
        System.out.println(x);
        val=120;
        System.out.println(val);
    }
}
