package Pattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed{
    List <String> vacancies = new ArrayList<>();
    List <Observer> subscribers = new ArrayList<>(); //лист подпищиков

    public void addVacancies (String vacancies) {
        this.vacancies.add(vacancies);
        notifyObservers();
    }

    public void removeVacancies (String vacancies) {
        this.vacancies.remove(vacancies);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
    this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribers) {
            observer.handleEvent(this.vacancies);
        }

    }
}
