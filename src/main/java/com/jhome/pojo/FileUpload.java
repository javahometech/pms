package com.jhome.pojo;

import java.sql.Blob;

public class FileUpload {
	
	private Integer fileId;
	public Integer getFileId() {
		return fileId;
	}

	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	private Blob content;

	public Blob getContent() {
		return content;
	}

	public void setContent(Blob content) {
		this.content = content;
	}

	

}
