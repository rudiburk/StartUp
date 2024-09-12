package org.example.startup2.service;

import org.example.startup2.dao.CarDao;
import org.example.startup2.dao.ProviderDao;
import org.example.startup2.model.ProviderDTO;

import java.util.List;

public interface ProviderService {
    public List<ProviderDTO> selectAllProviders();

    public ProviderDTO insertProvider(ProviderDTO providerDTO);

    public ProviderDTO selectProvider(String providerName);
}
