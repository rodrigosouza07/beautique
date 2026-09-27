package br.com.beautique.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor 
@NoArgsConstructor 
@Getter 
@Setter 
@Entity
@Builder 
@Table(name= "customer")
public class CustomerEntity extends BaseEntity{

    @Column (nullable = false , length=100)
    private String nome;
   
    @Column (nullable = false, length=100)
    private String phone;
}