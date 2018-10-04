package com.oppo.dto;

import java.util.Date;

/**
 * Created by JieChen on 2018/10/2.
 */
public class BookDto {
    public BookDto(){}

    public BookDto(String id, String incomeOrExpend, Boolean invoice, String invYM, String invNo, Boolean paid, Date paidDat, Integer amt,Integer projectId, String projectName, String description, String remarks) {
        this.id = id;
        this.incomeOrExpend = incomeOrExpend;
        this.invoice = invoice;
        this.invYM = invYM;
        this.invNo = invNo;
        this.paid = paid;
        this.paidDat = paidDat;
        this.amt = amt;
        this.projectId = projectId;
        this.projectName = projectName;
        this.description = description;
        this.remarks = remarks;
    }

    private String id;
    //收支 收1支0
    private String incomeOrExpend;
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
    //金額
    private Integer amt;
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

    public String getIncomeOrExpend() {
        return incomeOrExpend;
    }

    public void setIncomeOrExpend(String incomeOrExpend) {
        this.incomeOrExpend = incomeOrExpend;
    }

    public Integer getAmt() {
        return amt;
    }

    public void setAmt(Integer amt) {
        this.amt = amt;
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
        return "BookReq{" +
                "id='" + id + '\'' +
                ", incomeOrExpend='" + incomeOrExpend + '\'' +
                ", invoice=" + invoice +
                ", invYM='" + invYM + '\'' +
                ", invNo='" + invNo + '\'' +
                ", paid=" + paid +
                ", paidDat=" + paidDat +
                ", amt=" + amt +
                ", projectName='" + projectName + '\'' +
                ", description='" + description + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
