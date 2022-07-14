package top.plutozrh.torbaetoolbox.Model;


/*
 * @program TorbaeToolBox
 *
 * @class User
 *
 * @create Jul 13, 2022 16:26
 */

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * User Model
 *
 * @author renhaozhang
 */
@Entity
@Table(name = "User")
@Data
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "torbae_coin")
    private int torbaeCoin;

    @Column(name = "email")
    @NotEmpty(message = "电子邮件不能为空")
    private String email;

    @Column(name = "password")
    @NotEmpty(message = "密码不能为空")
    private String password;

    @Column(name = "friend_Id")
    private long friendId;

    @Column(name = "transfer_id")
    @ManyToMany(mappedBy = "users",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<TransferHistory> transferHistoryId;

    @Column(name = "nickname")
    @NotEmpty(message = "昵称不能为空")
    private String nickName;

}
