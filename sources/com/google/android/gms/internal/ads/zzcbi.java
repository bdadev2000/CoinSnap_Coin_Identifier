package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcbi implements Runnable {
    final /* synthetic */ zzcbn zza;

    public zzcbi(zzcbn zzcbnVar) {
        this.zza = zzcbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbo zzcboVar;
        zzcbo zzcboVar2;
        zzcbn zzcbnVar = this.zza;
        zzcboVar = zzcbnVar.zzq;
        if (zzcboVar != null) {
            zzcboVar2 = zzcbnVar.zzq;
            zzcboVar2.zzh();
        }
    }
}
