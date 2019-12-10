package MyMa;

import java.text.DecimalFormat;

public class Toyota  extends carLease implements carInterface {


    /*
    get the connection with carLease and carInterface
        after the connection you should have constructor ,  leaseMonthlyCalculator method and isAligable method

    */

    /*
             lease_MonthlyCalculator   --->> return type is String

            calculation is --->> calculateDepreciation + calculateInterest + Taxes (these methods are coming from the carLease method)

            hint:  after the calculation result result will be 2.11222211 you need to change result as a 2.11

    */

     /*
         isAligable

            if the salary is more then Toyota_MinIncome then true else false

     */


      /*
        method name is totalCalculator

        return type is String

        calculation :  (leaseMonthlyCalculator * termofLease) + documentationFees

        hint:  after the calculation result result will be 2.11222211 you need to change result as a 2.11

     */

}