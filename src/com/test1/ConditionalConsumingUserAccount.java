package com.test1;

public class ConditionalConsumingUserAccount {
	private Integer conditionExpressionOwner;
	private String conditionExpressionName;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private Integer locale;
	private String countryCode;
	private String isPrivileged;
	private String lastLogin;
	private Integer contactId;
	private String addressId;
	private String userGrp;
	private String requestType;

	public ConditionalConsumingUserAccount() {

	}

	public ConditionalConsumingUserAccount(Integer conditionExpressionOwner, String conditionExpressionName,
			String firstName, String lastName, String emailAddress, Integer locale, String countryCode,
			String isPrivileged, String lastLogin, Integer contactId, String addressId, String userGrp,
			String requestType) {
		super();
		this.conditionExpressionOwner = conditionExpressionOwner;
		this.conditionExpressionName = conditionExpressionName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.locale = locale;
		this.countryCode = countryCode;
		this.isPrivileged = isPrivileged;
		this.lastLogin = lastLogin;
		this.contactId = contactId;
		this.addressId = addressId;
		this.userGrp = userGrp;
		this.requestType = requestType;
	}

	public Integer getConditionExpressionOwner() {
		return conditionExpressionOwner;
	}

	public void setConditionExpressionOwner(Integer conditionExpressionOwner) {
		this.conditionExpressionOwner = conditionExpressionOwner;
	}

	public String getConditionExpressionName() {
		return conditionExpressionName;
	}

	public void setConditionExpressionName(String conditionExpressionName) {
		this.conditionExpressionName = conditionExpressionName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Integer getLocale() {
		return locale;
	}

	public void setLocale(Integer locale) {
		this.locale = locale;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getIsPrivileged() {
		return isPrivileged;
	}

	public void setIsPrivileged(String isPrivileged) {
		this.isPrivileged = isPrivileged;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getUserGrp() {
		return userGrp;
	}

	public void setUserGrp(String userGrp) {
		this.userGrp = userGrp;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

}
