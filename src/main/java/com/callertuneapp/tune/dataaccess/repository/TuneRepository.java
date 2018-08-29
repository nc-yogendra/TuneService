package com.callertuneapp.tune.dataaccess.repository;


import com.callertuneapp.tune.dataaccess.entity.TuneEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

//@Repository
public interface TuneRepository extends MongoRepository<TuneEntity, String> {


}
