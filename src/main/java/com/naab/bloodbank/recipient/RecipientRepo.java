package com.naab.bloodbank.recipient;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipientRepo extends MongoRepository<Recipient,String> {
}
