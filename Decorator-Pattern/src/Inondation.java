public class Inondation extends GammeDecorator {

    public Inondation(Assurance assurance){
        super(assurance);
    }
    @Override
    public int cost() {
        return this.assurance.cost()+1000;
    }
}
