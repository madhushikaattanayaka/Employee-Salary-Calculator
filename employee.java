/**
 *
 * @author MADHUSHIKA
 */
import java.util.Scanner;
class employee
{   //float ot_amount;
 public static void main(String args[]) 
 {
  float basic_salary,da,ot_h,ot_rt,Total_payment,ot_amount;
  String employee_name, em_id;

  Scanner scan=new Scanner(System.in);
  
   System.out.println("Enter the name Of the Employee: ");
   employee_name =scan.nextLine();
   
   System.out.println("Enter ID Of the Employee: ");
   em_id =scan.nextLine();
  
  
  System.out.println("Enter Basic Salary Of Employee: ");
  basic_salary=scan.nextFloat();

  System.out.println("Enter OT hours of the Employee: "); 
  ot_h=scan.nextFloat();
 
  System.out.println("Enter the OT rate: ");
  ot_rt=scan.nextFloat();
  
  System.out.println("Enter the Deduction amount of the employee: ");
  da=scan.nextFloat();

  ot_amount = ot_amount(ot_h,ot_rt);
  Total_payment = Total_payment(ot_amount,basic_salary,da);
  
  
  System.out.println("__________________________SALARY DETAILS_______________________________");
  
  System.out.println("1.Name :"+employee_name);
  System.out.println("2.Employee id :"+em_id);
  System.out.println("3.Total Salary :"+Total_payment);
  }
 
 public static float ot_amount(float ot_h,float ot_rt){
    float ot_amount=ot_h*ot_rt;
    return ot_amount;
 }
 public static float Total_payment(float ot_amount,float basic_salary,float da){
    float Total_payment=ot_amount+(basic_salary-da);
    return Total_payment;
 }
//AA2109
  
}