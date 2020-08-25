import java.util.ArrayList;
import java.util.Random;

public class U1  extends Rocket{

    U1() {
    this.setCost(100);
    this.setWeight(10000 );
    this.setMaxWeight(18000);
    this.setCargoCarried(0);
    this.list=new ArrayList();

    }


    @Override
    public boolean land() {

        double probability= 0.01*(cargoCarried/(maxWeight-weight));
        Random random = new Random();
        return random.nextFloat() < 1 - probability;
    }

    @Override
    public boolean launch() {

        double probability= 0.05*(cargoCarried/(maxWeight-weight));
        Random random = new Random();
        return random.nextFloat() < 1 - probability;
    }
}
