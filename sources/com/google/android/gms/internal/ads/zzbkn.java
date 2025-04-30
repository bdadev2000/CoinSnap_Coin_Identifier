package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzbkn implements zzblp {
    public final /* synthetic */ zzdhi zza;
    public final /* synthetic */ zzcqd zzb;

    public /* synthetic */ zzbkn(zzdhi zzdhiVar, zzcqd zzcqdVar) {
        this.zza = zzdhiVar;
        this.zzb = zzcqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        zzblo.zzc(map, this.zza);
        final String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from click GMSG.");
            return;
        }
        final zzcqd zzcqdVar = this.zzb;
        zzgfk zzu = zzgfk.zzu(zzblo.zza(zzchdVar, str));
        zzgfa zzgfaVar = new zzgfa() { // from class: com.google.android.gms.internal.ads.zzbkp
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj2) {
                zzcqd zzcqdVar2;
                String str2 = (String) obj2;
                zzblp zzblpVar = zzblo.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzka)).booleanValue() && (zzcqdVar2 = zzcqd.this) != null && zzcqd.zzj(str)) {
                    return zzcqdVar2.zzb(str2, com.google.android.gms.ads.internal.client.zzay.zze());
                }
                return zzgft.zzh(str2);
            }
        };
        zzgge zzggeVar = zzcci.zza;
        zzgft.zzr(zzgft.zzn(zzu, zzgfaVar, zzggeVar), new zzbld(zzchdVar), zzggeVar);
    }
}
