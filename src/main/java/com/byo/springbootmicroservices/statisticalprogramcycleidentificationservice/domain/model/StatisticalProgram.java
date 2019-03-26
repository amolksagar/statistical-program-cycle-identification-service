package com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.domain.model;

import java.util.Date;

public class StatisticalProgram {
	private Long statisticalProgramId;
	private Date startDate;
	private Date endDate;
	private String spName;
	private String spDescrition;

	public StatisticalProgram(Long statisticalProgramId, Date startDate, Date endDate, String spName,
			String spDescrition) {
		super();
		this.statisticalProgramId = statisticalProgramId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.spName = spName;
		this.spDescrition = spDescrition;
	}

	public Long getStatisticalProgramId() {
		return statisticalProgramId;
	}

	public void setStatisticalProgramId(Long statisticalProgramId) {
		this.statisticalProgramId = statisticalProgramId;
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

	public String getSpName() {
		return spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public String getSpDescrition() {
		return spDescrition;
	}

	public void setSpDescrition(String spDescrition) {
		this.spDescrition = spDescrition;
	}
}
