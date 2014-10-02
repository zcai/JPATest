package edu.harvard.channing.regepi.hibernate.test;
// default package
// Generated Oct 2, 2014 9:45:35 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Manuscriptchecklist generated by hbm2java
 */
@Entity
@Table(name = "manuscriptchecklist", catalog = "channingreview")
public class Manuscriptchecklist implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4332023159568225715L;
	private Integer id;
	private String irbNumber;
	private String irbTitle;
	private Date approvalDate;
	private String authors;
	private String checkbox1;
	private String checkbox2;
	private String checkbox3;
	private String checkbox4;
	private String checkbox5;
	private Date deadline;
	private String email;
	private String facultyName;
	private Date formSignedDate;
	private String changitLink;
	private String journal;
	private String link;
	private String manuscriptId;
	private Date proposalDate1;
	private Date proposalDate2;
	private Date proposalDate3;
	private Date proposalDate4;
	private String publishedOnJournal;
	private String question1;
	private String question2;
	private String question2a;
	private String question3;
	private String question3a;
	private String question4;
	private String question5;
	private String question6;
	private String question7;
	private String redmineLink;
	private Date resultDate1;
	private Date resultDate2;
	private Date resultDate3;
	private Date resultDate4;
	private Date resultDate5;
	private String stashLink;
	private String techReviewerName;
	private String title;
	private String userGroup;

	public Manuscriptchecklist() {
	}

	public Manuscriptchecklist(String manuscriptId) {
		this.manuscriptId = manuscriptId;
	}

	public Manuscriptchecklist(String irbNumber, String irbTitle,
			Date approvalDate, String authors, String checkbox1,
			String checkbox2, String checkbox3, String checkbox4,
			String checkbox5, Date deadline, String email, String facultyName,
			Date formSignedDate, String changitLink, String journal,
			String link, String manuscriptId, Date proposalDate1,
			Date proposalDate2, Date proposalDate3, Date proposalDate4,
			String publishedOnJournal, String question1, String question2,
			String question2a, String question3, String question3a,
			String question4, String question5, String question6,
			String question7, String redmineLink, Date resultDate1,
			Date resultDate2, Date resultDate3, Date resultDate4,
			Date resultDate5, String stashLink, String techReviewerName,
			String title, String userGroup) {
		this.irbNumber = irbNumber;
		this.irbTitle = irbTitle;
		this.approvalDate = approvalDate;
		this.authors = authors;
		this.checkbox1 = checkbox1;
		this.checkbox2 = checkbox2;
		this.checkbox3 = checkbox3;
		this.checkbox4 = checkbox4;
		this.checkbox5 = checkbox5;
		this.deadline = deadline;
		this.email = email;
		this.facultyName = facultyName;
		this.formSignedDate = formSignedDate;
		this.changitLink = changitLink;
		this.journal = journal;
		this.link = link;
		this.manuscriptId = manuscriptId;
		this.proposalDate1 = proposalDate1;
		this.proposalDate2 = proposalDate2;
		this.proposalDate3 = proposalDate3;
		this.proposalDate4 = proposalDate4;
		this.publishedOnJournal = publishedOnJournal;
		this.question1 = question1;
		this.question2 = question2;
		this.question2a = question2a;
		this.question3 = question3;
		this.question3a = question3a;
		this.question4 = question4;
		this.question5 = question5;
		this.question6 = question6;
		this.question7 = question7;
		this.redmineLink = redmineLink;
		this.resultDate1 = resultDate1;
		this.resultDate2 = resultDate2;
		this.resultDate3 = resultDate3;
		this.resultDate4 = resultDate4;
		this.resultDate5 = resultDate5;
		this.stashLink = stashLink;
		this.techReviewerName = techReviewerName;
		this.title = title;
		this.userGroup = userGroup;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "IRB_number")
	public String getIrbNumber() {
		return this.irbNumber;
	}

	public void setIrbNumber(String irbNumber) {
		this.irbNumber = irbNumber;
	}

	@Column(name = "IRB_title")
	public String getIrbTitle() {
		return this.irbTitle;
	}

	public void setIrbTitle(String irbTitle) {
		this.irbTitle = irbTitle;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "approval_date", length = 19)
	public Date getApprovalDate() {
		return this.approvalDate;
	}

	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}

	@Column(name = "authors")
	public String getAuthors() {
		return this.authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	@Column(name = "checkbox_1")
	public String getCheckbox1() {
		return this.checkbox1;
	}

	public void setCheckbox1(String checkbox1) {
		this.checkbox1 = checkbox1;
	}

	@Column(name = "checkbox_2")
	public String getCheckbox2() {
		return this.checkbox2;
	}

	public void setCheckbox2(String checkbox2) {
		this.checkbox2 = checkbox2;
	}

	@Column(name = "checkbox_3")
	public String getCheckbox3() {
		return this.checkbox3;
	}

	public void setCheckbox3(String checkbox3) {
		this.checkbox3 = checkbox3;
	}

	@Column(name = "checkbox_4")
	public String getCheckbox4() {
		return this.checkbox4;
	}

	public void setCheckbox4(String checkbox4) {
		this.checkbox4 = checkbox4;
	}

	@Column(name = "checkbox_5")
	public String getCheckbox5() {
		return this.checkbox5;
	}

	public void setCheckbox5(String checkbox5) {
		this.checkbox5 = checkbox5;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deadline", length = 19)
	public Date getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "faculty_name")
	public String getFacultyName() {
		return this.facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "form_signed_date", length = 19)
	public Date getFormSignedDate() {
		return this.formSignedDate;
	}

	public void setFormSignedDate(Date formSignedDate) {
		this.formSignedDate = formSignedDate;
	}

	@Column(name = "changit_link")
	public String getChangitLink() {
		return this.changitLink;
	}

	public void setChangitLink(String changitLink) {
		this.changitLink = changitLink;
	}

	@Column(name = "journal")
	public String getJournal() {
		return this.journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}

	@Column(name = "link")
	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	@Column(name = "manuscript_id", nullable = false)
	public String getManuscriptId() {
		return this.manuscriptId;
	}

	public void setManuscriptId(String manuscriptId) {
		this.manuscriptId = manuscriptId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "proposal_date1", length = 19)
	public Date getProposalDate1() {
		return this.proposalDate1;
	}

	public void setProposalDate1(Date proposalDate1) {
		this.proposalDate1 = proposalDate1;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "proposal_date2", length = 19)
	public Date getProposalDate2() {
		return this.proposalDate2;
	}

	public void setProposalDate2(Date proposalDate2) {
		this.proposalDate2 = proposalDate2;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "proposal_date3", length = 19)
	public Date getProposalDate3() {
		return this.proposalDate3;
	}

	public void setProposalDate3(Date proposalDate3) {
		this.proposalDate3 = proposalDate3;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "proposal_date4", length = 19)
	public Date getProposalDate4() {
		return this.proposalDate4;
	}

	public void setProposalDate4(Date proposalDate4) {
		this.proposalDate4 = proposalDate4;
	}

	@Column(name = "published_on_journal")
	public String getPublishedOnJournal() {
		return this.publishedOnJournal;
	}

	public void setPublishedOnJournal(String publishedOnJournal) {
		this.publishedOnJournal = publishedOnJournal;
	}

	@Column(name = "question_1")
	public String getQuestion1() {
		return this.question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	@Column(name = "question_2")
	public String getQuestion2() {
		return this.question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}

	@Column(name = "question_2a")
	public String getQuestion2a() {
		return this.question2a;
	}

	public void setQuestion2a(String question2a) {
		this.question2a = question2a;
	}

	@Column(name = "question_3")
	public String getQuestion3() {
		return this.question3;
	}

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}

	@Column(name = "question_3a")
	public String getQuestion3a() {
		return this.question3a;
	}

	public void setQuestion3a(String question3a) {
		this.question3a = question3a;
	}

	@Column(name = "question_4")
	public String getQuestion4() {
		return this.question4;
	}

	public void setQuestion4(String question4) {
		this.question4 = question4;
	}

	@Column(name = "question_5")
	public String getQuestion5() {
		return this.question5;
	}

	public void setQuestion5(String question5) {
		this.question5 = question5;
	}

	@Column(name = "question_6")
	public String getQuestion6() {
		return this.question6;
	}

	public void setQuestion6(String question6) {
		this.question6 = question6;
	}

	@Column(name = "question_7")
	public String getQuestion7() {
		return this.question7;
	}

	public void setQuestion7(String question7) {
		this.question7 = question7;
	}

	@Column(name = "redmine_link")
	public String getRedmineLink() {
		return this.redmineLink;
	}

	public void setRedmineLink(String redmineLink) {
		this.redmineLink = redmineLink;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "result_date1", length = 19)
	public Date getResultDate1() {
		return this.resultDate1;
	}

	public void setResultDate1(Date resultDate1) {
		this.resultDate1 = resultDate1;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "result_date2", length = 19)
	public Date getResultDate2() {
		return this.resultDate2;
	}

	public void setResultDate2(Date resultDate2) {
		this.resultDate2 = resultDate2;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "result_date3", length = 19)
	public Date getResultDate3() {
		return this.resultDate3;
	}

	public void setResultDate3(Date resultDate3) {
		this.resultDate3 = resultDate3;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "result_date4", length = 19)
	public Date getResultDate4() {
		return this.resultDate4;
	}

	public void setResultDate4(Date resultDate4) {
		this.resultDate4 = resultDate4;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "result_date5", length = 19)
	public Date getResultDate5() {
		return this.resultDate5;
	}

	public void setResultDate5(Date resultDate5) {
		this.resultDate5 = resultDate5;
	}

	@Column(name = "stash_link")
	public String getStashLink() {
		return this.stashLink;
	}

	public void setStashLink(String stashLink) {
		this.stashLink = stashLink;
	}

	@Column(name = "tech_reviewer_name")
	public String getTechReviewerName() {
		return this.techReviewerName;
	}

	public void setTechReviewerName(String techReviewerName) {
		this.techReviewerName = techReviewerName;
	}

	@Column(name = "title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "user_group")
	public String getUserGroup() {
		return this.userGroup;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}

}