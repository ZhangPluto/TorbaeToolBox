package top.plutozrh.torbaetoolbox.Model;


/*
 * @program TorbaeToolBox
 *
 * @class Food
 *
 * @create Jul 09, 2022 23:00
 */

import lombok.Data;

import javax.persistence.*;

/**
 * Food Entity
 *
 * @author renhaozhang
 */
@Entity
@Table(name = "Food")
@Data
public class Food {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Link")
    private String link;

    @Column(name = "Dosing")
    private String dosing;

    @Column(name = "Author")
    private String author;


}
