package com.glority.utils;

import android.app.Application;

/* loaded from: classes9.dex */
public final class UtilsApp {
    private static Application app;

    private UtilsApp() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }

    public static Application getApp() {
        Application application = app;
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Sorry, you must call UtilsApp#init() method at first!");
    }

    public static void init(Application application) {
        app = application;
    }
}
