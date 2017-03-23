package com.csc.team2.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 *
 * @author DIEP
 */
@Entity
@Table(name = "history")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "History.findAll", query = "SELECT h FROM History h")
    , @NamedQuery(name = "History.findById", query = "SELECT h FROM History h WHERE h.id = :id")
    , @NamedQuery(name = "History.findByDatetime", query = "SELECT h FROM History h WHERE h.datetime = :datetime")
   })
//@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@historyId")
public class History implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetime;
//    @Basic(optional = false)
//    @NotNull
    
    
    
//    @JoinColumn(name = "treatment_id", referencedColumnName = "id")
//   @ManyToOne(optional = false)
   // private Treatment treatmentId;
    
    @Column(name = "patient")
    private String patient;
    
    @Column(name = "doctor")
    private  String doctor;
    
    @Column(name = "treatment_id")
    private  Integer treatment_id;
    

    public String getPatient() {
		return patient;
	}

	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public Integer getTreatment_id() {
		return treatment_id;
	}

	public void setTreatment_id(Integer treatment_id) {
		this.treatment_id = treatment_id;
	}

	public History() {
    }

    public History(Integer id) {
        this.id = id;
    }

    public History(Integer id, Date datetime) {
        this.id = id;
        this.datetime = datetime;
       
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    
//    public Treatment getTreatmentId() {
//        return treatmentId;
//    }
//
//    public void setTreatmentId(Treatment treatmentId) {
//        this.treatmentId = treatmentId;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof History)) {
            return false;
        }
        History other = (History) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "asasdsa.History[ id=" + id + " ]";
    }
    
}
