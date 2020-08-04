package com.soft.boot.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author 
 * 
 */
public class SysUser implements Serializable {
    /**
     * 用户ID
     */
    private Long USER_ID;

    /**
     * 用户名
     */
    private String USERNAME;

    /**
     * 密码
     */
    private String PASSWORD;

    /**
     * 邮箱
     */
    private String EMAIL;

    /**
     * 联系电话
     */
    private String MOBILE;

    /**
     * 状态 0锁定 1有效
     */
    private String STATUS;

    /**
     * 创建时间
     */
    private LocalDateTime CRATE_TIME;

    /**
     * 修改时间
     */
    private LocalDateTime MODIFY_TIME;

    /**
     * 最近访问时间
     */
    private LocalDateTime LASsys_LOGIN_TIME;

    /**
     * 性别 0男 1女
     */
    private String SSEX;

    /**
     * 描述
     */
    private String DESCRIPTION;

    public SysUser(){}

    public SysUser(Long USER_ID, String USERNAME, String PASSWORD, String EMAIL, String MOBILE, String STATUS, LocalDateTime CRATE_TIME, LocalDateTime MODIFY_TIME, LocalDateTime LASsys_LOGIN_TIME, String SSEX, String DESCRIPTION) {
        this.USER_ID = USER_ID;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.EMAIL = EMAIL;
        this.MOBILE = MOBILE;
        this.STATUS = STATUS;
        this.CRATE_TIME = CRATE_TIME;
        this.MODIFY_TIME = MODIFY_TIME;
        this.LASsys_LOGIN_TIME = LASsys_LOGIN_TIME;
        this.SSEX = SSEX;
        this.DESCRIPTION = DESCRIPTION;
    }

    private static final long serialVersionUID = 1L;

    public Long getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Long USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getMOBILE() {
        return MOBILE;
    }

    public void setMOBILE(String MOBILE) {
        this.MOBILE = MOBILE;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public LocalDateTime getCRATE_TIME() {
        return CRATE_TIME;
    }

    public void setCRATE_TIME(LocalDateTime CRATE_TIME) {
        this.CRATE_TIME = CRATE_TIME;
    }

    public LocalDateTime getMODIFY_TIME() {
        return MODIFY_TIME;
    }

    public void setMODIFY_TIME(LocalDateTime MODIFY_TIME) {
        this.MODIFY_TIME = MODIFY_TIME;
    }

    public LocalDateTime getLASsys_LOGIN_TIME() {
        return LASsys_LOGIN_TIME;
    }

    public void setLASsys_LOGIN_TIME(LocalDateTime LASsys_LOGIN_TIME) {
        this.LASsys_LOGIN_TIME = LASsys_LOGIN_TIME;
    }

    public String getSSEX() {
        return SSEX;
    }

    public void setSSEX(String SSEX) {
        this.SSEX = SSEX;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
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
        SysUser other = (SysUser) that;
        return (this.getUSER_ID() == null ? other.getUSER_ID() == null : this.getUSER_ID().equals(other.getUSER_ID()))
            && (this.getUSERNAME() == null ? other.getUSERNAME() == null : this.getUSERNAME().equals(other.getUSERNAME()))
            && (this.getPASSWORD() == null ? other.getPASSWORD() == null : this.getPASSWORD().equals(other.getPASSWORD()))
            && (this.getEMAIL() == null ? other.getEMAIL() == null : this.getEMAIL().equals(other.getEMAIL()))
            && (this.getMOBILE() == null ? other.getMOBILE() == null : this.getMOBILE().equals(other.getMOBILE()))
            && (this.getSTATUS() == null ? other.getSTATUS() == null : this.getSTATUS().equals(other.getSTATUS()))
            && (this.getCRATE_TIME() == null ? other.getCRATE_TIME() == null : this.getCRATE_TIME().equals(other.getCRATE_TIME()))
            && (this.getMODIFY_TIME() == null ? other.getMODIFY_TIME() == null : this.getMODIFY_TIME().equals(other.getMODIFY_TIME()))
            && (this.getLASsys_LOGIN_TIME() == null ? other.getLASsys_LOGIN_TIME() == null : this.getLASsys_LOGIN_TIME().equals(other.getLASsys_LOGIN_TIME()))
            && (this.getSSEX() == null ? other.getSSEX() == null : this.getSSEX().equals(other.getSSEX()))
            && (this.getDESCRIPTION() == null ? other.getDESCRIPTION() == null : this.getDESCRIPTION().equals(other.getDESCRIPTION()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUSER_ID() == null) ? 0 : getUSER_ID().hashCode());
        result = prime * result + ((getUSERNAME() == null) ? 0 : getUSERNAME().hashCode());
        result = prime * result + ((getPASSWORD() == null) ? 0 : getPASSWORD().hashCode());
        result = prime * result + ((getEMAIL() == null) ? 0 : getEMAIL().hashCode());
        result = prime * result + ((getMOBILE() == null) ? 0 : getMOBILE().hashCode());
        result = prime * result + ((getSTATUS() == null) ? 0 : getSTATUS().hashCode());
        result = prime * result + ((getCRATE_TIME() == null) ? 0 : getCRATE_TIME().hashCode());
        result = prime * result + ((getMODIFY_TIME() == null) ? 0 : getMODIFY_TIME().hashCode());
        result = prime * result + ((getLASsys_LOGIN_TIME() == null) ? 0 : getLASsys_LOGIN_TIME().hashCode());
        result = prime * result + ((getSSEX() == null) ? 0 : getSSEX().hashCode());
        result = prime * result + ((getDESCRIPTION() == null) ? 0 : getDESCRIPTION().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", USER_ID=").append(USER_ID);
        sb.append(", USERNAME=").append(USERNAME);
        sb.append(", PASSWORD=").append(PASSWORD);
        sb.append(", EMAIL=").append(EMAIL);
        sb.append(", MOBILE=").append(MOBILE);
        sb.append(", STATUS=").append(STATUS);
        sb.append(", CRATE_TIME=").append(CRATE_TIME);
        sb.append(", MODIFY_TIME=").append(MODIFY_TIME);
        sb.append(", LASsys_LOGIN_TIME=").append(LASsys_LOGIN_TIME);
        sb.append(", SSEX=").append(SSEX);
        sb.append(", DESCRIPTION=").append(DESCRIPTION);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}