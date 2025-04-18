package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcbh implements Runnable {
    final /* synthetic */ zzcbj zza;

    public zzcbh(zzcbj zzcbjVar) {
        this.zza = zzcbjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbk zzcbkVar;
        boolean z10;
        zzcbk zzcbkVar2;
        zzcbk zzcbkVar3;
        zzcbj zzcbjVar = this.zza;
        zzcbkVar = zzcbjVar.zzq;
        if (zzcbkVar != null) {
            z10 = zzcbjVar.zzr;
            if (!z10) {
                zzcbkVar3 = zzcbjVar.zzq;
                zzcbkVar3.zzg();
                this.zza.zzr = true;
            }
            zzcbkVar2 = this.zza.zzq;
            zzcbkVar2.zze();
        }
    }
}
