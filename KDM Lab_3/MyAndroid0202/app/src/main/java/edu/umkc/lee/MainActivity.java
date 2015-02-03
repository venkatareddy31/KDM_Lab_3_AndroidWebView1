package edu.umkc.lee;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
    WebView webServiceView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button callServiceButton = (Button)(findViewById(R.id.webclick));

         webServiceView =(WebView)(findViewById(R.id.webView));
//         webServiceView.getSettings().setJavaScriptEnabled(true);
//         webServiceView.loadUrl("http://www.google.com");
        callServiceButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                Toast.makeText()
                Uri uri = Uri.parse("http://www.google.com");
                webServiceView.getSettings().setJavaScriptEnabled(true);
                webServiceView.loadUrl(String.valueOf(uri));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
