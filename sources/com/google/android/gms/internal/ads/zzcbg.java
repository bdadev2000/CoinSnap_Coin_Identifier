package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcbg implements Runnable {
    final /* synthetic */ zzcbn zza;

    public zzcbg(zzcbn zzcbnVar) {
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
            zzcboVar2.zza();
        }
    }
}
