package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfhy implements zzgfp {
    final /* synthetic */ zzchd zza;
    final /* synthetic */ zzcqd zzb;
    final /* synthetic */ zzfoe zzc;
    final /* synthetic */ zzefz zzd;

    public zzfhy(zzchd zzchdVar, zzcqd zzcqdVar, zzfoe zzfoeVar, zzefz zzefzVar) {
        this.zza = zzchdVar;
        this.zzb = zzcqdVar;
        this.zzc = zzfoeVar;
        this.zzd = zzefzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzD().zzaj) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzka)).booleanValue() && this.zzb != null && zzcqd.zzj(str)) {
                this.zzb.zzi(str, this.zzc, com.google.android.gms.ads.internal.client.zzay.zze());
                return;
            } else {
                this.zzc.zzc(str, null);
                return;
            }
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        String str2 = this.zza.zzR().zzb;
        int i9 = 2;
        if (!com.google.android.gms.ads.internal.zzu.zzo().zzA(this.zza.getContext())) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgx)).booleanValue() || !this.zza.zzD().zzT) {
                i9 = 1;
            }
        }
        this.zzd.zzd(new zzegb(currentTimeMillis, str2, str, i9));
    }
}
