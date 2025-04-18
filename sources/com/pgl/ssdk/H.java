package com.pgl.ssdk;

import java.lang.Thread;

/* loaded from: classes4.dex */
public class H implements Thread.UncaughtExceptionHandler {

    /* renamed from: c, reason: collision with root package name */
    private static volatile H f16520c;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f16521b = false;
    private final Thread.UncaughtExceptionHandler a = Thread.getDefaultUncaughtExceptionHandler();

    private H() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static H b() {
        if (f16520c == null) {
            synchronized (H.class) {
                if (f16520c == null) {
                    f16520c = new H();
                }
            }
        }
        return f16520c;
    }

    public boolean a() {
        return this.f16521b;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.f16521b = true;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
