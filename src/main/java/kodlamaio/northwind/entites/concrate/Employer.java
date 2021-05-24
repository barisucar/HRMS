package kodlamaio.northwind.entites.concrate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Employers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employer{
	
	@Id
	@GeneratedValue
	@Column(name="userId")
	private int userId;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="companyWebsite")
	private String companyWebsite;
	
	@Column(name="phone")
	private String phone;
	
}
