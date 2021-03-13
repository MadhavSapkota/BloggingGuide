package com.example.bloggingguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    Toolbar mActionBarToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




//    mActionBarToolBar = (Toolbar)findViewById(R.id.toolbar);
//    setSupportActionBar(mActionBarToolBar);
//    getSupportActionBar().setTitle("Lesson 1");
//        mActionBarToolBar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
//        mActionBarToolBar.setNavigationOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            startActivity(new Intent(getApplicationContext(), MainActivity.class));
//            finish();
//        }
//    });



    WebView view = (WebView)this.findViewById(R.id.webView);
        view.loadUrl("https://guideforblog.com");
//        view.getSettings().setJavaScriptEnabled(true);


//        view.setInitialScale(1);
//        view.getSettings().setLoadWithOverviewMode(true);
//        view.getSettings().setUseWideViewPort(true);
//        view.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
//        view.setScrollbarFadingEnabled(false);
//        view.loadUrl(myurl);



//        view.getSettings().setBuiltInZoomControls(true);
//        view.getSettings().setSupportZoom(true);
//        view.getSettings().setUseWideViewPort(true);
//        view.getSettings().setLoadWithOverviewMode(true);
//        view.loadUrl(myurl);
}
}