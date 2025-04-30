package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes2.dex */
public abstract class zzio extends zzdc {
    private final int zzc;
    private final zzxi zzd;

    public zzio(boolean z8, zzxi zzxiVar) {
        this.zzd = zzxiVar;
        this.zzc = zzxiVar.zzc();
    }

    private final int zzw(int i9, boolean z8) {
        if (z8) {
            return this.zzd.zzd(i9);
        }
        if (i9 >= this.zzc - 1) {
            return -1;
        }
        return i9 + 1;
    }

    private final int zzx(int i9, boolean z8) {
        if (z8) {
            return this.zzd.zze(i9);
        }
        if (i9 <= 0) {
            return -1;
        }
        return i9 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zza(Object obj) {
        int zza;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int zzp = zzp(obj2);
            if (zzp != -1 && (zza = zzu(zzp).zza(obj3)) != -1) {
                return zzs(zzp) + zza;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final zzcz zzd(int i9, zzcz zzczVar, boolean z8) {
        int zzq = zzq(i9);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i9 - zzs(zzq), zzczVar, z8);
        zzczVar.zzd += zzt;
        if (z8) {
            Object zzv = zzv(zzq);
            Object obj = zzczVar.zzc;
            obj.getClass();
            zzczVar.zzc = Pair.create(zzv, obj);
        }
        return zzczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final zzdb zze(int i9, zzdb zzdbVar, long j7) {
        int zzr = zzr(i9);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i9 - zzt, zzdbVar, j7);
        Object zzv = zzv(zzr);
        if (!zzdb.zza.equals(zzdbVar.zzc)) {
            zzv = Pair.create(zzv, zzdbVar.zzc);
        }
        zzdbVar.zzc = zzv;
        zzdbVar.zzp += zzs;
        zzdbVar.zzq += zzs;
        return zzdbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final Object zzf(int i9) {
        int zzq = zzq(i9);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i9 - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzg(boolean z8) {
        int i9;
        if (this.zzc != 0) {
            if (z8) {
                i9 = this.zzd.zza();
            } else {
                i9 = 0;
            }
            while (zzu(i9).zzo()) {
                i9 = zzw(i9, z8);
                if (i9 == -1) {
                }
            }
            return zzu(i9).zzg(z8) + zzt(i9);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzh(boolean z8) {
        int i9;
        int i10 = this.zzc;
        if (i10 != 0) {
            if (z8) {
                i9 = this.zzd.zzb();
            } else {
                i9 = i10 - 1;
            }
            while (zzu(i9).zzo()) {
                i9 = zzx(i9, z8);
                if (i9 == -1) {
                }
            }
            return zzu(i9).zzh(z8) + zzt(i9);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzj(int i9, int i10, boolean z8) {
        int i11;
        int zzr = zzr(i9);
        int zzt = zzt(zzr);
        zzdc zzu = zzu(zzr);
        int i12 = i9 - zzt;
        if (i10 == 2) {
            i11 = 0;
        } else {
            i11 = i10;
        }
        int zzj = zzu.zzj(i12, i11, z8);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z8);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z8);
        }
        if (zzw != -1) {
            return zzu(zzw).zzg(z8) + zzt(zzw);
        }
        if (i10 != 2) {
            return -1;
        }
        return zzg(z8);
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final int zzk(int i9, int i10, boolean z8) {
        int zzr = zzr(i9);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i9 - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (zzx != -1 && zzu(zzx).zzo()) {
            zzx = zzx(zzx, false);
        }
        if (zzx == -1) {
            return -1;
        }
        return zzu(zzx).zzh(false) + zzt(zzx);
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final zzcz zzn(Object obj, zzcz zzczVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzczVar);
        zzczVar.zzd += zzt;
        zzczVar.zzc = obj;
        return zzczVar;
    }

    public abstract int zzp(Object obj);

    public abstract int zzq(int i9);

    public abstract int zzr(int i9);

    public abstract int zzs(int i9);

    public abstract int zzt(int i9);

    public abstract zzdc zzu(int i9);

    public abstract Object zzv(int i9);
}
