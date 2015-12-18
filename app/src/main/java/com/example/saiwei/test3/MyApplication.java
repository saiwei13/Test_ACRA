package com.example.saiwei.test3;

import android.app.Application;

import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;
import org.acra.sender.HttpSender;

/**
 * Created by saiwei on 12/18/15.
 */

@ReportsCrashes(
        httpMethod = HttpSender.Method.PUT,
        reportType = HttpSender.Type.JSON,
        formUri = "http://xxxxxx:5984/acra-myapp/_design/acra-storage/_update/report",
        formUriBasicAuthLogin = "chenwei",
        formUriBasicAuthPassword = "xxxx"
)
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ACRA.init(this);
    }
}
