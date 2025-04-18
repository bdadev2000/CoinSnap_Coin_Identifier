package com.applovin.impl;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class d8 {
    public static final String a = vd.e.h(new StringBuilder("ExoPlayerLib/2.15.1 (Linux; Android "), Build.VERSION.RELEASE, ") ExoPlayerLib/2.15.1");

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet f4216b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static String f4217c = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (d8.class) {
            str = f4217c;
        }
        return str;
    }

    public static synchronized void a(String str) {
        synchronized (d8.class) {
            if (f4216b.add(str)) {
                f4217c += ", " + str;
            }
        }
    }
}
