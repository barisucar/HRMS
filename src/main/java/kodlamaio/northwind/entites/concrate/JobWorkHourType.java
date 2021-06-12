package kodlamaio.northwind.entites.concrate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_work_hour_type")
public class JobWorkHourType {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name="work_hour_type")
	private String workHourType;
	
}
