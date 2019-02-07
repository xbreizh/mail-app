package org.mail.impl;

import org.apache.log4j.Logger;
import org.mail.contract.ConnectManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.troparo.entities.connect.GetTokenRequestType;
import org.troparo.entities.connect.GetTokenResponseType;
import org.troparo.services.connectservice.BusinessExceptionConnect;
import org.troparo.services.connectservice.ConnectService;

import javax.inject.Named;

@Named
public class ConnectManagerImpl implements ConnectManager {

    private static final Logger logger = Logger.getLogger(ConnectManagerImpl.class);
    private String token;
    private String login = "lokii";
    private String password = "123";

    @Override
    public String authenticate() {
        ConnectService cs = new ConnectService();
        GetTokenRequestType t = new GetTokenRequestType();
        t.setLogin(login);
        t.setPassword(password);
       /* logger.info("login: " + login + " \n password: " + password);*/
        try {
            GetTokenResponseType responseType = cs.getConnectServicePort().getToken(t);
            token = responseType.getReturn();
        } catch (BusinessExceptionConnect businessExceptionConnect) {
            logger.error("issue while trying to get the token");
        }
        logger.info("token found: ");


        if (!token.equals("wrong login or pwd")) {


            return token;
        } else {
            return null;
           /* throw new
                    BadCredentialsException("External system authentication failed");*/

        }

    }


}
