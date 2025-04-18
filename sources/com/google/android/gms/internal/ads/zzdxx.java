package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdxx implements zzgfk {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdxy zzb;

    public zzdxx(zzdxy zzdxyVar, String str) {
        this.zza = str;
        this.zzb = zzdxyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdxm zzdxmVar;
        ((zzdwp) obj).zzf();
        zzdxmVar = this.zzb.zzd;
        zzdxmVar.zzk(this.zza);
    }
}
