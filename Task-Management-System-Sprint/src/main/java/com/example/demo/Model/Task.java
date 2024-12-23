package com.example.demo.Model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int taskid;
	
	private String taskname;
	private String description;
	private Date duedate;
	private String priority;
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "projectid")
	private Project project;
	
	@ManyToOne
	@JoinColumn(name = "userid")
	private User user;
	
	@OneToMany(mappedBy = "task" , cascade = CascadeType.ALL)
	private List<Comment> comments;
	
	@OneToMany(mappedBy = "task" , cascade = CascadeType.ALL)
	private List<Attachment> attachments;
	
	@ManyToMany
	@JoinTable(name = "taskcategory" , 
	joinColumns = @JoinColumn(name = "taskid") , 
	inverseJoinColumns = @JoinColumn(name = "categoryid"))
	private List<Category> categories;
	
	public Task() {
		super();
	}

	public Task(int taskid, String taskname, String description, Date dueDate, String priority, String status,
			Project project, User user, List<Comment> comments, List<Attachment> attachments,
			List<Category> categories) {
		super();
		this.taskid = taskid;
		this.taskname = taskname;
		this.description = description;
		this.duedate = dueDate;
		this.priority = priority;
		this.status = status;
		this.project = project;
		this.user = user;
		this.comments = comments;
		this.attachments = attachments;
		this.categories = categories;
	}

	public int getTaskid() {
		return taskid;
	}

	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}

	public String getTaskName() {
		return taskname;
	}

	public void setTaskName(String taskName) {
		this.taskname = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDueDate() {
		return duedate;
	}

	public void setDueDate(Date dueDate) {
		this.duedate = dueDate;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	

}
