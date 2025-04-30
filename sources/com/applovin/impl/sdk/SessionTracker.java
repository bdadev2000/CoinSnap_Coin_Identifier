package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.AbstractC0734p;
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

    /* renamed from: a, reason: collision with root package name */
    final k f10722a;
    private final AtomicBoolean b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10723c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f10724d = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f10725e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicLong f10726f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    private Date f10727g;

    /* renamed from: h, reason: collision with root package name */
    private Date f10728h;

    /* loaded from: classes.dex */
    public class a extends AbstractC0734p {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
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
        public void onTrimMemory(int i9) {
            SessionTracker.this.f10724d.set(i9);
            if (i9 == 20) {
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
        this.f10722a = kVar;
        Application application = (Application) k.k();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.f10722a.L();
        if (t.a()) {
            this.f10722a.L().a("SessionTracker", "Application Resumed");
        }
        this.f10726f.set(System.currentTimeMillis());
        boolean booleanValue = ((Boolean) this.f10722a.a(oj.f9565C3)).booleanValue();
        long longValue = ((Long) this.f10722a.a(oj.f9573D3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.b.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(longValue);
        if (this.f10728h == null || System.currentTimeMillis() - this.f10728h.getTime() >= millis) {
            this.f10722a.C().trackEvent("resumed");
            if (booleanValue) {
                this.f10728h = new Date();
            }
        }
        if (!booleanValue) {
            this.f10728h = new Date();
        }
        this.f10722a.F().c(aa.f6606p);
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f10725e.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f10726f.get();
    }

    public int getLastTrimMemoryLevel() {
        return this.f10724d.get();
    }

    public boolean isApplicationPaused() {
        return this.f10723c.get();
    }

    public void pauseForClick() {
        this.b.set(true);
    }

    public void resumeForClick() {
        this.b.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f10723c.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f10723c.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f10722a.L();
        if (t.a()) {
            this.f10722a.L().a("SessionTracker", "Application Paused");
        }
        this.f10725e.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.b.get()) {
            return;
        }
        boolean booleanValue = ((Boolean) this.f10722a.a(oj.f9565C3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f10722a.a(oj.f9581E3)).longValue());
        if (this.f10727g == null || System.currentTimeMillis() - this.f10727g.getTime() >= millis) {
            this.f10722a.C().trackEvent("paused");
            if (booleanValue) {
                this.f10727g = new Date();
            }
        }
        if (booleanValue) {
            return;
        }
        this.f10727g = new Date();
    }
}
