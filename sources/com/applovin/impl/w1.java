package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class w1 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c */
    private static final Set f8647c = new HashSet();
    private final ho a;

    /* renamed from: b */
    private final com.applovin.impl.sdk.k f8648b;

    private w1(long j3, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.a = ho.a(j3, kVar, new zv(1, this, runnable));
        this.f8648b = kVar;
        f8647c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public static /* synthetic */ void a(w1 w1Var, Runnable runnable) {
        w1Var.a(runnable);
    }

    public long b() {
        return this.a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.a.e();
        }
    }

    public void a() {
        this.a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f8647c.remove(this);
    }

    public /* synthetic */ void a(Runnable runnable) {
        a();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static w1 a(long j3, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new w1(j3, kVar, runnable);
    }
}
