package com.applovin.impl;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class hr {
    private final PowerManager a;

    /* renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f5200b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5201c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5202d;

    public hr(Context context) {
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z10) {
        if (z10 && this.f5200b == null) {
            PowerManager powerManager = this.a;
            if (powerManager == null) {
                kc.d("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f5200b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.f5201c = z10;
        a();
    }

    public void b(boolean z10) {
        this.f5202d = z10;
        a();
    }

    private void a() {
        PowerManager.WakeLock wakeLock = this.f5200b;
        if (wakeLock == null) {
            return;
        }
        if (this.f5201c && this.f5202d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
