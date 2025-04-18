package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdnw implements zzgee {
    final /* synthetic */ zzfet zza;
    final /* synthetic */ zzfew zzb;
    final /* synthetic */ zzcnb zzc;
    final /* synthetic */ zzdoc zzd;

    public zzdnw(zzdoc zzdocVar, zzfet zzfetVar, zzfew zzfewVar, zzcnb zzcnbVar) {
        this.zza = zzfetVar;
        this.zzb = zzfewVar;
        this.zzc = zzcnbVar;
        this.zzd = zzdocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzedp zzedpVar;
        zzflr zzflrVar;
        zzedp zzedpVar2;
        zzdsm zzdsmVar;
        zzcfk zzcfkVar = (zzcfk) obj;
        zzcfkVar.zzW(this.zza, this.zzb);
        zzchc zzN = zzcfkVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjM)).booleanValue() && zzN != null) {
            zzcnb zzcnbVar = this.zzc;
            zzdoc zzdocVar = this.zzd;
            zzedpVar = zzdocVar.zzi;
            zzflrVar = zzdocVar.zzj;
            zzN.zzJ(zzcnbVar, zzedpVar, zzflrVar);
            zzcnb zzcnbVar2 = this.zzc;
            zzdoc zzdocVar2 = this.zzd;
            zzedpVar2 = zzdocVar2.zzi;
            zzdsmVar = zzdocVar2.zzd;
            zzN.zzL(zzcnbVar2, zzedpVar2, zzdsmVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmH)).booleanValue() && zzN != null) {
            zzN.zzM(this.zza);
        }
    }
}
