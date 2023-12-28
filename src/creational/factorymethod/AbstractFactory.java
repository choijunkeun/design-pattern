package creational.factorymethod;

public interface AbstractFactory {

    default Product createOperation() {
        Product product = createProduct();
        product.setting();
        return product;
    }

    Product createProduct();
}
