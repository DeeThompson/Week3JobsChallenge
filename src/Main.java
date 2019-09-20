

import java.util.ArrayList;
import java.util.Scanner;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Name;


public class Main {
    public static <Job> void main (String[] args){
        Scanner sc = new Scanner (System.in);
        String userInput = "";

        String name ="";
        String email ="";
        String company ="";
        String jobtitle ="";
        int startdate = 0;
        int enddate = 0;
        String jobdescription ="";

        ArrayList<Jobs> position = new ArrayList<>();
        System.out.println("You will enter information for your resume below ");
        int counter =1;

        while (true ) {

            Jobs date = new Jobs();
            System.out.println("Please enter your name" + counter);
            name = sc.nextLine();
            date.setName(name);

            System.out.println("Please enter your email");
            email = sc.nextLine();
            date.setEmail(email);

            System.out.println("Please enter your Company");
            company = sc.nextLine();
            date.setCompany(company);

            System.out.println("Please enter your Job Title");
            jobtitle = sc.nextLine();
            date.setJobtitle(jobtitle);

            System.out.println("Please enter the year of your start date ");
            startdate = sc.nextInt();
            date.setStartdate(startdate);

            System.out.println("Please enter the year of your  end date ");
            enddate = sc.nextInt();
            date.setEnddate(enddate);

            sc.nextLine();

            System.out.println("Please enter your Job Description ");
            jobdescription = sc.nextLine();
            date.setJobdescription(jobdescription);



            position.add(date);
            System.out.println ("Do you want to add another Job y/n");
                userInput =sc.nextLine();

                if (userInput.equalsIgnoreCase("n")) {
                    break;

                }

                counter = counter + 1;


        }
        counter = 1;

        for (Jobs job  : position) {
            System.out.println("Job" + counter);
            System.out.println (job.getResume());

            counter = counter + 1;


        }


    }

}
