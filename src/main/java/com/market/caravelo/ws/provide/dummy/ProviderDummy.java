package com.market.caravelo.ws.provide.dummy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.market.caravelo.ws.wrapper.filter.DataFilter;
import com.market.caravelo.ws.wrapper.result.Data;
import com.market.caravelo.ws.wrapper.result.Operation;
import com.market.caravelo.ws.wrapper.result.Research;
import com.market.caravelo.ws.wrapper.result.Result;

public abstract class ProviderDummy {
	private final static Logger objLog = Logger.getLogger(ProviderDummy.class);
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	public static Research search(DataFilter filter) {
		objLog.info("::::::::::::: ProviderDummy.search :::::::::::::::::::::::::::::::");
		Research research = new Research();
		research.setStatus("regular");
		research.setDateSearch(dateFormat.format(new Date()));
		research.setTopic(filter.getSurvey().getTarget().toString());
		
		Result result = new Result();
		result.setListOperation(getOperation());
		research.setResult(result);
		
		return research;
	}

	public static Research searchAvailability(DataFilter filter) { 
		objLog.info("::::::::::::: ProviderDummy.searchAvailability :::::::::::::::::::::::::::::::");
		Research research = new Research();
		research.setStatus("open");
		research.setDateSearch(dateFormat.format(new Date()));
		research.setTopic(filter.getSurvey().getTarget().toString());

		Result result = new Result();
		result.setListOperation(getOperation());
		research.setResult(result);
		
		return research;
	}

	private static List<Operation> getOperation() {
		List<Operation> listOperation = new ArrayList<>();
		
		Operation operationKarnal = new Operation();
		operationKarnal.setGroupName("karnal");
		operationKarnal.setListData(getSearch());
		
		Operation operationIpsos = new Operation();
		operationIpsos.setGroupName("Ipsos");
		operationIpsos.setListData(getSearch());
		
		Operation operationGFK = new Operation();
		operationGFK.setGroupName("GFK");
		operationGFK.setListData(getSearch());
		
		listOperation.add(operationKarnal);
		listOperation.add(operationIpsos);
		listOperation.add(operationGFK);
		return listOperation;
	}

	private static List<Data> getSearch() {
		List<Data> listData = new ArrayList<>();
		
		Data dataPdf = new Data();
		dataPdf.setContentType("contentType");
		dataPdf.setSelf("self url");
		dataPdf.setPublished(dateFormat.format(new Date()));
		dataPdf.setUpdated(dateFormat.format(new Date()));
		
		Data dataJson = new Data();
		dataJson.setContentType("contentType");
		dataJson.setSelf("self url");
		dataJson.setPublished(dateFormat.format(new Date()));
		dataJson.setUpdated(dateFormat.format(new Date()));
		
		Data dataXML = new Data();
		dataXML.setContentType("contentType");
		dataXML.setSelf("self url");
		dataXML.setPublished(dateFormat.format(new Date()));
		dataXML.setUpdated(dateFormat.format(new Date()));
		
		Data dataMedia = new Data();
		dataMedia.setContentType("contentType");
		dataMedia.setSelf("self url");
		dataMedia.setPublished(dateFormat.format(new Date()));
		dataMedia.setUpdated(dateFormat.format(new Date()));
		
		listData.add(dataPdf);
		listData.add(dataJson);
		listData.add(dataXML);
		listData.add(dataMedia);
		
		return listData;
	}
}
