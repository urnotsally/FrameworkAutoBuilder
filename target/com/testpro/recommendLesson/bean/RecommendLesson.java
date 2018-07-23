package com.testpro.recommendLesson.bean;



import org.apache.ibatis.type.Alias;
import com.testpro.common.beans.BaseEntity;

/**
 * POJO:RecommendLesson
 * 
 * @author lubo
 * @date 2018-7-23
 */
@SuppressWarnings("serial")
@Alias("RecommendLesson")
public class RecommendLesson extends BaseEntity {
	
	
	private String	classId;		
	private String	courseId;		
	private String	courseName;		 /* 课程名称 */ 
	private String	className;		
	private String	teacherId;		 /* 教师id */ 
	private String	teacherName;		 /* 课程主讲老师 */ 
	private Integer	assistantId;		 /* 辅导老师id */ 
	private String	assistantName;		 /* 课程辅导老师 */ 
	private String	coursePic;		 /* 课程图片地址 */ 
	private String	courseUrl;		 /* 课程连接地址 */ 
	private String	courseTime;		 /* 推送课次 */ 
	private Integer	status;		 /* 发布状态 */ 
	private Integer	level;		 /* 课程等级level */ 
	private Double	price;		
	private String	subject;		 /* 课程 */ 
	private String	recommend;		
	private String	title;		 /* 标题 */ 
	private String	picUrl;		 /* 图片url */ 
	private String	linkUrl;		 /* 链接url */ 
	private Integer	createdtime;		 /* 创建时间 */ 
	private Integer	updatetime;		 /* 更新时间 */ 
	private Integer	deleted;		 /* 0未删除1已删除 */ 
	private String	createdUser;		 /* 创建人 */ 
	private String	updateUser;		 /* 修改人 */ 

	// Constructor
	public RecommendLesson() {
	}
	
	/**
	 * full Constructor
	 */
	public RecommendLesson(Integer id, String classId, String courseId, String courseName, String className, String teacherId, String teacherName, Integer assistantId, String assistantName, String coursePic, String courseUrl, String courseTime, Integer status, Integer level, Double price, String subject, String recommend, String title, String picUrl, String linkUrl, Integer createdtime, Integer updatetime, Integer deleted, String createdUser, String updateUser) {
		setId(id);
		this.classId = classId;
		this.courseId = courseId;
		this.courseName = courseName;
		this.className = className;
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.assistantId = assistantId;
		this.assistantName = assistantName;
		this.coursePic = coursePic;
		this.courseUrl = courseUrl;
		this.courseTime = courseTime;
		this.status = status;
		this.level = level;
		this.price = price;
		this.subject = subject;
		this.recommend = recommend;
		this.title = title;
		this.picUrl = picUrl;
		this.linkUrl = linkUrl;
		this.createdtime = createdtime;
		this.updatetime = updatetime;
		this.deleted = deleted;
		this.createdUser = createdUser;
		this.updateUser = updateUser;
	}

	// getter && setter
	// 在setter方法最后加上"return this;"并把返回参数改为RecommendLesson可以实现连缀设置属性
	
	public String getClassId() {
		return classId;
	}

	public RecommendLesson setClassId(String classId) {
		this.classId = classId;
		return this;
	}
	
	
	public String getCourseId() {
		return courseId;
	}

	public RecommendLesson setCourseId(String courseId) {
		this.courseId = courseId;
		return this;
	}
	
	
	public String getCourseName() {
		return courseName;
	}

	public RecommendLesson setCourseName(String courseName) {
		this.courseName = courseName;
		return this;
	}
	
	
	public String getClassName() {
		return className;
	}

	public RecommendLesson setClassName(String className) {
		this.className = className;
		return this;
	}
	
	
	public String getTeacherId() {
		return teacherId;
	}

	public RecommendLesson setTeacherId(String teacherId) {
		this.teacherId = teacherId;
		return this;
	}
	
	
	public String getTeacherName() {
		return teacherName;
	}

	public RecommendLesson setTeacherName(String teacherName) {
		this.teacherName = teacherName;
		return this;
	}
	
	
	public Integer getAssistantId() {
		return assistantId;
	}

	public RecommendLesson setAssistantId(Integer assistantId) {
		this.assistantId = assistantId;
		return this;
	}
	
	
	public String getAssistantName() {
		return assistantName;
	}

	public RecommendLesson setAssistantName(String assistantName) {
		this.assistantName = assistantName;
		return this;
	}
	
	
	public String getCoursePic() {
		return coursePic;
	}

	public RecommendLesson setCoursePic(String coursePic) {
		this.coursePic = coursePic;
		return this;
	}
	
	
	public String getCourseUrl() {
		return courseUrl;
	}

	public RecommendLesson setCourseUrl(String courseUrl) {
		this.courseUrl = courseUrl;
		return this;
	}
	
	
	public String getCourseTime() {
		return courseTime;
	}

	public RecommendLesson setCourseTime(String courseTime) {
		this.courseTime = courseTime;
		return this;
	}
	
	
	public Integer getStatus() {
		return status;
	}

	public RecommendLesson setStatus(Integer status) {
		this.status = status;
		return this;
	}
	
	
	public Integer getLevel() {
		return level;
	}

	public RecommendLesson setLevel(Integer level) {
		this.level = level;
		return this;
	}
	
	
	public Double getPrice() {
		return price;
	}

	public RecommendLesson setPrice(Double price) {
		this.price = price;
		return this;
	}
	
	
	public String getSubject() {
		return subject;
	}

	public RecommendLesson setSubject(String subject) {
		this.subject = subject;
		return this;
	}
	
	
	public String getRecommend() {
		return recommend;
	}

	public RecommendLesson setRecommend(String recommend) {
		this.recommend = recommend;
		return this;
	}
	
	
	public String getTitle() {
		return title;
	}

	public RecommendLesson setTitle(String title) {
		this.title = title;
		return this;
	}
	
	
	public String getPicUrl() {
		return picUrl;
	}

	public RecommendLesson setPicUrl(String picUrl) {
		this.picUrl = picUrl;
		return this;
	}
	
	
	public String getLinkUrl() {
		return linkUrl;
	}

	public RecommendLesson setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
		return this;
	}
	
	
	public Integer getCreatedtime() {
		return createdtime;
	}

	public RecommendLesson setCreatedtime(Integer createdtime) {
		this.createdtime = createdtime;
		return this;
	}
	
	
	public Integer getUpdatetime() {
		return updatetime;
	}

	public RecommendLesson setUpdatetime(Integer updatetime) {
		this.updatetime = updatetime;
		return this;
	}
	
	
	public Integer getDeleted() {
		return deleted;
	}

	public RecommendLesson setDeleted(Integer deleted) {
		this.deleted = deleted;
		return this;
	}
	
	
	public String getCreatedUser() {
		return createdUser;
	}

	public RecommendLesson setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
		return this;
	}
	
	
	public String getUpdateUser() {
		return updateUser;
	}

	public RecommendLesson setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
		return this;
	}
	
	@Override
	public String toString() {
		return "RecommendLesson [" + "id=" + getId() + ", classId=" + classId + ", courseId=" + courseId + ", courseName=" + courseName + ", className=" + className + ", teacherId=" + teacherId + ", teacherName=" + teacherName + ", assistantId=" + assistantId + ", assistantName=" + assistantName + ", coursePic=" + coursePic + ", courseUrl=" + courseUrl + ", courseTime=" + courseTime + ", status=" + status + ", level=" + level + ", price=" + price + ", subject=" + subject + ", recommend=" + recommend + ", title=" + title + ", picUrl=" + picUrl + ", linkUrl=" + linkUrl + ", createdtime=" + createdtime + ", updatetime=" + updatetime + ", deleted=" + deleted + ", createdUser=" + createdUser + ", updateUser=" + updateUser +  "]";
	}
}
