package com.google.android.gms.measurement.internal;

/* loaded from: classes4.dex */
final class zzne implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zznb zzb;

    public zzne(zznb zznbVar, long j2) {
        this.zza = j2;
        this.zzb = zznbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznb.zzb(this.zzb, this.zza);
    }
}
