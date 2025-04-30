package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzlz implements Runnable {
    private final /* synthetic */ zzlw zza;

    public zzlz(zzlw zzlwVar) {
        this.zza = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zzb = null;
        this.zza.zza.zzap();
    }
}
