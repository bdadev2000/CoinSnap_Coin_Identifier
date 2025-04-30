package com.applovin.impl;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class hr {

    /* renamed from: a, reason: collision with root package name */
    private final PowerManager f8178a;
    private PowerManager.WakeLock b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8179c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8180d;

    public hr(Context context) {
        this.f8178a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z8) {
        if (z8 && this.b == null) {
            PowerManager powerManager = this.f8178a;
            if (powerManager == null) {
                kc.d("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.f8179c = z8;
        a();
    }

    public void b(boolean z8) {
        this.f8180d = z8;
        a();
    }

    private void a() {
        PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock == null) {
            return;
        }
        if (this.f8179c && this.f8180d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
