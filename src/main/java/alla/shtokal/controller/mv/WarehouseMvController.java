package alla.shtokal.controller.mv;

import alla.shtokal.dto.salesorder.request.RootSalesOrderRequest;
import alla.shtokal.dto.salesorder.response.RootSalesOrderResponse;
import alla.shtokal.dto.warehouse.request.RootWarehouseRequest;
import alla.shtokal.dto.warehouse.response.RootWarehouseResponse;
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
@RequestMapping("/warehouse")
@RequiredArgsConstructor
public class WarehouseMvController {

    private final WebClient createWebClient;


    @PostMapping(path="/add", consumes= MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public Mono<RootWarehouseResponse> createPost(@RequestBody RootWarehouseRequest rootWarehouseRequest) {

        return createWebClient.post()
                .uri("/InventoryLocation/InventoryLocationUpdate")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(BodyInserters.fromValue(rootWarehouseRequest))
                .retrieve()
                .bodyToMono(RootWarehouseResponse.class);
    }


}
