package com.test1;

public class ConditionalConsumingAccountResponse {
	private Integer conditionExpressionId;
	private String conditionExpressionOwner;
	private boolean activeAccount;
	private Integer conditionExpressionTypeId;
	private String conditionExpressionType;
	private String conditionExpressionStatus;
	private Integer conditionExpressionDescription;
	private Integer authorizerCount;
	private String authCountry;
	private Integer authRegionCode;
	private String exceptions;
	private String status;
	private String remarks;

	public ConditionalConsumingAccountResponse() {

	}

	public ConditionalConsumingAccountResponse(Integer conditionExpressionId, String conditionExpressionOwner,
			boolean activeAccount, Integer conditionExpressionTypeId, String conditionExpressionType,
			String conditionExpressionStatus, Integer conditionExpressionDescription, Integer authorizerCount,
			String authCountry, Integer authRegionCode, String exceptions, String status, String remarks) {
		super();
		this.conditionExpressionId = conditionExpressionId;
		this.conditionExpressionOwner = conditionExpressionOwner;
		this.activeAccount = activeAccount;
		this.conditionExpressionTypeId = conditionExpressionTypeId;
		this.conditionExpressionType = conditionExpressionType;
		this.conditionExpressionStatus = conditionExpressionStatus;
		this.conditionExpressionDescription = conditionExpressionDescription;
		this.authorizerCount = authorizerCount;
		this.authCountry = authCountry;
		this.authRegionCode = authRegionCode;
		this.exceptions = exceptions;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getConditionExpressionId() {
		return conditionExpressionId;
	}

	public void setConditionExpressionId(Integer conditionExpressionId) {
		this.conditionExpressionId = conditionExpressionId;
	}

	public String getConditionExpressionOwner() {
		return conditionExpressionOwner;
	}

	public void setConditionExpressionOwner(String conditionExpressionOwner) {
		this.conditionExpressionOwner = conditionExpressionOwner;
	}

	public boolean isActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public Integer getConditionExpressionTypeId() {
		return conditionExpressionTypeId;
	}

	public void setConditionExpressionTypeId(Integer conditionExpressionTypeId) {
		this.conditionExpressionTypeId = conditionExpressionTypeId;
	}

	public String getConditionExpressionType() {
		return conditionExpressionType;
	}

	public void setConditionExpressionType(String conditionExpressionType) {
		this.conditionExpressionType = conditionExpressionType;
	}

	public String getConditionExpressionStatus() {
		return conditionExpressionStatus;
	}

	public void setConditionExpressionStatus(String conditionExpressionStatus) {
		this.conditionExpressionStatus = conditionExpressionStatus;
	}

	public Integer getConditionExpressionDescription() {
		return conditionExpressionDescription;
	}

	public void setConditionExpressionDescription(Integer conditionExpressionDescription) {
		this.conditionExpressionDescription = conditionExpressionDescription;
	}

	public Integer getAuthorizerCount() {
		return authorizerCount;
	}

	public void setAuthorizerCount(Integer authorizerCount) {
		this.authorizerCount = authorizerCount;
	}

	public String getAuthCountry() {
		return authCountry;
	}

	public void setAuthCountry(String authCountry) {
		this.authCountry = authCountry;
	}

	public Integer getAuthRegionCode() {
		return authRegionCode;
	}

	public void setAuthRegionCode(Integer authRegionCode) {
		this.authRegionCode = authRegionCode;
	}

	public String getExceptions() {
		return exceptions;
	}

	public void setExceptions(String exceptions) {
		this.exceptions = exceptions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
