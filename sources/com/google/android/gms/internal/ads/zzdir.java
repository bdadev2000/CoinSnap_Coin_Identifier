package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdir implements zzgee {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdit zzb;

    public zzdir(zzdit zzditVar, String str, boolean z10) {
        this.zzb = zzditVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfl)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdiy zzdiyVar;
        zzdiy zzdiyVar2;
        zzdiyVar = this.zzb.zze;
        zzdiyVar.zzT((zzcfk) obj);
        zzdit zzditVar = this.zzb;
        zzdiyVar2 = zzditVar.zze;
        zzcao zzp = zzdiyVar2.zzp();
        zzeew zzf = zzditVar.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
