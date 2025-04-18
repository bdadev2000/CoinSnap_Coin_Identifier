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
    private static final Set f5375f = new HashSet();
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f5376b;

    /* renamed from: c, reason: collision with root package name */
    private Runnable f5377c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f5378d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Timer f5379e;

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
            if (!ir.this.f5376b.f0().isApplicationPaused() || ir.this.a) {
                ir.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0018a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private ir(long j3, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f5379e = timer;
        if (j3 >= 0) {
            if (kVar != null) {
                if (runnable != null) {
                    this.a = z10;
                    this.f5376b = kVar;
                    this.f5377c = runnable;
                    f5375f.add(this);
                    timer.schedule(b(), j3);
                    return;
                }
                throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
            }
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Cannot create wall clock timer. Invalid timer length: ", j3));
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f5377c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f5378d) {
            this.f5379e.cancel();
            this.f5377c = null;
            f5375f.remove(this);
        }
    }

    public static ir a(long j3, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new ir(j3, z10, kVar, runnable);
    }
}
