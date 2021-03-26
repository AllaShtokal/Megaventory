package alla.shtokal.service;

import alla.shtokal.exception.NotFoundException;
import alla.shtokal.model.Product;

public interface ProductService {

    Product findById(Long id) throws NotFoundException;
}
