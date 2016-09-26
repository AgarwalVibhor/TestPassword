package com.tcs.dao;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.tcs.model.Associate;

public class AssociateDaoImpl extends JdbcDaoSupport implements AssociateDaoInterface {
	
	@Autowired
	private DataSource dataSource;
	
	@PostConstruct
	public void initialize()
	{
		setDataSource(dataSource);
	}

	@Override
	public int saveAssociate(Associate associate, String salt) {
		int count = 0;
		String sql = "insert into associates_second values (?,?,?,?,?,?)";
		
		count = getJdbcTemplate().update(sql, new Object[]{associate.getUsername(), associate.getFirstName(),
				associate.getLastName(), associate.getPassword(), salt, associate.isEnabled()});
		
		return count;
	}

}
