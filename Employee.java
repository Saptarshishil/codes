package general;

public class Employee {
  protected int empid;
  private String empname;
  private double basicpay;

public Employee(int empid, String empname, double basicpay){
  this.empid = empid;
  this.empname = empname;
  this.basicpay = basicpay;
}

public double earnings() {
  double da = 0.8 * basicpay;
  double hra = 0.15 * basicpay;
  return basicpay + da + hra;
}

public int getEmpid() {
  return empid;
}
public String grtEmpname() {
  return empname;
}
public double getBasicPay() {
  return basicpay;
 }
}



 

