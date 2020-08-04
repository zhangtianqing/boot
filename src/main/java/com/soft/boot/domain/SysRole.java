package com.soft.boot.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author 
 * 
 */
public class SysRole implements Serializable {
    /**
     * 角色ID
     */
    private Long ROLE_ID;

    /**
     * 角色名称
     */
    private String ROLE_NAME;

    /**
     * 角色描述
     */
    private String REMARK;

    /**
     * 创建时间
     */
    private LocalDateTime CREATE_TIME;

    /**
     * 修改时间
     */
    private LocalDateTime MODIFY_TIME;

    private static final long serialVersionUID = 1L;

    public Long getROLE_ID() {
        return ROLE_ID;
    }

    public void setROLE_ID(Long ROLE_ID) {
        this.ROLE_ID = ROLE_ID;
    }

    public String getROLE_NAME() {
        return ROLE_NAME;
    }

    public void setROLE_NAME(String ROLE_NAME) {
        this.ROLE_NAME = ROLE_NAME;
    }

    public String getREMARK() {
        return REMARK;
    }

    public void setREMARK(String REMARK) {
        this.REMARK = REMARK;
    }

    public LocalDateTime getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(LocalDateTime CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public LocalDateTime getMODIFY_TIME() {
        return MODIFY_TIME;
    }

    public void setMODIFY_TIME(LocalDateTime MODIFY_TIME) {
        this.MODIFY_TIME = MODIFY_TIME;
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
        SysRole other = (SysRole) that;
        return (this.getROLE_ID() == null ? other.getROLE_ID() == null : this.getROLE_ID().equals(other.getROLE_ID()))
            && (this.getROLE_NAME() == null ? other.getROLE_NAME() == null : this.getROLE_NAME().equals(other.getROLE_NAME()))
            && (this.getREMARK() == null ? other.getREMARK() == null : this.getREMARK().equals(other.getREMARK()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getMODIFY_TIME() == null ? other.getMODIFY_TIME() == null : this.getMODIFY_TIME().equals(other.getMODIFY_TIME()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getROLE_ID() == null) ? 0 : getROLE_ID().hashCode());
        result = prime * result + ((getROLE_NAME() == null) ? 0 : getROLE_NAME().hashCode());
        result = prime * result + ((getREMARK() == null) ? 0 : getREMARK().hashCode());
        result = prime * result + ((getCREATE_TIME() == null) ? 0 : getCREATE_TIME().hashCode());
        result = prime * result + ((getMODIFY_TIME() == null) ? 0 : getMODIFY_TIME().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ROLE_ID=").append(ROLE_ID);
        sb.append(", ROLE_NAME=").append(ROLE_NAME);
        sb.append(", REMARK=").append(REMARK);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", MODIFY_TIME=").append(MODIFY_TIME);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}