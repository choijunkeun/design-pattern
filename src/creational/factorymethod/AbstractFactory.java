package creational.factorymethod;

public interface AbstractFactory {

    default Product createOperation(String name) {
        validate(name);
        Product product = createProduct();  // 제품 객체 생성
        product.setting();
        return product;
    }

    private void validate(String name) {
        if(name == null) {
            throw new IllegalArgumentException("제품명은 필수입니다.");
        }
    }

    Product createProduct();
}
