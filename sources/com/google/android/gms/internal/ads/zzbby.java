package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class zzbby implements Comparator {
    public zzbby(zzbbz zzbbzVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbn zzbbnVar = (zzbbn) obj;
        zzbbn zzbbnVar2 = (zzbbn) obj2;
        if (zzbbnVar.zzd() < zzbbnVar2.zzd()) {
            return -1;
        }
        if (zzbbnVar.zzd() <= zzbbnVar2.zzd()) {
            if (zzbbnVar.zzb() < zzbbnVar2.zzb()) {
                return -1;
            }
            if (zzbbnVar.zzb() <= zzbbnVar2.zzb()) {
                float zza = (zzbbnVar.zza() - zzbbnVar.zzd()) * (zzbbnVar.zzc() - zzbbnVar.zzb());
                float zza2 = (zzbbnVar2.zza() - zzbbnVar2.zzd()) * (zzbbnVar2.zzc() - zzbbnVar2.zzb());
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
