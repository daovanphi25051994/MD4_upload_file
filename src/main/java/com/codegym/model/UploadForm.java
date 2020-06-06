package com.codegym.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.persistence.*;

@Entity
@Table
public class UploadForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    // Upload files.

    private CommonsMultipartFile[] fileDatas;

    public UploadForm() {
    }

    public UploadForm(Long id, String description, CommonsMultipartFile[] fileDatas) {
        this.id = id;
        this.description = description;
        this.fileDatas = fileDatas;
    }
}