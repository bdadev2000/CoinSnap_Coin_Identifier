package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcbc implements Runnable {
    final /* synthetic */ zzcbj zza;

    public zzcbc(zzcbj zzcbjVar) {
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
            zzcbkVar2.zza();
        }
    }
}
