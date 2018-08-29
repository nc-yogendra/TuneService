package com.callertuneapp.tune.dataaccess.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "tunes")
public class TuneEntity {

    @Id
    String id;
    private String tune;
}
