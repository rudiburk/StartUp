package org.example.startup2.dao;

import org.example.startup2.model.ProviderDTO;

import java.util.List;

public interface ProviderDao {

    public List<ProviderDTO> selectAllProviders();

    public ProviderDTO insertProvider(ProviderDTO providerDTO);

    public ProviderDTO selectProvider(String providerName);

}
