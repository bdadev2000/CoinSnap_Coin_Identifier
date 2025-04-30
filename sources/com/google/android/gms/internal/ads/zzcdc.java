package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcdc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcdi zzc;

    public zzcdc(zzcdi zzcdiVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcdj zzcdjVar;
        zzcdj zzcdjVar2;
        zzcdi zzcdiVar = this.zzc;
        zzcdjVar = zzcdiVar.zzq;
        if (zzcdjVar != null) {
            String str = this.zza;
            String str2 = this.zzb;
            zzcdjVar2 = zzcdiVar.zzq;
            zzcdjVar2.zzb(str, str2);
        }
    }
}
