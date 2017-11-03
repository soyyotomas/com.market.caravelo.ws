package com.market.caravelo.ws.service;

import com.market.caravelo.ws.exception.SearchException;
import com.market.caravelo.ws.wrapper.filter.DataFilter;
import com.market.caravelo.ws.wrapper.result.Research;

public interface SearchService {
	public Research searchEngine(DataFilter dataFilter) throws SearchException;
}
