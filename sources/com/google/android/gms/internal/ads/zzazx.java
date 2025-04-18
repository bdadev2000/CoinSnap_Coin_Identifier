package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class zzazx implements Comparator {
    public zzazx(zzazy zzazyVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazm zzazmVar = (zzazm) obj;
        zzazm zzazmVar2 = (zzazm) obj2;
        if (zzazmVar.zzd() < zzazmVar2.zzd()) {
            return -1;
        }
        if (zzazmVar.zzd() <= zzazmVar2.zzd()) {
            if (zzazmVar.zzb() < zzazmVar2.zzb()) {
                return -1;
            }
            if (zzazmVar.zzb() <= zzazmVar2.zzb()) {
                float zza = (zzazmVar.zza() - zzazmVar.zzd()) * (zzazmVar.zzc() - zzazmVar.zzb());
                float zza2 = (zzazmVar2.zza() - zzazmVar2.zzd()) * (zzazmVar2.zzc() - zzazmVar2.zzb());
                if (zza > zza2) {
                    return -1;
                }
                if (zza >= zza2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
