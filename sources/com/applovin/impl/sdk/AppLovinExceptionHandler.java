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
    private static final AppLovinExceptionHandler f7534d = new AppLovinExceptionHandler();
    private final Set a = new HashSet(2);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f7535b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f7536c;

    public static AppLovinExceptionHandler shared() {
        return f7534d;
    }

    public void addSdk(k kVar) {
        if (this.a.contains(kVar)) {
            return;
        }
        this.a.add(kVar);
    }

    public void enable() {
        if (this.f7535b.compareAndSet(false, true)) {
            this.f7536c = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        long j3 = 500;
        for (k kVar : this.a) {
            kVar.L();
            if (t.a()) {
                kVar.L().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            kVar.B().a(o.b.CRASH, CollectionUtils.map("top_main_method", th2.toString()));
            kVar.C().trackEventSynchronously("paused");
            j3 = ((Long) kVar.a(oj.f6782w3)).longValue();
        }
        try {
            Thread.sleep(j3);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7536c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
