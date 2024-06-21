package com.cctv.cctv.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CCTV {
    @Id
    private String cctvId;
    private String roadsection;
    private Double px;
    private Double py;
    private String cctvUrl;

    // Getters and Setters

    public String getCctvId() {
        return cctvId;
    }

    public void setCctvId(String cctvId) {
        this.cctvId = cctvId;
    }

    public String getRoadsection() {
        return roadsection;
    }

    public void setRoadsection(String roadsection) {
        this.roadsection = roadsection;
    }

    public Double getPx() {
        return px;
    }

    public void setPx(Double px) {
        this.px = px;
    }

    public Double getPy() {
        return py;
    }

    public void setPy(Double py) {
        this.py = py;
    }

    public String getCctvUrl() {
        return cctvUrl;
    }

    public void setCctvUrl(String cctvUrl) {
        this.cctvUrl = cctvUrl;
    }
}
