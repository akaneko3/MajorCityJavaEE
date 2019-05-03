package jp.mydns.akanekodou.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Entity
@NoArgsConstructor
@Getter
@Setter
public class District implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public District(String name) {
        this.name = name;
    }
}
