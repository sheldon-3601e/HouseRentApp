package com.house.server;

/**
 * @author sheldon
 * @date 2022/12/19-15:02
 * 储存房屋信息
 */
public class Info {

    private String name;
    private int call;
    private String address;
    private int price;
    private String state;

    public Info(String name, int call, String address, int price, String state) {
        this.name = name;
        this.call = call;
        this.address = address;
        this.price = price;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", call=" + call +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", state='" + state + '\'' +
                '}';
    }
}
