/* 
    THIS CODE IS FOR CALCULATING THE GROSS SALARY OF AN EMPLOYEE
*/

public class Main {

    public static int GrossSalary(int hours, int money, int vacation){
        int actual_hours = (hours * 52) - (vacation * 8); //it calculates the total working hours after cutting the vacation days
        int SalaryPerYear = actual_hours * money; //multiplying total hours of year with hourly salary
        return SalaryPerYear;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me how many hours you are working per week?"); //asking to employee for their working hours per week
        int NumOfHoursPerWeek = sc.nextInt(); //taking input as number of working hours per week
        
        System.out.println("How much you get paid per hour?"); //asking to employee for their hourly salary
        int MoneyPerHour = sc.nextInt(); //taking input as salary per hour
        
        System.out.println("And how many days you are getting the holiday throughout the year?"); //asking employee for their total vacation days per year
        int VacationDays = sc.nextInt();
        
        int salary = GrossSalary(NumOfHoursPerWeek,MoneyPerHour,VacationDays); //passing all these three values to GrossSalary function
        
        System.out.println("Your total gross salary after cutting your vacation days is: "+ salary);
    }

}
