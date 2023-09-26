import java.util.*;
class Mains
{
    public static void main(String args[]) throws InterruptedException
    {
        GSTAnimation anim=new GSTAnimation();
        anim.Animation();
        Loading loads= new Loading();
        Scanner s=new Scanner(System.in);
        System.out.println("                             ");
        System.out.println("1.GSTInformation");
        System.out.println("2.GSTProfitLossCalculator");
        System.out.println("3.Exit");
        int choice = s.nextInt();
        switch (choice) 
        {
            case 1:
                loads.loading();
                GSTInformation disk=new GSTInformation();
                disk.Information();
                break;
                
            case 2:
                loads.loading();
                GSTProfitLossCalculator cal=new GSTProfitLossCalculator();
                cal.calculcate();
                break;
                
            case 3:
                System.out .println("Exiting..........");
        }
    }
}