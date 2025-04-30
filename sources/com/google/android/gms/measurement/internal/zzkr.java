package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkr implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzkp zzb;
    private final /* synthetic */ zzkp zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzks zze;

    public zzkr(zzks zzksVar, Bundle bundle, zzkp zzkpVar, zzkp zzkpVar2, long j7) {
        this.zza = bundle;
        this.zzb = zzkpVar;
        this.zzc = zzkpVar2;
        this.zzd = j7;
        this.zze = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
