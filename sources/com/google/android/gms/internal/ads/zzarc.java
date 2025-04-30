package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzarc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzare zzc;

    public zzarc(zzare zzareVar, String str, long j7) {
        this.zza = str;
        this.zzb = j7;
        this.zzc = zzareVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzarp zzarpVar;
        zzarp zzarpVar2;
        zzarpVar = this.zzc.zza;
        zzarpVar.zza(this.zza, this.zzb);
        zzare zzareVar = this.zzc;
        zzarpVar2 = zzareVar.zza;
        zzarpVar2.zzb(zzareVar.toString());
    }
}
