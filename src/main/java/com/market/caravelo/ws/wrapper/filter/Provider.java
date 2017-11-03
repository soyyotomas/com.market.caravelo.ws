package com.market.caravelo.ws.wrapper.filter;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Provider implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1010159722694268092L;
	private List<Supplier> listSuppliers;

	public List<Supplier> getListSuppliers() {
		return listSuppliers;
	}

	public void setListSuppliers(List<Supplier> listSuppliers) {
		this.listSuppliers = listSuppliers;
	}

}
