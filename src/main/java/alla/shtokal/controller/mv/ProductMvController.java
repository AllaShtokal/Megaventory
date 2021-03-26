package alla.shtokal.controller.mv;


import alla.shtokal.dto.product.request.RootProductRequest;
import alla.shtokal.dto.product.response.RootProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductMvController {

    private final WebClient createWebClient;


    @PostMapping(path="/add", consumes= MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public Mono<RootProductResponse> createPost(@RequestBody RootProductRequest rootProductRequest) {

        return createWebClient.post()
                .uri("/Product/ProductUpdate")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(BodyInserters.fromValue(rootProductRequest))
                .retrieve()
                .bodyToMono(RootProductResponse.class);
    }
}
