package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcbf implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcbj zzc;

    public zzcbf(zzcbj zzcbjVar, int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzcbjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbk zzcbkVar;
        zzcbk zzcbkVar2;
        zzcbj zzcbjVar = this.zzc;
        zzcbkVar = zzcbjVar.zzq;
        if (zzcbkVar != null) {
            int i10 = this.zza;
            int i11 = this.zzb;
            zzcbkVar2 = zzcbjVar.zzq;
            zzcbkVar2.zzj(i10, i11);
        }
    }
}
