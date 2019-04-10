package firstOne;

import java.util.Scanner;

public class Deliverable1
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        
        String eventType= new String();
        String result= new String();
        int partySize;
        
        System.out.println("Enter the event type ");
        eventType=scnr.nextLine();
        System.out.println("Enter the party size ");
        partySize=scnr.nextInt();
        result = "Since you are hosting a "+eventType+" event for "+partySize;
        
        result=result+" participants, you should serve ";
        
        if(eventType.equals("casual"))
            result=result+"sandwiches";
        else if(eventType.equals("semi-formal"))
            result=result+"fried chicken";
        else if(eventType.equals("formal"))
            result=result+"chicken parmesan";
       
        
        result=result+" prepared ";
       
        if(partySize==1)
           result=result+"in the microwave";
        else if(partySize>=2&&partySize<=12)
           result=result+"in your kitchen";
        else if(partySize>12)
           result=result+"by a caterer";
        else if(partySize<1)
        	
        System.out.println(result);

    }
}
