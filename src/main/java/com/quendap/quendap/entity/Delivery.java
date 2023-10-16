package com.quendap.quendap.entity;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "deliveries")
@Entity
public class Delivery {

    @Id
    private UUID deliveryId;

    private Date date;
    private String comments;

    private List<AcreditationObject> deliveredAccreditationObjects;
    private List<Boolean> oldAccreditationObjectsAreRevoked;

    public UUID getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(UUID deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<AcreditationObject> getDeliveredAccreditationObjects() {
        return deliveredAccreditationObjects;
    }

    public void setDeliveredAccreditationObjects(List<AcreditationObject> deliveredAccreditationObjects) {
        this.deliveredAccreditationObjects = deliveredAccreditationObjects;
    }

    public List<Boolean> getOldAccreditationObjectsAreRevoked() {
        return oldAccreditationObjectsAreRevoked;
    }

    public void setOldAccreditationObjectsAreRevoked(List<Boolean> oldAccreditationObjectsAreRevoked) {
        this.oldAccreditationObjectsAreRevoked = oldAccreditationObjectsAreRevoked;
    }

}
