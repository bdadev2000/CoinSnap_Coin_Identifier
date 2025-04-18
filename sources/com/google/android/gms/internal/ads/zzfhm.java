package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
final class zzfhm implements zzgfk {
    final /* synthetic */ zzcfo zza;
    final /* synthetic */ zzcop zzb;
    final /* synthetic */ zzfng zzc;
    final /* synthetic */ zzeey zzd;

    public zzfhm(zzcfo zzcfoVar, zzcop zzcopVar, zzfng zzfngVar, zzeey zzeeyVar) {
        this.zza = zzcfoVar;
        this.zzb = zzcopVar;
        this.zzc = zzfngVar;
        this.zzd = zzeeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzD().zzai) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjG)).booleanValue() && this.zzb != null && zzcop.zzj(str)) {
                this.zzb.zzi(str, this.zzc, com.google.android.gms.ads.internal.client.zzbc.zze());
                return;
            } else {
                this.zzc.zzc(str, null);
                return;
            }
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        String str2 = this.zza.zzR().zzb;
        int i2 = 2;
        if (!com.google.android.gms.ads.internal.zzu.zzo().zzA(this.zza.getContext())) {
            if ((!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfZ)).booleanValue() || !this.zza.zzD().zzS) && this.zza.zzD().zzad == null) {
                i2 = 1;
            }
        }
        this.zzd.zzd(new zzefa(currentTimeMillis, str2, str, i2));
    }
}
