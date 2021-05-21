package com.assignment;

public class employeeWage {
    public static final int IS_FULL_TIME = 2;
    public static final int DAYS_PER_MONTH = 20;
    public static final int IS_PART_TIME = 1;
    public static final int TOTAL_WORK_HOURS = 100;
    public static final int WAGE_PER_HOUR = 20; // public static because they are to be used in the entire code and
    // final because the values are constant

    public static int calculateWage(){
        int emp_monthly_wage = 0;
        int totalHours = 0;
        int totalDays = 0;
        while (totalHours < TOTAL_WORK_HOURS && totalDays < DAYS_PER_MONTH) {
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
            emp_daily_wage = emp_hours * WAGE_PER_HOUR;
            emp_monthly_wage += emp_daily_wage;
            totalDays++;
            totalHours++;
        }

        System.out.println("ëmployee wage of the month is :" + emp_monthly_wage);
        return emp_monthly_wage;
    }
    public static void main(String args[]) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        calculateWage();



    }
}