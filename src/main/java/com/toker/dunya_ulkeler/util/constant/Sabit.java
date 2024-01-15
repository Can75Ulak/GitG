package com.toker.dunya_ulkeler.util.constant;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import static jakarta.persistence.EnumType.STRING;


public enum Sabit {

    ;

    public enum Renk {
        KIRMIZI, MAVI, YESIL
    }


    public static final String BASE_URLL = "/country";

}
