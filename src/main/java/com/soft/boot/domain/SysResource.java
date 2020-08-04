package com.soft.boot.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author 
 * 
 */
public class SysResource implements Serializable {
    /**
     * 资源/组件ID
     */
    private Long RESOURCE_ID;

    /**
     * URL
     */
    private String URL;

    /**
     * 创建时间
     */
    private LocalDateTime CREATE_TIME;

    /**
     * 修改时间
     */
    private LocalDateTime MODIFY_TIME;

    private static final long serialVersionUID = 1L;

    public Long getRESOURCE_ID() {
        return RESOURCE_ID;
    }

    public void setRESOURCE_ID(Long RESOURCE_ID) {
        this.RESOURCE_ID = RESOURCE_ID;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
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
        SysResource other = (SysResource) that;
        return (this.getRESOURCE_ID() == null ? other.getRESOURCE_ID() == null : this.getRESOURCE_ID().equals(other.getRESOURCE_ID()))
            && (this.getURL() == null ? other.getURL() == null : this.getURL().equals(other.getURL()))
            && (this.getCREATE_TIME() == null ? other.getCREATE_TIME() == null : this.getCREATE_TIME().equals(other.getCREATE_TIME()))
            && (this.getMODIFY_TIME() == null ? other.getMODIFY_TIME() == null : this.getMODIFY_TIME().equals(other.getMODIFY_TIME()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRESOURCE_ID() == null) ? 0 : getRESOURCE_ID().hashCode());
        result = prime * result + ((getURL() == null) ? 0 : getURL().hashCode());
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
        sb.append(", RESOURCE_ID=").append(RESOURCE_ID);
        sb.append(", URL=").append(URL);
        sb.append(", CREATE_TIME=").append(CREATE_TIME);
        sb.append(", MODIFY_TIME=").append(MODIFY_TIME);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}