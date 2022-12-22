package com.house.houseView;

import com.house.server.Server;
import com.house.uti.Utilitys;

/**
 * @author sheldon
 * @date 2022/12/19-11:32
 */
public class HouseView {

    public static void mainView() {
        boolean loop = true;

        while (loop) {
            System.out.println("=========房屋出租系统=========");
            System.out.println("\t\t1、新 增 房 源");
            System.out.println("\t\t2、查 找 房 源");
            System.out.println("\t\t3、删 除 房 源");
            System.out.println("\t\t4、修 改 房 源");
            System.out.println("\t\t5、查看房源列表");
            System.out.println("\t\t6、退 出 系 统");
            System.out.print("请输入你的选择：");
            int choice = Utilitys.readInt();
            switch (choice) {
                case 1:
                    Server.addHouse();
                    break;
                case 2:
                    Server.search();
                    break;
                case 3:
                    Server.delect();
                    break;
                case 4:
                    Server.update();
                    break;
                case 5:
                    Server.selectInfo();
                    break;
                case 6:
                    loop = false;
                    break;

            }
        }
    }


}
