import java.util.List;

public class Pizza {

    private Dough dough;
    private Mozarella mozarella;
    private List<Pickle> pickles;
    private Anchiovi anchiovi;
    private Chicken chicken;


    public Pizza(Dough dough, Mozarella mozarella) {
        this.dough = dough;
        this.mozarella = mozarella;
    }

    public Dough getDough() {
        return dough;
    }

    public Mozarella getMozarella() {
        return mozarella;
    }

    public List<Pickle> getPickles() {
        return pickles;
    }

    public Anchiovi getAnchiovi() {
        return anchiovi;
    }

    public void setPickles(List<Pickle> pickles) {
        this.pickles = pickles;
    }

    public void setAnchiovi(Anchiovi anchiovi) {
        this.anchiovi = anchiovi;
    }

    public void setChicken(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough=" + dough +
                ", mozarella=" + mozarella +
                ", pickles=" + pickles +
                ", anchiovi=" + anchiovi +
                ", chicken=" + chicken +
                '}';
    }
}
