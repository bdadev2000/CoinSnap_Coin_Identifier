package com.applovin.impl.sdk;

import android.os.Process;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: d, reason: collision with root package name */
    private static final AppLovinExceptionHandler f10672d = new AppLovinExceptionHandler();

    /* renamed from: a, reason: collision with root package name */
    private final Set f10673a = new HashSet(2);
    private final AtomicBoolean b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f10674c;

    public static AppLovinExceptionHandler shared() {
        return f10672d;
    }

    public void addSdk(k kVar) {
        if (this.f10673a.contains(kVar)) {
            return;
        }
        this.f10673a.add(kVar);
    }

    public void enable() {
        if (this.b.compareAndSet(false, true)) {
            this.f10674c = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        long j7 = 500;
        for (k kVar : this.f10673a) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            kVar.B().a(o.b.CRASH, CollectionUtils.map("top_main_method", th.toString()));
            kVar.C().trackEventSynchronously("paused");
            j7 = ((Long) kVar.a(oj.f9875w3)).longValue();
        }
        try {
            Thread.sleep(j7);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f10674c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
