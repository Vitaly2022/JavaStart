package Pattern.Observer;

public class Main {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();
        jobSite.addVacancies("First vacancies");
        jobSite.addVacancies("Second vacancies");
        Observer firstSubscriber = new Subscriber("Vitaly");
        Observer secondSubscriber = new Subscriber("Vasia");
        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.addVacancies("Third vacancies");
        jobSite.removeVacancies("First vacancies");


    }
}
