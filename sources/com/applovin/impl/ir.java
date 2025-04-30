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
public class ir {

    /* renamed from: f, reason: collision with root package name */
    private static final Set f8340f = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8341a;
    private final com.applovin.impl.sdk.k b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f8342c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f8343d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Timer f8344e;

    /* loaded from: classes.dex */
    public class a extends TimerTask {

        /* renamed from: com.applovin.impl.ir$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0018a implements AppLovinBroadcastManager.Receiver {
            public C0018a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                ir.this.c();
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!ir.this.b.f0().isApplicationPaused() || ir.this.f8341a) {
                ir.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0018a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private ir(long j7, boolean z8, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f8344e = timer;
        if (j7 >= 0) {
            if (kVar != null) {
                if (runnable != null) {
                    this.f8341a = z8;
                    this.b = kVar;
                    this.f8342c = runnable;
                    f8340f.add(this);
                    timer.schedule(b(), j7);
                    return;
                }
                throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
            }
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        throw new IllegalArgumentException(Q7.n0.g(j7, "Cannot create wall clock timer. Invalid timer length: "));
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f8342c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f8343d) {
            this.f8344e.cancel();
            this.f8342c = null;
            f8340f.remove(this);
        }
    }

    public static ir a(long j7, boolean z8, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new ir(j7, z8, kVar, runnable);
    }
}
