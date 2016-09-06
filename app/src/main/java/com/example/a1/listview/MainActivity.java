package com.example.a1.listview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private final static String USERNAME = "username";
    private final static String CLASSROOM = "classroom";
    private final static String INFO = "info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] usernames = {"龙飞", "张澈", "黄哲", "徐熙"};
        String[] classrooms = {"软工1401班","网工1402班","计科1403班","计科1406班"};
        String[] infos = {"001 男 1231231231", "002 女 1245632185", "003 男 08641234564", "004 男 17451547956"};

        List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < usernames.length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put(USERNAME, usernames[i]);
            item.put(CLASSROOM, classrooms[i]);
            item.put(INFO, infos[i]);
            items.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(this, items, R.layout.item, new String[]{USERNAME, CLASSROOM, INFO}, new int[]{R.id.textview1, R.id.textview2, R.id.textview3});
        ListView list = (ListView) findViewById(R.id.listView1);
        list.setAdapter(adapter);
    }
}
