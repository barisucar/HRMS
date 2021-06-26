package kodlamaio.northwind.entites.concrate;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_advertisement")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employer",})
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_advertisement_id")
	private int jobAdvertisementId;
	
	@ManyToOne()
	@JoinColumn(name = "job_position_id")
	private Job job;
	
	//@Column(name="job_position_id")
	//private int jobPositionId;
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	//@Column(name="employer_id")
	//private int employerId;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	//@Column(name="city_id")
	//private int cityId;
	
	@ManyToOne()
	@JoinColumn(name="job_work_hour_type_id")
	private JobWorkHourType jobWorkHourType;
	
	//@Column(name="job_work_hour_type_id")
	//private int jobWorkHourTypeId;
	
	@ManyToOne()
	@JoinColumn(name="job_work_type_id")
	private WorkType workType;

	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="number_of_open_position")
	private int numberOfOpenPositions;
	
	@Column(name="application_deadline")
	private String applicationDeadline;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="creation_date")
	private String creationDate;
	
	@Column(name="is_confirmed")
	private Boolean isConfirmed;
	
}

