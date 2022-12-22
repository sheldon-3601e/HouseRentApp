package com.house.server;

import com.house.uti.Utilitys;

/**
 * @author sheldon
 * @date 2022/12/19-15:02
 */
public class Server {

    public static Info[] infos_ = new Info[5];  //存储房屋信息的列表
    public static int index;  //用来表示当前数组的长度

    public static boolean check(int id) {
        if (id - 1 < Server.index && Server.index <= 5) {
            return true;
        } else {
            System.out.println("输入有误");
            return false;
        }
    }

    public static void addHouse() {
        if (Server.index <= 5) {
            System.out.println("=========添加房屋信息=========");
            System.out.print("姓名：");
            String name = Utilitys.readString(20);
            System.out.print("电话：");
            int call = Utilitys.readInt();
            System.out.print("地址：");
            String address = Utilitys.readString(20);
            System.out.print("月租：");
            int price = Utilitys.readInt();
            System.out.print("状态：");
            String state = Utilitys.readString(20);
            infos_[Server.index] = new Info(name, call, address, price, state);
            Server.index++;
        } else {
            System.out.println("房屋已满");
        }
    }

    public static void search() {
        System.out.print("请输入你要查找的房屋编号:");
        int id = Utilitys.readInt();
        
        if (check(id)) {
            System.out.println(Server.infos_[id - 1]);
        }
    }

    public static void update() {
        System.out.print("请输入你要修改的房屋编号：");
        int id = Utilitys.readInt();
        if (check(id)){
            Info info = Server.infos_[id - 1];
            System.out.print("姓名(" + info.getName() + ")：");
            String name = Utilitys.readString(20);
            info.setName(name);
            System.out.print("电话(" + info.getCall() + ")：");
            int call = Utilitys.readInt();
            info.setCall(call);
            System.out.print("地址(" + info.getAddress() + ")：");
            String address = Utilitys.readString(20);
            info.setAddress(address);
            System.out.print("月租(" + info.getPrice() + ")：");
            int price = Utilitys.readInt();
            info.setPrice(price);
            System.out.print("状态(" + info.getState() + ")：");
            String state = Utilitys.readString(20);
            info.setState(state);

        }
    }

    public static void delect() {
        System.out.println("请输入要删除的房屋编号:");
        int id = Utilitys.readInt();
        if (check(id)){
            Server.infos_[id - 1] = null;
            for (int i = id - 1; i < Server.index - 1; i++) {
                Server.infos_[i] = Server.infos_[i+1];
            }
            Server.infos_[Server.index - 1] = null;
            Server.index--;
        }
    }

    public static void selectInfo() {
        for (int i = 0; i < Server.index; i++) {
            System.out.println((i + 1) + " " + Server.infos_[i]);
        }

    }
}
