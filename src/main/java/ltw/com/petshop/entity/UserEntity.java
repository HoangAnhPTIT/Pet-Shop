package ltw.com.petshop.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "\"user\"")
public class UserEntity {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", unique = true)
    private String id;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "address")
    private String address;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email")
    private String email;

    @Column(name = "tel")
    private String tel;

    @Column(name = "point")
    private Long point;

    @ManyToMany(mappedBy = "roleUsers")
    private Set<RoleEntity> userRoles;

    @OneToMany(mappedBy = "userEntity")
    private Set<CartEntity> cartEntities;
    
    @OneToMany(mappedBy = "userEntity")
    private Set<UserVoucher> userVouchers;
 
    

}
