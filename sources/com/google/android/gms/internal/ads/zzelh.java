package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzelh {
    private final zzfig zza;
    private final zzdsq zzb;
    private final zzdvc zzc;

    public zzelh(zzfig zzfigVar, zzdsq zzdsqVar, zzdvc zzdvcVar) {
        this.zza = zzfigVar;
        this.zzb = zzdsqVar;
        this.zzc = zzdvcVar;
    }

    public final void zza(zzfgw zzfgwVar, zzfgt zzfgtVar, int i9, zzehp zzehpVar, long j7) {
        zzdsp zzdspVar;
        zzdvb zza = this.zzc.zza();
        zza.zzd(zzfgwVar);
        zza.zzc(zzfgtVar);
        zza.zzb("action", "adapter_status");
        zza.zzb("adapter_l", String.valueOf(j7));
        zza.zzb("sc", Integer.toString(i9));
        if (zzehpVar != null) {
            zza.zzb("arec", Integer.toString(zzehpVar.zzb().zza));
            String zza2 = this.zza.zza(zzehpVar.getMessage());
            if (zza2 != null) {
                zza.zzb("areec", zza2);
            }
        }
        zzdsq zzdsqVar = this.zzb;
        Iterator it = zzfgtVar.zzu.iterator();
        while (true) {
            if (it.hasNext()) {
                zzdspVar = zzdsqVar.zza((String) it.next());
                if (zzdspVar != null) {
                    break;
                }
            } else {
                zzdspVar = null;
                break;
            }
        }
        if (zzdspVar != null) {
            zza.zzb("ancn", zzdspVar.zza);
            zzbtt zzbttVar = zzdspVar.zzb;
            if (zzbttVar != null) {
                zza.zzb("adapter_v", zzbttVar.toString());
            }
            zzbtt zzbttVar2 = zzdspVar.zzc;
            if (zzbttVar2 != null) {
                zza.zzb("adapter_sv", zzbttVar2.toString());
            }
        }
        zza.zzf();
    }
}
