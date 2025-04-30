package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcde implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcdi zzc;

    public zzcde(zzcdi zzcdiVar, int i9, int i10) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdj zzcdjVar;
        zzcdj zzcdjVar2;
        zzcdi zzcdiVar = this.zzc;
        zzcdjVar = zzcdiVar.zzq;
        if (zzcdjVar != null) {
            int i9 = this.zza;
            int i10 = this.zzb;
            zzcdjVar2 = zzcdiVar.zzq;
            zzcdjVar2.zzj(i9, i10);
        }
    }
}
