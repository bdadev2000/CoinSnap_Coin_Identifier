package com.applovin.impl;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ds {
    private final WifiManager a;

    /* renamed from: b, reason: collision with root package name */
    private WifiManager.WifiLock f4377b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4378c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4379d;

    public ds(Context context) {
        this.a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void a(boolean z10) {
        if (z10 && this.f4377b == null) {
            WifiManager wifiManager = this.a;
            if (wifiManager == null) {
                kc.d("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f4377b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.f4378c = z10;
        a();
    }

    public void b(boolean z10) {
        this.f4379d = z10;
        a();
    }

    private void a() {
        WifiManager.WifiLock wifiLock = this.f4377b;
        if (wifiLock == null) {
            return;
        }
        if (this.f4378c && this.f4379d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
