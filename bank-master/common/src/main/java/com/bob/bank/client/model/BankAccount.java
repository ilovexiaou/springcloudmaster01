package com.bob.bank.client.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 数据库表：bank_account
 *
 * @author Administrator
 * @create 2018-08-01
 */
public class BankAccount {

    /**
     * 账户主键
     */
    private Integer id;

    /**
     * 所属用户ID
     */
    private Integer userId;

    /**
     * 账户所属银行
     */
    private String bank;

    /**
     * 账户创建时间
     */
    private Date createTime;

    /**
     * 账户最近更新时间
     */
    private Date updateTime;

    /**
     * 账户积分
     */
    private Integer score;

    /**
     * 账户等级
     */
    private Integer rank;

    /**
     * 账户余额
     */
    private BigDecimal money;

    /**
     * 账户激活状态，1：激活；0：未激活
     */
    private Boolean active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}