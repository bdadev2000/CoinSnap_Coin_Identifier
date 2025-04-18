package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfjg implements zzgee {
    final /* synthetic */ zzfix zza;
    final /* synthetic */ zzfjh zzb;

    public zzfjg(zzfjh zzfjhVar, zzfix zzfixVar) {
        this.zza = zzfixVar;
        this.zzb = zzfjhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        zzfjk zzfjkVar;
        zzfjkVar = this.zzb.zza.zzd;
        zzfjkVar.zzb(this.zza, th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        zzfjk zzfjkVar;
        zzfjkVar = this.zzb.zza.zzd;
        zzfjkVar.zzd(this.zza);
    }
}
