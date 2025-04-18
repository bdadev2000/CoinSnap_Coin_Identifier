package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class x1 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c */
    private static final Set f27822c = new HashSet();

    /* renamed from: a */
    private final go f27823a;

    /* renamed from: b */
    private final com.applovin.impl.sdk.j f27824b;

    private x1(long j2, boolean z2, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        this.f27823a = go.a(j2, z2, jVar, new ut(this, z2, runnable));
        this.f27824b = jVar;
        f27822c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public long b() {
        return this.f27823a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f27823a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f27823a.e();
        }
    }

    public void a() {
        this.f27823a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f27822c.remove(this);
    }

    public static x1 a(long j2, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        return a(j2, false, jVar, runnable);
    }

    public /* synthetic */ void a(boolean z2, Runnable runnable) {
        if (!z2) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static x1 a(long j2, boolean z2, com.applovin.impl.sdk.j jVar, Runnable runnable) {
        return new x1(j2, z2, jVar, runnable);
    }
}
