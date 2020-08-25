import java.util.ArrayList;
import java.util.Iterator;

public class Rocket implements SpaceShip {

    double cost;
    double weight ;
    double maxWeight ;
    double cargoCarried;
    ArrayList<Item> list;




    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }


    @Override
    final public boolean canCarry(Item item) {

        if (this.cargoCarried+item.getWeight()<=(this.maxWeight-this.weight)) {

            return true;
        }else {
            return false;
        }
    }

    @Override
    final public void carry(Item item) {
        this.cargoCarried=this.cargoCarried+item.getWeight();
        this.list.add(item);


    }

    public void print(ArrayList<Item> list){

        for (Item item : list){
            System.out.println(item.getName()+" "+item.getWeight());
        }
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getCargoCarried() {
        return cargoCarried;
    }

    public void setCargoCarried(double cargoCarried) {
        this.cargoCarried = cargoCarried;
    }


}
