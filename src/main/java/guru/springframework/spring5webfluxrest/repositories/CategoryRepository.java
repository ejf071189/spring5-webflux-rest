package guru.springframework.spring5webfluxrest.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import guru.springframework.spring5webfluxrest.domain.Category;

public interface CategoryRepository extends ReactiveMongoRepository <Category, String>{
}