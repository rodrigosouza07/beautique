package br.com.beautique.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter
@Builder 
@AllArgsConstructor 
@NoArgsConstructor 
@Table (name="beauty_procedures")
@Entity 
public class BeautyProcedures extends BaseEntity{

    @Column(nullable = false, length=100)
    private String name;

    @Column (length=500)
    private String description;

    @Column (nullable=false)
    private String price;   
}