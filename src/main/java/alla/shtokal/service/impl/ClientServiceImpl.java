package alla.shtokal.service.impl;

import alla.shtokal.exception.NotFoundException;
import alla.shtokal.model.Client;
import alla.shtokal.repository.ClientRepository;
import alla.shtokal.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client findById(Long id) throws NotFoundException {
        return clientRepository.findById(id)
                .orElseThrow(NotFoundException::new);
    }
}
