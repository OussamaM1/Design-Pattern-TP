public class DommageEtCollision extends GammeDecorator {

    public DommageEtCollision(Assurance assurance){
        super(assurance);
    }
    @Override
    public int cost() {
        return this.assurance.cost()+1000;
    }
}
