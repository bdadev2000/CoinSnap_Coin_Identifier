package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcbd implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcbj zzc;

    public zzcbd(zzcbj zzcbjVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcbjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbk zzcbkVar;
        zzcbk zzcbkVar2;
        zzcbj zzcbjVar = this.zzc;
        zzcbkVar = zzcbjVar.zzq;
        if (zzcbkVar != null) {
            String str = this.zza;
            String str2 = this.zzb;
            zzcbkVar2 = zzcbjVar.zzq;
            zzcbkVar2.zzb(str, str2);
        }
    }
}
