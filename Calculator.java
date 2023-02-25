class Calculator{
  private int a;
  private int b;
  int plus(int a,int b){
      int c=a+b;
    System.out.println(c);
  }
  int minus(int a,int b){
      int c=a-b;
      System.out.println(c);
  }
  int multiplication(int a,int b){
      int c=a*b;
      System.out.println(c);
  }
  int division(int a,int b){
      int c=a/b;
    System.out.println(c);
  }
}
class Main{
public static void main(String args[]){
    int a=10,b=5;
    Calculator cl=new Calculator();
  cl.plus(a,b);
  cl.minus(a,b);
  cl.multiplication(a,b);
  cl.division(a,b);
}
}
