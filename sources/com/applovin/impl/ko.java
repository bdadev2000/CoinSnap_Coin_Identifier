package com.applovin.impl;

import android.os.Trace;

/* loaded from: classes.dex */
public abstract class ko {
    public static void a(String str) {
        if (xp.f27962a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    private static void b() {
        Trace.endSection();
    }

    public static void a() {
        if (xp.f27962a >= 18) {
            b();
        }
    }
}
