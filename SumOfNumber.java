class SumOfNumber{
public static void main(String args[]){
int input=154;
int used=input;
int sum=0;
int rem=0;
while(input>0){
rem=input%10;
sum+=rem;
input=input/10;
}
System.out.println("The Sum of Number "+used+" is "+sum);
}
}