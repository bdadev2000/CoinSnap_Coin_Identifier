package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes3.dex */
public abstract class zzhn extends zzbv {
    private final int zzb;
    private final zzwj zzc;

    public zzhn(boolean z10, zzwj zzwjVar) {
        this.zzc = zzwjVar;
        this.zzb = zzwjVar.zzc();
    }

    private final int zzw(int i10, boolean z10) {
        if (z10) {
            return this.zzc.zzd(i10);
        }
        if (i10 >= this.zzb - 1) {
            return -1;
        }
        return i10 + 1;
    }

    private final int zzx(int i10, boolean z10) {
        if (z10) {
            return this.zzc.zze(i10);
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
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

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbt zzd(int i10, zzbt zzbtVar, boolean z10) {
        int zzq = zzq(i10);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i10 - zzs(zzq), zzbtVar, z10);
        zzbtVar.zzc += zzt;
        if (z10) {
            Object zzv = zzv(zzq);
            Object obj = zzbtVar.zzb;
            obj.getClass();
            zzbtVar.zzb = Pair.create(zzv, obj);
        }
        return zzbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbu zze(int i10, zzbu zzbuVar, long j3) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i10 - zzt, zzbuVar, j3);
        Object zzv = zzv(zzr);
        if (!zzbu.zza.equals(zzbuVar.zzb)) {
            zzv = Pair.create(zzv, zzbuVar.zzb);
        }
        zzbuVar.zzb = zzv;
        zzbuVar.zzn += zzs;
        zzbuVar.zzo += zzs;
        return zzbuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final Object zzf(int i10) {
        int zzq = zzq(i10);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i10 - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzg(boolean z10) {
        int i10;
        if (this.zzb != 0) {
            if (z10) {
                i10 = this.zzc.zza();
            } else {
                i10 = 0;
            }
            while (zzu(i10).zzo()) {
                i10 = zzw(i10, z10);
                if (i10 == -1) {
                }
            }
            return zzu(i10).zzg(z10) + zzt(i10);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzh(boolean z10) {
        int i10;
        int i11 = this.zzb;
        if (i11 != 0) {
            if (z10) {
                i10 = this.zzc.zzb();
            } else {
                i10 = i11 - 1;
            }
            while (zzu(i10).zzo()) {
                i10 = zzx(i10, z10);
                if (i10 == -1) {
                }
            }
            return zzu(i10).zzh(z10) + zzt(i10);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzj(int i10, int i11, boolean z10) {
        int i12;
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        zzbv zzu = zzu(zzr);
        int i13 = i10 - zzt;
        if (i11 == 2) {
            i12 = 0;
        } else {
            i12 = i11;
        }
        int zzj = zzu.zzj(i13, i12, z10);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z10);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z10);
        }
        if (zzw != -1) {
            return zzu(zzw).zzg(z10) + zzt(zzw);
        }
        if (i11 != 2) {
            return -1;
        }
        return zzg(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzbv
    public final int zzk(int i10, int i11, boolean z10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i10 - zzt, 0, false);
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

    @Override // com.google.android.gms.internal.ads.zzbv
    public final zzbt zzn(Object obj, zzbt zzbtVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzbtVar);
        zzbtVar.zzc += zzt;
        zzbtVar.zzb = obj;
        return zzbtVar;
    }

    public abstract int zzp(Object obj);

    public abstract int zzq(int i10);

    public abstract int zzr(int i10);

    public abstract int zzs(int i10);

    public abstract int zzt(int i10);

    public abstract zzbv zzu(int i10);

    public abstract Object zzv(int i10);
}
