package com.MyBookstore.MyBookstore.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Category implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;
	
	@Column(length = 64)
    @Size(min = 1, max = 64, message = "Der Name muss zwischen einem und 64 Zeichen lang sein.")
    @NotNull(message = "Der Name darf nicht leer sein.")
    private String name = "";
	

	public Category(@NotNull long id,
			@Size(min = 1, max = 64, message = "Der Name muss zwischen einem und 64 Zeichen lang sein.") @NotNull(message = "Der Name darf nicht leer sein.") String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Category() {
	}
	
}
