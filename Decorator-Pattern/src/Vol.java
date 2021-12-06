public class Vol extends GammeDecorator {

    public Vol(Assurance assurance) {
        super(assurance);
    }

    @Override
    public int cost() {
        return this.assurance.cost() + 1000;
    }
}
