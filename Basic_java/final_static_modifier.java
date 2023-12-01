
public class final_static_modifier {
    static int a =30;
    int b = 45;
    public static void main(String[] args) {
        final_static_modifier f = new final_static_modifier();
        System.out.println("Original value of a :"+a);
        f.a=50;
        System.out.println(a);
        System.out.println("General variable b value:"+f.b);
        f.b=70;
        System.out.println(f.b);

        final_static_modifier f1 = new final_static_modifier();
        System.out.println(f1.a);
        System.out.println(f1.b);


    }
}
