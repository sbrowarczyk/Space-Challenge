import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Simulation {


     ArrayList<Item> loadItems(String fileName) throws FileNotFoundException {
        String line;
        String[] parts;
        ArrayList list = new ArrayList();
        File file = new File(fileName);

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            parts = line.split("=");
            Item item = new Item(parts[0], Integer.parseInt(parts[1]));
            list.add(item);
        }

        return list;
    }


    ArrayList<Rocket> loadU1(ArrayList<Item> list) {
        ArrayList rocketsList = new ArrayList();


        while (!list.isEmpty()) {
            Rocket rocket = new U1();


                     for (int j = 0; j <list.size(); j++) {

                         if (rocket.canCarry(list.get(j))) {
                             rocket.carry(list.get(j));
                             list.remove(list.get(j));
                             j--;


                         }
                     }
        rocketsList.add(rocket);

        }



        return rocketsList;
    }

    ArrayList<Rocket> loadU2(ArrayList<Item> list) {
        ArrayList rocketsList = new ArrayList();


        while (!list.isEmpty()) {
            Rocket rocket = new U2();


            for (int j = 0; j <list.size(); j++) {

                if (rocket.canCarry(list.get(j))) {
                    rocket.carry(list.get(j));
                    list.remove(list.get(j));
                    j--;


                }
            }
            rocketsList.add(rocket);

        }



        return rocketsList;
    }

    double runSimulation(ArrayList<Rocket> rocketsList) {
        double cost = 0;
        for (Rocket rocket:rocketsList){
            do {
                cost+=rocket.getCost();
            }while (!(rocket.launch()&&rocket.land()));


        }

         return cost;
    }




}
