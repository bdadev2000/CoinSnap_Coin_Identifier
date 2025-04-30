package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
abstract class zzheq {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i9, int i10);

    public abstract void zzi(Object obj, int i9, long j7);

    public abstract void zzj(Object obj, int i9, Object obj2);

    public abstract void zzk(Object obj, int i9, zzhac zzhacVar);

    public abstract void zzl(Object obj, int i9, long j7);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public abstract void zzp(Object obj, zzhfi zzhfiVar) throws IOException;

    public abstract void zzq(Object obj, zzhfi zzhfiVar) throws IOException;

    public final boolean zzr(Object obj, zzhdr zzhdrVar) throws IOException {
        int zzd = zzhdrVar.zzd();
        int i9 = zzd >>> 3;
        int i10 = zzd & 7;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                zzh(obj, i9, zzhdrVar.zzf());
                                return true;
                            }
                            throw zzhcd.zza();
                        }
                        return false;
                    }
                    Object zzf = zzf();
                    int i11 = i9 << 3;
                    while (zzhdrVar.zzc() != Integer.MAX_VALUE && zzr(zzf, zzhdrVar)) {
                    }
                    if ((4 | i11) == zzhdrVar.zzd()) {
                        zzg(zzf);
                        zzj(obj, i9, zzf);
                        return true;
                    }
                    throw zzhcd.zzb();
                }
                zzk(obj, i9, zzhdrVar.zzp());
                return true;
            }
            zzi(obj, i9, zzhdrVar.zzk());
            return true;
        }
        zzl(obj, i9, zzhdrVar.zzl());
        return true;
    }

    public abstract boolean zzs(zzhdr zzhdrVar);
}
