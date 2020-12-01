package com.kodilla.good.patterns.foof2door;

public class ProducersListModerator {

   public void initializeProducersList(ProducerList producerList) {
       Producer extraFoodShop = new Producer("ExtraFoodShoop");
       Producer healthyShop = new Producer("HealthyShop");
       Producer glutenFreeShop = new Producer("GlutenFreeShop");

       extraFoodShop.addProduct(new Product("Apple", 2));
       extraFoodShop.addProduct(new Product("Smoothie", 10));
       extraFoodShop.addProduct(new Product("Orange Juice", 8));
       healthyShop.addProduct(new Product("Smoothie", 9));
       healthyShop.addProduct(new Product("Orange Juice", 7.5));
       healthyShop.addProduct(new Product("Vegan Burger", 30));
       glutenFreeShop.addProduct(new Product("Orange Juice", 7.25));
       glutenFreeShop.addProduct(new Product("Vegan Burger", 25));
       glutenFreeShop.addProduct(new Product("Apple", 2.5));

       producerList.addProducer(extraFoodShop);
       producerList.addProducer(healthyShop);
       producerList.addProducer(glutenFreeShop);
   }
}

