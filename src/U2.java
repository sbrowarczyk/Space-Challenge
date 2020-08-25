import java.util.ArrayList;
import java.util.Random;

public class U2 extends Rocket {

    U2() {
        this.setCost(120);
        this.setWeight(18000);
        this.setMaxWeight(29000);
        this.setCargoCarried(0);
        this.list=new ArrayList();

    }
    @Override
    public boolean land() {

        double probability= 0.08*(cargoCarried/(maxWeight-weight));
        Random random = new Random();
        return random.nextFloat() < 1 - probability;
    }

    @Override
    public boolean launch() {

        double probability= 0.04*(cargoCarried/(maxWeight-weight));
        Random random = new Random();
        return random.nextFloat() < 1 - probability;
    }

}
