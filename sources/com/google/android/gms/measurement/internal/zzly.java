package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* loaded from: classes2.dex */
final class zzly implements Runnable {
    private final /* synthetic */ ComponentName zza;
    private final /* synthetic */ zzlw zzb;

    public zzly(zzlw zzlwVar, ComponentName componentName) {
        this.zza = componentName;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkx.zza(this.zzb.zza, this.zza);
    }
}
