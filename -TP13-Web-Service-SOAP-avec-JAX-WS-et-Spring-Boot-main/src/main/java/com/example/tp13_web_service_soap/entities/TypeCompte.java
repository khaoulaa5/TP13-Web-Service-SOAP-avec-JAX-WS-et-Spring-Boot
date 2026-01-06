package com.example.tp13_web_service_soap.entities;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "typeCompte")
@XmlEnum
public enum TypeCompte {
    COURANT,
    EPARGNE
}
