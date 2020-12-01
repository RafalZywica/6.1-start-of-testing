package com.kodilla.good.patterns.foof2door;

import java.util.ArrayList;

public class ProducerList {
    private static ArrayList<Producer> producersList = new ArrayList<>();
    private int j;

    public void addProducer(Producer producer) {
        producersList.add(producer);
    }

    public ArrayList<Producer> getProducersList() {
        return producersList;
    }
    public Producer getProducer(String producerName){
        for (int i = 0; i < producersList.size(); i++)
            if (producersList.get(i).getName().equals(producerName)) j = i;
        return producersList.get(j);
    }

    @Override
    public String toString() {
        return "ProducerList{" +
                "j=" + j +
                '}';
    }
}