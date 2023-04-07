/**Super Class containing the Data**/
import java.io.*;//importing package io.*
import java.util.*;//importing package util.*
public class Periodic_Table_Data
{
    /**Instance Variables to store Data from the Files**/
    final int Max;;
    String abundance[];
    int atomic_number[];
    double atomic_mass[];
    int mass_number[];
    String atomic_radius[];
    String boiling_point[];
    String density[];
    String electron_affinity[];
    String electronegetivity[];
    String electronic_configuration[];
    String group[];
    String ionisation_enthalpy[];
    String latin_name[];
    String melting_point[];
    String name[];
    String origin_of_name[];
    String period[];
    String specific_heat_capacity[];
    String symbol[];
    Periodic_Table_Data()//constructor to declare all the arrays of size Max(i.e. 118)
    {
        Max=118;
        abundance = new String[Max];
        mass_number = new int[Max];
        atomic_number = new int[Max];
        atomic_mass = new double[Max];
        atomic_radius = new String[Max];
        boiling_point = new String[Max];
        density = new String[Max];
        electron_affinity = new String[Max];
        electronegetivity = new String[Max];
        electronic_configuration = new String[Max];
        group = new String[Max];
        ionisation_enthalpy = new String[Max];
        latin_name = new String[Max];
        melting_point = new String[Max];
        name = new String[Max];
        origin_of_name = new String[Max];
        period = new String[Max];
        specific_heat_capacity = new String[Max];
        symbol = new String[Max];
    }
    void inputViaFile()throws IOException//function to input data from Files
    {
        int i;
        for(i=0;i<Max;i++)//inputting the atomic number in the array
        {
            atomic_number[i]=i+1;
        }
        /**Creating the variables for inputting via Files**/
        FileReader fr1 = new FileReader("Data/Abundance.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        FileReader fr2 = new FileReader("Data/Atomic Mass.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        FileReader fr3 = new FileReader("Data/Atomic Radius.txt");
        BufferedReader br3 = new BufferedReader(fr3);
        FileReader fr4 = new FileReader("Data/Boiling Point.txt");
        BufferedReader br4 = new BufferedReader(fr4);
        FileReader fr5 = new FileReader("Data/Density.txt");
        BufferedReader br5 = new BufferedReader(fr5);
        FileReader fr6 = new FileReader("Data/Electron Affinity.txt");
        BufferedReader br6 = new BufferedReader(fr6);
        FileReader fr7 = new FileReader("Data/Electronegetivity.txt");
        BufferedReader br7 = new BufferedReader(fr7);
        FileReader fr8 = new FileReader("Data/Electronic Configuration.txt");
        BufferedReader br8 = new BufferedReader(fr8);
        FileReader fr9 = new FileReader("Data/Group.txt");
        BufferedReader br9 = new BufferedReader(fr9);
        FileReader fr10 = new FileReader("Data/Ionisation Enthalpy.txt");
        BufferedReader br10 = new BufferedReader(fr10);
        FileReader fr11 = new FileReader("Data/Latin Name.txt");
        BufferedReader br11 = new BufferedReader(fr11);
        FileReader fr12 = new FileReader("Data/Melting Point.txt");
        BufferedReader br12 = new BufferedReader(fr12);
        FileReader fr13 = new FileReader("Data/Name.txt");
        BufferedReader br13 = new BufferedReader(fr13);
        FileReader fr14 = new FileReader("Data/Origin of Name.txt");
        BufferedReader br14 = new BufferedReader(fr14);
        FileReader fr15 = new FileReader("Data/Period.txt");
        BufferedReader br15 = new BufferedReader(fr15);
        FileReader fr16 = new FileReader("Data/Specific Heat Capacity.txt");
        BufferedReader br16 = new BufferedReader(fr16);
        FileReader fr17 = new FileReader("Data/Symbol.txt");
        BufferedReader br17 = new BufferedReader(fr17);
        /**Inputting from Files**/
        i=0;
        while(i<Max)//inputting the abundance in the array
        {
            abundance[i]=br1.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the atomic mass in the array
        {
            atomic_mass[i]=Double.parseDouble(br2.readLine());
            mass_number[i]=(int)Math.round(atomic_mass[i]);
            i++;
        }
        i=0;
        while(i<Max)//inputting the atomic radius in the array
        {
            atomic_radius[i]=br3.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the boiling point in the array
        {
            boiling_point[i]=br4.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the density in the array
        {
            density[i]=br5.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the electron affinity in the array
        {
            electron_affinity[i]=br6.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the electronegetivity in the array
        {
            electronegetivity[i]=br7.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the electronic configuration in the array
        {
            electronic_configuration[i]=br8.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the group in the array
        {
            group[i]=br9.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the ionisation enthalpy in the array
        {
            ionisation_enthalpy[i]=br10.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the latin name in the array
        {
            latin_name[i]=br11.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the melting point in the array
        {
            melting_point[i]=br12.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the name in the array
        {
            name[i]=br13.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the origin of name in the array
        {
            origin_of_name[i]=br14.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the period in the array
        {
            period[i]=br15.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the specific heat capacity in the array
        {
            specific_heat_capacity[i]=br16.readLine();
            i++;
        }
        i=0;
        while(i<Max)//inputting the symbol in the array
        {
            symbol[i]=br17.readLine();
            i++;
        }
        /**Closing all the Files**/
        br1.close();
        br2.close();
        br3.close();
        br4.close();
        br5.close();
        br6.close();
        br7.close();
        br8.close();
        br9.close();
        br10.close();
        br11.close();
        br12.close();
        br13.close();
        br14.close();
        br15.close();
        br16.close();
        br17.close();
    }
    void display()//display function to show the structure of periodic table
    {
        int i,j;
        System.out.println("****************************************************PERIODIC TABLE**********************************************************************************");
        System.out.print("   \t");
        for(j=1;j<=18;j++)
        {
            if(j<=9)
            System.out.print(j+" \t");
            else
            System.out.print(j+"\t");
        }
        System.out.println();
        System.out.println("   ________________________________________________________________________________________________________________________________________________");
        System.out.print("1 |\t");
        System.out.print(symbol[0]+" ");
        for(j=0;j<=16;j++)
        System.out.print("  \t");
        System.out.println(symbol[1]);
        System.out.print("2 |\t");
        for(i=3;i<=10;)
        {
            if(i==5)
            {
                for(j=1;j<=10;j++)
                System.out.print("  \t");
            }
            if(symbol[i-1].length()==2)
            {
                System.out.print(symbol[i-1]+"\t");
                i++;
            }
            else
            {
                System.out.print(symbol[i-1]+" \t");
                i++;
            }
        }
        System.out.println();
        System.out.print("3 |\t");
        for(i=11;i<=18;)
        {
            if(i==13)
            {
                for(j=1;j<=10;j++)
                System.out.print("  \t");
            }
            if(symbol[i-1].length()==2)
            {
                System.out.print(symbol[i-1]+"\t");
                i++;
            }
            else
            {
                System.out.print(symbol[i-1]+" \t");
                i++;
            }
        }
        System.out.println();
        System.out.print("4 |\t");
        for(i=19;i<=36;)
        {
            if(symbol[i-1].length()==2)
            {
                System.out.print(symbol[i-1]+"\t");
                i++;
            }
            else
            {
                System.out.print(symbol[i-1]+" \t");
                i++;
            }
        }
        System.out.println();
        System.out.print("5 |\t");
        for(i=37;i<=54;)
        {
            if(symbol[i-1].length()==2)
            {
                System.out.print(symbol[i-1]+"\t");
                i++;
            }
            else
            {
                System.out.print(symbol[i-1]+" \t");
                i++;
            }
        }
        System.out.println();
        System.out.print("6 |\t");
        for(i=55;i<=86;)
        {
            if(i==58)
            {
                i=72;
                continue;
            }
            if(symbol[i-1].length()==2)
            {
                System.out.print(symbol[i-1]+"\t");
                i++;
            }
            else
            {
                System.out.print(symbol[i-1]+" \t");
                i++;
            }
        }
        System.out.println();
        System.out.print("7 |\t");
        for(i=87;i<=118;)
        {
            if(i==90)
            {
                i=104;
                continue;
            }
            if(symbol[i-1].length()==2)
            {
                System.out.print(symbol[i-1]+"\t");
                i++;
            }
            else
            {
                System.out.print(symbol[i-1]+" \t");
                i++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Lanthanoids:-");
        for(i=58;i<=71;i++)
        {
            if(symbol[i-1].length()==2)
            System.out.print(symbol[i-1]+"\t");
            else
            System.out.print(symbol[i-1]+" \t");
        }
        System.out.println();
        System.out.println("Actinoids:-");
        for(i=90;i<=103;i++)
        {
            if(symbol[i-1].length()==2)
            System.out.print(symbol[i-1]+"\t");
            else
            System.out.print(symbol[i-1]+" \t");
        }
    }
    void inputAtomicNumber()//function to accept atomic number from the user
    {
        Scanner sc = new Scanner(System.in);
        boolean b=false;
        int i=-1;
        int an;
        while(b==false)
        {
            try
            {
                System.out.println();
                System.out.println("Enter the Atomic Number of the Element");
                an=Integer.parseInt(sc.next());
            }
            catch(Exception e)
            {
                System.out.println();
                System.out.println("You have Entered Wrong Statement");
                System.out.println("Please Enter it Again!!!");
                System.out.println();
                continue;
            }
            for(i=0;i<Max;i++)
            {
                if(atomic_number[i]==an)
                {
                    b=true;
                    break;
                }
            }
            if(b==false)
            {
                System.out.println();
                System.out.println("You have Entered Wrong Atomic Number");
                System.out.println("Please Enter it Again!!!");
            }
        }
        /**Printing the Details of the Element**/
        System.out.println("****************************************************************************************************************************************************");
        System.out.println("Element Name => "+name[i]);
        System.out.println("Symbol => "+symbol[i]);
        System.out.println("Atomic Number => "+atomic_number[i]);
        System.out.println("Atomic Mass => "+atomic_mass[i]+" amu");
        System.out.println("Electronic Configuration => "+electronic_configuration[i]);
        System.out.println("Period => "+period[i]);
        System.out.println("Group => "+group[i]);
        System.out.println("Latin Name => "+latin_name[i]);
        System.out.println("Origin of Name => "+origin_of_name[i]);
        if(abundance[i].equals("--"))
        {
            System.out.println("Abundance => N/A");
        }
        else
        {
            System.out.println("Abundance => "+abundance[i]+" mg/kg");
        }
        if(density[i].equals("--"))
        {
            System.out.println("Density => N/A");
        }
        else
        {
            System.out.println("Density => "+density[i]+" g/cm^(-3)");
        }
        if(melting_point[i].equals("--"))
        {
            System.out.println("Melting Point => N/A");
        }
        else
        {
            System.out.println("Melting Point => "+melting_point[i]+" C'");
        }
        if(boiling_point[i].equals("--"))
        {
            System.out.println("Boiling Point => N/A");
        }
        else
        {
            System.out.println("Boiling Point => "+boiling_point[i]+" C'");
        }
        if(ionisation_enthalpy[i].equals("--"))
        {
            System.out.println("Ionisation Enthalpy => N/A");
        }
        else
        {
            System.out.println("Ionisation Enthalpy => "+ionisation_enthalpy[i]+" eV");
        }
         if(electron_affinity[i].equals("--"))
        {
            System.out.println("Electron Affinity => N/A");
        }
        else
        {
            System.out.println("Electron Affinity => "+electron_affinity[i]+" eV");
        }
        if(electronegetivity[i].equals("--"))
        {
            System.out.println("Electronegetivity => N/A");
        }
        else
        {
            System.out.println("Electronegetivity => "+electronegetivity[i]+" X");
        }
        if(atomic_radius[i].equals("--"))
        {
            System.out.println("Atomic Radius => N/A");
        }
        else
        {
            System.out.println("Atomic Radius => "+atomic_radius[i]+" A'");
        }
        if(specific_heat_capacity[i].equals("--"))
        {
            System.out.println("Specific Heat Capacity => N/A");
        }
        else
        {
            System.out.println("Specific Heat Capacity => "+specific_heat_capacity[i]+" J/kg-K");
        }
        System.out.println("****************************************************************************************************************************************************");
    }
    void inputName()//function to accept name from the user
    {
        Scanner sc = new Scanner(System.in);
        boolean b=false;
        int i=-1;
        String n;
        while(b==false)
        {
            System.out.println();
            System.out.println("Enter the Name of the Element");
            n=sc.next();
            for(i=0;i<Max;i++)
            {
                if(name[i].equalsIgnoreCase(n))
                {
                    b=true;
                    break;
                }
            }
            if(b==false)
            {
                System.out.println();
                System.out.println("You have Entered Wrong Name");
                System.out.println("Please Enter it Again!!!");
            }
        }
        /**Printing the Details of the Element**/
        System.out.println("****************************************************************************************************************************************************");
        System.out.println("Element Name => "+name[i]);
        System.out.println("Symbol => "+symbol[i]);
        System.out.println("Atomic Number => "+atomic_number[i]);
        System.out.println("Atomic Mass => "+atomic_mass[i]+" amu");
        System.out.println("Electronic Configuration => "+electronic_configuration[i]);
        System.out.println("Period => "+period[i]);
        System.out.println("Group => "+group[i]);
        System.out.println("Latin Name => "+latin_name[i]);
        System.out.println("Origin of Name => "+origin_of_name[i]);
        if(abundance[i].equals("--"))
        {
            System.out.println("Abundance => N/A");
        }
        else
        {
            System.out.println("Abundance => "+abundance[i]+" mg/kg");
        }
        if(density[i].equals("--"))
        {
            System.out.println("Density => N/A");
        }
        else
        {
            System.out.println("Density => "+density[i]+" g/cm^(-3)");
        }
        if(melting_point[i].equals("--"))
        {
            System.out.println("Melting Point => N/A");
        }
        else
        {
            System.out.println("Melting Point => "+melting_point[i]+" C'");
        }
        if(boiling_point[i].equals("--"))
        {
            System.out.println("Boiling Point => N/A");
        }
        else
        {
            System.out.println("Boiling Point => "+boiling_point[i]+" C'");
        }
        if(ionisation_enthalpy[i].equals("--"))
        {
            System.out.println("Ionisation Enthalpy => N/A");
        }
        else
        {
            System.out.println("Ionisation Enthalpy => "+ionisation_enthalpy[i]+" eV");
        }
         if(electron_affinity[i].equals("--"))
        {
            System.out.println("Electron Affinity => N/A");
        }
        else
        {
            System.out.println("Electron Affinity => "+electron_affinity[i]+" eV");
        }
        if(electronegetivity[i].equals("--"))
        {
            System.out.println("Electronegetivity => N/A");
        }
        else
        {
            System.out.println("Electronegetivity => "+electronegetivity[i]+" X");
        }
        if(atomic_radius[i].equals("--"))
        {
            System.out.println("Atomic Radius => N/A");
        }
        else
        {
            System.out.println("Atomic Radius => "+atomic_radius[i]+" A'");
        }
        if(specific_heat_capacity[i].equals("--"))
        {
            System.out.println("Specific Heat Capacity => N/A");
        }
        else
        {
            System.out.println("Specific Heat Capacity => "+specific_heat_capacity[i]+" J/kg-K");
        }
        System.out.println("****************************************************************************************************************************************************");
    }
    void inputSymbol()//function to accept symbol from the user
    {
        Scanner sc = new Scanner(System.in);
        boolean b=false;
        int i=-1;
        String sym;
        while(b==false)
        {
            System.out.println();
            System.out.println("Enter the Symbol of the Element");
            sym=sc.next();
            for(i=0;i<Max;i++)
            {
                if(symbol[i].equals(sym))
                {
                    b=true;
                    break;
                }
            }
            if(b==false)
            {
                System.out.println();
                System.out.println("You have Entered Wrong Symbol");
                System.out.println("Please Enter it Again!!!");
            }
        }
        /**Printing the Details of the Element**/
        System.out.println("****************************************************************************************************************************************************");
        System.out.println("Element Name => "+name[i]);
        System.out.println("Symbol => "+symbol[i]);
        System.out.println("Atomic Number => "+atomic_number[i]);
        System.out.println("Atomic Mass => "+atomic_mass[i]+" amu");
        System.out.println("Electronic Configuration => "+electronic_configuration[i]);
        System.out.println("Period => "+period[i]);
        System.out.println("Group => "+group[i]);
        System.out.println("Latin Name => "+latin_name[i]);
        System.out.println("Origin of Name => "+origin_of_name[i]);
        if(abundance[i].equals("--"))
        {
            System.out.println("Abundance => N/A");
        }
        else
        {
            System.out.println("Abundance => "+abundance[i]+" mg/kg");
        }
        if(density[i].equals("--"))
        {
            System.out.println("Density => N/A");
        }
        else
        {
            System.out.println("Density => "+density[i]+" g/cm^(-3)");
        }
        if(melting_point[i].equals("--"))
        {
            System.out.println("Melting Point => N/A");
        }
        else
        {
            System.out.println("Melting Point => "+melting_point[i]+" C'");
        }
        if(boiling_point[i].equals("--"))
        {
            System.out.println("Boiling Point => N/A");
        }
        else
        {
            System.out.println("Boiling Point => "+boiling_point[i]+" C'");
        }
        if(ionisation_enthalpy[i].equals("--"))
        {
            System.out.println("Ionisation Enthalpy => N/A");
        }
        else
        {
            System.out.println("Ionisation Enthalpy => "+ionisation_enthalpy[i]+" eV");
        }
         if(electron_affinity[i].equals("--"))
        {
            System.out.println("Electron Affinity => N/A");
        }
        else
        {
            System.out.println("Electron Affinity => "+electron_affinity[i]+" eV");
        }
        if(electronegetivity[i].equals("--"))
        {
            System.out.println("Electronegetivity => N/A");
        }
        else
        {
            System.out.println("Electronegetivity => "+electronegetivity[i]+" X");
        }
        if(atomic_radius[i].equals("--"))
        {
            System.out.println("Atomic Radius => N/A");
        }
        else
        {
            System.out.println("Atomic Radius => "+atomic_radius[i]+" A'");
        }
        if(specific_heat_capacity[i].equals("--"))
        {
            System.out.println("Specific Heat Capacity => N/A");
        }
        else
        {
            System.out.println("Specific Heat Capacity => "+specific_heat_capacity[i]+" J/kg-K");
        }
        System.out.println("****************************************************************************************************************************************************");
    }
    void inputAtomicMass()//function to accept atomic mass from the user
    {
        Scanner sc = new Scanner(System.in);
        boolean b=false;
        int i=-1;
        int am,cho,j=0;
        int a[] = new int[2];
        while(b==false)
        {
            try
            {
                System.out.println();
                System.out.println("Enter the Atomic Mass of the Element in Nearest Integer");
                am=Integer.parseInt(sc.next());
            }
            catch(Exception e)
            {
                System.out.println();
                System.out.println("You have Entered Wrong Statement");
                System.out.println("Please Enter it Again!!!");
                System.out.println();
                continue;
            }
            for(i=0;i<Max;i++)
            {
                if(mass_number[i]==am)
                {
                    b=true;
                    a[j]=i;
                    j++;
                }
            }
            if(b==false)
            {
                System.out.println();
                System.out.println("You have Entered Wrong Atomic Mass");
                System.out.println("Please Enter it Again!!!");
            }
        }
        /**Printing the Details of the Element**/
        if(j==1)//if there is only one element having that atomic mass entered by the user
        {
            System.out.println("****************************************************************************************************************************************************");
            System.out.println("Element Name => "+name[a[0]]);
            System.out.println("Symbol => "+symbol[a[0]]);
            System.out.println("Atomic Number => "+atomic_number[a[0]]);
            System.out.println("Atomic Mass => "+atomic_mass[a[0]]+" amu");
            System.out.println("Electronic Configuration => "+electronic_configuration[a[0]]);
            System.out.println("Period => "+period[a[0]]);
            System.out.println("Group => "+group[a[0]]);
            System.out.println("Latin Name => "+latin_name[a[0]]);
            System.out.println("Origin of Name => "+origin_of_name[a[0]]);
            if(abundance[a[0]].equals("--"))
            {
                System.out.println("Abundance => N/A");
            }
            else
            {
                System.out.println("Abundance => "+abundance[a[0]]+" mg/kg");
            }
            if(density[a[0]].equals("--"))
            {
                System.out.println("Density => N/A");
            }
            else
            {
                System.out.println("Density => "+density[a[0]]+" g/cm^(-3)");
            }
            if(melting_point[a[0]].equals("--"))
            {
                System.out.println("Melting Point => N/A");
            }
            else
            {
                System.out.println("Melting Point => "+melting_point[a[0]]+" C'");
            }
            if(boiling_point[a[0]].equals("--"))
            {
                System.out.println("Boiling Point => N/A");
            }
            else
            {
                System.out.println("Boiling Point => "+boiling_point[a[0]]+" C'");
            }
            if(ionisation_enthalpy[a[0]].equals("--"))
            {
                System.out.println("Ionisation Enthalpy => N/A");
            }
            else
            {
                System.out.println("Ionisation Enthalpy => "+ionisation_enthalpy[a[0]]+" eV");
            }
            if(electron_affinity[a[0]].equals("--"))
            {
                System.out.println("Electron Affinity => N/A");
            }
            else
            {
                System.out.println("Electron Affinity => "+electron_affinity[a[0]]+" eV");
            }
            if(electronegetivity[a[0]].equals("--"))
            {
                System.out.println("Electronegetivity => N/A");
            }
            else
            {
                System.out.println("Electronegetivity => "+electronegetivity[a[0]]+" X");
            }
            if(atomic_radius[a[0]].equals("--"))
            {
                System.out.println("Atomic Radius => N/A");
            }
            else
            {
                System.out.println("Atomic Radius => "+atomic_radius[a[0]]+" A'");
            }
            if(specific_heat_capacity[a[0]].equals("--"))
            {
                System.out.println("Specific Heat Capacity => N/A");
            }
            else
            {
                System.out.println("Specific Heat Capacity => "+specific_heat_capacity[a[0]]+" J/kg-K");
            }
            System.out.println("****************************************************************************************************************************************************");
        }
        if(j==2)//if there are 2 elements having same atomic mass
        {
            System.out.println();
            System.out.println("There are Two Elements having Same Atomic Mass!!!");
            System.out.println("Which Element Details Do you want?");
            System.out.println(name[a[0]]+" Or "+name[a[1]]+"???");
            System.out.println();
            System.out.println("Press 1 for "+name[a[0]]);
            System.out.println("Press 2 for "+name[a[1]]);
            while(true)
            {
                try
                {
                    cho=Integer.parseInt(sc.next());
                }
                catch(Exception e)
                {
                    System.out.println();
                    System.out.println("You have Entered Wrong Statement");
                    System.out.println("Please Enter it Again!!!");
                    System.out.println();
                    continue;
                }
                switch(cho)
                {
                    case 1://printing the details of the element if user enters 1
                    System.out.println("****************************************************************************************************************************************************");
                    System.out.println("Element Name => "+name[a[0]]);
                    System.out.println("Symbol => "+symbol[a[0]]);
                    System.out.println("Atomic Number => "+atomic_number[a[0]]);
                    System.out.println("Atomic Mass => "+atomic_mass[a[0]]+" amu");
                    System.out.println("Electronic Configuration => "+electronic_configuration[a[0]]);
                    System.out.println("Period => "+period[a[0]]);
                    System.out.println("Group => "+group[a[0]]);
                    System.out.println("Latin Name => "+latin_name[a[0]]);
                    System.out.println("Origin of Name => "+origin_of_name[a[0]]);
                    if(abundance[a[0]].equals("--"))
                    {
                        System.out.println("Abundance => N/A");
                    }
                    else
                    {
                        System.out.println("Abundance => "+abundance[a[0]]+" mg/kg");
                    }
                    if(density[a[0]].equals("--"))
                    {
                        System.out.println("Density => N/A");
                    }
                    else
                    {
                        System.out.println("Density => "+density[a[0]]+" g/cm^(-3)");
                    }
                    if(melting_point[a[0]].equals("--"))
                    {
                        System.out.println("Melting Point => N/A");
                    }
                    else
                    {
                        System.out.println("Melting Point => "+melting_point[a[0]]+" C'");
                    }
                    if(boiling_point[a[0]].equals("--"))
                    {
                        System.out.println("Boiling Point => N/A");
                    }
                    else
                    {
                        System.out.println("Boiling Point => "+boiling_point[a[0]]+" C'");
                    }
                    if(ionisation_enthalpy[a[0]].equals("--"))
                    {
                        System.out.println("Ionisation Enthalpy => N/A");
                    }
                    else
                    {
                        System.out.println("Ionisation Enthalpy => "+ionisation_enthalpy[a[0]]+" eV");
                    }
                    if(electron_affinity[a[0]].equals("--"))
                    {
                        System.out.println("Electron Affinity => N/A");
                    }
                    else
                    {
                        System.out.println("Electron Affinity => "+electron_affinity[a[0]]+" eV");
                    }
                    if(electronegetivity[a[0]].equals("--"))
                    {
                        System.out.println("Electronegetivity => N/A");
                    }
                    else
                    {
                        System.out.println("Electronegetivity => "+electronegetivity[a[0]]+" X");
                    }
                    if(atomic_radius[a[0]].equals("--"))
                    {
                        System.out.println("Atomic Radius => N/A");
                    }
                    else
                    {
                        System.out.println("Atomic Radius => "+atomic_radius[a[0]]+" A'");
                    }
                    if(specific_heat_capacity[a[0]].equals("--"))
                    {
                        System.out.println("Specific Heat Capacity => N/A");
                    }
                    else
                    {
                        System.out.println("Specific Heat Capacity => "+specific_heat_capacity[a[0]]+" J/kg-K");
                    }
                    System.out.println("****************************************************************************************************************************************************");
                    break;
                    case 2://printing the details of the element if user enters 2
                    System.out.println("****************************************************************************************************************************************************");
                    System.out.println("Element Name => "+name[a[1]]);
                    System.out.println("Symbol => "+symbol[a[1]]);
                    System.out.println("Atomic Number => "+atomic_number[a[1]]);
                    System.out.println("Atomic Mass => "+atomic_mass[a[1]]+" amu");
                    System.out.println("Electronic Configuration => "+electronic_configuration[a[1]]);
                    System.out.println("Period => "+period[a[1]]);
                    System.out.println("Group => "+group[a[1]]);
                    System.out.println("Latin Name => "+latin_name[a[1]]);
                    System.out.println("Origin of Name => "+origin_of_name[a[1]]);
                    if(abundance[a[1]].equals("--"))
                    {
                        System.out.println("Abundance => N/A");
                    }
                    else
                    {
                        System.out.println("Abundance => "+abundance[a[1]]+" mg/kg");
                    }
                    if(density[a[1]].equals("--"))
                    {
                        System.out.println("Density => N/A");
                    }
                    else
                    {
                        System.out.println("Density => "+density[a[1]]+" g/cm^(-3)");
                    }
                    if(melting_point[a[1]].equals("--"))
                    {
                        System.out.println("Melting Point => N/A");
                    }
                    else
                    {
                        System.out.println("Melting Point => "+melting_point[a[1]]+" C'");
                    }
                    if(boiling_point[a[1]].equals("--"))
                    {
                        System.out.println("Boiling Point => N/A");
                    }
                    else
                    {
                        System.out.println("Boiling Point => "+boiling_point[a[1]]+" C'");
                    }
                    if(ionisation_enthalpy[a[1]].equals("--"))
                    {
                        System.out.println("Ionisation Enthalpy => N/A");
                    }
                    else
                    {
                        System.out.println("Ionisation Enthalpy => "+ionisation_enthalpy[a[1]]+" eV");
                    }
                    if(electron_affinity[a[1]].equals("--"))
                    {
                        System.out.println("Electron Affinity => N/A");
                    }
                    else
                    {
                        System.out.println("Electron Affinity => "+electron_affinity[a[1]]+" eV");
                    }
                    if(electronegetivity[a[1]].equals("--"))
                    {
                        System.out.println("Electronegetivity => N/A");
                    }
                    else
                    {
                        System.out.println("Electronegetivity => "+electronegetivity[a[1]]+" X");
                    }
                    if(atomic_radius[a[1]].equals("--"))
                    {
                        System.out.println("Atomic Radius => N/A");
                    }
                    else
                    {
                        System.out.println("Atomic Radius => "+atomic_radius[a[1]]+" A'");
                    }
                    if(specific_heat_capacity[a[1]].equals("--"))
                    {
                        System.out.println("Specific Heat Capacity => N/A");
                    }
                    else
                    {
                        System.out.println("Specific Heat Capacity => "+specific_heat_capacity[a[1]]+" J/kg-K");
                    }
                    System.out.println("****************************************************************************************************************************************************");
                    break;
                    default:
                    System.out.println();
                    System.out.println("You have Entered Wrong Choice");
                    System.out.println("Please Enter it Again!!!");
                    System.out.println();
                }
                if((cho==1)||(cho==2))
                break;
            }
        }
    }
}
/**Super Class Ends Here**/