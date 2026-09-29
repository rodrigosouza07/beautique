package br.com.beautique.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@Builder 
@AllArgsConstructor 
@NoArgsConstructor 
@Table (name="beauty_procedures")
@Entity 
public class BeautyProceduresEntity extends BaseEntity{

    @Column(nullable = false, length=100)
    private String name;

    @Column (length=500)
    private String description;

    @Column (nullable=false)
    private String price;   

    @JsonIgnore 
    @OneToMany(mappedBy="beautyProcedures", cascade=CascadeType.ALL, orphanRemoval=true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<AppointmentsEntity> appointments;
}