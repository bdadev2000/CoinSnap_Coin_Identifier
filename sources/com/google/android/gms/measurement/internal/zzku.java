package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzku implements Runnable {
    private final /* synthetic */ zzkp zza;
    private final /* synthetic */ zzkp zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ zzks zze;

    public zzku(zzks zzksVar, zzkp zzkpVar, zzkp zzkpVar2, long j7, boolean z8) {
        this.zza = zzkpVar;
        this.zzb = zzkpVar2;
        this.zzc = j7;
        this.zzd = z8;
        this.zze = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd, (Bundle) null);
    }
}
