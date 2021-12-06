abstract class GammeDecorator extends Assurance {
    Assurance assurance;
    public GammeDecorator(Assurance assurance){
        this.assurance = assurance;
    }
    public abstract int cost();
}
