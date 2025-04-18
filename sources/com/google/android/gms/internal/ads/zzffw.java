package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzffw implements zzbjr {
    public final /* synthetic */ zzdel zza;
    public final /* synthetic */ zzcnb zzb;
    public final /* synthetic */ zzflr zzc;
    public final /* synthetic */ zzedp zzd;

    public /* synthetic */ zzffw(zzdel zzdelVar, zzcnb zzcnbVar, zzflr zzflrVar, zzedp zzedpVar) {
        this.zza = zzdelVar;
        this.zzb = zzcnbVar;
        this.zzc = zzflrVar;
        this.zzd = zzedpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        zzbjq.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from click GMSG.");
            return;
        }
        zzedp zzedpVar = this.zzd;
        zzflr zzflrVar = this.zzc;
        zzgei.zzr(zzbjq.zza(zzcfkVar, str), new zzffy(zzcfkVar, this.zzb, zzflrVar, zzedpVar), zzcaj.zza);
    }
}
