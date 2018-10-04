package com.oppo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by JieChen on 2018/10/3.
 */
@Entity
public class Project {
    @Id
    private Integer id;

    private String ProjectName;

    @OneToMany(targetEntity = Book.class, mappedBy = "project")
    private List<Book> books = new LinkedList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String projectName) {
        ProjectName = projectName;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", ProjectName='" + ProjectName + '\'' +
                ", books=" + books +
                '}';
    }
}
