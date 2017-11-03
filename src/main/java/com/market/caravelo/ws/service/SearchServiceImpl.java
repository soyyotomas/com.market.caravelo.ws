package com.market.caravelo.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.caravelo.ws.exception.SearchException;
import com.market.caravelo.ws.provide.SearchFactory;
import com.market.caravelo.ws.wrapper.filter.DataFilter;
import com.market.caravelo.ws.wrapper.result.Research;

@Service
public class SearchServiceImpl implements SearchService {
	@Autowired
	private SearchFactory searchFactory;
	
	public Research searchEngine(DataFilter dataFilter) throws SearchException {
		Research research = null;
		try {
			if(dataFilter == null) {
				return null;
			}

			if(dataFilter.getRequester().isAvailable()) {
				research = searchFactory.getServiceProvider().searchAvailabity(dataFilter);
			}else {
				research = searchFactory.getServiceProvider().search(dataFilter);
			}
			
		} catch (Exception e) {
			
		}
		return research;
	}

}
