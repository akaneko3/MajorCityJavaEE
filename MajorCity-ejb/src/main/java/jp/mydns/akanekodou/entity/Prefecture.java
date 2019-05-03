package jp.mydns.akanekodou.entity;

import java.io.Serializable;

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
public class Prefecture implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @ManyToOne
    private District district;

    public Prefecture(String name, District district) {
        this.name = name;
        this.district = district;
    }
}
