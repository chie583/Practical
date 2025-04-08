package com.rocs.practicalexam.app.facade.customer.impl;




import com.rocs.practicalexam.app.facade.customer.CustomerFacade;
import com.rocs.practicalexam.data.dao.customer.CustomerDao;
import com.rocs.practicalexam.data.dao.customer.impl.CustomerDaoImpl;

import java.util.List;
public class CustomerFacadeImpl implements CustomerFacade {

    private final CustomerDao CustomerInformation = new CustomerDaoImpl();

    public Customer findInformationById(Id);
    return this.CustomerInformation.getInformationById(Id);




}
