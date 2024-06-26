package com.cctv.cctv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CCTV_List")
public class CCTV {
    @Id
    @Column(name = "cctvId")
    private String cctvId;

    @Column(name = "roadsection")
    private String roadsection;

    @Column(name = "px")
    private Double px;

    @Column(name = "py")
    private Double py;

    @Column(name = "cctvUrl")
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
