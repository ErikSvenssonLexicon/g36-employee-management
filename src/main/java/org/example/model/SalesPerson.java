package org.example.model;

import java.time.LocalDate;
import java.util.Arrays;

import static org.example.util.StringArrayUtils.addToStringArray;
import static org.example.util.StringArrayUtils.isNotPresent;

public class SalesPerson extends Employee{
    private String[] clients;
    private int acquiredClients;

    public SalesPerson(int id, String name, LocalDate dateHired, String[] clients, int acquiredClients) {
        super(id, name, dateHired);
        this.clients = clients;
        this.acquiredClients = acquiredClients;
    }

    public SalesPerson(int id, String name, LocalDate dateHired, String[] clients) {
        this(id, name, dateHired, clients, 0);
    }


    @Override
    public double getSalary() {
        return (500 * clients.length) + (1500 * acquiredClients) + salary;
    }

    public String[] getClients() {
        return clients;
    }

    public int getAcquiredClients() {
        return acquiredClients;
    }

    public void addAcquiredClient(String client){
        if(client != null && isNotPresent(clients, client)){
            clients = addToStringArray(clients, client);
            acquiredClients++;
        }
    }

    public void addClient(String client){
        if(client != null && isNotPresent(clients, client)) {
            clients = addToStringArray(clients, client);
        }
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", dateHired=" + getDateHired() +
                ", clients=" + Arrays.toString(clients) +
                ", acquiredClients=" + acquiredClients +
                ", salary=" + getSalary() +
                '}';
    }
}
