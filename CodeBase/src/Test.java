
public class Test {
public static void main(String[] args) {

int num1= 0;
int num2= 0;
for (int num3 = 0; num3 < 5; num3++) 
{
if (( ++num1 > 2 ) && (++num2 > 2)) 
{
num1++;
}
}
System.out.println(num1 + " " + num2);

}
}
