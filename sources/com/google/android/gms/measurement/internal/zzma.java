package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes2.dex */
final class zzma implements Runnable {
    private final /* synthetic */ zzlw zza;

    public zzma(zzlw zzlwVar) {
        this.zza = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkx.zza(this.zza.zza, new ComponentName(this.zza.zza.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
