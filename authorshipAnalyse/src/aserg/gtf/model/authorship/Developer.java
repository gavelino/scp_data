package aserg.gtf.model.authorship;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import aserg.authorship.AuthorshipAnalyzer;
import aserg.gtf.model.LogCommitInfo;

@Entity
public class Developer implements Comparable<Developer>{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	private String name;
	private String email;
	@Lob
	private String newUserName;
	private boolean removed;
	private List<LogCommitInfo> commits = new ArrayList<LogCommitInfo>();
	private LogCommitInfo firstCommit;
	private LogCommitInfo lastCommit;
	
	@Enumerated(EnumType.STRING)
	private DevStatus status;
	
	@OneToMany(cascade = { CascadeType.REFRESH })
	private List<Developer> origemDevelopers;
	
	@OneToMany(cascade = { CascadeType.REFRESH })
	private List<AuthorshipInfo> authorshipInfos = new ArrayList<AuthorshipInfo>();
	
	private List<File> authorshipFiles;
	
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public Developer(String name, String email, String userName) {
		super();
		this.name = name;
		this.email = email;
		this.newUserName = userName;
		this.removed = false;
		this.status = DevStatus.DEFAULT;
	}
	public Developer(String name, String email, String userName, DevStatus status) {
		super();
		this.name = name;
		this.email = email;
		this.newUserName = userName;
		this.removed = false;
		this.status = status;
	}
	
	public Developer(String userName) {
		super();
		this.newUserName = userName;
		this.removed=false;
	}
//	public static String createUserName(String name, String email){
//		String userName;
//		if (!email.isEmpty())
//			userName = email;	
//		else{
//			userName = "[NoEmail]"+name;
//			if (name.isEmpty())
//				userName = "[NoEmail-NoName]";	
//		}
//		return userName;
//	}
	
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<AuthorshipInfo> getAuthorshipInfos() {
		return authorshipInfos;
	}

	public void setAuthorshipInfos(List<AuthorshipInfo> authorshipInfos) {
		this.authorshipInfos = authorshipInfos;
	}

	public void addAuthorshipInfo(AuthorshipInfo authorshipInfo) {
		this.authorshipInfos.add(authorshipInfo);		
	}

	@Override
	public String toString() {
		return newUserName;
	}

	public String getNewUserName() {
		return newUserName;
	}

	public void setNewUserName(String newUserName) {
		this.newUserName = newUserName;
	}

	public boolean isRemoved() {
		return removed;
	}

	public void setAsRemoved() {
		this.removed = true;
		this.status = DevStatus.REMOVED;
	}

	public DevStatus getStatus() {
		return status;
	}
	public void setStatus(DevStatus status) {
		this.status = status;
	}
	public List<Developer> getOrigemDevelopers() {
		return origemDevelopers;
	}
	public void addOrigemDeveloper(Developer dev) {
		if(origemDevelopers == null)
			origemDevelopers = new ArrayList<Developer>();
		origemDevelopers.add(dev);
	}
	public void setOrigemDevelopers(List<Developer> origemDevelopers) {
		this.origemDevelopers = origemDevelopers;
	}
	public List<File> getAuthorshipFiles(boolean ignoreNoFirstAuthorFiles) {
		if (authorshipFiles == null){
			authorshipFiles = new ArrayList<File>();
			for (AuthorshipInfo authorship : this.getAuthorshipInfos()) {
				if (ignoreNoFirstAuthorFiles && !authorship.getFile().hasFirstAuthor())
					continue;
				if (authorship.isDOAAuthor())
					authorshipFiles.add(authorship.getFile());
			}	
		}			
		return authorshipFiles;
	}
	@Override
	public int compareTo(Developer o) {
		return Integer.compare(this.getAuthorshipFiles(AuthorshipAnalyzer.IGNORE_NO_FIRST_AUTHOR).size(), o.getAuthorshipFiles(AuthorshipAnalyzer.IGNORE_NO_FIRST_AUTHOR).size());
	}

	public List<LogCommitInfo> getCommits() {
		return commits;
	}
	public LogCommitInfo getFirstCommit() {
		return firstCommit;
	}
	public LogCommitInfo getLastCommit() {
		return lastCommit;
	}
	public void addCommit(LogCommitInfo commit) {
		this.commits.add(commit);
		if (this.firstCommit == null || commit.getAuthorDate().before(this.firstCommit.getAuthorDate()))
			this.firstCommit = commit;
		if (this.lastCommit == null || commit.getAuthorDate().after(this.lastCommit.getAuthorDate()))
			this.lastCommit = commit;
	}
	
}