package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfga {
    private final zzfet zza;
    private final zzfew zzb;
    private final zzedp zzc;
    private final zzflr zzd;
    private final zzfkl zze;
    private final zzcnb zzf;

    public zzfga(zzedp zzedpVar, zzflr zzflrVar, zzfet zzfetVar, zzfew zzfewVar, zzcnb zzcnbVar, zzfkl zzfklVar) {
        this.zza = zzfetVar;
        this.zzb = zzfewVar;
        this.zzc = zzedpVar;
        this.zzd = zzflrVar;
        this.zzf = zzcnbVar;
        this.zze = zzfklVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i10) {
        if (!this.zza.zzai) {
            this.zzd.zzc(str, this.zze);
        } else {
            this.zzc.zzd(new zzedr(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis(), this.zzb.zzb, str, i10));
        }
    }

    public final void zzc(List list, int i10) {
        ua.b zzh;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjI)).booleanValue() && zzcnb.zzj(str)) {
                zzh = this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzbc.zze());
            } else {
                zzh = zzgei.zzh(str);
            }
            zzgei.zzr(zzh, new zzffz(this, i10), zzcaj.zza);
        }
    }
}
