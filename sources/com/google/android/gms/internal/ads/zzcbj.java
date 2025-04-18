package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzcbj implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcbn zzc;

    public zzcbj(zzcbn zzcbnVar, int i2, int i3) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = zzcbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbo zzcboVar;
        zzcbo zzcboVar2;
        zzcbn zzcbnVar = this.zzc;
        zzcboVar = zzcbnVar.zzq;
        if (zzcboVar != null) {
            int i2 = this.zza;
            int i3 = this.zzb;
            zzcboVar2 = zzcbnVar.zzq;
            zzcboVar2.zzj(i2, i3);
        }
    }
}
