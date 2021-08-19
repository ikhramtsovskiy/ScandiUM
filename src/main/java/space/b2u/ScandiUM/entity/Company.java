package space.b2u.ScandiUM.entity;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="inn")
    private String inn;

    @Column(name="name")
    private String name;

    @Column(name="branch_count")
    private Integer branchCount;

    @Column(name="address")
    private String address;

    @Column(name="latitude")
    private Float latitude;

    @Column(name="longitude")
    private Float Longitude;

    public Company() { }
}
