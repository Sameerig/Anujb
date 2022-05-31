
public class gotn {
  public static void main(String[] args) {
      Scanner i = new Scanner(System.in);
      System.out.println("Enter the 1st number : ");
      int num1 = i.nextInt();
      Scanner ii = new Scanner(System.in);
      System.out.println("Enter the second number: ");
      int num2= ii.nextInt();	
      Scanner iii= new Scanner(System.in);
      System.out.println("Enter the third number : ");
      int num3 = iii.nextInt();

      if(num1>num2&&num1>num3) {
        System.out.println(num1+" is greater than the other two");
      }
      else if (num2>num1&&num2>num3) {
        System.out.println(num2+" is greater than the other two number");
      }
      else {
        System.out.println(num3+" is greater");
      }

    }
}
