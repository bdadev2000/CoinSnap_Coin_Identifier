package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.ca;
import com.applovin.impl.sj;
import com.applovin.impl.yp;
import com.safedk.android.internal.SafeDKWebAppInterface;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* renamed from: a, reason: collision with root package name */
    final j f26525a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f26526b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f26527c = new AtomicBoolean();
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicLong e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicLong f26528f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    private Date f26529g;

    /* renamed from: h, reason: collision with root package name */
    private Date f26530h;

    /* loaded from: classes2.dex */
    public class a extends com.applovin.impl.p {
        public a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ComponentCallbacks2 {
        public b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i2) {
            SessionTracker.this.d.set(i2);
            if (i2 == 20) {
                SessionTracker.this.a();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (yp.g()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    public SessionTracker(j jVar) {
        this.f26525a = jVar;
        Application application = (Application) j.l();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.f26525a.J();
        if (n.a()) {
            this.f26525a.J().a("SessionTracker", "Application Resumed");
        }
        this.f26528f.set(System.currentTimeMillis());
        boolean booleanValue = ((Boolean) this.f26525a.a(sj.L3)).booleanValue();
        long longValue = ((Long) this.f26525a.a(sj.M3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f26526b.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(longValue);
        if (this.f26530h == null || System.currentTimeMillis() - this.f26530h.getTime() >= millis) {
            this.f26525a.A().trackEvent("resumed");
            if (booleanValue) {
                this.f26530h = new Date();
            }
        }
        if (!booleanValue) {
            this.f26530h = new Date();
        }
        this.f26525a.D().c(ca.f23252p);
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.e.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f26528f.get();
    }

    public int getLastTrimMemoryLevel() {
        return this.d.get();
    }

    public boolean isApplicationPaused() {
        return this.f26527c.get();
    }

    public void pauseForClick() {
        this.f26526b.set(true);
    }

    public void resumeForClick() {
        this.f26526b.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f26527c.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f26527c.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f26525a.J();
        if (n.a()) {
            this.f26525a.J().a("SessionTracker", "Application Paused");
        }
        this.e.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f26526b.get()) {
            return;
        }
        boolean booleanValue = ((Boolean) this.f26525a.a(sj.L3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f26525a.a(sj.N3)).longValue());
        if (this.f26529g == null || System.currentTimeMillis() - this.f26529g.getTime() >= millis) {
            this.f26525a.A().trackEvent(SafeDKWebAppInterface.d);
            if (booleanValue) {
                this.f26529g = new Date();
            }
        }
        if (booleanValue) {
            return;
        }
        this.f26529g = new Date();
    }
}
