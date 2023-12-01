package com.example.demo.models.db;

import com.example.demo.models.requests.CreateRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Audited
@Table(name = "books")
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @NotAudited
    private String author;

    public Book(CreateRequest request)
    {
        this.name = request.getName();
        this.author = request.getAuthor();
    }
}
