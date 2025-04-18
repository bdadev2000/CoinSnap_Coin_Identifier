package com.applovin.impl;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes3.dex */
public abstract class f8 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23827a = android.support.v4.media.d.r(new StringBuilder("ExoPlayerLib/2.15.1 (Linux; Android "), Build.VERSION.RELEASE, ") ExoPlayerLib/2.15.1");

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet f23828b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static String f23829c = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (f8.class) {
            str = f23829c;
        }
        return str;
    }

    public static synchronized void a(String str) {
        synchronized (f8.class) {
            if (f23828b.add(str)) {
                f23829c += ", " + str;
            }
        }
    }
}
