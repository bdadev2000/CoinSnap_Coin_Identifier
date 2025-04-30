package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdyv implements zzgfp {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdyx zzb;

    public zzdyv(zzdyx zzdyxVar, String str) {
        this.zza = str;
        this.zzb = zzdyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdyl zzdylVar;
        ((zzdxo) obj).zze();
        zzdylVar = this.zzb.zzd;
        zzdylVar.zzk(this.zza);
    }
}
