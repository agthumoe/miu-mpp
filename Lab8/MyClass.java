public class MyClass {
    private int x ;
    private String y;
    public MyClass(int x, String y) {
        this.x = x;
        this.y = y;
    }
    // testing method to check the equality
    public void myMethod(MyClass cl) {
        System.out.println(this.equals(cl));
    }

    @Override
    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(ob.getClass() != getClass()) return false;
        MyClass mc = (MyClass)ob;
        return mc.x == x && mc.y.equals(y);
    }

    public static void main(String[] args) {
        MyClass myclass = new MyClass(1, "A");
        MyClass myclass1 = new MyClass(1,"B");
        myclass.myMethod(myclass); //
        myclass.myMethod(myclass1);
    }
}
