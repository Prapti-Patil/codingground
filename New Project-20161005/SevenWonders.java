import java.util.*;
public class SevenWonders
{
    static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String W[]={"CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJ MAHAL", "GREAT WALL OF CHINA", "MACHU PICCHU", "PETRA", "COLOSSEUM"};
        String L[]={"MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY"};
        int i;
        boolean flag=false;
        System.out.println("Enter country to be searched");
        String c=sc.nextLine();
        for(i=0;i<7;i++)
        {
            if(L[i].equalsIgnoreCase(c))
            {
            flag=true;
            break;
            }
        }
        if(flag==true)
        {
            System.out.println("Search Successful");
            System.out.println(L[i]+" - "+W[i]);
        }
        else
        {
            System.out.println("Sorry Not Found!");
        }
    }
}  