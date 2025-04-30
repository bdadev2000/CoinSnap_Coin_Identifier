package com.applovin.impl;

import android.os.Build;
import java.util.HashSet;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class d8 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7191a = AbstractC2914a.h(new StringBuilder("ExoPlayerLib/2.15.1 (Linux; Android "), Build.VERSION.RELEASE, ") ExoPlayerLib/2.15.1");
    private static final HashSet b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static String f7192c = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (d8.class) {
            str = f7192c;
        }
        return str;
    }

    public static synchronized void a(String str) {
        synchronized (d8.class) {
            if (b.add(str)) {
                f7192c += ", " + str;
            }
        }
    }
}
