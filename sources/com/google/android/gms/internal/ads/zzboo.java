package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzboo implements zzcaw {
    final /* synthetic */ zzbnt zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcas zzc;
    final /* synthetic */ zzbor zzd;

    public zzboo(zzbor zzborVar, zzbnt zzbntVar, Object obj, zzcas zzcasVar) {
        this.zza = zzbntVar;
        this.zzb = obj;
        this.zzc = zzcasVar;
        this.zzd = zzborVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcas zzcasVar = this.zzc;
        zzbor.zzd(this.zzd, this.zza, (zzboa) obj, obj2, zzcasVar);
    }
}
