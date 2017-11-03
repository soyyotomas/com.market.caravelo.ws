package com.market.caravelo.ws;

import javax.ws.rs.Path;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.market.caravelo.ws.exception.SearchException;
import com.market.caravelo.ws.service.SearchService;
import com.market.caravelo.ws.wrapper.filter.DataFilter;
import com.market.caravelo.ws.wrapper.result.Research;


@Component
@Path("/search")
public class SearchController {
	private static final Logger objLog = Logger.getLogger(SearchController.class);
	
	@Autowired
	private SearchService searchService;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Research> searchEngine(@RequestBody DataFilter datafilter) {
		Research research = null;
		try {
			research = searchService.searchEngine(datafilter);
		} catch (SearchException e) {
			objLog.error(e.getMessage());
		}
		return new ResponseEntity<Research>(research, HttpStatus.OK);
	}
	
}
