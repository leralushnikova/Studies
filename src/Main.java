import java.io.IOException;

public class Main  {
    public static void main(String[] args) {
        Foo foo = new Bar();
        foo.doStuff(1, "1");
    }
}
class Foo{
    public void doStuff(int y, String s){
        System.out.println("doStuff in Foo");
    }

    public void moreThings(int x) {
    }
}
class Bar extends Foo{
    public void doStuff(int y, long s) throws IOException{
        System.out.println("doStuff in Bar");
    }
}