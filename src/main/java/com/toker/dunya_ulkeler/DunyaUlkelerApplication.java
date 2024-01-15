package com.toker.dunya_ulkeler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DunyaUlkelerApplication {

    public static void main(String[] args) {
        log.error("hata loglandı mı?");
        SpringApplication.run(DunyaUlkelerApplication.class, args);
    }

}
