package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.ho;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class d implements AppLovinBroadcastManager.Receiver {
    private ho a;

    /* renamed from: b */
    private final Object f7637b = new Object();

    /* renamed from: c */
    private final AtomicBoolean f7638c = new AtomicBoolean();

    /* renamed from: d */
    private boolean f7639d;

    /* renamed from: f */
    private final k f7640f;

    /* renamed from: g */
    private final WeakReference f7641g;

    /* renamed from: h */
    private long f7642h;

    /* loaded from: classes.dex */
    public interface a {
        void onAdRefresh();
    }

    public d(k kVar, a aVar) {
        this.f7641g = new WeakReference(aVar);
        this.f7640f = kVar;
    }

    public static /* synthetic */ void a(d dVar) {
        dVar.i();
    }

    private void e() {
        if (((Boolean) this.f7640f.a(qe.X6)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f7640f.a(qe.X6)).booleanValue()) {
            synchronized (this.f7637b) {
                if (this.f7639d) {
                    this.f7640f.L();
                    if (t.a()) {
                        this.f7640f.L().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                } else if (this.f7640f.f0().isApplicationPaused()) {
                    this.f7640f.L();
                    if (t.a()) {
                        this.f7640f.L().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                    }
                } else {
                    ho hoVar = this.a;
                    if (hoVar != null) {
                        hoVar.e();
                    }
                }
            }
        }
    }

    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f7641g.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.f7637b) {
            ho hoVar = this.a;
            if (hoVar != null) {
                hoVar.d();
            } else {
                this.f7640f.L();
                if (t.a()) {
                    this.f7640f.L().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                }
                this.f7638c.set(true);
            }
        }
    }

    private void l() {
        synchronized (this.f7637b) {
            this.a = null;
            if (!((Boolean) this.f7640f.a(qe.Y6)).booleanValue()) {
                AppLovinBroadcastManager.unregisterReceiver(this);
            }
        }
    }

    private void n() {
        synchronized (this.f7637b) {
            ho hoVar = this.a;
            if (hoVar != null) {
                hoVar.e();
            } else {
                this.f7638c.set(false);
            }
        }
    }

    public long b() {
        long j3;
        synchronized (this.f7637b) {
            ho hoVar = this.a;
            if (hoVar != null) {
                j3 = hoVar.c();
            } else {
                j3 = -1;
            }
        }
        return j3;
    }

    public void c() {
        if (((Boolean) this.f7640f.a(qe.W6)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z10;
        a aVar;
        if (((Boolean) this.f7640f.a(qe.W6)).booleanValue()) {
            synchronized (this.f7637b) {
                if (this.f7639d) {
                    this.f7640f.L();
                    if (t.a()) {
                        this.f7640f.L().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                    }
                    return;
                }
                if (this.f7640f.E().c()) {
                    this.f7640f.L();
                    if (t.a()) {
                        this.f7640f.L().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                    }
                    return;
                }
                if (this.a != null) {
                    long b3 = this.f7642h - b();
                    long longValue = ((Long) this.f7640f.a(qe.V6)).longValue();
                    if (longValue >= 0 && b3 > longValue) {
                        a();
                        z10 = true;
                        if (!z10 && (aVar = (a) this.f7641g.get()) != null) {
                            aVar.onAdRefresh();
                            return;
                        }
                    }
                    this.a.e();
                }
                z10 = false;
                if (!z10) {
                }
            }
        }
    }

    public boolean g() {
        return this.f7639d;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f7637b) {
            if (this.a != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public void j() {
        synchronized (this.f7637b) {
            k();
            this.f7639d = true;
        }
    }

    public void m() {
        synchronized (this.f7637b) {
            n();
            this.f7639d = false;
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

    public void a(long j3) {
        synchronized (this.f7637b) {
            a();
            this.f7642h = j3;
            this.a = ho.a(j3, this.f7640f, new z(this, 2));
            if (!((Boolean) this.f7640f.a(qe.Y6)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f7640f.a(qe.X6)).booleanValue() && (this.f7640f.E().c() || this.f7640f.f0().isApplicationPaused())) {
                this.a.d();
            }
            if (this.f7638c.compareAndSet(true, false) && ((Boolean) this.f7640f.a(qe.Z6)).booleanValue()) {
                this.f7640f.L();
                if (t.a()) {
                    this.f7640f.L().a("AdRefreshManager", "Pausing refresh for a previous request.");
                }
                this.a.d();
            }
        }
    }

    public void a() {
        synchronized (this.f7637b) {
            ho hoVar = this.a;
            if (hoVar != null) {
                hoVar.a();
                l();
            }
        }
    }
}
