import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class GrossSalary {
    public void GrSal()
    {
        Scanner sc = new Scanner(System.in);
        double Basic = sc.nextDouble();
        if (Basic >= 20000)
        {
            double TA = Basic*10/100;
            double DA = Basic*15/100;
            double HRA = Basic*20/100;
            double Bonus = Basic*10/100;
            double PF = Basic*12/100;
            double Gross = (Basic + TA + DA + HRA + Bonus - PF);
            System.out.println("Your Gross Salary is "+ Gross);

        }
        else
        {
            double TA = Basic*10/100;
            double DA = Basic*15/100;
            double HRA = Basic*20/100;
            double Bonus = Basic*20/100;
            double PF = Basic*12/100;
            double Gross = (Basic + TA + DA + HRA + Bonus - PF);
            System.out.println("Your Gross Salary is "+ Gross);
        }


    }

    public static void main(String[] args) {

        System.out.println("Enter your Basic salary: ");

        GrossSalary obj = new GrossSalary();
        obj.GrSal();
    }
}
