/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author Martin
 */
public class Order
{
    public Order(int orderID, int height, int length, int width)
    {
        this.orderID = orderID;
        this.height = height;
        this.length = length;
        this.width = width;
        
    }

    public Order(int orderID)
    {
        this.orderID = orderID;
    }
   
    
    private int orderID;
    private int height;
    private int length;
    private int width;
    private int user_id;

    public int getOrderID()
    {
        return orderID;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getUser_id()
    {
        return user_id;
    }

    public void setUser_id(int user_id)
    {
        this.user_id = user_id;
    }

    public void setOrderID(int orderID)
    {
        this.orderID = orderID;
    }

}
