import java.util.Scanner;
class BMI 
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);

      System.out.print("Enter your weight in kilo =>");
      Double W = sc.nextDouble();
      System.out.print("Enter your high in centimeter =>");
      Double H = sc.nextDouble();

      Double HM = H/100;
      Double BMI = W/(HM*HM);

      System.out.printf("Your BMI is: %.2f\n",BMI);

        if (BMI < 18.5 )
        {
            System.out.print("Underweight");
        }
        else if (BMI>= 18.5 && BMI < 25) 
        {
            System.out.print("Normal");
        }
        else if (BMI >= 25 && BMI < 30) 
        {
            System.out.print("Overweight");
        }
        else if (BMI >= 30) 
        {
            System.out.print("Obese");
        }

  }

}