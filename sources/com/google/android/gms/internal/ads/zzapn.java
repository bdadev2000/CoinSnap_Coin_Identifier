package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzapn implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzapp zzc;

    public zzapn(zzapp zzappVar, String str, long j3) {
        this.zza = str;
        this.zzb = j3;
        this.zzc = zzappVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaqa zzaqaVar;
        zzaqa zzaqaVar2;
        zzaqaVar = this.zzc.zza;
        zzaqaVar.zza(this.zza, this.zzb);
        zzapp zzappVar = this.zzc;
        zzaqaVar2 = zzappVar.zza;
        zzaqaVar2.zzb(zzappVar.toString());
    }
}
