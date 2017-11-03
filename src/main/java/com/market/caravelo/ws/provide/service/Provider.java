package com.market.caravelo.ws.provide.service;

import com.market.caravelo.ws.exception.SearchException;
import com.market.caravelo.ws.wrapper.filter.DataFilter;
import com.market.caravelo.ws.wrapper.result.Research;

public interface Provider {

	public Research search(DataFilter filter) throws SearchException;

	public Research searchAvailabity(DataFilter filter) throws SearchException;

}
