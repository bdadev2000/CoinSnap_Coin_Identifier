package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzfhw implements zzblp {
    public final /* synthetic */ zzdhi zza;
    public final /* synthetic */ zzcqd zzb;
    public final /* synthetic */ zzfoe zzc;
    public final /* synthetic */ zzefz zzd;

    public /* synthetic */ zzfhw(zzdhi zzdhiVar, zzcqd zzcqdVar, zzfoe zzfoeVar, zzefz zzefzVar) {
        this.zza = zzdhiVar;
        this.zzb = zzcqdVar;
        this.zzc = zzfoeVar;
        this.zzd = zzefzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        zzblo.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from click GMSG.");
            return;
        }
        zzefz zzefzVar = this.zzd;
        zzfoe zzfoeVar = this.zzc;
        zzgft.zzr(zzblo.zza(zzchdVar, str), new zzfhy(zzchdVar, this.zzb, zzfoeVar, zzefzVar), zzcci.zza);
    }
}
