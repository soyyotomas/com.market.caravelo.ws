package com.market.caravelo.ws.provide.service.impl;

import java.time.Instant;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.market.caravelo.ws.exception.SearchException;
import com.market.caravelo.ws.provide.dummy.ProviderDummy;
import com.market.caravelo.ws.provide.service.Provider;
import com.market.caravelo.ws.wrapper.filter.DataFilter;
import com.market.caravelo.ws.wrapper.result.Research;

@Repository
public class ProviderImpl implements Provider {
	private final static Logger objLog = Logger.getLogger(ProviderImpl.class);

	@Override
	public Research search(DataFilter filter) throws SearchException {
		objLog.info("#############################################################################");
		objLog.info("######################### BEGIN ::::: search ##### " + Instant.now());
		Research research = null;
		try {
			// Service provider dummy
			research = ProviderDummy.search(filter);
		} finally {
			objLog.info("#############################################################################");
			objLog.info("######################### END ::::: search ##### " + Instant.now());
		}
		return research;
	}

	@Override
	public Research searchAvailabity(DataFilter filter) throws SearchException {
		objLog.info("#############################################################################");
		objLog.info("######################### BEGIN ::::: searchAvailabity ##### " + Instant.now());
		Research research = null;
		try {
			// Service provider dummy
			research = ProviderDummy.searchAvailability(filter);
		} finally {
			objLog.info("#############################################################################");
			objLog.info("######################### END ::::: searchAvailabity ##### " + Instant.now());
		}
		return research;
	}

}
