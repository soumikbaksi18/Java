package com.developer.employee_management.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "mt_employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "dateOfBirth")
    private String dateOfBirth;

    @Column(name = "address")
    private String address;

    public EmployeeEntity(long id, String name, String gender, int dateOfBirth, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = String.valueOf(dateOfBirth);
        this.address = address;
    }

    public EmployeeEntity(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = String.valueOf(dateOfBirth);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
