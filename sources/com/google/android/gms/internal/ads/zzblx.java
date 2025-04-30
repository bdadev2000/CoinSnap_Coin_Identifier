package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class zzblx implements zzgfp {
    final /* synthetic */ Map zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbmb zzd;

    public zzblx(zzbmb zzbmbVar, Map map, com.google.android.gms.ads.internal.client.zza zzaVar, String str) {
        this.zza = map;
        this.zzb = zzaVar;
        this.zzc = str;
        this.zzd = zzbmbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkb)).booleanValue()) {
            this.zza.put("u", str);
        }
        this.zzd.zzh(str, this.zzb, this.zza, this.zzc);
    }
}
