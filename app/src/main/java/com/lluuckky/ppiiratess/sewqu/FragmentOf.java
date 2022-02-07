package com.lluuckky.ppiiratess.sewqu;

import static com.lluuckky.ppiiratess.sewqu.LP.navController;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.onesignal.OneSignal;


public class FragmentOf extends Fragment {


    @SuppressLint("StaticFieldLeak")
    public static WebView ttttre;
    public static String iusba;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_of, container, false);

        ttttre = view.findViewById(R.id.ttttre);

        ttttre.setFocusable(true);
        ttttre.getSettings().setAllowUniversalAccessFromFileURLs(true);
        ttttre.getSettings().setJavaScriptEnabled(true);
        ttttre.getSettings().setAllowContentAccess(true);
        ttttre.getSettings().setLoadWithOverviewMode(true);
        ttttre.getSettings().setEnableSmoothTransition(true);
        ttttre.getSettings().setUseWideViewPort(true);
        ttttre.getSettings().setSaveFormData(true);
        ttttre.getSettings().setAllowFileAccess(true);
        ttttre.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        ttttre.getSettings().setDomStorageEnabled(true);
        ttttre.setFocusableInTouchMode(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(ttttre, true);
        CookieManager.getInstance().setAcceptCookie(true);
        ttttre.setVisibility(View.VISIBLE);
        ttttre.getSettings().setAllowFileAccessFromFileURLs(true);
        ttttre.getSettings().setSavePassword(true);
        ttttre.getSettings().setDatabaseEnabled(true);
        ttttre.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        ttttre.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        ttttre.getSettings().setAppCacheEnabled(true);
        ttttre.getSettings().setLoadsImagesAutomatically(true);
        ttttre.setSaveEnabled(true);
        ttttre.getSettings().setMixedContentMode(0);
        ttttre.setWebViewClient(new WEF());
        ttttre.setWebChromeClient(new WRTY());
        ttttre.loadUrl(iusba);



        return view;
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String pooo(String idsnqw, String oiuycba, String iuybdrw, String oiduhd){

         String iudytr;
         String oiundf;
         String iuuytda;
         String uydtrca;
         String tyebad;
         String ytdfrw;
         String ydtvax;

        String[] udavb = idsnqw.split("::");

        try {
            iudytr = udavb[0];
        }catch (Exception e){
            iudytr = "";
        }
        try {
            oiundf = udavb[1];
        }catch (Exception e){
            oiundf = "";
        }

        try {
            iuuytda = udavb[2];
        }catch (Exception e){
            iuuytda = "";

        }

        try {
            uydtrca = udavb[3];
        }catch (Exception e){
            uydtrca = "";
        }

        try {
            tyebad = udavb[4];
        }catch (Exception e){
            tyebad = "";
        }


        try {
            ytdfrw = udavb[5];
        }catch (Exception e){
            ytdfrw = "";
        }

        try {
            ydtvax = udavb[6];
        }catch (Exception e){
            ydtvax = "";
        }

        OneSignal.sendTag(LP.ffffd("c3ViX2FwcA=="), oiundf);

        String qwqwqw = iudytr + LP.ffffd("P2J1bmRsZT0=") + oiuycba + LP.ffffd("JmFkX2lkPQ==") + iuybdrw + LP.ffffd("JmFwcHNfaWQ9") + oiduhd +
                LP.ffffd("JnN1YjY9") + oiundf +
                LP.ffffd("JnN1Yjc9") + iuuytda +
                LP.ffffd("JnN1YjI9") + uydtrca +
                LP.ffffd("JnN1YjM9") + tyebad +
                LP.ffffd("JnN1YjQ9") + ytdfrw +
                LP.ffffd("JnN1YjU9") + ydtvax +
                LP.ffffd("JmRldl9rZXk9") + LP.ffffd(FragmentPol.iuyba);
        return qwqwqw;

    }

    public static class WEF extends WebViewClient {

        public static LP lp;

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);

            if(url.contains(LP.ffffd("NDA0"))){
                navController.navigate(R.id.fragmentButt);
            }
        }

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            lp.getSharedPreferences(lp.getPackageName(), lp.MODE_PRIVATE).edit().putString(LP.ffffd("c2F2ZWRVcmw="),url).apply();
        }
    }

    public static class WRTY extends WebChromeClient{

        public static LP lp;
        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public boolean onShowFileChooser(WebView view,
                                         ValueCallback<Uri[]> filePath,
                                         FileChooserParams fileChooserParams) {
            if (LP.iudytrgs != null) {
                LP.iudytrgs.onReceiveValue(null);
            }
            LP.iudytrgs = filePath;
            Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
            contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
            contentSelectionIntent.setType("*/*");
            Intent[] intentArray = new Intent[0];
            Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
            chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
            chooserIntent.putExtra(Intent.EXTRA_TITLE, LP.ffffd("U2VsZWN0IE9wdGlvbjo="));
            chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
            lp.startActivityForResult(chooserIntent, 1);
            return true;
        }
    }
}