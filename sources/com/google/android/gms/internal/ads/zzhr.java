package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes3.dex */
public abstract class zzhr extends zzcc {
    private final int zzb;
    private final zzwq zzc;

    public zzhr(boolean z2, zzwq zzwqVar) {
        this.zzc = zzwqVar;
        this.zzb = zzwqVar.zzc();
    }

    private final int zzw(int i2, boolean z2) {
        if (z2) {
            return this.zzc.zzd(i2);
        }
        if (i2 >= this.zzb - 1) {
            return -1;
        }
        return i2 + 1;
    }

    private final int zzx(int i2, boolean z2) {
        if (z2) {
            return this.zzc.zze(i2);
        }
        if (i2 <= 0) {
            return -1;
        }
        return i2 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
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

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzca zzd(int i2, zzca zzcaVar, boolean z2) {
        int zzq = zzq(i2);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i2 - zzs(zzq), zzcaVar, z2);
        zzcaVar.zzc += zzt;
        if (z2) {
            Object zzv = zzv(zzq);
            Object obj = zzcaVar.zzb;
            obj.getClass();
            zzcaVar.zzb = Pair.create(zzv, obj);
        }
        return zzcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzcb zze(int i2, zzcb zzcbVar, long j2) {
        int zzr = zzr(i2);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i2 - zzt, zzcbVar, j2);
        Object zzv = zzv(zzr);
        if (!zzcb.zza.equals(zzcbVar.zzb)) {
            zzv = Pair.create(zzv, zzcbVar.zzb);
        }
        zzcbVar.zzb = zzv;
        zzcbVar.zzn += zzs;
        zzcbVar.zzo += zzs;
        return zzcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final Object zzf(int i2) {
        int zzq = zzq(i2);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i2 - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzg(boolean z2) {
        if (this.zzb != 0) {
            int zza = z2 ? this.zzc.zza() : 0;
            while (zzu(zza).zzo()) {
                zza = zzw(zza, z2);
                if (zza == -1) {
                }
            }
            return zzu(zza).zzg(z2) + zzt(zza);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzh(boolean z2) {
        int i2 = this.zzb;
        if (i2 != 0) {
            int zzb = z2 ? this.zzc.zzb() : i2 - 1;
            while (zzu(zzb).zzo()) {
                zzb = zzx(zzb, z2);
                if (zzb == -1) {
                }
            }
            return zzu(zzb).zzh(z2) + zzt(zzb);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzj(int i2, int i3, boolean z2) {
        int zzr = zzr(i2);
        int zzt = zzt(zzr);
        int zzj = zzu(zzr).zzj(i2 - zzt, i3 == 2 ? 0 : i3, z2);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z2);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z2);
        }
        if (zzw != -1) {
            return zzu(zzw).zzg(z2) + zzt(zzw);
        }
        if (i3 == 2) {
            return zzg(z2);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzk(int i2, int i3, boolean z2) {
        int zzr = zzr(i2);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i2 - zzt, 0, false);
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

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzca zzn(Object obj, zzca zzcaVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzcaVar);
        zzcaVar.zzc += zzt;
        zzcaVar.zzb = obj;
        return zzcaVar;
    }

    public abstract int zzp(Object obj);

    public abstract int zzq(int i2);

    public abstract int zzr(int i2);

    public abstract int zzs(int i2);

    public abstract int zzt(int i2);

    public abstract zzcc zzu(int i2);

    public abstract Object zzv(int i2);
}
