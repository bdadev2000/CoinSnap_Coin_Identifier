package com.applovin.impl;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ds {

    /* renamed from: a, reason: collision with root package name */
    private final WifiManager f7365a;
    private WifiManager.WifiLock b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7366c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7367d;

    public ds(Context context) {
        this.f7365a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void a(boolean z8) {
        if (z8 && this.b == null) {
            WifiManager wifiManager = this.f7365a;
            if (wifiManager == null) {
                kc.d("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.f7366c = z8;
        a();
    }

    public void b(boolean z8) {
        this.f7367d = z8;
        a();
    }

    private void a() {
        WifiManager.WifiLock wifiLock = this.b;
        if (wifiLock == null) {
            return;
        }
        if (this.f7366c && this.f7367d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
