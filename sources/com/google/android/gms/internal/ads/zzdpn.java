package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdpn implements zzgfk {
    final /* synthetic */ zzfgh zza;
    final /* synthetic */ zzfgk zzb;
    final /* synthetic */ zzcop zzc;
    final /* synthetic */ zzdpt zzd;

    public zzdpn(zzdpt zzdptVar, zzfgh zzfghVar, zzfgk zzfgkVar, zzcop zzcopVar) {
        this.zza = zzfghVar;
        this.zzb = zzfgkVar;
        this.zzc = zzcopVar;
        this.zzd = zzdptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeey zzeeyVar;
        zzfng zzfngVar;
        zzeey zzeeyVar2;
        zzdud zzdudVar;
        zzcfo zzcfoVar = (zzcfo) obj;
        zzcfoVar.zzW(this.zza, this.zzb);
        zzchg zzN = zzcfoVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjK)).booleanValue() && zzN != null) {
            zzcop zzcopVar = this.zzc;
            zzdpt zzdptVar = this.zzd;
            zzeeyVar = zzdptVar.zzi;
            zzfngVar = zzdptVar.zzj;
            zzN.zzI(zzcopVar, zzeeyVar, zzfngVar);
            zzcop zzcopVar2 = this.zzc;
            zzdpt zzdptVar2 = this.zzd;
            zzeeyVar2 = zzdptVar2.zzi;
            zzdudVar = zzdptVar2.zzd;
            zzN.zzK(zzcopVar2, zzeeyVar2, zzdudVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzmA)).booleanValue() || zzN == null) {
            return;
        }
        zzN.zzL(this.zza);
    }
}
