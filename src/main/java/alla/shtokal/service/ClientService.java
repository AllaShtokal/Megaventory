package alla.shtokal.service;

import alla.shtokal.exception.NotFoundException;
import alla.shtokal.model.Client;

public interface ClientService {

   Client findById(Long id) throws NotFoundException;
}
