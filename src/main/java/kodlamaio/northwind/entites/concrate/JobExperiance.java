package kodlamaio.northwind.entites.concrate;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_experiance")
public class JobExperiance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="previous_company")
	private String previousCompany;

	@Column(name="previous_job_department")
	private String previousJobDepartment;
	
	@Column(name="previous_job_leave_date")
	private Date previousJobLeaveDate;
}
