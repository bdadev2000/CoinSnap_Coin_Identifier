package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzfho {
    private final zzfgh zza;
    private final zzfgk zzb;
    private final zzeey zzc;
    private final zzfng zzd;
    private final zzfma zze;
    private final zzcop zzf;

    @VisibleForTesting
    public zzfho(zzeey zzeeyVar, zzfng zzfngVar, zzfgh zzfghVar, zzfgk zzfgkVar, zzcop zzcopVar, zzfma zzfmaVar) {
        this.zza = zzfghVar;
        this.zzb = zzfgkVar;
        this.zzc = zzeeyVar;
        this.zzd = zzfngVar;
        this.zzf = zzcopVar;
        this.zze = zzfmaVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i2) {
        if (!this.zza.zzai) {
            this.zzd.zzc(str, this.zze);
        } else {
            this.zzc.zzd(new zzefa(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), this.zzb.zzb, str, i2));
        }
    }

    public final void zzc(List list, int i2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgfo.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjG)).booleanValue() && zzcop.zzj(str)) ? this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzbc.zze()) : zzgfo.zzh(str), new zzfhn(this, i2), zzcan.zza);
        }
    }
}
