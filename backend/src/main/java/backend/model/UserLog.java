package backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_log")
public class UserLog {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "log_id")
	private Integer id;
	private String log;
	
	@Column(name = "user_id")
	private Integer userId;
	
	public UserLog() { }

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

}
