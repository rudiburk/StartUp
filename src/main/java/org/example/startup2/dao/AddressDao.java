package org.example.startup2.dao;

import org.example.startup2.model.AddressDTO;


import java.util.List;

public interface AddressDao {


    public List<AddressDTO> selectAllAddress();

    public AddressDTO insertAddress(AddressDTO addressDTO);


}
