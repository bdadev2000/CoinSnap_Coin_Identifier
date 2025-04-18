package com.google.android.gms.measurement.internal;

/* loaded from: classes4.dex */
final class zznd implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zznb zzb;

    public zznd(zznb zznbVar, long j2) {
        this.zza = j2;
        this.zzb = zznbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznb.zza(this.zzb, this.zza);
    }
}
