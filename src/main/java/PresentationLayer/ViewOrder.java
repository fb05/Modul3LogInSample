/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

/**
 *
 * @author simon
 */
public class ViewOrder {

    int orderID;
    int height;
    int length;
    int width;

    public ViewOrder(int orderID) {
        this.orderID = orderID;
    }

    public ViewOrder(int orderID, int height, int length, int width) {
        this.orderID = orderID;
        this.height = height;
        this.length = length;
        this.width = width;
    }
    

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    

    
}
