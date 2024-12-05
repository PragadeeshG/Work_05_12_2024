package com.test1;

public class ConditionalConsumingAccount {
	private Integer recordKey;
	private Integer consumingItamConCode;
	private String consumingItamConCodePosition;
	private String consumingItamConCodeLength;
	private String conditionExpressionDigitsPosition;
	private String conditionExpressionDigitsLength;
	private boolean withHoldingTaxPosition;
	private String withHoldingTaxLength;
	private String requiredTaxPosition;
	private String requiredTaxLength;
	private String fundraisingIdLength;
	private String fundraisingSpace;
	private String pulseSpaceName;
	private String futureMarket;

	public ConditionalConsumingAccount() {

	}

	public ConditionalConsumingAccount(Integer recordKey, Integer consumingItamConCode,
			String consumingItamConCodePosition, String consumingItamConCodeLength,
			String conditionExpressionDigitsPosition, String conditionExpressionDigitsLength,
			boolean withHoldingTaxPosition, String withHoldingTaxLength, String requiredTaxPosition,
			String requiredTaxLength, String fundraisingIdLength, String fundraisingSpace, String pulseSpaceName,
			String futureMarket) {
		super();
		this.recordKey = recordKey;
		this.consumingItamConCode = consumingItamConCode;
		this.consumingItamConCodePosition = consumingItamConCodePosition;
		this.consumingItamConCodeLength = consumingItamConCodeLength;
		this.conditionExpressionDigitsPosition = conditionExpressionDigitsPosition;
		this.conditionExpressionDigitsLength = conditionExpressionDigitsLength;
		this.withHoldingTaxPosition = withHoldingTaxPosition;
		this.withHoldingTaxLength = withHoldingTaxLength;
		this.requiredTaxPosition = requiredTaxPosition;
		this.requiredTaxLength = requiredTaxLength;
		this.fundraisingIdLength = fundraisingIdLength;
		this.fundraisingSpace = fundraisingSpace;
		this.pulseSpaceName = pulseSpaceName;
		this.futureMarket = futureMarket;
	}

	public Integer getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(Integer recordKey) {
		this.recordKey = recordKey;
	}

	public Integer getConsumingItamConCode() {
		return consumingItamConCode;
	}

	public void setConsumingItamConCode(Integer consumingItamConCode) {
		this.consumingItamConCode = consumingItamConCode;
	}

	public String getConsumingItamConCodePosition() {
		return consumingItamConCodePosition;
	}

	public void setConsumingItamConCodePosition(String consumingItamConCodePosition) {
		this.consumingItamConCodePosition = consumingItamConCodePosition;
	}

	public String getConsumingItamConCodeLength() {
		return consumingItamConCodeLength;
	}

	public void setConsumingItamConCodeLength(String consumingItamConCodeLength) {
		this.consumingItamConCodeLength = consumingItamConCodeLength;
	}

	public String getConditionExpressionDigitsPosition() {
		return conditionExpressionDigitsPosition;
	}

	public void setConditionExpressionDigitsPosition(String conditionExpressionDigitsPosition) {
		this.conditionExpressionDigitsPosition = conditionExpressionDigitsPosition;
	}

	public String getConditionExpressionDigitsLength() {
		return conditionExpressionDigitsLength;
	}

	public void setConditionExpressionDigitsLength(String conditionExpressionDigitsLength) {
		this.conditionExpressionDigitsLength = conditionExpressionDigitsLength;
	}

	public boolean isWithHoldingTaxPosition() {
		return withHoldingTaxPosition;
	}

	public void setWithHoldingTaxPosition(boolean withHoldingTaxPosition) {
		this.withHoldingTaxPosition = withHoldingTaxPosition;
	}

	public String getWithHoldingTaxLength() {
		return withHoldingTaxLength;
	}

	public void setWithHoldingTaxLength(String withHoldingTaxLength) {
		this.withHoldingTaxLength = withHoldingTaxLength;
	}

	public String getRequiredTaxPosition() {
		return requiredTaxPosition;
	}

	public void setRequiredTaxPosition(String requiredTaxPosition) {
		this.requiredTaxPosition = requiredTaxPosition;
	}

	public String getRequiredTaxLength() {
		return requiredTaxLength;
	}

	public void setRequiredTaxLength(String requiredTaxLength) {
		this.requiredTaxLength = requiredTaxLength;
	}

	public String getFundraisingIdLength() {
		return fundraisingIdLength;
	}

	public void setFundraisingIdLength(String fundraisingIdLength) {
		this.fundraisingIdLength = fundraisingIdLength;
	}

	public String getFundraisingSpace() {
		return fundraisingSpace;
	}

	public void setFundraisingSpace(String fundraisingSpace) {
		this.fundraisingSpace = fundraisingSpace;
	}

	public String getPulseSpaceName() {
		return pulseSpaceName;
	}

	public void setPulseSpaceName(String pulseSpaceName) {
		this.pulseSpaceName = pulseSpaceName;
	}

	public String getFutureMarket() {
		return futureMarket;
	}

	public void setFutureMarket(String futureMarket) {
		this.futureMarket = futureMarket;
	}

}
