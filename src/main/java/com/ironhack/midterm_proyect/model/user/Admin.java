package com.ironhack.midterm_proyect.model.user;
import com.ironhack.midterm_proyect.enums.Role;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "admin")
public class Admin extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    public Admin(String username, String password, Role role, Long id) {
        super(username, password, role);
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
