package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzboj implements zzcas {
    final /* synthetic */ zzbno zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcao zzc;
    final /* synthetic */ zzbom zzd;

    public zzboj(zzbom zzbomVar, zzbno zzbnoVar, Object obj, zzcao zzcaoVar) {
        this.zza = zzbnoVar;
        this.zzb = obj;
        this.zzc = zzcaoVar;
        this.zzd = zzbomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcao zzcaoVar = this.zzc;
        zzbom.zzd(this.zzd, this.zza, (zzbnv) obj, obj2, zzcaoVar);
    }
}
