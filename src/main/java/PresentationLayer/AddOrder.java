/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DBAccess.UserMapper;
import FunctionLayer.Calc;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author simon
 */
public class AddOrder extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int getlength = Integer.parseInt(request.getParameter("length"));
        int getwidth = Integer.parseInt(request.getParameter( "width" ));
        int getheight = Integer.parseInt(request.getParameter( "height" ));

        
        
        
        Calc itemList = new Calc();
        int[] result = itemList.result(getheight, getlength, getwidth);
        
        request.setAttribute("itemlist", result);
        User user = (User)request.getSession().getAttribute("user");
        UserMapper.createOrder(user, getheight, getlength, getwidth);
        return "order";
    }
    
}
