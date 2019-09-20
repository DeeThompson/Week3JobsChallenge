
public class Jobs {

    private String name;
    private String email;
    private String company;
    private String jobtitle;
    private int startdate;
    private int enddate;
    private String jobdescription;
    private String resume;

    public Jobs() {

    }

    public Jobs(String name, String email, String company, String jobtitle, int startdate, int enddate, String jobdescription) {
        this.name = name;
        this.email = email;
        this.company = company;
        this.jobtitle = jobtitle;
        this.enddate = enddate;
        this.jobdescription = jobdescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public int getStartdate() {
        return startdate;
    }

    public void setStartdate(int startdate) {
        this.startdate = startdate;
    }

    public int getEnddate() {
        return enddate;
    }

    public void setEnddate(int enddate) {
        this.enddate = enddate;
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }

    public String getResume;

    {

        //String resume = "Name on Resume " + getName() + "\nThis is the email address" + getEmail() + "\n This is the company" + getCompany() + "\n This is the job title" + getJobtitle() + "\n This is the Start Date" + getStartdate() + "\n This is the End Date" + getEnddate() + "\n This is the job description" + getJobdescription();
        //String resume1 = resume;

        //"\n(this means next line) Model of car:" + getModel() +
        //"\nYear of car: " + getYear();
        //-note do need parenthesis -this whole part will print
    }


    public String getResume() {

        String resume = "Name on Resume: " + getName() + "\nThis is the email address:" + getEmail() + "\n This is the company:" + getCompany() + "\n This is the job title:" + getJobtitle() + "\n This is the Start Date:" + getStartdate() + "\n This is the End Date:" + getEnddate() + "\n This is the job description:" + getJobdescription();
    return resume;


    }


}


//String display = "Make of car: " + getMake() + "\n(this means next line) Model of car:" + getModel() + "\nYear of car: " +getYear(); - note do need parenthesis - this whole part will print

