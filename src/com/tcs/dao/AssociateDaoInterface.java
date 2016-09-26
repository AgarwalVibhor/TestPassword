package com.tcs.dao;

import com.tcs.model.Associate;

public interface AssociateDaoInterface {
	
	public int saveAssociate(Associate associate, String salt);

}
