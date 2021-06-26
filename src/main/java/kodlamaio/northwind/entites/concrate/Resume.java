package kodlamaio.northwind.entites.concrate;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="resumes")
public class Resume{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@ManyToOne()
	@JoinColumn(name ="education_id")
	private Education education;
	
	@ManyToOne()
	@JoinColumn(name ="language_id")
	private Language language;

	@ManyToOne()
	@JoinColumn(name ="skill_id")
	private Skill skill;
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linkedin_link")
	private String linkedinLink;
	
	@ManyToOne()
	@JoinColumn(name="school_department_id")
	private SchoolDepartment schoolDepartment;
	
	@ManyToOne()
	@JoinColumn(name ="language_level_id")
	private LanguageLevel languageLevel;
	
	@ManyToOne()
	@JoinColumn(name="photo_id")
	private Photo photo;
	
}
