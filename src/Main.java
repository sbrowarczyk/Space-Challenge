import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Simulation simulation = new Simulation();


            ArrayList<Rocket> phaseOneRocketsList = simulation.loadU1(simulation.loadItems("phase1.txt"));
            ArrayList<Rocket> phaseTwoRocketsList = simulation.loadU1(simulation.loadItems("phase2.txt"));

            ArrayList<Rocket> phaseOneRocketsList2 = simulation.loadU2(simulation.loadItems("phase1.txt"));
            ArrayList<Rocket> phaseTwoRocketsList2 = simulation.loadU2(simulation.loadItems("phase2.txt"));

            double phaseOneU1Cost = simulation.runSimulation(simulation.loadU1(simulation.loadItems("phase1.txt")));
           double phaseTwoU1Cost = simulation.runSimulation(simulation.loadU1(simulation.loadItems("phase2.txt")));
            double phaseOneU2Cost = simulation.runSimulation(simulation.loadU2(simulation.loadItems("phase1.txt")));
            double phaseTwoU2Cost = simulation.runSimulation(simulation.loadU1(simulation.loadItems("phase2.txt")));



            System.out.println("Phase One");
            for (Rocket rocket : phaseOneRocketsList) {
                System.out.println(rocket);
                rocket.print(rocket.list);
            }
            System.out.println("Phase Two");
            for (Rocket rocket : phaseTwoRocketsList) {
                System.out.println(rocket);
                rocket.print(rocket.list);
            }
            System.out.println(phaseOneU1Cost);
            System.out.println(phaseTwoU1Cost);

            System.out.println("Phase One");
            for (Rocket rocket : phaseOneRocketsList2) {
                System.out.println(rocket);
                rocket.print(rocket.list);
            }
            System.out.println("Phase Two");
            for (Rocket rocket : phaseTwoRocketsList2) {
                System.out.println(rocket);
                rocket.print(rocket.list);
            }

            System.out.println(phaseOneU2Cost);
            System.out.println(phaseTwoU2Cost);


    }




}
