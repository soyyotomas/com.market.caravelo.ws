package com.market.caravelo.ws.wrapper.result;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Operation implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 3222067908797320679L;
	private String groupName;
	private List<Data> listData;

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<Data> getListData() {
		return listData;
	}

	public void setListData(List<Data> listData) {
		this.listData = listData;
	}

}