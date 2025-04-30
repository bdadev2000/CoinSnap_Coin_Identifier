package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjn implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ Bundle zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ String zzh;
    private final /* synthetic */ zziv zzi;

    public zzjn(zziv zzivVar, String str, String str2, long j7, Bundle bundle, boolean z8, boolean z9, boolean z10, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j7;
        this.zzd = bundle;
        this.zze = z8;
        this.zzf = z9;
        this.zzg = z10;
        this.zzh = str3;
        this.zzi = zzivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzi.zza(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
