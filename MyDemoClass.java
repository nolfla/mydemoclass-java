public class MyDemoClass{
  
  public static int variableA = 4;
  public int variableB;
  
  public MyDemoClass(){
    variableA += 1;
    this.variableB = 4;
  }
  
  public static void main(String[] args){
    MyDemoClass myObject = new  MyDemoClass();
    System.out.println(myObject.variableA);
   }
   
   }
