package top.plutozrh.torbaetoolbox.Model;


/*
 * @program TorbaeToolBox
 *
 * @class TransferHistory
 *
 * @create Jul 13, 2022 17:22
 */

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

/**
 * Transfer history entity
 *
 * @author renhaozhang
 */
@Table(name = "TransferHistory")
@Entity
@Data
public class TransferHistory {
    @Id
    @Column(name = "transfer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transferHistoryId;

    @Column(name = "amount")
    @NotEmpty(message = "金额不能为空")
    private double amount;

    @Column(name = "note")
    private String note;

    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.REFRESH})
    @JoinTable(name = "User_Transfer_rel",
    joinColumns = {@JoinColumn(name = "transfer_id",referencedColumnName = "transfer_id")},
    inverseJoinColumns = {@JoinColumn(name = "user_id",referencedColumnName = "user_id")})
    private List<User> users;

}
