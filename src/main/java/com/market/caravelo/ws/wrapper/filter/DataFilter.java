package com.market.caravelo.ws.wrapper.filter;

import java.io.Serializable;

public class DataFilter implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = -2525673663719903336L;
	private Requester requester;
	private Provider provider;
	private Survey survey;

	public Requester getRequester() {
		return requester;
	}

	public void setRequester(Requester requester) {
		this.requester = requester;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

}
