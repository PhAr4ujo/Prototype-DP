package Entities;

import java.util.ArrayList;
import java.util.List;

public class Contract implements Prototype {

    private int number;
    private String client;
    private String startDate;
    private List<String> clauses;

    public Contract(int number, String client, String startDate, List<String> clauses) {
        this.number = number;
        this.client = client;
        this.startDate = startDate;
        this.clauses = clauses;
    }

    @Override
    public Contract clone() {
        return new Contract(number, client, startDate, new ArrayList<>(clauses));
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public List<String> getClauses() {
        return clauses;
    }

    public void setClauses(List<String> clauses) {
        this.clauses = clauses;
    }
}
