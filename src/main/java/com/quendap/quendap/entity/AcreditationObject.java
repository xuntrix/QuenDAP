package com.quendap.quendap.entity;

public enum AcreditationObject {
    CARD("Tarjeta Empleado Público"), NON_NOMINATIVE_CARD("Tarjeta No Nominativa"),
    EMPLOYEE_CERTIFICATE("Certificado Empleado Público"),
    PSEUDONYM_CERTIFICATE("Certificado Seudónimo"), CLOUD_CERTIFICATE("Certificado Nube"),
    CLOUD_PSEUDONYM_CERTIFICATE("Certificado Seudónimo Nube");

    private String acreditationObjectType;

    private AcreditationObject(String acreditationObjectType) {
        this.acreditationObjectType = acreditationObjectType;
    }

    public String getAcreditationObjectType() {
        return acreditationObjectType;
    }

}
