package com.mdumrauf.android.examples.gradle;

import java.util.Collection;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.mdumrauf.android.examples.gradle.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Collection<Integer> filtered = Utils.getFilteredNumbers(Lists.newArrayList(4, 1, 2, 5, 9, 8));
        
        ((TextView) findViewById(R.id.text_view)).setText(Joiner.on(",").join(filtered));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}
