package com.naab.bloodbank.donor;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonorRepo extends MongoRepository<Donor,String> {
}
