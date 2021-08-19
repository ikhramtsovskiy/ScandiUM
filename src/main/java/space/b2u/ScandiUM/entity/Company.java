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

    @Column(name="ogrn")
    private String ogrn;
    @Column(name = "inn")
    private String inn;
    @Column(name="kpp")
    private String kpp;
    @Column(name="full_name")
    private String fullName;
    @Column(name = "short_name")
    private String shortName;
    @Column(name = "branch_count")
    private String branchCount;
    @Column(name = "okved")
    private String okved;
    @Column(name = "addr")
    private String address;
    @Column(name = "geo_lat")
    private Double lattitude;
    @Column(name = "geo_lon")
    private Double longitude;
    @Column(name="post")
    private String post;
    @Column(name="manager")
    private String manager;


    public Company() { }
}
