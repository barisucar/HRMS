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
@Table(name = "JobSeekers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker {

	@Id
	@GeneratedValue
	@Column(name = "userId")
	private int userId;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "nationalIdentity")
	private String nationalIdentity;

	@Column(name = "birthYear")
	private String birthYear;
}
