package com.oppo.dto;

import java.util.Date;

/**
 * Created by JieChen on 2018/10/2.
 */
public class BookDto {
    public BookDto(){}
    public BookDto(String id, Boolean invoice, String invYM, String invNo, Boolean paid, Date paidDat, Integer deposits, Integer remittance, Integer subTotal, Integer projectId, String projectName, String description, String remarks) {
        this.id = id;
        this.invoice = invoice;
        this.invYM = invYM;
        this.invNo = invNo;
        this.paid = paid;
        this.paidDat = paidDat;
        this.deposits = deposits;
        this.remittance = remittance;
        this.subTotal = subTotal;
        this.projectId = projectId;
        this.projectName = projectName;
        this.description = description;
        this.remarks = remarks;
    }

    //流水號
    private String id;
    //是否廠商發票
    private Boolean invoice = false;
    //發票月份
    private String invYM;
    //發票號碼
    private String invNo;
    //付款與否
    private Boolean paid = false;
    //付款日期
    private Date paidDat;
    //存入金額
    private Integer deposits;
    //存款匯出
    private Integer remittance;
    //小計
    private Integer subTotal;
    //專案名稱
    private Integer projectId;
    //專案名稱
    private String projectName;
    //說明
    private String description;
    //備註
    private String remarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getInvoice() {
        return invoice;
    }

    public void setInvoice(Boolean invoice) {
        this.invoice = invoice;
    }

    public String getInvYM() {
        return invYM;
    }

    public void setInvYM(String invYM) {
        this.invYM = invYM;
    }

    public String getInvNo() {
        return invNo;
    }

    public void setInvNo(String invNo) {
        this.invNo = invNo;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Date getPaidDat() {
        return paidDat;
    }

    public void setPaidDat(Date paidDat) {
        this.paidDat = paidDat;
    }

    public Integer getDeposits() {
        return deposits;
    }

    public void setDeposits(Integer deposits) {
        this.deposits = deposits;
    }

    public Integer getRemittance() {
        return remittance;
    }

    public void setRemittance(Integer remittance) {
        this.remittance = remittance;
    }

    public Integer getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", invoice=" + invoice +
                ", invYM='" + invYM + '\'' +
                ", invNo='" + invNo + '\'' +
                ", paid=" + paid +
                ", paidDat=" + paidDat +
                ", deposits=" + deposits +
                ", remittance=" + remittance +
                ", subTotal=" + subTotal +
                ", projectID='" + projectId + '\'' +
                ", projectName='" + projectName + '\'' +
                ", description='" + description + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
