package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class hr {

    /* renamed from: f, reason: collision with root package name */
    private static final Set f24352f = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24353a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f24354b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f24355c;
    private final Object d = new Object();
    private final Timer e;

    /* loaded from: classes.dex */
    public class a extends TimerTask {

        /* renamed from: com.applovin.impl.hr$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0080a implements AppLovinBroadcastManager.Receiver {
            public C0080a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                hr.this.c();
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!hr.this.f24354b.f0().isApplicationPaused() || hr.this.f24353a) {
                hr.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0080a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private hr(long j2, boolean z2, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        Timer timer = new Timer();
        this.e = timer;
        if (j2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.d.m("Cannot create wall clock timer. Invalid timer length: ", j2));
        }
        if (jVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.f24353a = z2;
        this.f24354b = jVar;
        this.f24355c = runnable;
        f24352f.add(this);
        timer.schedule(b(), j2);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f24355c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.d) {
            this.e.cancel();
            this.f24355c = null;
            f24352f.remove(this);
        }
    }

    public static hr a(long j2, boolean z2, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        return new hr(j2, z2, jVar, runnable);
    }
}
