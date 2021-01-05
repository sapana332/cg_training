class ReverseNumber{
public static void main(String args[]){
int input=12345678;
int rem=0;
while(input>0) {
rem=input%10;
System.out.print(rem);
input=input/10;
}
}
}