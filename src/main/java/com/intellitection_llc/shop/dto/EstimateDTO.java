package com.intellitection_llc.shop.dto;

import java.io.Serializable;

public class EstimateDTO extends SuperDTO implements Serializable {

    private String estimateid;
    private String status;


    public EstimateDTO() {
    }

    public EstimateDTO(String estimateid, String status) {
        this.estimateid = estimateid;
        this.status = status;
    }

    public String getEstimateid() {
        return estimateid;
    }

    public void setEstimateid(String estimateid) {
        this.estimateid = estimateid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EstimateDTO{" +
                "estimateid='" + estimateid + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
