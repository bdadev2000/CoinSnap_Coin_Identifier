package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzw extends zzal {
    private zzaa zzk;

    public zzw(zzaa zzaaVar) {
        super("internal.registerCallback");
        this.zzk = zzaaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        int i9;
        zzg.zza(this.zza, 3, list);
        String zzf = zzhVar.zza(list.get(0)).zzf();
        zzaq zza = zzhVar.zza(list.get(1));
        if (zza instanceof zzar) {
            zzaq zza2 = zzhVar.zza(list.get(2));
            if (zza2 instanceof zzap) {
                zzap zzapVar = (zzap) zza2;
                if (zzapVar.zzc("type")) {
                    String zzf2 = zzapVar.zza("type").zzf();
                    if (zzapVar.zzc("priority")) {
                        i9 = zzg.zzb(zzapVar.zza("priority").zze().doubleValue());
                    } else {
                        i9 = 1000;
                    }
                    this.zzk.zza(zzf, i9, (zzar) zza, zzf2);
                    return zzaq.zzc;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
