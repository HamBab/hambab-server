package hambap.demo.data.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity @Data
@Getter
public class Restaurant {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private String category;

    private String phone;

    private String time;

}
