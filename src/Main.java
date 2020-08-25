import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Simulation simulation = new Simulation();



            System.out.println("Budget required for Phase 1 using U1 fleet: $" + simulation.runSimulation(simulation.loadU1(simulation.loadItems("phase1.txt")))+" Million");
            System.out.println("Budget required for Phase 2 using U1 fleet: $" + simulation.runSimulation(simulation.loadU1(simulation.loadItems("phase2.txt")))+" Million");
            System.out.println("Budget required for Phase 1 using U2 fleet: $" + simulation.runSimulation(simulation.loadU2(simulation.loadItems("phase1.txt")))+" Million");
            System.out.println("Budget required for Phase 2 using U2 fleet: $" + simulation.runSimulation(simulation.loadU2(simulation.loadItems("phase2.txt")))+" Million");


    }




}
