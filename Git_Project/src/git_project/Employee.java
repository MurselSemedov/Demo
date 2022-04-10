package git_project;
public class Employee {
public String name;
          public double salary;
          public int workHours,HireYear;
          Employee(int workHours,int HireYear,double salary,String name)
          {
              this.HireYear=HireYear;
              this.workHours=workHours;
              this.name=name;
              this.salary=salary;
          }
          double tax()
          {
              if(this.salary>1000)
                     return this.salary*0.03;
              return 0.0;
          }
          double Bonus()
          {
              if(this.workHours-40>0)
                     return 30*(this.workHours-40);
              return 0.0;
          }
          double RaiseSalary()
          {
                     if (2020-this.HireYear<10)
                         return this.salary*0.05;
                     else if ((2020-this.HireYear>9)&&(2020-this.HireYear<20))
                         return this.salary*0.1;
                     else
                         return this.salary*0.15;
          }
          void tostring()
          {
              System.out.println("Name:"+this.name);
              System.out.println("Salary:"+this.salary);
              System.out.println("Hire Date:"+this.HireYear);
              System.out.println("Work Hours:"+this.workHours);
              System.out.println("Tax:"+this.tax());
              System.out.println("Bonus:"+this.Bonus());
              System.out.println("Raise of Salary:"+this.RaiseSalary());
          }
          public static void main(String[] args)
          {
                    Employee emp1=new Employee(45,1985,2000.0,"Kamal");
                    emp1.tostring();
                    System.out.println("Salary with tax and bonus:"+(emp1.salary-emp1.tax()+emp1.Bonus()));
                    System.out.println("Total Salary with the raise of salary:"+(emp1.salary+emp1.RaiseSalary()));
          }
}
