package jp.mydns.akanekodou.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class City implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToOne
    private Prefecture prefecture;
    private Date designated;
    private double area;
    private int population;

    public City(
        String name,
        Prefecture prefecture,
        Date designated,
        double area,
        int population
    ) {
        this.name = name;
        this.prefecture = prefecture;
        this.designated = designated;
        this.area = area;
        this.population = population;
    }
}
