package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcbl implements Runnable {
    final /* synthetic */ zzcbn zza;

    public zzcbl(zzcbn zzcbnVar) {
        this.zza = zzcbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbo zzcboVar;
        boolean z2;
        zzcbo zzcboVar2;
        zzcbo zzcboVar3;
        zzcbn zzcbnVar = this.zza;
        zzcboVar = zzcbnVar.zzq;
        if (zzcboVar != null) {
            z2 = zzcbnVar.zzr;
            if (!z2) {
                zzcboVar3 = zzcbnVar.zzq;
                zzcboVar3.zzg();
                this.zza.zzr = true;
            }
            zzcboVar2 = this.zza.zzq;
            zzcboVar2.zze();
        }
    }
}
