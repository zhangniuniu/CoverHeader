package test.zhangniuniu.coverheader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * ListView Header 滑动
 */
public class Main2Activity extends AppCompatActivity {

    private ListView listView;
    private String[] datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = (ListView) findViewById(R.id.listView);

        final View header = LayoutInflater.from(this).inflate(R.layout.list_view_header, listView, false);
        listView.addHeaderView(header);
        initData();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datas);
        listView.setAdapter(stringArrayAdapter);


        listView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                header.scrollTo(0, (int) (header.getY()/2));
            }
        });
    }

    private void initData() {
        datas = new String[200];

        for (int i = 0; i < 100; i++) {
            datas[i] = ("当前条目:"+i);
        }

    }
}
