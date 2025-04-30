package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcdf implements Runnable {
    final /* synthetic */ zzcdi zza;

    public zzcdf(zzcdi zzcdiVar) {
        this.zza = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdj zzcdjVar;
        zzcdj zzcdjVar2;
        zzcdj zzcdjVar3;
        zzcdi zzcdiVar = this.zza;
        zzcdjVar = zzcdiVar.zzq;
        if (zzcdjVar != null) {
            zzcdjVar2 = zzcdiVar.zzq;
            zzcdjVar2.zzd();
            zzcdjVar3 = this.zza.zzq;
            zzcdjVar3.zzi();
        }
    }
}
