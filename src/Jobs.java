
public class Jobs {

    private String name;
    private String email;
    private String company;
    private String jobtitle;
    private String startdate;
    private String enddate;
    private String jobdescription;

    public Jobs() {

    }

    public Jobs(String name, String email, String company, String jobtitle, String startdate, String enddate, String jobdescription) {
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

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
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

        String Resume = "Name on Resume " + getName() + "\nThis is the email address" + getEmail() + "\n This is the company" + getCompany() + "\n This is the job title" + getJobtitle() + "\n This is the Start Date" + getStartdate() + "\n This is the End Date" + getEnddate() + "\n This is the job description" + getJobdescription();

        //"\n(this means next line) Model of car:" + getModel() +
        //"\nYear of car: " + getYear();
        //-note do need parenthesis -this whole part will print
    }


}


//String display = "Make of car: " + getMake() + "\n(this means next line) Model of car:" + getModel() + "\nYear of car: " +getYear(); - note do need parenthesis - this whole part will print

