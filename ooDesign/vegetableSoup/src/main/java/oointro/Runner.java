package oointro;

import oointro.*;

public class Runner {

  /**
   * Main Class 
   * @param args
   */
  public static void main(String[] args) {
    VegetableSoup vegetableSoup = new VegetableSoup();
    Food food = new Food();

    Vegetable vegetable = new Vegetable();
    Oninon onion = new Oninon();
    Carrot carrot = new Carrot();
    Potato potato = new Potato();
    Celery celery = new Celery();
    Corn corn = new Corn();

    Grain grain = new Grain();
    Barley barley = new Barley();

    Spice spice = new Spice();
    Pepper pepper = new Pepper();
    Dill dill = new Dill();
    Salt salt = new Salt();

    vegetableSoup.addToSoup(food);
    
    vegetableSoup.addToSoup(vegetable);
    vegetableSoup.addToSoup(onion);
    vegetableSoup.addToSoup(carrot);
    vegetableSoup.addToSoup(potato);
    vegetableSoup.addToSoup(celery);
    vegetableSoup.addToSoup(corn);

    vegetableSoup.addToSoup(grain);
    vegetableSoup.addToSoup(barley);

    vegetableSoup.addToSoup(spice);
    vegetableSoup.addToSoup(pepper);
    vegetableSoup.addToSoup(dill);
    vegetableSoup.addToSoup(salt);

    System.out.println(vegetableSoup.smellTheSoup());
    System.out.println(vegetableSoup.tasteTheSoup());
  }
}

