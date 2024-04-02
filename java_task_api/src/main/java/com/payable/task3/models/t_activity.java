package com.payable.task3.models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_activity")
public class t_activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID
    @Column(name = "id")
    private String id;

    @Column(name = "pro_id")
    private String pro_id;

    @Column(name = "cat_id")
    private String cat_id;

    @Column(name = "act_name")
    private String act_name;

    @Column(name = "status")
    private String status;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "created_by")
    private String created_by;

    @Column(name = "updated_at")
    private Timestamp updated_at;

    @Column(name = "updated_by")
    private String updated_by;

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPro_id() {
        return pro_id;
    }

    public void setPro_id(String pro_id) {
        this.pro_id = pro_id;
    }

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }

    public String getAct_name() {
        return act_name;
    }

    public void setAct_name(String act_name) {
        this.act_name = act_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }
}
