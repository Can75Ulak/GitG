package com.toker.dunya_ulkeler.service.impl;

import com.toker.dunya_ulkeler.entity.Country;
import com.toker.dunya_ulkeler.repository.ICountryRepository;
import com.toker.dunya_ulkeler.service.interfaces.ICountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor // Bu anotasyon kullanıldığı için constructor injectiona gerek kalmadı
//@AllArgsConstructor   // @RequiredArgsConstructor yerine @AllArgsConstructor da kullanılabilirdi
public class CountryService implements ICountryService {

    private final ICountryRepository iCountryRepository;

  /*  public CountryService(ICountryRepository iCountryRepository) {
        this.iCountryRepository = iCountryRepository;
    }*/


    @Override
    public List<Country> getAllCountries() {
        return iCountryRepository.findAll();
    }
}
