package com.example.lisong.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
<<<<<<< HEAD
=======
import android.util.Log;
>>>>>>> cd35fa695c02918beb76bd074f0545b519037265
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

<<<<<<< HEAD
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
=======
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
>>>>>>> cd35fa695c02918beb76bd074f0545b519037265
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
<<<<<<< HEAD
            }
        });
        System.out.println("MainActivity.onCreate");
=======
                System.out.println("MainActivity.onClick out i1e " + fab);

            }
        });
>>>>>>> cd35fa695c02918beb76bd074f0545b519037265
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }
<<<<<<< HEAD

        return super.onOptionsItemSelected(item);
    }
=======
        geta();
        return super.onOptionsItemSelected(item);
    }

    /**
     * @author songli
     * create at 2016/4/2 0:17
     */
    private void geta()
    {

    }
>>>>>>> cd35fa695c02918beb76bd074f0545b519037265
}
