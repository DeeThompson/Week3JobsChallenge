

import java.util.ArrayList;
import java.util.Scanner;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Name;


public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        String userInput = "";

        String name ="";
        String email ="";
        String company ="";
        String jobtitle ="";
        String startdate ="";
        String enddate = "";
        String jobdescription ="";

        ArrayList<Jobs> date = new ArrayList<>();
        System.out.println("Please submit your Resume ");
        int counter =1;

        while (true ) {

            Jobs position = new Jobs();
            System.out.println ("Please enter your name" + counter);
            name = sc.nextLine();
            date.setName(Name);

            System.out.println ("Please enter your email");
            email = sc.nextLine();
            date.setEmail(Email);

        }



    }

}
