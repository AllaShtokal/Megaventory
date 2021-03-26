package alla.shtokal.service.impl;
import alla.shtokal.exception.NotFoundException;
import alla.shtokal.model.Product;
import alla.shtokal.repository.ProductRepository;
import alla.shtokal.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product findById(Long id) throws NotFoundException {
        return productRepository.findById(id)
                .orElseThrow(NotFoundException::new);
    }
}
