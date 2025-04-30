package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdqm implements zzgfp {
    final /* synthetic */ zzfgt zza;
    final /* synthetic */ zzfgw zzb;
    final /* synthetic */ zzcqd zzc;
    final /* synthetic */ zzdqs zzd;

    public zzdqm(zzdqs zzdqsVar, zzfgt zzfgtVar, zzfgw zzfgwVar, zzcqd zzcqdVar) {
        this.zza = zzfgtVar;
        this.zzb = zzfgwVar;
        this.zzc = zzcqdVar;
        this.zzd = zzdqsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzefz zzefzVar;
        zzfoe zzfoeVar;
        zzefz zzefzVar2;
        zzdvc zzdvcVar;
        zzchd zzchdVar = (zzchd) obj;
        zzchdVar.zzW(this.zza, this.zzb);
        zzciv zzN = zzchdVar.zzN();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzke)).booleanValue() && zzN != null) {
            zzcqd zzcqdVar = this.zzc;
            zzdqs zzdqsVar = this.zzd;
            zzefzVar = zzdqsVar.zzj;
            zzfoeVar = zzdqsVar.zzk;
            zzN.zzI(zzcqdVar, zzefzVar, zzfoeVar);
            zzcqd zzcqdVar2 = this.zzc;
            zzdqs zzdqsVar2 = this.zzd;
            zzefzVar2 = zzdqsVar2.zzj;
            zzdvcVar = zzdqsVar2.zze;
            zzN.zzK(zzcqdVar2, zzefzVar2, zzdvcVar);
        }
    }
}
