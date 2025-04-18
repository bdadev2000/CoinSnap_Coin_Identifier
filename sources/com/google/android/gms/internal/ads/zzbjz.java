package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzbjz implements zzgee {
    final /* synthetic */ Map zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbkd zzd;

    public zzbjz(zzbkd zzbkdVar, Map map, com.google.android.gms.ads.internal.client.zza zzaVar, String str) {
        this.zza = map;
        this.zzb = zzaVar;
        this.zzc = str;
        this.zzd = zzbkdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjJ)).booleanValue()) {
            this.zza.put("u", str);
        }
        this.zzd.zzh(str, this.zzb, this.zza, this.zzc);
    }
}
