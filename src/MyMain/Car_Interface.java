package MyMain;

public interface Car_Interface {

    /*
        Create 4 int variables variables

            Hyundai_MinIncome

            Toyota_MinIncome

            BMW_MinIncome

            documentation_Fees


            Create two methods -->

             1) return type is String ,  no parameter  ,,, name is ---> lease_MonthlyCalculator

             2) return type is boolean ,  no parameter ,,, name is ---> is_aligable


     */

    int Hyundai_MinIncome = 100000;

    int Toyota_MinIncome = 80000;

    int BMW_MinIncome = 110000;

    int documentation_Fees = 1000;

    public String lease_MonthlyCalculator();

    public boolean is_aligable();


}
