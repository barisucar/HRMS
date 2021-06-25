package kodlamaio.northwind.entites.concrate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_seekers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User{



	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "national_identity")
	private int nationalIdentity;

	@Column(name = "birth_year")
	private int birthYear;
	

}
