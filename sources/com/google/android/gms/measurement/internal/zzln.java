package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzln implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzlj zzb;

    public zzln(zzlj zzljVar, long j3) {
        this.zza = j3;
        this.zzb = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc().zza(this.zza);
        this.zzb.zza = null;
    }
}
