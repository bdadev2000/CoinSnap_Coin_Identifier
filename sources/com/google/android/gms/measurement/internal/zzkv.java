package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzkv implements Runnable {
    private final /* synthetic */ Boolean zza;
    private final /* synthetic */ zzjq zzb;

    public zzkv(zzjq zzjqVar, Boolean bool) {
        this.zza = bool;
        this.zzb = zzjqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza, true);
    }
}
