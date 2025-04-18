package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcbh implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcbn zzc;

    public zzcbh(zzcbn zzcbnVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbo zzcboVar;
        zzcbo zzcboVar2;
        zzcbn zzcbnVar = this.zzc;
        zzcboVar = zzcbnVar.zzq;
        if (zzcboVar != null) {
            String str = this.zza;
            String str2 = this.zzb;
            zzcboVar2 = zzcbnVar.zzq;
            zzcboVar2.zzb(str, str2);
        }
    }
}
