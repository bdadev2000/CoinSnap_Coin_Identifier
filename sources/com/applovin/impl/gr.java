package com.applovin.impl;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class gr {

    /* renamed from: a, reason: collision with root package name */
    private final PowerManager f24167a;

    /* renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f24168b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24169c;
    private boolean d;

    public gr(Context context) {
        this.f24167a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z2) {
        if (z2 && this.f24168b == null) {
            PowerManager powerManager = this.f24167a;
            if (powerManager == null) {
                pc.d("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f24168b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.f24169c = z2;
        a();
    }

    public void b(boolean z2) {
        this.d = z2;
        a();
    }

    private void a() {
        PowerManager.WakeLock wakeLock = this.f24168b;
        if (wakeLock == null) {
            return;
        }
        if (this.f24169c && this.d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
