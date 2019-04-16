package com.seeyon.v3x.edoc.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.seeyon.v3x.common.domain.BaseModel;


/**
 * EdocMarkCategory generated by MyEclipse - Hibernate Tools
 */
public class EdocMarkCategory extends BaseModel implements Serializable {
     
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -814806729341052785L;
	// Fields
	private Short codeMode;
	private String categoryName;	 
	private Integer currentNo;
	private Integer minNo;
	private Integer maxNo;
	private boolean readonly;
	private Set edocMarkDefinitions = new HashSet(0);
	private Long domainId;
	private boolean yearEnabled;

    // Constructors

    /** default constructor */
    public EdocMarkCategory() {
    }	     
   
    // Property accessors    
    
    
    public String getCategoryName()
    {
    	return categoryName;
    }
    
    public void setCategoryName(String categoryName)
    {
    	this.categoryName = categoryName;
    }

    public Integer getCurrentNo() {
        return this.currentNo;
    }
    
    public void setCurrentNo(Integer currentNo) {
        this.currentNo = currentNo;
    }

    public Integer getMinNo() {
        return this.minNo;
    }
    
    public void setMinNo(Integer minNo) {
        this.minNo = minNo;
    }

    public Integer getMaxNo() {
        return this.maxNo;
    }
    
    public void setMaxNo(Integer maxNo) {
        this.maxNo = maxNo;
    }

    public boolean isReadonly() {
        return this.readonly;
    }
    
    public void setReadonly(boolean b) {
        this.readonly = b;
    }
    
    public Long getDomainId()
    {
    	return domainId;
    }

    public void setDomainId(Long domainId) {
		this.domainId = domainId;
	}

	public Set getEdocMarkDefinitions() {
        return this.edocMarkDefinitions;
    }
    
    public void setEdocMarkDefinitions(Set edocMarkDefinitions) {
        this.edocMarkDefinitions= edocMarkDefinitions;
    }

	public Short getCodeMode() {
		return codeMode;
	}

	public void setCodeMode(Short codeMode) {
		this.codeMode = codeMode;
	}

	public boolean getYearEnabled() {
		return yearEnabled;
	}
	
	public void setYearEnabled(boolean b) {
		this.yearEnabled = b;
	}

}