/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema_service;


import com.google.gson.Gson;
import entities.User;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hieup
 */
@WebService(serviceName = "CinemaService")
public class CinemaService {

    /**
     * This is a sample web service operation
     *
     * @return
     */
    @WebMethod(operationName = "hello")
    public String hello() {
        return "Hello there";
    }

    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        if (username.equals("admin") && password.equals("admin")) {
            return new Gson().toJson(new User(username, 18));
        }
        return null;
    }

}
