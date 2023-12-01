class FirstClass{
    protected int x=30;
    private int y =90;
    public int z=98;
    int a =80;
}
class access_modifier_examples{
    public static void main(String[] args) {
        FirstClass fc = new FirstClass();
        System.out.println(fc.x);
        // System.out.println(fc.y);
        System.out.println(fc.z);
        System.out.println(fc.a);
    }
}