package alla.shtokal.controller.mv;

import alla.shtokal.dto.product.request.RootProductRequest;
import alla.shtokal.dto.product.response.RootProductResponse;
import alla.shtokal.dto.salesorder.request.RootSalesOrderRequest;
import alla.shtokal.dto.salesorder.response.RootSalesOrderResponse;
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
@RequestMapping("/salesorder")
@RequiredArgsConstructor
public class SalesOrderMVController {

    private final WebClient createWebClient;


    @PostMapping(path="/add", consumes= MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public Mono<RootSalesOrderResponse> createPost(@RequestBody RootSalesOrderRequest rootSalesOrderRequest) {

        return createWebClient.post()
                .uri("/SalesOrder/SalesOrderUpdate")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(BodyInserters.fromValue(rootSalesOrderRequest))
                .retrieve()
                .bodyToMono(RootSalesOrderResponse.class);
    }



}