package com.nt.model;

//import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
import lombok.NonNull;
//import lombok.RequiredArgsConstructor;
import lombok.Setter;
//import lombok.ToString;

@Data
@Setter
@AllArgsConstructor

public class Customer {
	
	private int id;
	@NonNull
	private String name;
	
	
	private int bill;

}
