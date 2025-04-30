package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static volatile u f6061a;
    private static volatile Handler b;

    public static HandlerThread a() {
        if (f6061a == null) {
            synchronized (p.class) {
                try {
                    if (f6061a == null) {
                        f6061a = new u("default_npth_thread");
                        f6061a.b();
                    }
                } finally {
                }
            }
        }
        return f6061a.c();
    }

    public static u b() {
        if (f6061a == null) {
            a();
        }
        return f6061a;
    }
}
