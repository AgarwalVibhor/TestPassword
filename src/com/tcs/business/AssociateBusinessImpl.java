package com.tcs.business;

import java.security.SecureRandom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.tcs.dao.AssociateDaoInterface;
import com.tcs.model.Associate;

public class AssociateBusinessImpl implements AssociateBusinessInterface {
	
	@Autowired
	private AssociateDaoInterface dao;

	@Override
	public String hashPassword(String password, String salt) {
		
		password = salt+password;
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String hashPassword = encoder.encode(password);
		return hashPassword;
	}

	@Override
	public int saveAssociate(Associate associate, String salt) {
		
		return dao.saveAssociate(associate, salt);
	}

	@Override
	public byte[] saltInput() {
		
		SecureRandom random = new SecureRandom();
		byte[] bytes = new byte[20];
		random.nextBytes(bytes);
		return bytes;
	}
	
	

}
