package com.quendap.quendap.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "employees")
@Entity
public class Employee {
    @Id
    private UUID employeeId;

    private String dni;
    private String name;
    private String surname1;
    private String surname2;

    private Boolean isSilex;
    private Boolean isCorpu;

    @OneToMany
    @JoinColumn(name = "employee_id")
    private List<Appointment> appointments;

    public void setEmployeeId(UUID employeeId) {
        this.employeeId = employeeId;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public Boolean getIsSilex() {
        return isSilex;
    }

    public void setIsSilex(Boolean isSilex) {
        this.isSilex = isSilex;
    }

    public Boolean getIsCorpu() {
        return isCorpu;
    }

    public void setIsCorpu(Boolean isCorpu) {
        this.isCorpu = isCorpu;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointmets) {
        this.appointments = appointments;
    }

}
