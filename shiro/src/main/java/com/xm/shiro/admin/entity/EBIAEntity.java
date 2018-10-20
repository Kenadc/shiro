package com.xm.shiro.admin.entity;

public class EBIAEntity {
	private String ID;
	private String CONTENT;
	private String ORG_NAME;
	private String REMARK;
	private String FIELD_NAME;
	private String TYPE_NAME;
	private String CREATE_TIME;
	private String FLAG;
	private String LIST_SOURCE;
	private String RELEASE_TIME;
	private String REGION_CODE;
	private String REGION_NAME;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}
	public String getORG_NAME() {
		return ORG_NAME;
	}
	public void setORG_NAME(String oRG_NAME) {
		ORG_NAME = oRG_NAME;
	}
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	public String getFIELD_NAME() {
		return FIELD_NAME;
	}
	public void setFIELD_NAME(String fIELD_NAME) {
		FIELD_NAME = fIELD_NAME;
	}
	public String getTYPE_NAME() {
		return TYPE_NAME;
	}
	public void setTYPE_NAME(String tYPE_NAME) {
		TYPE_NAME = tYPE_NAME;
	}
	public String getCREATE_TIME() {
		return CREATE_TIME;
	}
	public void setCREATE_TIME(String cREATE_TIME) {
		CREATE_TIME = cREATE_TIME;
	}
	public String getFLAG() {
		return FLAG;
	}
	public void setFLAG(String fLAG) {
		FLAG = fLAG;
	}
	public String getLIST_SOURCE() {
		return LIST_SOURCE;
	}
	public void setLIST_SOURCE(String lIST_SOURCE) {
		LIST_SOURCE = lIST_SOURCE;
	}
	public String getRELEASE_TIME() {
		return RELEASE_TIME;
	}
	public void setRELEASE_TIME(String rELEASE_TIME) {
		RELEASE_TIME = rELEASE_TIME;
	}
	public String getREGION_CODE() {
		return REGION_CODE;
	}
	public void setREGION_CODE(String rEGION_CODE) {
		REGION_CODE = rEGION_CODE;
	}
	public String getREGION_NAME() {
		return REGION_NAME;
	}
	public void setREGION_NAME(String rEGION_NAME) {
		REGION_NAME = rEGION_NAME;
	}
	@Override
	public String toString() {
		return "EBIAEntity [ID=" + ID + ", CONTENT=" + CONTENT + ", ORG_NAME=" + ORG_NAME + ", REMARK=" + REMARK
				+ ", FIELD_NAME=" + FIELD_NAME + ", TYPE_NAME=" + TYPE_NAME + ", CREATE_TIME=" + CREATE_TIME + ", FLAG="
				+ FLAG + ", LIST_SOURCE=" + LIST_SOURCE + ", RELEASE_TIME=" + RELEASE_TIME + ", REGION_CODE="
				+ REGION_CODE + ", REGION_NAME=" + REGION_NAME + "]";
	}
	
}
