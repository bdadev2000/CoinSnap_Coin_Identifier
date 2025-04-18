package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzbip implements zzbjr {
    public final /* synthetic */ zzdel zza;
    public final /* synthetic */ zzcnb zzb;

    public /* synthetic */ zzbip(zzdel zzdelVar, zzcnb zzcnbVar) {
        this.zza = zzdelVar;
        this.zzb = zzcnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        zzbjq.zzc(map, this.zza);
        final String str = (String) map.get("u");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from click GMSG.");
            return;
        }
        final zzcnb zzcnbVar = this.zzb;
        zzgdz zzu = zzgdz.zzu(zzbjq.zza(zzcfkVar, str));
        zzgdp zzgdpVar = new zzgdp() { // from class: com.google.android.gms.internal.ads.zzbir
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj2) {
                zzcnb zzcnbVar2;
                String str2 = (String) obj2;
                zzbjr zzbjrVar = zzbjq.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjI)).booleanValue() && (zzcnbVar2 = zzcnb.this) != null && zzcnb.zzj(str)) {
                    return zzcnbVar2.zzb(str2, com.google.android.gms.ads.internal.client.zzbc.zze());
                }
                return zzgei.zzh(str2);
            }
        };
        zzges zzgesVar = zzcaj.zza;
        zzgei.zzr((zzgdz) zzgei.zzn(zzu, zzgdpVar, zzgesVar), new zzbjf(zzcfkVar), zzgesVar);
    }
}
