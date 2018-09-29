package aserg.authorship;

import aserg.gtf.model.LogCommitInfo;

public class FileAuthorsInfo implements Comparable<FileAuthorsInfo>{
	private String path;
	private String name;
	private String email;
	private Double doa;
	private boolean isAuthor;
	private LogCommitInfo firstCommit;
	private LogCommitInfo lastcommit;
	
	public FileAuthorsInfo(String path, String name, String email, Double doa, boolean isAuthor, LogCommitInfo firstCommit, LogCommitInfo lastcommit) {
		super();
		this.path = path;
		this.name = name;
		this.email = email;
		this.doa = doa;
		this.isAuthor = isAuthor;
		this.firstCommit = firstCommit;
		this.lastcommit = lastcommit;
	}

		
	
	public LogCommitInfo getFirstCommit() {
		return firstCommit;
	}



	public LogCommitInfo getLastCommit() {
		return lastcommit;
	}



	public String getPath() {
		return path;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Double getDoa() {
		return doa;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return path+";"+name+";"+email+";"+doa+";"+isAuthor;
	}

	@Override
	public int compareTo(FileAuthorsInfo o) {
		if (this.getPath().equals(o.getPath()))
			return this.getDoa().compareTo(o.getDoa());
		return this.getPath().compareTo(o.getPath());
	}

	public boolean isAuthor() {
		return isAuthor;
	}

	public void setAuthor(boolean isAuthor) {
		this.isAuthor = isAuthor;
	}
	
}
