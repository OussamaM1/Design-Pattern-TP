public class Incendie extends GammeDecorator {

    public Incendie(Assurance assurance){
        super(assurance);
    }
    @Override
    public int cost() {
        return this.assurance.cost()+1000;
    }
}
