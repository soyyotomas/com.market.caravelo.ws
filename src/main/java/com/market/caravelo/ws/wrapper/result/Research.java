package com.market.caravelo.ws.wrapper.result;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Research implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 4913898054408844682L;
	private String status;
	private String dateSearch;
	private String topic;
	private Result result;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDateSearch() {
		return dateSearch;
	}

	public void setDateSearch(String dateSearch) {
		this.dateSearch = dateSearch;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
