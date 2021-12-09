import pattern.composite.Category;
import pattern.composite.Product;

public class Client {
    public static void main(String[] args) throws Throwable {
        Category category1 = new Category("category1");
        Product product1 = new Product("product1");
        Category category01 = new Category("category01");
        Category category02 = new Category("category02");
        Product product03 = new Product("product03");
        Category category3 = new Category("category3");


        category1.addComponent(product1);
        category1.addComponent(category01);
        category1.addComponent(category02);

        category02.addComponent(category3);
        category3.addComponent(product03);




        System.out.println(category1.getTree());
        category1.deleteCategory(product1);
        System.out.println(category1.getTree());

    }
}
