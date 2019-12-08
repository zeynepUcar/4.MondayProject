package MyMain;

import java.text.DecimalFormat;

public class Hyundai extends Car_Lease implements Car_Interface{

    /*

      get the connection with CarLease and Car_Interface
        after the connection you should have constructor ,  lease_MonthlyCalculator method and is_aligable method

    */
    public Hyundai(String name, String Which_Model, int age, int salary, int Total_Cost, int downPayment, int termofLease, int leaseFee, double TaxRate, double MoneyFactor) {
        super(name, Which_Model, age, salary, Total_Cost, downPayment, termofLease, leaseFee, TaxRate, MoneyFactor);
    }


    /*
             lease_MonthlyCalculator   --->> return type is String

            calculation is --->> calculate_Depreciation + calculate_Interest + Taxes (these methods are coming from the Car_Lease method)

            hint:  after the calculation result result will be 2.11222211 you need to change result as a 2.11

    */
    @Override
    public String lease_MonthlyCalculator() {

        double result =  calculate_Depreciation() + calculate_Interest() + Taxes();

        DecimalFormat df = new DecimalFormat("0.00");

        String st = df.format(result);

        return st;

    }

     /*
         is_aligable

            if the salary is more then Hyundai_MinIncome then true else false

     */
     @Override
     public boolean is_aligable() {

         boolean result = false;

         if(getSalary()>Hyundai_MinIncome){

             result = true;

         }

         return result;

     }

      /*
        method name is Total_Calculator

        return type is String

        calculation :  (lease_MonthlyCalculator * termofLease) + documentation_fees

        Format the calculation result

        hint:  after the calculation result result will be 2.11222211 you need to change result as a 2.11

     */
      public String Total_Calculator(){

          double num = Double.parseDouble(lease_MonthlyCalculator());
          double result = (num * termofLease) + documentation_Fees;

          DecimalFormat df = new DecimalFormat("0.00");

          String st = df.format(result);

          return st;

      }
}
