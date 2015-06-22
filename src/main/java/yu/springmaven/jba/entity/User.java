package yu.springmaven.jba.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import yu.springmaven.jba.annotation.UniqueUsername;

@Entity
@Table(name="app_user")
public class User {

	@Id
	@GeneratedValue
	private int id;
	
	@Size(min = 3, message = "Name must be at least 3 characters!")
	@Column(unique=true)
	@UniqueUsername(message="Such username already exists!")
	private String name;
	
	@Size(min = 5, message = "Password must be at least 5 characters!")
	private String password;
	private boolean enabled;
	

	
	@Size(min = 1, message="Invalid email address!")
	@Email(message="Invalid email address!")
	private String email;
	
	@ManyToMany
	@JoinTable
	private List<Role> roles;
	
	@OneToMany(mappedBy="user",cascade=CascadeType.REMOVE)
	private List<Blog> blogs;
	
	
	
	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
