class Fibonacci{
public static void main(String args[]){
int a=0;
int b=1;
int c=0;
System.out.print(a+" "+b);
for(int i=0;i<8;i++) {
   c=a+b;
   a=b;
   b=c;
System.out.print(" "+c);
}
}
}https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html
https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html