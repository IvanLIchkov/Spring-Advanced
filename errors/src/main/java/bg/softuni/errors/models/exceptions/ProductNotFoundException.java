package bg.softuni.errors.models.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Product was not found.")
public class ProductNotFoundException extends RuntimeException{

    private long productId;

    public ProductNotFoundException(long productId) {
        super("Product with ID " +productId+" not found!");
        this.productId = productId;
    }

    public long getProductId() {
        return productId;
    }

    public ProductNotFoundException setProductId(long productId) {
        this.productId = productId;
        return this;
    }
}
