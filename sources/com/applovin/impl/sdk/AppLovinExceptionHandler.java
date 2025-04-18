package com.applovin.impl.sdk;

import android.os.Process;
import com.applovin.impl.la;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sj;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final AppLovinExceptionHandler d = new AppLovinExceptionHandler();

    /* renamed from: a, reason: collision with root package name */
    private final Set f26505a = new HashSet(2);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f26506b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f26507c;

    public static AppLovinExceptionHandler shared() {
        return d;
    }

    public void addSdk(j jVar) {
        if (this.f26505a.contains(jVar)) {
            return;
        }
        this.f26505a.add(jVar);
    }

    public void enable() {
        if (this.f26506b.compareAndSet(false, true)) {
            this.f26507c = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        long j2 = 500;
        for (j jVar : this.f26505a) {
            jVar.J();
            if (n.a()) {
                jVar.J().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            jVar.E().a(la.J, CollectionUtils.map("top_main_method", th.toString()));
            jVar.A().trackEventSynchronously(SafeDKWebAppInterface.d);
            j2 = ((Long) jVar.a(sj.F3)).longValue();
        }
        try {
            Thread.sleep(j2);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f26507c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
