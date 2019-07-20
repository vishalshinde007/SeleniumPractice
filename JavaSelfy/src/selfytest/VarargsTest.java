package selfytest;

public class VarargsTest {

public void printValues(String... a, int b) {
System.out.print(a[a.length - 1] + " ");
}
public static void main(String[] args) {
VarargsTest test1 = new VarargsTest();
test1.printValues("Hello","Hi","Welcome", 10);
test1.printValues("Hello", 20);
}
}
