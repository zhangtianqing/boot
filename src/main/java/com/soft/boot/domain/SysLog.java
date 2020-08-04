package com.soft.boot.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author 
 * 
 */
public class SysLog implements Serializable {
    /**
     * 日志ID
     */
    private Long ID;

    /**
     * 操作用户
     */
    private String USERNAME;

    /**
     * 操作内容
     */
    private String OPERATION;

    /**
     * 耗时
     */
    private Long TIME;

    /**
     * 操作方法
     */
    private String METHOD;

    /**
     * 方法参数
     */
    private String PARAMS;

    /**
     * 操作者IP
     */
    private String IP;

    /**
     * 创建时间
     */
    private LocalDateTime CREATE_TIME;

    /**
     * 操作地点
     */
    private String location;

    private static final long serialVersionUID = 1L;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getOPERATION() {
        return OPERATION;
    }

    public void setOPERATION(String OPERATION) {
        this.OPERATION = OPERATION;
    }

    public Long getTIME() {
        return TIME;
    }

    public void setTIME(Long TIME) {
        this.TIME = TIME;
    }

    public String getMETHOD() {
        return METHOD;
    }

    public void setMETHOD(String METHOD) {
        this.METHOD = METHOD;
    }

    public String getPARAMS() {
        return PARAMS;
    }

    public void setPARAMS(String PARAMS) {
        this.PARAMS = PARAMS;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public LocalDateTime getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(LocalDateTime CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysLog other = (SysLog) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getUSERNAME() == null ? other.getUSERNAME() == null : this.getUSERNAME().equals(other.getUSERNAME()))
            && (this.getOPERATION() == null ? other.getOPERATION() == null : this.getOPERATION().equals(other.getOPERATION()))
            && (this.getTIME() == null ? other.getTIME() == null : this.getTIME().equals(other.getTIME()))
            && (this.getMETHOD() == null ? other.getMETHOD() == null : this.getMETHOD().equals(other.getMETHOD()))
            && (this.getPARAMS() == null ? other.getPARAMS() == null : this.getPARAMS().equals(other.getPARAMS()))
            && (this.getIP() == null ? other.getIP() == null : this.getIP().equals(other.getIP()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getUSERNAME() == null) ? 0 : getUSERNAME().hashCode());
        result = prime * result + ((getOPERATION() == null) ? 0 : getOPERATION().hashCode());
        result = prime * result + ((getTIME() == null) ? 0 : getTIME().hashCode());
        result = prime * result + ((getMETHOD() == null) ? 0 : getMETHOD().hashCode());
        result = prime * result + ((getPARAMS() == null) ? 0 : getPARAMS().hashCode());
        result = prime * result + ((getIP() == null) ? 0 : getIP().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ID=").append(ID);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", OPERATION=").append(OPERATION);
        sb.append(", TIME=").append(TIME);
        sb.append(", METHOD=").append(METHOD);
        sb.append(", PARAMS=").append(PARAMS);
        sb.append(", IP=").append(IP);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", location=").append(location);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}