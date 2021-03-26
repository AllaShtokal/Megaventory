package alla.shtokal.controller.mv;


import alla.shtokal.dto.client.request.RootClientRequest;
import alla.shtokal.dto.client.response.RootClientResponse;
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
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientMvController {

    private final WebClient createWebClient;


    @PostMapping(path="/add", consumes= MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public Mono<RootClientResponse> createPost(@RequestBody RootClientRequest rootClientRequest) {

        return createWebClient.post()
                .uri("/SupplierClient/SupplierClientUpdate")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(BodyInserters.fromValue(rootClientRequest))
                .retrieve()
                .bodyToMono(RootClientResponse.class);
    }
}
