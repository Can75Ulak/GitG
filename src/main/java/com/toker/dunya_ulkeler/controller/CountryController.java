package com.toker.dunya_ulkeler.controller;

import com.toker.dunya_ulkeler.entity.Country;
import com.toker.dunya_ulkeler.service.impl.CountryService;
import com.toker.dunya_ulkeler.util.constant.ApiTransfer;
import com.toker.dunya_ulkeler.util.constant.Sabit;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@SpringBootApplication(scanBasePackages = "com.toker.dunya_ulkeler.util.constant")
@RestController
//@RequestMapping(Sabit.BASE_URLL)
@RequestMapping(ApiTransfer.Country.BASE_URL)
@AllArgsConstructor
public class CountryController {
   // private final Sabit sabit;
    private final CountryService countryService;

  /*  @GetMapping("/test")
    public String testCountryController(){
        return "test";

    }

    @GetMapping("/country")
    public String testCountry(){
        return "country dedik ya";

    }*/

    @GetMapping
    public List<Country> getAllCountries(){
        return  countryService.getAllCountries();

    }
}
