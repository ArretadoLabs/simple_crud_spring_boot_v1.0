package com.example.CRUDApplication.model;

import jakarta.persistence.*;
import lombok.*;

/***
 * Section of annotation and you explain
 */
@Entity //Used for information and identify class used also entity
@Table(name="Books") //For identify and create with hibernate link a table called "Books"
@NoArgsConstructor // Create constructor default no arguments
@AllArgsConstructor // Create constructor with all arguments
@Setter // Generate Setters for update values in attribute
@Getter // Generate Getters for return value of attributes
@ToString // Generate method ToString for converter data in format String
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String author;
}
