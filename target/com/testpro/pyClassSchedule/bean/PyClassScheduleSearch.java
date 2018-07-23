package com.testpro.pyClassSchedule.bean;

import java.util.Date;


import org.apache.ibatis.type.Alias;
import com.testpro.common.beans.PageModel;

/**
 * POJO Search:PyClassSchedule
 * 
 * @author lubo
 * @date 2018-7-23
 */
@SuppressWarnings({ "rawtypes" })
@Alias("PyClassScheduleSearch")
public class PyClassScheduleSearch extends PageModel {
	
	private String	pkId;		 /* tb_curriculum 表中的cuc_id */ 
	private String	claId;		
	private String	claName;		
	private String	claGtId;		
	private String	claGtName;		
	private String	claYear;		
	private String	claTermName;		
	private String	claTermId;		
	private String	claGradeId;		
	private String	claGradeName;		
	private String	claLevelId;		
	private String	claLevelName;		
	private String	claClassroomId;		
	private String	claClassroomName;		
	private String	claClassroomNameAbb;		
	private String	claServicecenterId;		
	private String	claServicecenterName;		
	private String	claVenueId;		
	private String	claVenueName;		
	private String	claAreaId;		
	private String	claAreaName;		
	private String	claClassdateId;		
	private String	claClassdateName;		
	private Integer	claSubjectIds;		
	private String	claSubjectNames;		
	private String	claClasstimeIds;		
	private String	claClasstimeNames;		
	private String	claTeacherIds;		
	private String	claTeacherNames;		
	private Date	claStartDate;		
	private Date	claEndDate;		
	private Integer	claDeleted;		
	private String	claClassTeacherId;		
	private String	claClassTeacherName;		
	private String	claClasstimeTimePeriod;		
	private String	claClasstimeTimeClassify;		
	private String	claTutorId;		
	private String	claTutorRealName;		
	private String	cucClassId;		
	private Integer	cucClassNum;		
	private Date	cucClassDate;		
	private String	cucClasstimeId;		
	private time	cucStartTime;		
	private time	cucEndTime;		
	private String	cucTeacherId;		
	private String	cucSubjectId;		
	private Integer	cucTeacherType;		
	private String	cucClassroomId;		
	private Integer	cucDeleted;		
	private Integer	cucStatus;		
	private Integer	cucVersion;		
	private Integer	cucLockStatus;		 /* 锁定状态(0未锁定;1已锁定;2已解锁) */ 
	private Integer	cucCancel;		 /* 是否取消0否，1是 */ 
	private Integer	cucBiTest;		 /* 是否为测试数据0：否；1：是 */ 
	private String	cucClasstimeTypeId;		 /* 上课时间类型id */ 
	private String	cucClassTimeName;		 /* 上课时间名称 */ 
	private String	cucName;		
	private String	claLiveNumberId;		
	private String	claCourseId;		
	private String	cityId;		
	private String	cityName;		
	private Integer	claStuNum;		 /* 班级报名容量 */ 

	// Constructor
	public PyClassScheduleSearch() {
	}
	
	/**
	 * full Constructor
	 */
	public PyClassScheduleSearch(String pkId, String claId, String claName, String claGtId, String claGtName, String claYear, String claTermName, String claTermId, String claGradeId, String claGradeName, String claLevelId, String claLevelName, String claClassroomId, String claClassroomName, String claClassroomNameAbb, String claServicecenterId, String claServicecenterName, String claVenueId, String claVenueName, String claAreaId, String claAreaName, String claClassdateId, String claClassdateName, Integer claSubjectIds, String claSubjectNames, String claClasstimeIds, String claClasstimeNames, String claTeacherIds, String claTeacherNames, Date claStartDate, Date claEndDate, Integer claDeleted, String claClassTeacherId, String claClassTeacherName, String claClasstimeTimePeriod, String claClasstimeTimeClassify, String claTutorId, String claTutorRealName, String cucClassId, Integer cucClassNum, Date cucClassDate, String cucClasstimeId, time cucStartTime, time cucEndTime, String cucTeacherId, String cucSubjectId, Integer cucTeacherType, String cucClassroomId, Integer cucDeleted, Integer cucStatus, Integer cucVersion, Integer cucLockStatus, Integer cucCancel, Integer cucBiTest, String cucClasstimeTypeId, String cucClassTimeName, String cucName, String claLiveNumberId, String claCourseId, String cityId, String cityName, Integer claStuNum) {
		this.pkId = pkId;
		this.claId = claId;
		this.claName = claName;
		this.claGtId = claGtId;
		this.claGtName = claGtName;
		this.claYear = claYear;
		this.claTermName = claTermName;
		this.claTermId = claTermId;
		this.claGradeId = claGradeId;
		this.claGradeName = claGradeName;
		this.claLevelId = claLevelId;
		this.claLevelName = claLevelName;
		this.claClassroomId = claClassroomId;
		this.claClassroomName = claClassroomName;
		this.claClassroomNameAbb = claClassroomNameAbb;
		this.claServicecenterId = claServicecenterId;
		this.claServicecenterName = claServicecenterName;
		this.claVenueId = claVenueId;
		this.claVenueName = claVenueName;
		this.claAreaId = claAreaId;
		this.claAreaName = claAreaName;
		this.claClassdateId = claClassdateId;
		this.claClassdateName = claClassdateName;
		this.claSubjectIds = claSubjectIds;
		this.claSubjectNames = claSubjectNames;
		this.claClasstimeIds = claClasstimeIds;
		this.claClasstimeNames = claClasstimeNames;
		this.claTeacherIds = claTeacherIds;
		this.claTeacherNames = claTeacherNames;
		this.claStartDate = claStartDate;
		this.claEndDate = claEndDate;
		this.claDeleted = claDeleted;
		this.claClassTeacherId = claClassTeacherId;
		this.claClassTeacherName = claClassTeacherName;
		this.claClasstimeTimePeriod = claClasstimeTimePeriod;
		this.claClasstimeTimeClassify = claClasstimeTimeClassify;
		this.claTutorId = claTutorId;
		this.claTutorRealName = claTutorRealName;
		this.cucClassId = cucClassId;
		this.cucClassNum = cucClassNum;
		this.cucClassDate = cucClassDate;
		this.cucClasstimeId = cucClasstimeId;
		this.cucStartTime = cucStartTime;
		this.cucEndTime = cucEndTime;
		this.cucTeacherId = cucTeacherId;
		this.cucSubjectId = cucSubjectId;
		this.cucTeacherType = cucTeacherType;
		this.cucClassroomId = cucClassroomId;
		this.cucDeleted = cucDeleted;
		this.cucStatus = cucStatus;
		this.cucVersion = cucVersion;
		this.cucLockStatus = cucLockStatus;
		this.cucCancel = cucCancel;
		this.cucBiTest = cucBiTest;
		this.cucClasstimeTypeId = cucClasstimeTypeId;
		this.cucClassTimeName = cucClassTimeName;
		this.cucName = cucName;
		this.claLiveNumberId = claLiveNumberId;
		this.claCourseId = claCourseId;
		this.cityId = cityId;
		this.cityName = cityName;
		this.claStuNum = claStuNum;
	}

	// getter && setter
	// 在setter方法最后加上"return this;"并把返回参数改为PyClassSchedule可以实现连缀设置属性
	public String getPkId() {
		return pkId;
	}

	public PyClassScheduleSearch setPkId(String pkId) {
		this.pkId = pkId;
		return this;
	}
	
	public String getClaId() {
		return claId;
	}

	public PyClassScheduleSearch setClaId(String claId) {
		this.claId = claId;
		return this;
	}
	
	public String getClaName() {
		return claName;
	}

	public PyClassScheduleSearch setClaName(String claName) {
		this.claName = claName;
		return this;
	}
	
	public String getClaGtId() {
		return claGtId;
	}

	public PyClassScheduleSearch setClaGtId(String claGtId) {
		this.claGtId = claGtId;
		return this;
	}
	
	public String getClaGtName() {
		return claGtName;
	}

	public PyClassScheduleSearch setClaGtName(String claGtName) {
		this.claGtName = claGtName;
		return this;
	}
	
	public String getClaYear() {
		return claYear;
	}

	public PyClassScheduleSearch setClaYear(String claYear) {
		this.claYear = claYear;
		return this;
	}
	
	public String getClaTermName() {
		return claTermName;
	}

	public PyClassScheduleSearch setClaTermName(String claTermName) {
		this.claTermName = claTermName;
		return this;
	}
	
	public String getClaTermId() {
		return claTermId;
	}

	public PyClassScheduleSearch setClaTermId(String claTermId) {
		this.claTermId = claTermId;
		return this;
	}
	
	public String getClaGradeId() {
		return claGradeId;
	}

	public PyClassScheduleSearch setClaGradeId(String claGradeId) {
		this.claGradeId = claGradeId;
		return this;
	}
	
	public String getClaGradeName() {
		return claGradeName;
	}

	public PyClassScheduleSearch setClaGradeName(String claGradeName) {
		this.claGradeName = claGradeName;
		return this;
	}
	
	public String getClaLevelId() {
		return claLevelId;
	}

	public PyClassScheduleSearch setClaLevelId(String claLevelId) {
		this.claLevelId = claLevelId;
		return this;
	}
	
	public String getClaLevelName() {
		return claLevelName;
	}

	public PyClassScheduleSearch setClaLevelName(String claLevelName) {
		this.claLevelName = claLevelName;
		return this;
	}
	
	public String getClaClassroomId() {
		return claClassroomId;
	}

	public PyClassScheduleSearch setClaClassroomId(String claClassroomId) {
		this.claClassroomId = claClassroomId;
		return this;
	}
	
	public String getClaClassroomName() {
		return claClassroomName;
	}

	public PyClassScheduleSearch setClaClassroomName(String claClassroomName) {
		this.claClassroomName = claClassroomName;
		return this;
	}
	
	public String getClaClassroomNameAbb() {
		return claClassroomNameAbb;
	}

	public PyClassScheduleSearch setClaClassroomNameAbb(String claClassroomNameAbb) {
		this.claClassroomNameAbb = claClassroomNameAbb;
		return this;
	}
	
	public String getClaServicecenterId() {
		return claServicecenterId;
	}

	public PyClassScheduleSearch setClaServicecenterId(String claServicecenterId) {
		this.claServicecenterId = claServicecenterId;
		return this;
	}
	
	public String getClaServicecenterName() {
		return claServicecenterName;
	}

	public PyClassScheduleSearch setClaServicecenterName(String claServicecenterName) {
		this.claServicecenterName = claServicecenterName;
		return this;
	}
	
	public String getClaVenueId() {
		return claVenueId;
	}

	public PyClassScheduleSearch setClaVenueId(String claVenueId) {
		this.claVenueId = claVenueId;
		return this;
	}
	
	public String getClaVenueName() {
		return claVenueName;
	}

	public PyClassScheduleSearch setClaVenueName(String claVenueName) {
		this.claVenueName = claVenueName;
		return this;
	}
	
	public String getClaAreaId() {
		return claAreaId;
	}

	public PyClassScheduleSearch setClaAreaId(String claAreaId) {
		this.claAreaId = claAreaId;
		return this;
	}
	
	public String getClaAreaName() {
		return claAreaName;
	}

	public PyClassScheduleSearch setClaAreaName(String claAreaName) {
		this.claAreaName = claAreaName;
		return this;
	}
	
	public String getClaClassdateId() {
		return claClassdateId;
	}

	public PyClassScheduleSearch setClaClassdateId(String claClassdateId) {
		this.claClassdateId = claClassdateId;
		return this;
	}
	
	public String getClaClassdateName() {
		return claClassdateName;
	}

	public PyClassScheduleSearch setClaClassdateName(String claClassdateName) {
		this.claClassdateName = claClassdateName;
		return this;
	}
	
	public Integer getClaSubjectIds() {
		return claSubjectIds;
	}

	public PyClassScheduleSearch setClaSubjectIds(Integer claSubjectIds) {
		this.claSubjectIds = claSubjectIds;
		return this;
	}
	
	public String getClaSubjectNames() {
		return claSubjectNames;
	}

	public PyClassScheduleSearch setClaSubjectNames(String claSubjectNames) {
		this.claSubjectNames = claSubjectNames;
		return this;
	}
	
	public String getClaClasstimeIds() {
		return claClasstimeIds;
	}

	public PyClassScheduleSearch setClaClasstimeIds(String claClasstimeIds) {
		this.claClasstimeIds = claClasstimeIds;
		return this;
	}
	
	public String getClaClasstimeNames() {
		return claClasstimeNames;
	}

	public PyClassScheduleSearch setClaClasstimeNames(String claClasstimeNames) {
		this.claClasstimeNames = claClasstimeNames;
		return this;
	}
	
	public String getClaTeacherIds() {
		return claTeacherIds;
	}

	public PyClassScheduleSearch setClaTeacherIds(String claTeacherIds) {
		this.claTeacherIds = claTeacherIds;
		return this;
	}
	
	public String getClaTeacherNames() {
		return claTeacherNames;
	}

	public PyClassScheduleSearch setClaTeacherNames(String claTeacherNames) {
		this.claTeacherNames = claTeacherNames;
		return this;
	}
	
	public Date getClaStartDate() {
		return claStartDate;
	}

	public PyClassScheduleSearch setClaStartDate(Date claStartDate) {
		this.claStartDate = claStartDate;
		return this;
	}
	
	public Date getClaEndDate() {
		return claEndDate;
	}

	public PyClassScheduleSearch setClaEndDate(Date claEndDate) {
		this.claEndDate = claEndDate;
		return this;
	}
	
	public Integer getClaDeleted() {
		return claDeleted;
	}

	public PyClassScheduleSearch setClaDeleted(Integer claDeleted) {
		this.claDeleted = claDeleted;
		return this;
	}
	
	public String getClaClassTeacherId() {
		return claClassTeacherId;
	}

	public PyClassScheduleSearch setClaClassTeacherId(String claClassTeacherId) {
		this.claClassTeacherId = claClassTeacherId;
		return this;
	}
	
	public String getClaClassTeacherName() {
		return claClassTeacherName;
	}

	public PyClassScheduleSearch setClaClassTeacherName(String claClassTeacherName) {
		this.claClassTeacherName = claClassTeacherName;
		return this;
	}
	
	public String getClaClasstimeTimePeriod() {
		return claClasstimeTimePeriod;
	}

	public PyClassScheduleSearch setClaClasstimeTimePeriod(String claClasstimeTimePeriod) {
		this.claClasstimeTimePeriod = claClasstimeTimePeriod;
		return this;
	}
	
	public String getClaClasstimeTimeClassify() {
		return claClasstimeTimeClassify;
	}

	public PyClassScheduleSearch setClaClasstimeTimeClassify(String claClasstimeTimeClassify) {
		this.claClasstimeTimeClassify = claClasstimeTimeClassify;
		return this;
	}
	
	public String getClaTutorId() {
		return claTutorId;
	}

	public PyClassScheduleSearch setClaTutorId(String claTutorId) {
		this.claTutorId = claTutorId;
		return this;
	}
	
	public String getClaTutorRealName() {
		return claTutorRealName;
	}

	public PyClassScheduleSearch setClaTutorRealName(String claTutorRealName) {
		this.claTutorRealName = claTutorRealName;
		return this;
	}
	
	public String getCucClassId() {
		return cucClassId;
	}

	public PyClassScheduleSearch setCucClassId(String cucClassId) {
		this.cucClassId = cucClassId;
		return this;
	}
	
	public Integer getCucClassNum() {
		return cucClassNum;
	}

	public PyClassScheduleSearch setCucClassNum(Integer cucClassNum) {
		this.cucClassNum = cucClassNum;
		return this;
	}
	
	public Date getCucClassDate() {
		return cucClassDate;
	}

	public PyClassScheduleSearch setCucClassDate(Date cucClassDate) {
		this.cucClassDate = cucClassDate;
		return this;
	}
	
	public String getCucClasstimeId() {
		return cucClasstimeId;
	}

	public PyClassScheduleSearch setCucClasstimeId(String cucClasstimeId) {
		this.cucClasstimeId = cucClasstimeId;
		return this;
	}
	
	public time getCucStartTime() {
		return cucStartTime;
	}

	public PyClassScheduleSearch setCucStartTime(time cucStartTime) {
		this.cucStartTime = cucStartTime;
		return this;
	}
	
	public time getCucEndTime() {
		return cucEndTime;
	}

	public PyClassScheduleSearch setCucEndTime(time cucEndTime) {
		this.cucEndTime = cucEndTime;
		return this;
	}
	
	public String getCucTeacherId() {
		return cucTeacherId;
	}

	public PyClassScheduleSearch setCucTeacherId(String cucTeacherId) {
		this.cucTeacherId = cucTeacherId;
		return this;
	}
	
	public String getCucSubjectId() {
		return cucSubjectId;
	}

	public PyClassScheduleSearch setCucSubjectId(String cucSubjectId) {
		this.cucSubjectId = cucSubjectId;
		return this;
	}
	
	public Integer getCucTeacherType() {
		return cucTeacherType;
	}

	public PyClassScheduleSearch setCucTeacherType(Integer cucTeacherType) {
		this.cucTeacherType = cucTeacherType;
		return this;
	}
	
	public String getCucClassroomId() {
		return cucClassroomId;
	}

	public PyClassScheduleSearch setCucClassroomId(String cucClassroomId) {
		this.cucClassroomId = cucClassroomId;
		return this;
	}
	
	public Integer getCucDeleted() {
		return cucDeleted;
	}

	public PyClassScheduleSearch setCucDeleted(Integer cucDeleted) {
		this.cucDeleted = cucDeleted;
		return this;
	}
	
	public Integer getCucStatus() {
		return cucStatus;
	}

	public PyClassScheduleSearch setCucStatus(Integer cucStatus) {
		this.cucStatus = cucStatus;
		return this;
	}
	
	public Integer getCucVersion() {
		return cucVersion;
	}

	public PyClassScheduleSearch setCucVersion(Integer cucVersion) {
		this.cucVersion = cucVersion;
		return this;
	}
	
	public Integer getCucLockStatus() {
		return cucLockStatus;
	}

	public PyClassScheduleSearch setCucLockStatus(Integer cucLockStatus) {
		this.cucLockStatus = cucLockStatus;
		return this;
	}
	
	public Integer getCucCancel() {
		return cucCancel;
	}

	public PyClassScheduleSearch setCucCancel(Integer cucCancel) {
		this.cucCancel = cucCancel;
		return this;
	}
	
	public Integer getCucBiTest() {
		return cucBiTest;
	}

	public PyClassScheduleSearch setCucBiTest(Integer cucBiTest) {
		this.cucBiTest = cucBiTest;
		return this;
	}
	
	public String getCucClasstimeTypeId() {
		return cucClasstimeTypeId;
	}

	public PyClassScheduleSearch setCucClasstimeTypeId(String cucClasstimeTypeId) {
		this.cucClasstimeTypeId = cucClasstimeTypeId;
		return this;
	}
	
	public String getCucClassTimeName() {
		return cucClassTimeName;
	}

	public PyClassScheduleSearch setCucClassTimeName(String cucClassTimeName) {
		this.cucClassTimeName = cucClassTimeName;
		return this;
	}
	
	public String getCucName() {
		return cucName;
	}

	public PyClassScheduleSearch setCucName(String cucName) {
		this.cucName = cucName;
		return this;
	}
	
	public String getClaLiveNumberId() {
		return claLiveNumberId;
	}

	public PyClassScheduleSearch setClaLiveNumberId(String claLiveNumberId) {
		this.claLiveNumberId = claLiveNumberId;
		return this;
	}
	
	public String getClaCourseId() {
		return claCourseId;
	}

	public PyClassScheduleSearch setClaCourseId(String claCourseId) {
		this.claCourseId = claCourseId;
		return this;
	}
	
	public String getCityId() {
		return cityId;
	}

	public PyClassScheduleSearch setCityId(String cityId) {
		this.cityId = cityId;
		return this;
	}
	
	public String getCityName() {
		return cityName;
	}

	public PyClassScheduleSearch setCityName(String cityName) {
		this.cityName = cityName;
		return this;
	}
	
	public Integer getClaStuNum() {
		return claStuNum;
	}

	public PyClassScheduleSearch setClaStuNum(Integer claStuNum) {
		this.claStuNum = claStuNum;
		return this;
	}
	
}