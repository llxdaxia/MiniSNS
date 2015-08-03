package cn.hotwoo.alien.minisns.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by alien on 2015/8/2.
 */
@Table(name = "UserInfo")
public class UserInfo extends Model{
    @Column(name = "Name")
    public String name;

    @Column(name = "Sign")
    public String sign;
}
