package com.toker.dunya_ulkeler.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Abc {




    @Id
    private String yas;
    private String cinsiyet;
    private int phoneNumber;

}
