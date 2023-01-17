package com.naab.bloodbank.camps;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampRepo extends MongoRepository<Camp,String> {
}
