package com.applovin.impl;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class cs {

    /* renamed from: a, reason: collision with root package name */
    private final WifiManager f23374a;

    /* renamed from: b, reason: collision with root package name */
    private WifiManager.WifiLock f23375b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23376c;
    private boolean d;

    public cs(Context context) {
        this.f23374a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void a(boolean z2) {
        if (z2 && this.f23375b == null) {
            WifiManager wifiManager = this.f23374a;
            if (wifiManager == null) {
                pc.d("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f23375b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.f23376c = z2;
        a();
    }

    public void b(boolean z2) {
        this.d = z2;
        a();
    }

    private void a() {
        WifiManager.WifiLock wifiLock = this.f23375b;
        if (wifiLock == null) {
            return;
        }
        if (this.f23376c && this.d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
