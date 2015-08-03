package cn.hotwoo.alien.minisns;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;

import java.util.List;

import cn.hotwoo.alien.minisns.model.UserInfo;


public class MainActivity extends ActionBarActivity {


    private UserInfo userInfo;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInfo=new UserInfo();
        userInfo.name="我是猪";
        userInfo.sign="我是猪吗";
        userInfo.save();
        textView= (TextView) findViewById(R.id.text);
        new Delete().from(UserInfo.class).where("id=?",0).execute();

        //说明id从1开始
        UserInfo info=new Select().from(UserInfo.class).where("id=?",1).executeSingle();
        textView.setText(info.name + info.sign);

    }

    public List<UserInfo> getRandom(UserInfo user){

        return new Select().from(UserInfo.class).where("name = ?",user.name).orderBy("RANDOM()").execute();
    }
}
