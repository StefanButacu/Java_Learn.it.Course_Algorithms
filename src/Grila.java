public class Grila {
    public static void main(String[] args) {
        A[] classes = new A[]{new A(), new B()};
        for(A x: classes)
            x.print();
    }
public static class A{
        public A() {
            System.out.print("A");
        }
        void print(){
            System.out.print("A");
        }
}
public static class B extends A{
        public B(){
            System.out.print("B");
        }
        void print(){
            System.out.print("B");
        }
    }
}

