package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaqa implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzaqc zzc;

    public zzaqa(zzaqc zzaqcVar, String str, long j2) {
        this.zza = str;
        this.zzb = j2;
        this.zzc = zzaqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaqn zzaqnVar;
        zzaqn zzaqnVar2;
        zzaqnVar = this.zzc.zza;
        zzaqnVar.zza(this.zza, this.zzb);
        zzaqc zzaqcVar = this.zzc;
        zzaqnVar2 = zzaqcVar.zza;
        zzaqnVar2.zzb(zzaqcVar.toString());
    }
}
