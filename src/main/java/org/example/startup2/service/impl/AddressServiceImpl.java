package org.example.startup2.service.impl;

import org.example.startup2.dao.AddressDao;
import org.example.startup2.dao.UserDao;
import org.example.startup2.model.AddressDTO;
import org.example.startup2.service.AddressService;

import java.util.List;

public class AddressServiceImpl implements AddressService {

    private final AddressDao addressDao;

    public AddressServiceImpl(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    @Override
    public List<AddressDTO> selectAllAddress() {
        return addressDao.selectAllAddress();
    }

    @Override
    public AddressDTO insertAddress(AddressDTO addressDTO) {
        return addressDao.insertAddress(addressDTO);
    }
}
