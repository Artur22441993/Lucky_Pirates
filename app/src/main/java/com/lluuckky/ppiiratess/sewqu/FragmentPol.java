package com.lluuckky.ppiiratess.sewqu;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

import java.util.Map;


public class FragmentPol extends Fragment {

    WebView webdad;

    public static String iuybsa;
    public static String iuytvsa = "";
    public static String idbwtda;
    public static String iuycab;
    public static String iuyba = "QURGR2EzZUduWHN5U25KazJ3NXVxZg==";
    public static String iuytvs;
    public static String iusha;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pol, container, false);
        webdad = (WebView) view.findViewById(R.id.webdad);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webdad, true);
        CookieManager.getInstance().setAcceptCookie(true);
        webdad.setVisibility(View.VISIBLE);
        webdad.getSettings().setAllowFileAccessFromFileURLs(true);
        webdad.getSettings().setSavePassword(true);
        webdad.getSettings().setDatabaseEnabled(true);
        webdad.getSettings().setRenderPriority(android.webkit.WebSettings.RenderPriority.HIGH);
        webdad.getSettings().setCacheMode(android.webkit.WebSettings.LOAD_DEFAULT);
        webdad.getSettings().setAppCacheEnabled(true);
        webdad.getSettings().setLoadsImagesAutomatically(true);
        webdad.setSaveEnabled(true);
        webdad.getSettings().setMixedContentMode(0);
        webdad.setFocusable(true);
        webdad.getSettings().setAllowUniversalAccessFromFileURLs(true);
        webdad.getSettings().setJavaScriptEnabled(true);
        webdad.getSettings().setAllowContentAccess(true);
        webdad.getSettings().setLoadWithOverviewMode(true);
        webdad.getSettings().setEnableSmoothTransition(true);
        webdad.getSettings().setUseWideViewPort(true);
        webdad.getSettings().setSaveFormData(true);
        webdad.getSettings().setAllowFileAccess(true);
        webdad.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webdad.getSettings().setDomStorageEnabled(true);
        webdad.setFocusableInTouchMode(true);
        webdad.loadUrl(LP.ffffd("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49SU1tbktyY243eHR0OWliOGZKTGU0cXl3aDBTMzU1cWg="));
        return view;
    }

    public static void yfhs(LP lp){

        FacebookSdk.setApplicationId(FragmentButt.udsba);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(lp.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);

        AppEventsLogger.activateApp(lp.getApplication());
        AppLinkData.fetchDeferredAppLinkData(lp.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {
                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(lp);
                }
                if (appLinkData != null) {
                    Uri url = appLinkData.getTargetUri();
                    iuytvs = url.getQuery();
                    iusha = FragmentOf.pooo(iuytvs,lp.getPackageName(), idbwtda, iuybsa);
                }else {

                }
            }
        });



    }

    public static void isj(Aaaewdsdk aaaewdsdk){

        iuybsa = AppsFlyerLib.getInstance().getAppsFlyerUID(aaaewdsdk.getApplicationContext());
    }
    public static void uyd(Aaaewdsdk aaaewdsdk){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    idbwtda = AdvertisingIdClient.getAdvertisingIdInfo(aaaewdsdk.getApplicationContext()).getId();
                }catch (Exception e){

                }
            }
        }).start();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void ytj(Aaaewdsdk aaaewdsdk){

        AppsFlyerLib.getInstance().init(LP.ffffd(iuyba), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                iuytvsa = map.get(LP.ffffd("YWZfc3RhdHVz")).toString();
                if (iuytvsa.equals(LP.ffffd("Tm9uLW9yZ2FuaWM="))){
                    String str =map.get(LP.ffffd("Y2FtcGFpZ24=")).toString();
                    iuycab = FragmentOf.pooo(str,aaaewdsdk.getPackageName(), idbwtda, iuybsa);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },aaaewdsdk.getApplicationContext());
        AppsFlyerLib.getInstance().start(aaaewdsdk.getApplicationContext());
    }
}