package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class zzbag implements Comparator {
    public zzbag(zzbah zzbahVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazv zzazvVar = (zzazv) obj;
        zzazv zzazvVar2 = (zzazv) obj2;
        if (zzazvVar.zzd() < zzazvVar2.zzd()) {
            return -1;
        }
        if (zzazvVar.zzd() <= zzazvVar2.zzd()) {
            if (zzazvVar.zzb() < zzazvVar2.zzb()) {
                return -1;
            }
            if (zzazvVar.zzb() <= zzazvVar2.zzb()) {
                float zza = (zzazvVar.zza() - zzazvVar.zzd()) * (zzazvVar.zzc() - zzazvVar.zzb());
                float zza2 = (zzazvVar2.zza() - zzazvVar2.zzd()) * (zzazvVar2.zzc() - zzazvVar2.zzb());
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
