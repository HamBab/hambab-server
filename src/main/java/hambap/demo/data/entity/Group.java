package hambap.demo.data.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String date;

    private String time;

    private char sex;

    private int age;

    private int personnel;

    private String optional;

    private int leader;

    private int restaurantId;
}
