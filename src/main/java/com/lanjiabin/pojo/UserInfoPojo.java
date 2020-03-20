package com.lanjiabin.pojo;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "userinfo")
public class UserInfoPojo {

  @Id
  @GeneratedValue
  private Integer userid;
  private String badgenumber;
  private String ssn;
  private String name;
  private String gender;
  private String title;
  private String pager;
  private java.sql.Timestamp birthday;
  private java.sql.Timestamp hiredday;
  private String street;
  private String city;
  private String state;
  private String zip;
  private String ophone;
  private String fphone;
  private Integer verificationmethod;
  private Integer defaultdeptid;
  private Integer securityflags;
  private Integer att;
  private Integer inlate;
  private Integer outearly;
  private Integer overtime;
  private Integer sep;
  private Integer holiday;
  private String minzu;
  private String password;
  private Integer lunchduration;
  private String photo;
  private String mverifypass;
  private String notes;
  private Integer privilege;
  private Integer inheritDeptSch;
  private Integer inheritDeptSchClass;
  private Integer autoSchPlan;
  private Integer minAutoSchInterval;
  private Integer registerOt;
  private Integer inheritDeptRule;
  private Integer emprivilege;
  private String cardNo;
  private Integer faceGroup;
  private Integer accGroup;
  private Integer useAccGroupTz;
  private Integer verifyCode;
  private Integer expires;
  private Integer validCount;
  private java.sql.Timestamp validTimeBegin;
  private java.sql.Timestamp validTimeEnd;
  private Integer timeZone1;
  private Integer timeZone2;
  private Integer timeZone3;
  private String idCardNo;
  private String idCardValidTime;
  private String eMail;
  private String idCardName;
  private String idCardBirth;
  private String idCardSn;
  private String idCardDn;
  private String idCardAddr;
  private String idCardNewAddr;
  private String idCardIssuer;
  private Integer idCardGender;
  private Integer idCardNation;
  private String idCardReserve;
  private String idCardNotice;
  private String idCardMainCard;
  private String idCardViceCard;
  private Integer fSelected;


  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }


  public String getBadgenumber() {
    return badgenumber;
  }

  public void setBadgenumber(String badgenumber) {
    this.badgenumber = badgenumber;
  }


  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }



  public String getGender() {
    return gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getPager() {
    return pager;
  }

  public void setPager(String pager) {
    this.pager = pager;
  }


  public java.sql.Timestamp getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Timestamp birthday) {
    this.birthday = birthday;
  }


  public java.sql.Timestamp getHiredday() {
    return hiredday;
  }

  public void setHiredday(java.sql.Timestamp hiredday) {
    this.hiredday = hiredday;
  }


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }


  public String getOphone() {
    return ophone;
  }

  public void setOphone(String ophone) {
    this.ophone = ophone;
  }


  public String getFphone() {
    return fphone;
  }

  public void setFphone(String fphone) {
    this.fphone = fphone;
  }


  public Integer getVerificationmethod() {
    return verificationmethod;
  }

  public void setVerificationmethod(Integer verificationmethod) {
    this.verificationmethod = verificationmethod;
  }


  public Integer getDefaultdeptid() {
    return defaultdeptid;
  }

  public void setDefaultdeptid(Integer defaultdeptid) {
    this.defaultdeptid = defaultdeptid;
  }


  public Integer getSecurityflags() {
    return securityflags;
  }

  public void setSecurityflags(Integer securityflags) {
    this.securityflags = securityflags;
  }


  public Integer getAtt() {
    return att;
  }

  public void setAtt(Integer att) {
    this.att = att;
  }


  public Integer getInlate() {
    return inlate;
  }

  public void setInlate(Integer inlate) {
    this.inlate = inlate;
  }


  public Integer getOutearly() {
    return outearly;
  }

  public void setOutearly(Integer outearly) {
    this.outearly = outearly;
  }


  public Integer getOvertime() {
    return overtime;
  }

  public void setOvertime(Integer overtime) {
    this.overtime = overtime;
  }


  public Integer getSep() {
    return sep;
  }

  public void setSep(Integer sep) {
    this.sep = sep;
  }


  public Integer getHoliday() {
    return holiday;
  }

  public void setHoliday(Integer holiday) {
    this.holiday = holiday;
  }


  public String getMinzu() {
    return minzu;
  }

  public void setMinzu(String minzu) {
    this.minzu = minzu;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public Integer getLunchduration() {
    return lunchduration;
  }

  public void setLunchduration(Integer lunchduration) {
    this.lunchduration = lunchduration;
  }


  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }


  public String getMverifypass() {
    return mverifypass;
  }

  public void setMverifypass(String mverifypass) {
    this.mverifypass = mverifypass;
  }


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public Integer getPrivilege() {
    return privilege;
  }

  public void setPrivilege(Integer privilege) {
    this.privilege = privilege;
  }


  public Integer getInheritDeptSch() {
    return inheritDeptSch;
  }

  public void setInheritDeptSch(Integer inheritDeptSch) {
    this.inheritDeptSch = inheritDeptSch;
  }


  public Integer getInheritDeptSchClass() {
    return inheritDeptSchClass;
  }

  public void setInheritDeptSchClass(Integer inheritDeptSchClass) {
    this.inheritDeptSchClass = inheritDeptSchClass;
  }


  public Integer getAutoSchPlan() {
    return autoSchPlan;
  }

  public void setAutoSchPlan(Integer autoSchPlan) {
    this.autoSchPlan = autoSchPlan;
  }


  public Integer getMinAutoSchInterval() {
    return minAutoSchInterval;
  }

  public void setMinAutoSchInterval(Integer minAutoSchInterval) {
    this.minAutoSchInterval = minAutoSchInterval;
  }


  public Integer getRegisterOt() {
    return registerOt;
  }

  public void setRegisterOt(Integer registerOt) {
    this.registerOt = registerOt;
  }


  public Integer getInheritDeptRule() {
    return inheritDeptRule;
  }

  public void setInheritDeptRule(Integer inheritDeptRule) {
    this.inheritDeptRule = inheritDeptRule;
  }


  public Integer getEmprivilege() {
    return emprivilege;
  }

  public void setEmprivilege(Integer emprivilege) {
    this.emprivilege = emprivilege;
  }


  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }


  public Integer getFaceGroup() {
    return faceGroup;
  }

  public void setFaceGroup(Integer faceGroup) {
    this.faceGroup = faceGroup;
  }


  public Integer getAccGroup() {
    return accGroup;
  }

  public void setAccGroup(Integer accGroup) {
    this.accGroup = accGroup;
  }


  public Integer getUseAccGroupTz() {
    return useAccGroupTz;
  }

  public void setUseAccGroupTz(Integer useAccGroupTz) {
    this.useAccGroupTz = useAccGroupTz;
  }


  public Integer getVerifyCode() {
    return verifyCode;
  }

  public void setVerifyCode(Integer verifyCode) {
    this.verifyCode = verifyCode;
  }


  public Integer getExpires() {
    return expires;
  }

  public void setExpires(Integer expires) {
    this.expires = expires;
  }


  public Integer getValidCount() {
    return validCount;
  }

  public void setValidCount(Integer validCount) {
    this.validCount = validCount;
  }


  public java.sql.Timestamp getValidTimeBegin() {
    return validTimeBegin;
  }

  public void setValidTimeBegin(java.sql.Timestamp validTimeBegin) {
    this.validTimeBegin = validTimeBegin;
  }


  public java.sql.Timestamp getValidTimeEnd() {
    return validTimeEnd;
  }

  public void setValidTimeEnd(java.sql.Timestamp validTimeEnd) {
    this.validTimeEnd = validTimeEnd;
  }


  public Integer getTimeZone1() {
    return timeZone1;
  }

  public void setTimeZone1(Integer timeZone1) {
    this.timeZone1 = timeZone1;
  }


  public Integer getTimeZone2() {
    return timeZone2;
  }

  public void setTimeZone2(Integer timeZone2) {
    this.timeZone2 = timeZone2;
  }


  public Integer getTimeZone3() {
    return timeZone3;
  }

  public void setTimeZone3(Integer timeZone3) {
    this.timeZone3 = timeZone3;
  }


  public String getIdCardNo() {
    return idCardNo;
  }

  public void setIdCardNo(String idCardNo) {
    this.idCardNo = idCardNo;
  }


  public String getIdCardValidTime() {
    return idCardValidTime;
  }

  public void setIdCardValidTime(String idCardValidTime) {
    this.idCardValidTime = idCardValidTime;
  }


  public String getEMail() {
    return eMail;
  }

  public void setEMail(String eMail) {
    this.eMail = eMail;
  }


  public String getIdCardName() {
    return idCardName;
  }

  public void setIdCardName(String idCardName) {
    this.idCardName = idCardName;
  }


  public String getIdCardBirth() {
    return idCardBirth;
  }

  public void setIdCardBirth(String idCardBirth) {
    this.idCardBirth = idCardBirth;
  }


  public String getIdCardSn() {
    return idCardSn;
  }

  public void setIdCardSn(String idCardSn) {
    this.idCardSn = idCardSn;
  }


  public String getIdCardDn() {
    return idCardDn;
  }

  public void setIdCardDn(String idCardDn) {
    this.idCardDn = idCardDn;
  }


  public String getIdCardAddr() {
    return idCardAddr;
  }

  public void setIdCardAddr(String idCardAddr) {
    this.idCardAddr = idCardAddr;
  }


  public String getIdCardNewAddr() {
    return idCardNewAddr;
  }

  public void setIdCardNewAddr(String idCardNewAddr) {
    this.idCardNewAddr = idCardNewAddr;
  }


  public String getIdCardIssuer() {
    return idCardIssuer;
  }

  public void setIdCardIssuer(String idCardIssuer) {
    this.idCardIssuer = idCardIssuer;
  }


  public Integer getIdCardGender() {
    return idCardGender;
  }

  public void setIdCardGender(Integer idCardGender) {
    this.idCardGender = idCardGender;
  }


  public Integer getIdCardNation() {
    return idCardNation;
  }

  public void setIdCardNation(Integer idCardNation) {
    this.idCardNation = idCardNation;
  }


  public String getIdCardReserve() {
    return idCardReserve;
  }

  public void setIdCardReserve(String idCardReserve) {
    this.idCardReserve = idCardReserve;
  }


  public String getIdCardNotice() {
    return idCardNotice;
  }

  public void setIdCardNotice(String idCardNotice) {
    this.idCardNotice = idCardNotice;
  }


  public String getIdCardMainCard() {
    return idCardMainCard;
  }

  public void setIdCardMainCard(String idCardMainCard) {
    this.idCardMainCard = idCardMainCard;
  }


  public String getIdCardViceCard() {
    return idCardViceCard;
  }

  public void setIdCardViceCard(String idCardViceCard) {
    this.idCardViceCard = idCardViceCard;
  }


  public Integer getFSelected() {
    return fSelected;
  }

  public void setFSelected(Integer fSelected) {
    this.fSelected = fSelected;
  }

}
