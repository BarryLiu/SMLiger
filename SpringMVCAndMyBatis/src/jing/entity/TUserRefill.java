package jing.entity;

import java.util.Date;

public class TUserRefill {
    private Long id;

    private String title;

    private Long userId;

    private String userName;

    private Double infoMoney;

    private Date infoDate;

    private Double curMoney;

    private String comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Double getInfoMoney() {
        return infoMoney;
    }

    public void setInfoMoney(Double infoMoney) {
        this.infoMoney = infoMoney;
    }

    public Date getInfoDate() {
        return infoDate;
    }

    public void setInfoDate(Date infoDate) {
        this.infoDate = infoDate;
    }

    public Double getCurMoney() {
        return curMoney;
    }

    public void setCurMoney(Double curMoney) {
        this.curMoney = curMoney;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}