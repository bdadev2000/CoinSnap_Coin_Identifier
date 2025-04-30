package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.ho;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.d */
/* loaded from: classes.dex */
public class C0752d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private ho f10778a;
    private final Object b = new Object();

    /* renamed from: c */
    private final AtomicBoolean f10779c = new AtomicBoolean();

    /* renamed from: d */
    private boolean f10780d;

    /* renamed from: f */
    private final k f10781f;

    /* renamed from: g */
    private final WeakReference f10782g;

    /* renamed from: h */
    private long f10783h;

    /* renamed from: com.applovin.impl.sdk.d$a */
    /* loaded from: classes.dex */
    public interface a {
        void onAdRefresh();
    }

    public C0752d(k kVar, a aVar) {
        this.f10782g = new WeakReference(aVar);
        this.f10781f = kVar;
    }

    private void e() {
        if (((Boolean) this.f10781f.a(qe.f10320X6)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f10781f.a(qe.f10320X6)).booleanValue()) {
            synchronized (this.b) {
                try {
                    if (this.f10780d) {
                        this.f10781f.L();
                        if (t.a()) {
                            this.f10781f.L().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                    } else if (this.f10781f.f0().isApplicationPaused()) {
                        this.f10781f.L();
                        if (t.a()) {
                            this.f10781f.L().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                        }
                    } else {
                        ho hoVar = this.f10778a;
                        if (hoVar != null) {
                            hoVar.e();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f10782g.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.b) {
            try {
                ho hoVar = this.f10778a;
                if (hoVar != null) {
                    hoVar.d();
                } else {
                    this.f10781f.L();
                    if (t.a()) {
                        this.f10781f.L().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                    }
                    this.f10779c.set(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void l() {
        synchronized (this.b) {
            try {
                this.f10778a = null;
                if (!((Boolean) this.f10781f.a(qe.f10321Y6)).booleanValue()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void n() {
        synchronized (this.b) {
            try {
                ho hoVar = this.f10778a;
                if (hoVar != null) {
                    hoVar.e();
                } else {
                    this.f10779c.set(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long b() {
        long j7;
        synchronized (this.b) {
            try {
                ho hoVar = this.f10778a;
                if (hoVar != null) {
                    j7 = hoVar.c();
                } else {
                    j7 = -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j7;
    }

    public void c() {
        if (((Boolean) this.f10781f.a(qe.f10319W6)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z8;
        a aVar;
        if (((Boolean) this.f10781f.a(qe.f10319W6)).booleanValue()) {
            synchronized (this.b) {
                try {
                    if (this.f10780d) {
                        this.f10781f.L();
                        if (t.a()) {
                            this.f10781f.L().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                        return;
                    }
                    if (this.f10781f.E().c()) {
                        this.f10781f.L();
                        if (t.a()) {
                            this.f10781f.L().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                        }
                        return;
                    }
                    if (this.f10778a != null) {
                        long b = this.f10783h - b();
                        long longValue = ((Long) this.f10781f.a(qe.f10318V6)).longValue();
                        if (longValue >= 0 && b > longValue) {
                            a();
                            z8 = true;
                            if (!z8 && (aVar = (a) this.f10782g.get()) != null) {
                                aVar.onAdRefresh();
                                return;
                            }
                        }
                        this.f10778a.e();
                    }
                    z8 = false;
                    if (!z8) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean g() {
        return this.f10780d;
    }

    public boolean h() {
        boolean z8;
        synchronized (this.b) {
            if (this.f10778a != null) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    public void j() {
        synchronized (this.b) {
            k();
            this.f10780d = true;
        }
    }

    public void m() {
        synchronized (this.b) {
            n();
            this.f10780d = false;
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

    public void a(long j7) {
        synchronized (this.b) {
            try {
                a();
                this.f10783h = j7;
                this.f10778a = ho.a(j7, this.f10781f, new z(this, 2));
                if (!((Boolean) this.f10781f.a(qe.f10321Y6)).booleanValue()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
                }
                if (((Boolean) this.f10781f.a(qe.f10320X6)).booleanValue() && (this.f10781f.E().c() || this.f10781f.f0().isApplicationPaused())) {
                    this.f10778a.d();
                }
                if (this.f10779c.compareAndSet(true, false) && ((Boolean) this.f10781f.a(qe.f10322Z6)).booleanValue()) {
                    this.f10781f.L();
                    if (t.a()) {
                        this.f10781f.L().a("AdRefreshManager", "Pausing refresh for a previous request.");
                    }
                    this.f10778a.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.b) {
            try {
                ho hoVar = this.f10778a;
                if (hoVar != null) {
                    hoVar.a();
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
