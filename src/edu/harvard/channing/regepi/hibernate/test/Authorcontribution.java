package edu.harvard.channing.regepi.hibernate.test;
// default package
// Generated Oct 2, 2014 9:45:35 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Authorcontribution generated by hbm2java
 */
@Entity
@Table(name = "authorcontribution", catalog = "channingreview")
public class Authorcontribution implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8425289862081260611L;
	private Integer id;
	private String analysis;
	private String cellection;
	private String concept;
	private String author;
	private String funding;
	private String manuscriptId;
	private String statistics;
	private String writing;

	public Authorcontribution() {
	}

	public Authorcontribution(String analysis, String cellection,
			String concept, String author, String funding, String manuscriptId,
			String statistics, String writing) {
		this.analysis = analysis;
		this.cellection = cellection;
		this.concept = concept;
		this.author = author;
		this.funding = funding;
		this.manuscriptId = manuscriptId;
		this.statistics = statistics;
		this.writing = writing;
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

	@Column(name = "analysis")
	public String getAnalysis() {
		return this.analysis;
	}

	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

	@Column(name = "cellection")
	public String getCellection() {
		return this.cellection;
	}

	public void setCellection(String cellection) {
		this.cellection = cellection;
	}

	@Column(name = "concept")
	public String getConcept() {
		return this.concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}

	@Column(name = "author")
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "funding")
	public String getFunding() {
		return this.funding;
	}

	public void setFunding(String funding) {
		this.funding = funding;
	}

	@Column(name = "manuscript_id")
	public String getManuscriptId() {
		return this.manuscriptId;
	}

	public void setManuscriptId(String manuscriptId) {
		this.manuscriptId = manuscriptId;
	}

	@Column(name = "statistics")
	public String getStatistics() {
		return this.statistics;
	}

	public void setStatistics(String statistics) {
		this.statistics = statistics;
	}

	@Column(name = "writing")
	public String getWriting() {
		return this.writing;
	}

	public void setWriting(String writing) {
		this.writing = writing;
	}

}
