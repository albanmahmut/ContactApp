package com.malban.capp.dao;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

/**
 *
 * @author MAMI
 */
//NOTE: do not @Repository or @Service or @Component annotation
abstract public class BaseDAO extends NamedParameterJdbcDaoSupport{
    @Autowired
    public void setDataSource2(DataSource ds){
        super.setDataSource(ds);
    }
}
