package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkp implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ String zzb = null;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ zzjq zzf;

    public zzkp(zzjq zzjqVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.zza = atomicReference;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = zzjqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zzu.zzr().zza(this.zza, null, this.zzc, this.zzd, this.zze);
    }
}
