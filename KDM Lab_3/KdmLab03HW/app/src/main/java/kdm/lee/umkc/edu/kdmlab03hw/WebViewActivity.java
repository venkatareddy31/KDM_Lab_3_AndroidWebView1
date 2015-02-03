package kdm.lee.umkc.edu.kdmlab03hw;

import android.annotation.TargetApi;
import android.app.Activity;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

import android.webkit.CookieManager;


public class WebViewActivity extends Activity {

         WebView webServiceView;
        @Override
        @TargetApi(21)
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_web_view);
            Button callServiceButton = (Button) (findViewById(R.id.webclick));
            webServiceView = (WebView) (findViewById(R.id.webView));
            webServiceView.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
            CookieManager cookiemanager = CookieManager.getInstance();
            cookiemanager.setAcceptThirdPartyCookies(webServiceView,true);

//         webServiceView.getSettings().setJavaScriptEnabled(true);
//         webServiceView.loadUrl("http://www.google.com");
            callServiceButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
//                Toast.makeText()
                    Uri uri = Uri.parse("http://www.ibm.com/smarterplanet/us/en/ibmwatson/");
                    webServiceView.getSettings().setJavaScriptEnabled(true);
                    webServiceView.loadUrl(String.valueOf(uri));
                }
            });
        }
}
