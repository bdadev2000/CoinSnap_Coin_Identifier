package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class p {
    private static volatile u a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f3348b;

    public static HandlerThread a() {
        if (a == null) {
            synchronized (p.class) {
                if (a == null) {
                    a = new u("default_npth_thread");
                    a.b();
                }
            }
        }
        return a.c();
    }

    public static u b() {
        if (a == null) {
            a();
        }
        return a;
    }
}
