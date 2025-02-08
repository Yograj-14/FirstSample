package com;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employees {
	
	@Id
	private int sl_no;
	
	private String employeename;
	private String mobil_no;

}
