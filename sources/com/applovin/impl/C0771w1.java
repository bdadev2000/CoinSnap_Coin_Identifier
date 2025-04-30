package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.w1 */
/* loaded from: classes.dex */
public class C0771w1 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c */
    private static final Set f11855c = new HashSet();

    /* renamed from: a */
    private final ho f11856a;
    private final com.applovin.impl.sdk.k b;

    private C0771w1(long j7, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f11856a = ho.a(j7, kVar, new P2(1, this, runnable));
        this.b = kVar;
        f11855c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public long b() {
        return this.f11856a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f11856a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f11856a.e();
        }
    }

    public void a() {
        this.f11856a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f11855c.remove(this);
    }

    public /* synthetic */ void a(Runnable runnable) {
        a();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static C0771w1 a(long j7, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new C0771w1(j7, kVar, runnable);
    }
}
