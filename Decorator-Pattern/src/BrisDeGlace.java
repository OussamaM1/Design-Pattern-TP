public class BrisDeGlace extends GammeDecorator {

    public BrisDeGlace(Assurance assurance){
        super(assurance);
    }
    @Override
    public int cost() {
        return this.assurance.cost()+1000;
    }
}
