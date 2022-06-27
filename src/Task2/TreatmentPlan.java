package Task2;

public class TreatmentPlan {
    int plan;

    public TreatmentPlan() {
        this.plan = plan;
    }

    void getPlan(int plan) {
        if (plan == 1) Surgeon.Treat();
        else if (plan == 2) Dentist.Treat();
        else Therapist.Treat();
    }
}
