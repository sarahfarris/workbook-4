public class Employee {


    double regularHours;
    double overtimeHours;
    double payRate;
    double totalPay;

    // this is the constructor
    Employee (double regularHours, double overtimeHours, double payRate) {
        this.payRate = payRate;
        this.regularHours = regularHours;
        this.overtimeHours = overtimeHours;

    }


    public double getTotalPay() {
        this.totalPay = (payRate * regularHours) + (payRate * overtimeHours);
        return (payRate * regularHours) + (payRate * overtimeHours);
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public double getRegularHours() {
        return regularHours;
    }
    public double getOvertimeHours() {
        return overtimeHours;
    }
}
