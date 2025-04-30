package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcdg implements Runnable {
    final /* synthetic */ zzcdi zza;

    public zzcdg(zzcdi zzcdiVar) {
        this.zza = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdj zzcdjVar;
        boolean z8;
        zzcdj zzcdjVar2;
        zzcdj zzcdjVar3;
        zzcdi zzcdiVar = this.zza;
        zzcdjVar = zzcdiVar.zzq;
        if (zzcdjVar != null) {
            z8 = zzcdiVar.zzr;
            if (!z8) {
                zzcdjVar3 = zzcdiVar.zzq;
                zzcdjVar3.zzg();
                this.zza.zzr = true;
            }
            zzcdjVar2 = this.zza.zzq;
            zzcdjVar2.zze();
        }
    }
}
