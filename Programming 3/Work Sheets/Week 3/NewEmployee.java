/* NewEmployee.java        Authors: Koffman & Wolz
 * Superclass of employee classes.
 * Uses String
 */
public class NewEmployee {

  // data fields
  private String name = "";
  private String socSecNum = "";
  private String jobTitle = "";
  private String address = "";
  private String phoneNumber = "";
  private int age;
  private int startYear;
  private double totalPay;

  // methods
  // constructors 
  public NewEmployee() {
  } 

  public NewEmployee(String name, String social) {
    this.name = name;
    socSecNum = social;
  }

  public NewEmployee(String name, String social, String job,
                     String address, String phone, 
                     int age, int year, double totPay) {
    this.name = name;
    socSecNum = social;
    jobTitle = job;
    this.address = address;
    phoneNumber = phone;
    this.age = age;
    startYear = year;
    totalPay = totPay;
  }

  // modifiers
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Insert other modifiers here.
  // . . .

  // accessors
  public String getName() {
    return name;
  }

  public String getSocial() {
    return socSecNum;
  }

  public int getAge() {
    return age;
  }

  public double getTotalPay() {
    return totalPay;
  }

  // Insert other accessors here.
  // . . .

  // precondition: the argument is the current year
  // postcondition: Returns the number of years worked 
  public int calcYearsService(int year) {
    return year - startYear;
  }

  // postcondition: Returns the number of years until employee
  //   will reach the retirement age of 65. Returns 0 if employee
  //   has reached retirement age. 
  public int calcYearsToRetire() {
    int RETIREMENT_AGE = 65;  // normal retirement age
    int yearsToRetire = RETIREMENT_AGE - age;
    if (yearsToRetire > 0)
      return yearsToRetire;
    else
      return 0;
  }

  public void updateTotalPay(double pay) {
    totalPay += pay;
  }

  // postcondition: Returns the object's state as a string 
  public String toString() {
    return "name: " + name + ", social security: " + socSecNum +
           ", job: " + jobTitle + "\naddress: " + address +
           ", phone: " + phoneNumber + ", age: " + age +
           ", year started: " + startYear +
           ", total pay $" + totalPay;
  }

  // postcondition: Returns true if this object has the same
  //   social security number as the argument. 
  public boolean equals(NewEmployee emp) {
    return this.socSecNum.equals(emp.socSecNum);
  }

}

