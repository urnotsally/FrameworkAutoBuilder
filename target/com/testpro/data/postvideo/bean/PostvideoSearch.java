package com.testpro.data.postvideo.bean;

import java.util.Date;


import org.apache.ibatis.type.Alias;
import com.testpro.common.beans.PageModel;

/**
 * POJO Search:Postvideo
 * 
 * @author lubo
 * @date 2018-7-23
 */
@SuppressWarnings({ "rawtypes" })
@Alias("PostvideoSearch")
public class PostvideoSearch extends PageModel {
	
	private Integer	id;		
	private String	classId;		 /* 教室编号 */ 
	private String	liveId;		 /* 直播编号 */ 
	private String	courseNumber;		 /* 课程编号 */ 
	private String	videoName;		 /* 视频名称 */ 
	private String	videoUrl;		 /* 视频保存路径 */ 
	private Date	createdAt;		 /* 创建时间 */ 
	private Date	updatedAt;		 /* 更新时间 */ 
	private Date	deletedAt;		 /* 删除时间 */ 

	// Constructor
	public PostvideoSearch() {
	}
	
	/**
	 * full Constructor
	 */
	public PostvideoSearch(Integer id, String classId, String liveId, String courseNumber, String videoName, String videoUrl, Date createdAt, Date updatedAt, Date deletedAt) {
		this.id = id;
		this.classId = classId;
		this.liveId = liveId;
		this.courseNumber = courseNumber;
		this.videoName = videoName;
		this.videoUrl = videoUrl;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
	}

	// getter && setter
	// 在setter方法最后加上"return this;"并把返回参数改为Postvideo可以实现连缀设置属性
	public Integer getId() {
		return id;
	}

	public PostvideoSearch setId(Integer id) {
		this.id = id;
		return this;
	}
	
	public String getClassId() {
		return classId;
	}

	public PostvideoSearch setClassId(String classId) {
		this.classId = classId;
		return this;
	}
	
	public String getLiveId() {
		return liveId;
	}

	public PostvideoSearch setLiveId(String liveId) {
		this.liveId = liveId;
		return this;
	}
	
	public String getCourseNumber() {
		return courseNumber;
	}

	public PostvideoSearch setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
		return this;
	}
	
	public String getVideoName() {
		return videoName;
	}

	public PostvideoSearch setVideoName(String videoName) {
		this.videoName = videoName;
		return this;
	}
	
	public String getVideoUrl() {
		return videoUrl;
	}

	public PostvideoSearch setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
		return this;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}

	public PostvideoSearch setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
		return this;
	}
	
	public Date getUpdatedAt() {
		return updatedAt;
	}

	public PostvideoSearch setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}
	
	public Date getDeletedAt() {
		return deletedAt;
	}

	public PostvideoSearch setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
		return this;
	}
	
}