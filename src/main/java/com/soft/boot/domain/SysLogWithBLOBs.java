package com.soft.boot.domain;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class SysLogWithBLOBs extends SysLog implements Serializable {
    /**
     * 操作内容
     */
    private String OPERATION;

    /**
     * 操作方法
     */
    private String METHOD;

    /**
     * 方法参数
     */
    private String PARAMS;

    private static final long serialVersionUID = 1L;

    public String getOPERATION() {
        return OPERATION;
    }

    public void setOPERATION(String OPERATION) {
        this.OPERATION = OPERATION;
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
        SysLogWithBLOBs other = (SysLogWithBLOBs) that;
        return (this.getID() == null ? other.getID() == null : this.getID().equals(other.getID()))
            && (this.getUSERNAME() == null ? other.getUSERNAME() == null : this.getUSERNAME().equals(other.getUSERNAME()))
            && (this.getTIME() == null ? other.getTIME() == null : this.getTIME().equals(other.getTIME()))
            && (this.getIP() == null ? other.getIP() == null : this.getIP().equals(other.getIP()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getOPERATION() == null ? other.getOPERATION() == null : this.getOPERATION().equals(other.getOPERATION()))
            && (this.getMETHOD() == null ? other.getMETHOD() == null : this.getMETHOD().equals(other.getMETHOD()))
            && (this.getPARAMS() == null ? other.getPARAMS() == null : this.getPARAMS().equals(other.getPARAMS()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getID() == null) ? 0 : getID().hashCode());
        result = prime * result + ((getUSERNAME() == null) ? 0 : getUSERNAME().hashCode());
        result = prime * result + ((getTIME() == null) ? 0 : getTIME().hashCode());
        result = prime * result + ((getIP() == null) ? 0 : getIP().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getOPERATION() == null) ? 0 : getOPERATION().hashCode());
        result = prime * result + ((getMETHOD() == null) ? 0 : getMETHOD().hashCode());
        result = prime * result + ((getPARAMS() == null) ? 0 : getPARAMS().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", OPERATION=").append(OPERATION);
        sb.append(", METHOD=").append(METHOD);
        sb.append(", PARAMS=").append(PARAMS);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}