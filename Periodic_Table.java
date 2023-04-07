/**Child Class also the Main Class**/
import java.io.*;//importing package io.*
public class Periodic_Table extends Periodic_Table_Data//inheriting the super class
{
    public static void main(String[]args)throws IOException//main function
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br  = new BufferedReader(in);
        Periodic_Table_Data PT = new Periodic_Table();//creating the object of the super class
        PT.inputViaFile();//function called in super class to input from files
        PT.display();//function called to show periodic table
        int ch;
        String st="yes";
        System.out.println();
        while(st.equalsIgnoreCase("yes"))
        {  
            System.out.println("****************************************************************************************************************************************************");
            System.out.println("Enter 1 to Enter Atomic Number");
            System.out.println("Enter 2 to Enter Name");
            System.out.println("Press 3 to Enter Symbol");
            System.out.println("Press 4 to Enter Atomic Mass");
            System.out.println("Enter Your Choice");
            try
            {
                ch=Integer.parseInt(br.readLine());//user entering his/her choice
            }
            catch(Exception e)
            {
                System.out.println();
                System.out.println("You have Entered Wrong Statement");
                System.out.println("Please Enter it Again!!!");
                System.out.println();
                continue;
            }
            switch(ch)//switch case
            {
                case 1:PT.inputAtomicNumber();break;//case 1 calling the function in super class to input atomic number
                case 2:PT.inputName();break;//case 2 calling the function in super class to input name
                case 3:PT.inputSymbol();break;//case 3 calling the function in super class to input symbol
                case 4:PT.inputAtomicMass();break;//case 4 calling the function in super class to input atomic mass
                default://if no case is satisfied
                System.out.println();
                System.out.println("You have Entered Wrong Choice");
                System.out.println("Please Enter it Again!!!");
                System.out.println();
            }
            if((ch>=1)&&(ch<=4))//asking the user whether he/she wants to input again or not
            {
                System.out.println();
                System.out.println("Enter Yes if you Want to Input Again");
                System.out.println("Enter any Other Button to Quit");
                st=br.readLine();
            }
        }
        /**Concluding Statements**/
        System.out.println("****************************************************************************************************************************************************");
        System.out.println("Thanking You!!!");
        System.out.println("This Project was Made by Manish M. Pillai");
        System.out.println("****************************************************************************************************************************************************");
    }
}
/**Child Class Ends Here**/