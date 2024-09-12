package org.example.startup2.service.impl;

import org.example.startup2.dao.ProviderDao;
import org.example.startup2.model.ProviderDTO;
import org.example.startup2.service.ProviderService;

import java.util.List;

public class ProviderServiceImpl implements ProviderService {

    private final ProviderDao providerDao;

    public ProviderServiceImpl(ProviderDao providerDao) {
        this.providerDao = providerDao;
    }

    @Override
    public List<ProviderDTO> selectAllProviders() {
        return providerDao.selectAllProviders();
    }

    @Override
    public ProviderDTO insertProvider(ProviderDTO providerDTO) {
        return providerDao.insertProvider(providerDTO);
    }

    public ProviderDTO selectProvider(String providerName) {
        return providerDao.selectProvider(providerName);
    }
}
