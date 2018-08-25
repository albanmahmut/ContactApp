package com.malban.capp.rm;

import com.malban.capp.domain.Contact;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author MAMI
 */
public class ContactRowMapper implements RowMapper<Contact>{
    @Override
    public Contact mapRow(ResultSet rs, int i) throws SQLException {
        Contact c=new Contact();
        c.setContactId(rs.getInt("contactId"));
        c.setUserId(rs.getInt("userId"));
        c.setName(rs.getString("name"));
        c.setEmail(rs.getString("email"));
        c.setadress(rs.getString("adress"));
        c.setPhone(rs.getString("phone"));       
        c.setRemark(rs.getString("remark"));               
        return c;
    }
    
}
