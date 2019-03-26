package com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.domain.model;

import java.util.Date;

public class StatisticalProgramCycle {
	private Long statisticalProgramCycleId;
	private Date startDate;
	private Date endDate;
	private String spcName;
	private String spcDescrition;

	public StatisticalProgramCycle(Long statisticalProgramCycleId, Date startDate, Date endDate, String spcName,
			String spcDescrition) {
		super();
		this.statisticalProgramCycleId = statisticalProgramCycleId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.spcName = spcName;
		this.spcDescrition = spcDescrition;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getSpcName() {
		return spcName;
	}

	public void setSpcName(String spcName) {
		this.spcName = spcName;
	}

	public String getSpcDescrition() {
		return spcDescrition;
	}

	public void setSpcDescrition(String spcDescrition) {
		this.spcDescrition = spcDescrition;
	}

	public Long getStatisticalProgramCycleId() {
		return statisticalProgramCycleId;
	}

	public void setStatisticalProgramCycleId(Long statisticalProgramCycleId) {
		this.statisticalProgramCycleId = statisticalProgramCycleId;
	}

	@Override
	public String toString() {
		return "StatisticalProgramCycle [statisticalProgramCycleId=" + statisticalProgramCycleId + ", startDate="
				+ startDate + ", endDate=" + endDate + ", spcName=" + spcName + ", spcDescrition=" + spcDescrition
				+ "]";
	}
}
