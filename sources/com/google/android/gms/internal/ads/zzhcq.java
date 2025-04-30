package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzhcq extends zzhcs {
    private zzhcq() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhcs
    public final List zza(Object obj, long j7) {
        int i9;
        zzhca zzhcaVar = (zzhca) zzhfa.zzh(obj, j7);
        if (!zzhcaVar.zzc()) {
            int size = zzhcaVar.size();
            if (size == 0) {
                i9 = 10;
            } else {
                i9 = size + size;
            }
            zzhca zzf = zzhcaVar.zzf(i9);
            zzhfa.zzv(obj, j7, zzf);
            return zzf;
        }
        return zzhcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcs
    public final void zzb(Object obj, long j7) {
        ((zzhca) zzhfa.zzh(obj, j7)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhcs
    public final void zzc(Object obj, Object obj2, long j7) {
        zzhca zzhcaVar = (zzhca) zzhfa.zzh(obj, j7);
        zzhca zzhcaVar2 = (zzhca) zzhfa.zzh(obj2, j7);
        int size = zzhcaVar.size();
        int size2 = zzhcaVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzhcaVar.zzc()) {
                zzhcaVar = zzhcaVar.zzf(size2 + size);
            }
            zzhcaVar.addAll(zzhcaVar2);
        }
        if (size > 0) {
            zzhcaVar2 = zzhcaVar;
        }
        zzhfa.zzv(obj, j7, zzhcaVar2);
    }

    public /* synthetic */ zzhcq(zzhcp zzhcpVar) {
        super(null);
    }
}
