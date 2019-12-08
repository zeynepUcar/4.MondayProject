package MyMain;

public abstract class Car_Lease {

    /*
        Create 2 string   (name , Which_Model)

        7 int (age ,salary , Total_Cost , downPayment , termofLease , leaseFee , depraction_amount )

        3  double (TaxRate , MoneyFactor , Interest_amount)




     */

    String name;

    String Which_Model;

    int age;

    int salary;

    int Total_Cost;

    int downPayment;

    int termofLease;

    int leaseFee;

    int depraction_amount;

    double TaxRate;

    double MoneyFactor;

    double Interest_amount;

    /*

        Create a constructor

        All the variables are should be as a parameter except (depraction_amount and Interest_amount)

        depraction_amount = calculate_Depreciation method (you will create this in this class)

        Interest_amount = calculate_Interest method (you will create this in this class)

     */


    public Car_Lease(String name, String Which_Model , int age , int salary, int Total_Cost , int downPayment,int termofLease, int leaseFee,double TaxRate , double MoneyFactor){

        this.name = name;

        this.Which_Model = Which_Model;

        this.age = age;

        this.salary =salary;

        this.Total_Cost=Total_Cost;

        this.downPayment=downPayment;

        this.termofLease=termofLease;

        this.leaseFee=leaseFee;

        this.TaxRate=TaxRate;

        this.MoneyFactor = MoneyFactor;


        depraction_amount = calculate_Depreciation();

        Interest_amount = calculate_Interest();
    }
/*
 Create a method

        calculate_Depreciation

        return type should be int

        calculation is :

        total cost minus down payment divide by term of lease


 */
    public int calculate_Depreciation(){

         int result = (Total_Cost - downPayment) /termofLease;

         return result;
    }

    /*
       calculate_Interest

                return type should  be double

                calculation is : total cost plus down payment multiolt by money factor

     */

    public double calculate_Interest(){

        double result = (Total_Cost + downPayment) * MoneyFactor;

         return result;
    }

    /*

        Taxes
           return type should be double

            calculation is :
            depraction_amount + Interest_amount * TaxRate

     */
    public double Taxes(){

        double result = depraction_amount + Interest_amount * TaxRate;

        return result;
    }

    /*
     getter for the (getSalary)
     */
    public int getSalary() {
        return salary;
    }


}
