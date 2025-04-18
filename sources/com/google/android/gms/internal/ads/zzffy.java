package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzffy implements zzgee {
    final /* synthetic */ zzcfk zza;
    final /* synthetic */ zzcnb zzb;
    final /* synthetic */ zzflr zzc;
    final /* synthetic */ zzedp zzd;

    public zzffy(zzcfk zzcfkVar, zzcnb zzcnbVar, zzflr zzflrVar, zzedp zzedpVar) {
        this.zza = zzcfkVar;
        this.zzb = zzcnbVar;
        this.zzc = zzflrVar;
        this.zzd = zzedpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzD().zzai) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjI)).booleanValue() && this.zzb != null && zzcnb.zzj(str)) {
                this.zzb.zzi(str, this.zzc, com.google.android.gms.ads.internal.client.zzbc.zze());
                return;
            } else {
                this.zzc.zzc(str, null);
                return;
            }
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        String str2 = this.zza.zzR().zzb;
        int i10 = 2;
        if (!com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza.getContext())) {
            if ((!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzge)).booleanValue() || !this.zza.zzD().zzS) && this.zza.zzD().zzad == null) {
                i10 = 1;
            }
        }
        this.zzd.zzd(new zzedr(currentTimeMillis, str2, str, i10));
    }
}
