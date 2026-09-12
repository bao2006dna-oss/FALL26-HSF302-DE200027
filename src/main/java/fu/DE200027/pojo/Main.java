package fu.DE200027.pojo;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        // Tên truyền vào phải trùng khớp chính xác với name="hsf302FU" trong persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hsf302FU");

        if (emf != null) {
            System.out.println("EMF tao thanh cong!");
            emf.close(); // Nhớ đóng EMF khi không sử dụng
        }
    }
}