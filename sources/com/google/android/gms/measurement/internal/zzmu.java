package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes3.dex */
final class zzmu implements Runnable {
    private final /* synthetic */ zzmq zza;

    public zzmu(zzmq zzmqVar) {
        this.zza = zzmqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzls.zza(this.zza.zza, new ComponentName(this.zza.zza.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
