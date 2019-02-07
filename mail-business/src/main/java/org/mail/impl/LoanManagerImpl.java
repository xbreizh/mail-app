package org.mail.impl;

import javax.inject.Named;

@Named
public class LoanManagerImpl /*implements LoanManager */{
  /*  private static final Logger logger = Logger.getLogger(LoanManager.class.toString());
   *//* private String token = "";
    private String login = "";
    private List<Loan> loanList = new ArrayList<>();*//*

    @Inject
    BookManager bookManager;



    @Override
    public boolean renewLoan(String token, int id) {
        logger.info("trying to renew: " + id);
        LoanService loanService = new LoanService();
        RenewLoanRequestType renewLoanRequestType = new RenewLoanRequestType();
        renewLoanRequestType.setToken(token);
        renewLoanRequestType.setId(id);
        RenewLoanResponseType responseType = new RenewLoanResponseType();
        try {
            responseType = loanService.getLoanServicePort().renewLoan(renewLoanRequestType);
        } catch (BusinessExceptionLoan businessExceptionLoan) {
            logger.error(businessExceptionLoan.getMessage());
        }
        if (responseType.isReturn()) {
            logger.info("renew ok for: " + id);
        } else {
            logger.info("issue renewing for: " + id);
        }
        return false;
    }

    @Override
    public boolean isRenewable(String token, int id) {
        LoanService loanService = new LoanService();
        IsRenewableRequestType requestType = new IsRenewableRequestType();
        requestType.setToken(token);
        requestType.setId(id);
        try {
            IsRenewableResponseType responseType = loanService.getLoanServicePort().isRenewable(requestType);
            return responseType.isReturn();

        } catch (BusinessExceptionLoan businessExceptionLoan) {
            logger.error(businessExceptionLoan.getMessage());
        }
        return false;
    }

    @Override
    public String getStatus(String token, int id) {
        LoanService loanService = new LoanService();
        GetLoanStatusRequestType requestType = new GetLoanStatusRequestType();
        requestType.setToken(token);
        requestType.setId(id);

        try {
            GetLoanStatusResponseType responseType = loanService.getLoanServicePort().getLoanStatus(requestType);
            return responseType.getStatus();
        } catch (BusinessExceptionLoan businessExceptionLoan) {
            logger.error(businessExceptionLoan.getMessage());
        }

        return null;
    }


    protected Date convertGregorianCalendarIntoDate(GregorianCalendar gDate) {
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gDate);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        Date date = xmlCalendar.toGregorianCalendar().getTime();
        return date;

    }*/
}
