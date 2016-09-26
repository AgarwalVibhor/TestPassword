package com.tcs.business;

import com.tcs.model.Associate;

public interface AssociateBusinessInterface {
	
	public byte[] saltInput();
	
	public String hashPassword(String password, String salt);
	
	public int saveAssociate(Associate associate, String salt);

}
