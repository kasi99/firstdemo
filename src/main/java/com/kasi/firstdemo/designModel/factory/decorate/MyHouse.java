package com.kasi.firstdemo.designModel.factory.decorate;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-07 06:44
 * @Version:
 */

public class MyHouse {
    public static void main(String[] args) {
        System.out.println("=========建造房子==========");
        House house = new Build();
        System.out.println("可用面积: "+ house.area() + ", 花销: " + house.cost());

        //往房子添置家具
        System.out.println("=========添置家具==========");
        house = new Sofa(house);
        System.out.println("添置沙发后--> 可用面积: "+ house.area() + ", 花销: " + house.cost());

        house = new Bed(house);
        System.out.println("添置床--> 可用面积: "+ house.area() + ", 花销: " + house.cost());

        house = new Desk(house);
        System.out.println("添置桌子--> 可用面积: "+ house.area() + ", 花销: " + house.cost());
    }
}
