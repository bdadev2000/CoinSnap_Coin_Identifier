package com.pgl.ssdk;

import java.lang.Thread;

/* loaded from: classes3.dex */
public class G implements Thread.UncaughtExceptionHandler {

    /* renamed from: c, reason: collision with root package name */
    private static volatile G f19537c;
    private volatile boolean b = false;

    /* renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f19538a = Thread.getDefaultUncaughtExceptionHandler();

    private G() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static G b() {
        if (f19537c == null) {
            synchronized (G.class) {
                try {
                    if (f19537c == null) {
                        f19537c = new G();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19537c;
    }

    public boolean a() {
        return this.b;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.b = true;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f19538a;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
