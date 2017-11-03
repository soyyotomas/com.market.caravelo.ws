package com.market.caravelo.ws.wrapper.filter;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Target implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8640580329391951984L;
	private String gender;
	private List<Integer> rangeAge;
	private Income income;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Integer> getRangeAge() {
		return rangeAge;
	}

	public void setRangeAge(List<Integer> rangeAge) {
		this.rangeAge = rangeAge;
	}

	public Income getIncome() {
		return income;
	}

	public void setIncome(Income income) {
		this.income = income;
	}
}
