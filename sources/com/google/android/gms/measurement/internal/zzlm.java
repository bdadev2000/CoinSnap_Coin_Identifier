package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes12.dex */
public final class zzlm implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzlk zzb;
    private final /* synthetic */ zzlk zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzlj zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlm(zzlj zzljVar, Bundle bundle, zzlk zzlkVar, zzlk zzlkVar2, long j) {
        this.zza = bundle;
        this.zzb = zzlkVar;
        this.zzc = zzlkVar2;
        this.zzd = j;
        this.zze = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
