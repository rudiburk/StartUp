package org.example.startup2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AddressDTO {
    private int idAddress;
    private String addressName;
    private int addressNum;
    private int idUser;

}
