package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
final class zzmj implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzmh zzb;

    public zzmj(zzmh zzmhVar, long j7) {
        this.zza = j7;
        this.zzb = zzmhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmh.zza(this.zzb, this.zza);
    }
}
