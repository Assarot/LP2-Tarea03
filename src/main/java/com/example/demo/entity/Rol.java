package com.example.demo.entity;


import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tbl_rol")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "estado")
	private char estado;
	
	@ManyToMany(mappedBy = "roles")
	@JsonIgnore
	private Set<Usuario> usuarios;
	
	@ManyToMany
	@JoinTable(
			name = "rol_acceso",
			joinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "acceso_id", referencedColumnName = "id")
			)
	@JsonIgnore
	private Set<Acceso> accesos;
}
