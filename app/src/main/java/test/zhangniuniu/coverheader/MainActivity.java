package test.zhangniuniu.coverheader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * ScrollView Header  滑动
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyScrollView scrollView = (MyScrollView) findViewById(R.id.scrollView);
        final View header =  findViewById(R.id.header);
        scrollView.setListener(new OnScrolledListener() {
           @Override
           public void scroll(int y) {
               header.scrollTo(0,-y/2);
           }
       });
    }
}
