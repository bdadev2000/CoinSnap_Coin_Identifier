package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfli implements zzgfp {
    final /* synthetic */ zzfky zza;
    final /* synthetic */ zzflk zzb;

    public zzfli(zzflk zzflkVar, zzfky zzfkyVar) {
        this.zza = zzfkyVar;
        this.zzb = zzflkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        zzflm zzflmVar;
        zzflmVar = this.zzb.zza.zzd;
        zzflmVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zzb(Object obj) {
        zzflm zzflmVar;
        zzflmVar = this.zzb.zza.zzd;
        zzflmVar.zzd(this.zza);
    }
}
