package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.go;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.ve;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private go f26589a;

    /* renamed from: b */
    private final Object f26590b = new Object();

    /* renamed from: c */
    private final AtomicBoolean f26591c = new AtomicBoolean();
    private boolean d;

    /* renamed from: f */
    private final j f26592f;

    /* renamed from: g */
    private final WeakReference f26593g;

    /* renamed from: h */
    private long f26594h;

    /* loaded from: classes.dex */
    public interface a {
        void onAdRefresh();
    }

    public d(j jVar, a aVar) {
        this.f26593g = new WeakReference(aVar);
        this.f26592f = jVar;
    }

    private void e() {
        if (((Boolean) this.f26592f.a(ve.f7)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f26592f.a(ve.f7)).booleanValue()) {
            synchronized (this.f26590b) {
                try {
                    if (this.d) {
                        this.f26592f.J();
                        if (n.a()) {
                            this.f26592f.J().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                    } else if (this.f26592f.f0().isApplicationPaused()) {
                        this.f26592f.J();
                        if (n.a()) {
                            this.f26592f.J().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                        }
                    } else {
                        go goVar = this.f26589a;
                        if (goVar != null) {
                            goVar.e();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f26593g.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.f26590b) {
            try {
                go goVar = this.f26589a;
                if (goVar != null) {
                    goVar.d();
                } else {
                    this.f26592f.J();
                    if (n.a()) {
                        this.f26592f.J().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                    }
                    this.f26591c.set(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        synchronized (this.f26590b) {
            try {
                this.f26589a = null;
                if (!((Boolean) this.f26592f.a(ve.g7)).booleanValue()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n() {
        synchronized (this.f26590b) {
            try {
                go goVar = this.f26589a;
                if (goVar != null) {
                    goVar.e();
                } else {
                    this.f26591c.set(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        long c2;
        synchronized (this.f26590b) {
            try {
                go goVar = this.f26589a;
                c2 = goVar != null ? goVar.c() : -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2;
    }

    public void c() {
        if (((Boolean) this.f26592f.a(ve.e7)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z2;
        a aVar;
        if (((Boolean) this.f26592f.a(ve.e7)).booleanValue()) {
            synchronized (this.f26590b) {
                try {
                    if (this.d) {
                        this.f26592f.J();
                        if (n.a()) {
                            this.f26592f.J().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                        return;
                    }
                    if (this.f26592f.C().c()) {
                        this.f26592f.J();
                        if (n.a()) {
                            this.f26592f.J().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                        }
                        return;
                    }
                    if (this.f26589a != null) {
                        long b2 = this.f26594h - b();
                        long longValue = ((Long) this.f26592f.a(ve.d7)).longValue();
                        if (longValue >= 0 && b2 > longValue) {
                            a();
                            z2 = true;
                            if (z2 || (aVar = (a) this.f26593g.get()) == null) {
                            }
                            aVar.onAdRefresh();
                            return;
                        }
                        this.f26589a.e();
                    }
                    z2 = false;
                    if (z2) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean g() {
        return this.d;
    }

    public boolean h() {
        boolean z2;
        synchronized (this.f26590b) {
            z2 = this.f26589a != null;
        }
        return z2;
    }

    public void j() {
        synchronized (this.f26590b) {
            k();
            this.d = true;
        }
    }

    public void m() {
        synchronized (this.f26590b) {
            n();
            this.d = false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a(long j2) {
        synchronized (this.f26590b) {
            try {
                a();
                this.f26594h = j2;
                this.f26589a = go.a(j2, this.f26592f, new s(this, 2));
                if (!((Boolean) this.f26592f.a(ve.g7)).booleanValue()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
                }
                if (((Boolean) this.f26592f.a(ve.f7)).booleanValue() && (this.f26592f.C().c() || this.f26592f.f0().isApplicationPaused())) {
                    this.f26589a.d();
                }
                if (this.f26591c.compareAndSet(true, false) && ((Boolean) this.f26592f.a(ve.h7)).booleanValue()) {
                    this.f26592f.J();
                    if (n.a()) {
                        this.f26592f.J().a("AdRefreshManager", "Pausing refresh for a previous request.");
                    }
                    this.f26589a.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.f26590b) {
            try {
                go goVar = this.f26589a;
                if (goVar != null) {
                    goVar.a();
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
