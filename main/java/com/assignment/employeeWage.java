package com.assignment;

public class employeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME=2;

    private final String company;
    private final int DAYS_PER_MONTH;
    private final int TOTAL_WORK_HOURS;
    private final int WAGE_PER_HOUR;
    public employeeWage(String company, int DAYS_PER_MONTH, int TOTAL_WORK_HOURS, int WAGE_PER_HOUR){
        this.company=company;
        this.DAYS_PER_MONTH=DAYS_PER_MONTH;
        this.TOTAL_WORK_HOURS=TOTAL_WORK_HOURS;
        this.WAGE_PER_HOUR=WAGE_PER_HOUR;
    }


    public static void main(String args[]) {
        employeeWage dMart=new employeeWage("DMART",20,8,100);
        employeeWage reliance=new employeeWage("RELIANCE",25,6,80);
        int emp_monthly_wage = 0;
        int totalHours = 0;
        int totalDays = 0;
        while (totalHours < dMart.TOTAL_WORK_HOURS && totalDays < dMart.DAYS_PER_MONTH) {
            int emp_hours = 0;
            int emp_daily_wage = 0;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    emp_hours = 8;
                    break;
                case IS_PART_TIME:
                    emp_hours = 4;
                    break;
                default:
                    emp_hours = 0;
            }
            emp_daily_wage = emp_hours * dMart.WAGE_PER_HOUR;
            emp_monthly_wage += emp_daily_wage;
            totalDays++;
            totalHours++;
        }

        System.out.println("ëmployee wage of the month is :" + emp_monthly_wage);

    }
}