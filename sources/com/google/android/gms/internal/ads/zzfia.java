package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfia {
    private final zzfgt zza;
    private final zzfgw zzb;
    private final zzefz zzc;
    private final zzfoe zzd;
    private final zzfmn zze;
    private final zzcqd zzf;

    public zzfia(zzefz zzefzVar, zzfoe zzfoeVar, zzfgt zzfgtVar, zzfgw zzfgwVar, zzcqd zzcqdVar, zzfmn zzfmnVar) {
        this.zza = zzfgtVar;
        this.zzb = zzfgwVar;
        this.zzc = zzefzVar;
        this.zzd = zzfoeVar;
        this.zzf = zzcqdVar;
        this.zze = zzfmnVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i9) {
        if (!this.zza.zzaj) {
            this.zzd.zzc(str, this.zze);
        } else {
            this.zzc.zzd(new zzegb(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), this.zzb.zzb, str, i9));
        }
    }

    public final void zzc(List list, int i9) {
        f4.c zzh;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzka)).booleanValue() && zzcqd.zzj(str)) {
                zzh = this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzay.zze());
            } else {
                zzh = zzgft.zzh(str);
            }
            zzgft.zzr(zzh, new zzfhz(this, i9), zzcci.zza);
        }
    }
}
