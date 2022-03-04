package com.onetomany.demo.entity;

import java.math.BigInteger;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
public class Comments {

	@Id
	@SequenceGenerator(name = "tutorial_id_seq", sequenceName = "tutorial_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_id_seq")
	private BigInteger id; 
	private String content;
	
	private BigInteger tutorial_id;
}
