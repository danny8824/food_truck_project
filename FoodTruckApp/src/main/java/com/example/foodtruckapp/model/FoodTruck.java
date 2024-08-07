package com.example.foodtruckapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class FoodTruck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id; // Auto-generated ID
    private String locationid;
    private String applicant;
    private String facilitytype;
    private String cnn;
    private String locationdescription;
    private String address;
    private String blocklot;
    private String block;
    private String lot;
    private String permit;
    private String status;
    private String fooditems;
    private String x;
    private String y;
    private String latitude;
    private String longitude;
    private String schedule;
    private String dayshours;
    private String noisSent;
    private LocalDateTime approved;
    private String received;
    private String priorpermit;
    private LocalDateTime expirationdate;
    private String location;
    private String firePreventionDistricts;
    private String policeDistricts;
    private String supervisorDistricts;
    private String zipCodes;
    private String neighborhoodsOld;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getFacilitytype() {
        return facilitytype;
    }

    public void setFacilitytype(String facilitytype) {
        this.facilitytype = facilitytype;
    }

    public String getCnn() {
        return cnn;
    }

    public void setCnn(String cnn) {
        this.cnn = cnn;
    }

    public String getLocationdescription() {
        return locationdescription;
    }

    public void setLocationdescription(String locationdescription) {
        this.locationdescription = locationdescription;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBlocklot() {
        return blocklot;
    }

    public void setBlocklot(String blocklot) {
        this.blocklot = blocklot;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFooditems() {
        return fooditems;
    }

    public void setFooditems(String fooditems) {
        this.fooditems = fooditems;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDayshours() {
        return dayshours;
    }

    public void setDayshours(String dayshours) {
        this.dayshours = dayshours;
    }

    public String getNoisSent() {
        return noisSent;
    }

    public void setNoisSent(String noisSent) {
        this.noisSent = noisSent;
    }

    public LocalDateTime getApproved() {
        return approved;
    }

    public void setApproved(LocalDateTime approved) {
        this.approved = approved;
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getPriorpermit() {
        return priorpermit;
    }

    public void setPriorpermit(String priorpermit) {
        this.priorpermit = priorpermit;
    }

    public LocalDateTime getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(LocalDateTime expirationdate) {
        this.expirationdate = expirationdate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFirePreventionDistricts() {
        return firePreventionDistricts;
    }

    public void setFirePreventionDistricts(String firePreventionDistricts) {
        this.firePreventionDistricts = firePreventionDistricts;
    }

    public String getPoliceDistricts() {
        return policeDistricts;
    }

    public void setPoliceDistricts(String policeDistricts) {
        this.policeDistricts = policeDistricts;
    }

    public String getSupervisorDistricts() {
        return supervisorDistricts;
    }

    public void setSupervisorDistricts(String supervisorDistricts) {
        this.supervisorDistricts = supervisorDistricts;
    }

    public String getZipCodes() {
        return zipCodes;
    }

    public void setZipCodes(String zipCodes) {
        this.zipCodes = zipCodes;
    }

    public String getNeighborhoodsOld() {
        return neighborhoodsOld;
    }

    public void setNeighborhoodsOld(String neighborhoodsOld) {
        this.neighborhoodsOld = neighborhoodsOld;
    }
}
