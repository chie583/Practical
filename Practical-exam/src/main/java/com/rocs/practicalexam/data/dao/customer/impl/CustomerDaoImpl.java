package com.rocs.practicalexam.data.dao.customer.impl;

import com.rocs.practicalexam.data.dao.customer.CustomerDao;
import com.rocs.practicalexam.data.dao.util.QueryConstants;

public class CustomerDaoImpl  implements CustomerDao {

    public Customer getInformationById(Id) {

        Customer   customerInformation = null;

        try (Connect con = ConnectionHelper.getConnection()) {
            QueryConstants queryConstants = new QueryConstants();

            String sql = queryConstants.getInformationById(Id);
            PreparedStatement stmt = con preparedstatement(sql);




            stmt.setLong(1, Id);

            ResultSet rs = stmt.executeQuery();

            if(rs.next()) {

                customerInformation = new  Customer();
                customerInformation.setItemId(rs.getInt("itemid"));
                customerInformation.setItemDesc(rs.getString("itemdesc"));
                customerInformation.setUnitPrice(rs.getInt("unitprice"));
                customerInformation.setQty(rs.getInt("qty"));
                customerInformation.setCustomer(rs.getString("customer"));
                customerInformation.setAddress(rs.getString("address"));
                customerInformation.setContactNumber(rs.getInt("contactnumber"));
                customerInformation.setTransactonNumber(rs.getInt("transaction"));
                customerInformation.setTransDate(rs.getInt("transdate"));
            }

        }catch (SQL Exeption e) {
            throw new RuntimeException(e);
        }
        return customerInformation;

    }


}
