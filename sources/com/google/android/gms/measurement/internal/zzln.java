package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzln implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzlj zzb;

    public zzln(zzlj zzljVar, long j2) {
        this.zza = j2;
        this.zzb = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc().zza(this.zza);
        this.zzb.zza = null;
    }
}
