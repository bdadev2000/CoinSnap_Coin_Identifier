package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcbe implements Runnable {
    final /* synthetic */ zzcbj zza;

    public zzcbe(zzcbj zzcbjVar) {
        this.zza = zzcbjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbk zzcbkVar;
        zzcbk zzcbkVar2;
        zzcbj zzcbjVar = this.zza;
        zzcbkVar = zzcbjVar.zzq;
        if (zzcbkVar != null) {
            zzcbkVar2 = zzcbjVar.zzq;
            zzcbkVar2.zzh();
        }
    }
}
