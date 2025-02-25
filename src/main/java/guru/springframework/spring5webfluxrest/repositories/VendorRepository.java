package guru.springframework.spring5webfluxrest.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import guru.springframework.spring5webfluxrest.domain.Vendor;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
