package org.example.startup2.service;

import org.example.startup2.model.AddressDTO;

import java.util.List;

public interface AddressService {

    public List<AddressDTO> selectAllAddress();

    public AddressDTO insertAddress(AddressDTO addressDTO);
}
