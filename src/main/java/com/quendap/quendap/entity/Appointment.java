package com.quendap.quendap.entity;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name = "appointments")
@Entity
public class Appointment {
    @Id
    private UUID appointmentId;

    private Date date;
    private Boolean isThroughRepresentative;
    private String comments;

    private List<AcreditationObject> accreditationObjects;
    private List<Boolean> accreditationObjectsAreFirst;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_id", referencedColumnName = "appointment_id")
    private Delivery delivery;

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public UUID getAppointmentId() {
        return appointmentId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getIsThroughRepresentative() {
        return isThroughRepresentative;
    }

    public void setIsThroughRepresentative(Boolean isThroughRepresentative) {
        this.isThroughRepresentative = isThroughRepresentative;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<AcreditationObject> getAccreditationObjects() {
        return accreditationObjects;
    }

    public void setAccreditationObjects(List<AcreditationObject> accreditationObjects) {
        this.accreditationObjects = accreditationObjects;
    }

    public List<Boolean> getAccreditationObjectsAreFirst() {
        return accreditationObjectsAreFirst;
    }

    public void setAccreditationObjectsAreFirst(List<Boolean> accreditationObjectsAreFirst) {
        this.accreditationObjectsAreFirst = accreditationObjectsAreFirst;
    }

}
