package com.hch.model;

import java.util.Date;

public class XtUser {
    private String xtUserId;

    private String xtUserCreateId;

    private String xtUserName;

    private String password;

    private Date createDate;

    private String contactnumber;

    private String state;

    public String getXtUserId() {
        return xtUserId;
    }

    public void setXtUserId(String xtUserId) {
        this.xtUserId = xtUserId == null ? null : xtUserId.trim();
    }

    public String getXtUserCreateId() {
        return xtUserCreateId;
    }

    public void setXtUserCreateId(String xtUserCreateId) {
        this.xtUserCreateId = xtUserCreateId == null ? null : xtUserCreateId.trim();
    }

    public String getXtUserName() {
        return xtUserName;
    }

    public void setXtUserName(String xtUserName) {
        this.xtUserName = xtUserName == null ? null : xtUserName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber == null ? null : contactnumber.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}