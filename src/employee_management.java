import java.util.Scanner;
public class employee_management
{
    String name,employee_id,email_id;
    String department,company_name;
    float asses1,asses2,asses3,asses4,asses5;
    float  x,average,target,basic_salary;
    long mobile_number;
    Double netSalary;
    public void get_Data()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name :");
         name=scan.nextLine();
        System.out.println(" Enter Employee ID :");
         employee_id=scan.next();
        System.out.println("Enter Mobile number :");
         mobile_number=scan.nextLong();
        System.out.println("Enter Email ID:");
         email_id=scan.next();
        System.out.println("Assesment1:");
         asses1=scan.nextFloat();
        System.out.println("Assesment2:");
         asses2=scan.nextFloat();
        System.out.println("Assesment3:");
         asses3=scan.nextFloat();
        System.out.println("Assesment4:");
         asses4=scan.nextFloat();
        System.out.println("Assesment5:");
         asses5=scan.nextFloat();
        System.out.println("Department:");
         department=scan.next();
         if(department.equalsIgnoreCase("sales"))
         {
             System.out.println("Enter target :");
             target=scan.nextFloat();
         }
        System.out.println("company name:");
         company_name =scan.next();
        System.out.println("Salary:");
         basic_salary=scan.nextFloat();
    }
    public void print_Data()
    {
        System.out.println("Name         :"+name);
        System.out.println("Employee Id  :" +employee_id );
        System.out.println("Mobil number :"+mobile_number);
        System.out.println("Email ID     :"+email_id);
        System.out.println("Assessment1  :"+asses1);
        System.out.println("Assessment2  :"+asses2);
        System.out.println("Assessment3  :"+asses3);
        System.out.println("Assessment4  :"+asses4);
        System.out.println("Assessment5  :"+asses5);
        System.out.println("Department   :"+department);
        System.out.println("company name :"+company_name);
        System.out.println("Average      :"+average);
    }
    public void average()
    {
       x =  asses1+ asses2+ asses3+ asses4+ asses5;
       average= x/5;
    }

   public void designation()
   {
       if(average >= 90 && average <= 100) {
           System.out.println("A Grade");
           System.out.println("Project manager");
       }
       else if(average > 80 && average <= 90)
       {
           System.out.println("B Grade");
           System.out.println("Developer");
       }
       else if(average >=70 && average <= 80)
       {
           System.out.println(" C Grade");
           System.out.println("Junior Programmer");
       }
       else if(average >=60 && average <= 70)
       {
           System.out.println(" D Grade");
           System.out.println("Database Designer");
       }
       else if(average > 50 && average <= 60)
       {
           System.out.println("E Grade");
           System.out.println("tester");
       }
       else if(average > 0 && average <= 50)
       {
           System.out.println("F Grade");
           System.out.println("On Bench");
       }
   }
   public void salary()
   {
       netSalary=basic_salary+(0.35*basic_salary)+(0.50*basic_salary);
   }

   public void bonus() {
       if ((target > 100) && (target <= 200))
           {
               System.out.println("bonus=" + (basic_salary * 10) / 100);
           }
           else if ((target > 200) && (target <= 250))
           {
               System.out.println("bonus=" + (basic_salary * 20) / 100);
           } else if (target > 250 && target <= 300)
           {
               System.out.println("bonus=" + (basic_salary * 40) / 100);
           } else if (target > 300)
           {
               System.out.println("bonus=" + (basic_salary * 50) / 100);
           }
       }
       public static void main(String[] args)
        {
        employee_management t1=new employee_management();
        System.out.println("******employee Management******");
        t1.get_Data();
        t1.average();
        t1.designation();
        t1.salary();
        t1.bonus();
        t1.print_Data();
        }
}
