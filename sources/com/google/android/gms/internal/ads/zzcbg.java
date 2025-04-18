package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcbg implements Runnable {
    final /* synthetic */ zzcbj zza;

    public zzcbg(zzcbj zzcbjVar) {
        this.zza = zzcbjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbk zzcbkVar;
        zzcbk zzcbkVar2;
        zzcbk zzcbkVar3;
        zzcbj zzcbjVar = this.zza;
        zzcbkVar = zzcbjVar.zzq;
        if (zzcbkVar != null) {
            zzcbkVar2 = zzcbjVar.zzq;
            zzcbkVar2.zzd();
            zzcbkVar3 = this.zza.zzq;
            zzcbkVar3.zzi();
        }
    }
}
