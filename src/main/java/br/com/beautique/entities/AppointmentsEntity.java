package br.com.beautique.entities;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@AllArgsConstructor 
@NoArgsConstructor 
@Getter 
@Setter 
@Builder 
@Table (name = "appointments")
public class AppointmentsEntity extends BaseEntity{
    
    @Column(nullable=false, updatable=true)
    private LocalDateTime dateTime;

    @Column(nullable=false)
    private Boolean appointmentsOpen;



}
