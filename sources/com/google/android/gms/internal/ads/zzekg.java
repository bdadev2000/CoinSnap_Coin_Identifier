package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzekg {
    private final zzfhu zza;
    private final zzdrr zzb;
    private final zzdud zzc;

    public zzekg(zzfhu zzfhuVar, zzdrr zzdrrVar, zzdud zzdudVar) {
        this.zza = zzfhuVar;
        this.zzb = zzdrrVar;
        this.zzc = zzdudVar;
    }

    public final void zza(zzfgk zzfgkVar, zzfgh zzfghVar, int i2, zzego zzegoVar, long j2) {
        zzdrq zzdrqVar;
        zzduc zza = this.zzc.zza();
        zza.zzd(zzfgkVar);
        zza.zzc(zzfghVar);
        zza.zzb("action", "adapter_status");
        zza.zzb("adapter_l", String.valueOf(j2));
        zza.zzb("sc", Integer.toString(i2));
        if (zzegoVar != null) {
            zza.zzb("arec", Integer.toString(zzegoVar.zzb().zza));
            String zza2 = this.zza.zza(zzegoVar.getMessage());
            if (zza2 != null) {
                zza.zzb("areec", zza2);
            }
        }
        zzdrr zzdrrVar = this.zzb;
        Iterator it = zzfghVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdrqVar = null;
                break;
            } else {
                zzdrqVar = zzdrrVar.zza((String) it.next());
                if (zzdrqVar != null) {
                    break;
                }
            }
        }
        if (zzdrqVar != null) {
            zza.zzb("ancn", zzdrqVar.zza);
            zzbrz zzbrzVar = zzdrqVar.zzb;
            if (zzbrzVar != null) {
                zza.zzb("adapter_v", zzbrzVar.toString());
            }
            zzbrz zzbrzVar2 = zzdrqVar.zzc;
            if (zzbrzVar2 != null) {
                zza.zzb("adapter_sv", zzbrzVar2.toString());
            }
        }
        zza.zzf();
    }
}
