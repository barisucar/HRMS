package kodlamaio.northwind.entites.concrate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employers"})
public class Employer extends User{
	

	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_website")
	private String companyWebsite;
	
	@Column(name="phone")
	private String phone;

	
}
