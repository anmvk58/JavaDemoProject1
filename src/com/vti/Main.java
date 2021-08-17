package com.vti;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {
        //Khởi tạo Department
        Department department1 = new Department();
        Department department2 = new Department();
        Department department3 = new Department();

        //gán giá trị cho department1:
        department1.departmentId = 1;
        department1.departmentName = "Phòng Marketing";

        //gán giá trị cho department2:
        department2.departmentId = 2;
        department2.departmentName = "Phòng Sale";

        //gán giá trị cho department3:
        department3.departmentId = 3;
        department3.departmentName = "Phòng CEO";

        System.out.println("Đã khởi tạo xong Department");

        //Khởi tạo Position
        Position position1 = new Position();
        position1.positionId = 1;
        position1.positionName = PositionName.TEST;

        System.out.println("Đã khởi tạo xong Position");

        //Khởi tạo Account
        Account account1 = new Account();
        account1.accountId = 1;
        account1.email = "abc@vti.vn";
        account1.username = "user1";
        account1.fullName = "Full Name One";
        account1.department = department1;
        account1.position = position1;
        account1.createDate = new Date(2021, 8,17);

        System.out.println("Đã khởi tạo xong Account - Bắt đầu in ...");

        //In ra Department:
        System.out.println("Department Info: " + department1.departmentId + " | " + department1.departmentName );

        //In ra Position
        System.out.println("Position Info: " + position1.positionId + " | " + position1.positionName );

        //In ra thông tin account:
        System.out.println("Account Info: " + account1.accountId + " | " + account1.email + " + " + account1.fullName + " | " + account1.username);
    }
}
