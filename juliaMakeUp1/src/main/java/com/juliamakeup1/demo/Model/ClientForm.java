package com.juliamakeup1.demo.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "ClientForms")
public class ClientForm {

    private String nameClient;

    private int phoneNumberClient;

    private Date dateMakeUpClient;

    @Id
    private String idClient;

}
