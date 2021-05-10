package kodlamaio.northwind.entites.concrate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Jobs")

public class Job {

	@Id
	@GeneratedValue
	@Column(name = "jobId")
	private int id;

	@Column(name = "jobName")
	private String jobName;

/*	public Job() {
	}

	public Job(int id, String jobName) {
		super();
		this.id = id;
		this.jobName = jobName;
	} */

}
