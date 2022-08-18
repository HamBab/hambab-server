package hambap.demo.data.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
//import javax.validation.constraints.NotEmpty;

@Entity @Data
@Getter
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="userId")
    private String userId;

    private String nickname;

    private String name;

    private String password;

    private char sex;

    private int age;
}