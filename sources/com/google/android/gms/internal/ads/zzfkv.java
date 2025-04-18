package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzfkv implements zzgfk {
    final /* synthetic */ zzfkl zza;
    final /* synthetic */ zzfkx zzb;

    public zzfkv(zzfkx zzfkxVar, zzfkl zzfklVar) {
        this.zza = zzfklVar;
        this.zzb = zzfkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
        zzfkz zzfkzVar;
        zzfkzVar = this.zzb.zza.zzd;
        zzfkzVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zzb(Object obj) {
        zzfkz zzfkzVar;
        zzfkzVar = this.zzb.zza.zzd;
        zzfkzVar.zzd(this.zza);
    }
}
