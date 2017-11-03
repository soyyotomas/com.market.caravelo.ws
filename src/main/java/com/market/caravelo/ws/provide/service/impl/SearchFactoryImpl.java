package com.market.caravelo.ws.provide.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.market.caravelo.ws.provide.SearchFactory;
import com.market.caravelo.ws.provide.service.Provider;

@Repository
public class SearchFactoryImpl implements SearchFactory {

	@Autowired
	private Provider provider;

	@Override
	public Provider getServiceProvider() {
		return provider;
	}

}
