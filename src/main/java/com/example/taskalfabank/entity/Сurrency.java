package com.example.taskalfabank.entity;

import javax.persistence.*;


@Entity
@Table(name ="currency")
public class Сurrency {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "rate")
    private Integer rate;
    @Column(name = "giftAdress")
    private String gifAdress;
    @Column(name = "rateAdress")
    private String rateAdress;

    public Сurrency(Long id, Integer rate, String gifAdress, String rateAdress) {
        this.id = id;
        this.rate = rate;
        this.gifAdress = gifAdress;
        this.rateAdress = rateAdress;
    }

    public Сurrency() {
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public Integer getRate() {return rate;}

    public void setRate(Integer rate) {this.rate = rate;}

    public String getGifAdress() {return gifAdress;}

    public void setGifAdress(String gifAdress) {this.gifAdress = gifAdress;}

    public String getRateAdress() {return rateAdress;}

    public void setRateAdress(String rateAdress) {this.rateAdress = rateAdress;}
}
