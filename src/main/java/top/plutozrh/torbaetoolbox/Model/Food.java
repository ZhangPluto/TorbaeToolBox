package top.plutozrh.torbaetoolbox.Model;


/*
 * @program TorbaeToolBox
 *
 * @class Food
 *
 * @create Jul 09, 2022 23:00
 */

import javax.persistence.*;

/**
 * Food Entity
 *
 * @author renhaozhang
 */
@Entity(name = "Food")
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

    public Food() {
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }

    public String getDosing() {
        return dosing;
    }

    public String getAuthor() {
        return author;
    }


}
