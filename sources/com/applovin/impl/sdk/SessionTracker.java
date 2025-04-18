package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.aa;
import com.applovin.impl.oj;
import com.applovin.impl.zp;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";
    final k a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f7571b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f7572c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f7573d = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f7574e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicLong f7575f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    private Date f7576g;

    /* renamed from: h, reason: collision with root package name */
    private Date f7577h;

    /* loaded from: classes.dex */
    public class a extends com.applovin.impl.p {
        public a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    /* loaded from: classes.dex */
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
        public void onTrimMemory(int i10) {
            SessionTracker.this.f7573d.set(i10);
            if (i10 == 20) {
                SessionTracker.this.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (zp.g()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    public SessionTracker(k kVar) {
        this.a = kVar;
        Application application = (Application) k.k();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.a.L();
        if (t.a()) {
            this.a.L().a("SessionTracker", "Application Resumed");
        }
        this.f7575f.set(System.currentTimeMillis());
        boolean booleanValue = ((Boolean) this.a.a(oj.C3)).booleanValue();
        long longValue = ((Long) this.a.a(oj.D3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f7571b.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(longValue);
        if (this.f7577h == null || System.currentTimeMillis() - this.f7577h.getTime() >= millis) {
            this.a.C().trackEvent("resumed");
            if (booleanValue) {
                this.f7577h = new Date();
            }
        }
        if (!booleanValue) {
            this.f7577h = new Date();
        }
        this.a.F().c(aa.f3626p);
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f7574e.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f7575f.get();
    }

    public int getLastTrimMemoryLevel() {
        return this.f7573d.get();
    }

    public boolean isApplicationPaused() {
        return this.f7572c.get();
    }

    public void pauseForClick() {
        this.f7571b.set(true);
    }

    public void resumeForClick() {
        this.f7571b.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f7572c.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f7572c.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.a.L();
        if (t.a()) {
            this.a.L().a("SessionTracker", "Application Paused");
        }
        this.f7574e.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f7571b.get()) {
            return;
        }
        boolean booleanValue = ((Boolean) this.a.a(oj.C3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.a.a(oj.E3)).longValue());
        if (this.f7576g == null || System.currentTimeMillis() - this.f7576g.getTime() >= millis) {
            this.a.C().trackEvent("paused");
            if (booleanValue) {
                this.f7576g = new Date();
            }
        }
        if (booleanValue) {
            return;
        }
        this.f7576g = new Date();
    }
}
