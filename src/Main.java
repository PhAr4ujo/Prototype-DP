import Entities.Contract;
import Entities.Prototype;
import Entities.Report;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contract c = new Contract(1, "Pedro", "20-05-2025", List.of("Clause 1", "Clause 2", "Clause 3"));
        Report r = new Report("Report of the Week", "Fabio", "20-05-2025", "Content 1");


        Contract contract = c.clone();
        Contract secondContract = c.clone();
        Report report = r.clone();
        Report secondReport = r.clone();

        contract.setNumber(2);
        contract.setClient("Isabela");
        contract.setStartDate("21-05-2025");
        contract.setClauses(List.of("Clause A", "Clause B"));

        secondContract.setNumber(3);
        secondContract.setClient("Marcio");
        secondContract.setStartDate("21-05-2025");
        secondContract.setClauses(List.of("Clause C", "Clause E"));

        report.setTitle("Report of the Month");
        report.setAuthor("Rafael");
        report.setGenerationDate("21-05-2025");
        report.setContent("Content A");

        secondReport.setTitle("Report of the Year");
        secondReport.setAuthor("Thiago");
        secondReport.setGenerationDate("21-05-2025");
        secondReport.setContent("Content B");

        System.out.println("======= Original Contract =======");
        System.out.println("Number: " + c.getNumber());
        System.out.println("Client: " + c.getClient());
        System.out.println("Start Date: " + c.getStartDate());
        System.out.println("Clauses: " + String.join(", ", c.getClauses()));
        System.out.println();

        System.out.println("======= Cloned Contracts =======");
        System.out.println("Contract 1:");
        System.out.println("Number: " + contract.getNumber());
        System.out.println("Client: " + contract.getClient());
        System.out.println("Start Date: " + contract.getStartDate());
        System.out.println("Clauses: " + String.join(", ", contract.getClauses()));
        System.out.println();

        System.out.println("Contract 2:");
        System.out.println("Number: " + secondContract.getNumber());
        System.out.println("Client: " + secondContract.getClient());
        System.out.println("Start Date: " + secondContract.getStartDate());
        System.out.println("Clauses: " + String.join(", ", secondContract.getClauses()));
        System.out.println();

        System.out.println("======= Original Report =======");
        System.out.println("Title: " + r.getTitle());
        System.out.println("Author: " + r.getAuthor());
        System.out.println("Date: " + r.getGenerationDate());
        System.out.println("Content: " + r.getContent());
        System.out.println();

        System.out.println("======= Cloned Reports =======");
        System.out.println("Report 1:");
        System.out.println("Title: " + report.getTitle());
        System.out.println("Author: " + report.getAuthor());
        System.out.println("Date: " + report.getGenerationDate());
        System.out.println("Content: " + report.getContent());
        System.out.println();

        System.out.println("Report 2:");
        System.out.println("Title: " + secondReport.getTitle());
        System.out.println("Author: " + secondReport.getAuthor());
        System.out.println("Date: " + secondReport.getGenerationDate());
        System.out.println("Content: " + secondReport.getContent());
    }
}