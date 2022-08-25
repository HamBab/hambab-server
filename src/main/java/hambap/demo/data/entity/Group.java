package hambap.demo.data.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Data
@Getter
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String date;

    private String time;

    private char sex;

    private String age;

    private int personnel;

    private String optional;

    private Long leader;

    private Long restaurantId;
}
