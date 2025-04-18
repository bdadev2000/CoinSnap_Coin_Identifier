package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class zzcc {
    public static final zzcc zza = new zzbz();

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcc)) {
            return false;
        }
        zzcc zzccVar = (zzcc) obj;
        if (zzccVar.zzc() == zzc() && zzccVar.zzb() == zzb()) {
            zzcb zzcbVar = new zzcb();
            zzca zzcaVar = new zzca();
            zzcb zzcbVar2 = new zzcb();
            zzca zzcaVar2 = new zzca();
            for (int i2 = 0; i2 < zzc(); i2++) {
                if (!zze(i2, zzcbVar, 0L).equals(zzccVar.zze(i2, zzcbVar2, 0L))) {
                    return false;
                }
            }
            for (int i3 = 0; i3 < zzb(); i3++) {
                if (!zzd(i3, zzcaVar, true).equals(zzccVar.zzd(i3, zzcaVar2, true))) {
                    return false;
                }
            }
            int zzg = zzg(true);
            if (zzg == zzccVar.zzg(true) && (zzh = zzh(true)) == zzccVar.zzh(true)) {
                while (zzg != zzh) {
                    int zzj = zzj(zzg, 0, true);
                    if (zzj != zzccVar.zzj(zzg, 0, true)) {
                        return false;
                    }
                    zzg = zzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        zzcb zzcbVar = new zzcb();
        zzca zzcaVar = new zzca();
        int zzc = zzc() + 217;
        int i3 = 0;
        while (true) {
            i2 = zzc * 31;
            if (i3 >= zzc()) {
                break;
            }
            zzc = i2 + zze(i3, zzcbVar, 0L).hashCode();
            i3++;
        }
        int zzb = zzb() + i2;
        for (int i4 = 0; i4 < zzb(); i4++) {
            zzb = (zzb * 31) + zzd(i4, zzcaVar, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb = (zzb * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzca zzd(int i2, zzca zzcaVar, boolean z2);

    public abstract zzcb zze(int i2, zzcb zzcbVar, long j2);

    public abstract Object zzf(int i2);

    public int zzg(boolean z2) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z2) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i2, zzca zzcaVar, zzcb zzcbVar, int i3, boolean z2) {
        int i4 = zzd(i2, zzcaVar, false).zzc;
        if (zze(i4, zzcbVar, 0L).zzo != i2) {
            return i2 + 1;
        }
        int zzj = zzj(i4, i3, z2);
        if (zzj == -1) {
            return -1;
        }
        return zze(zzj, zzcbVar, 0L).zzn;
    }

    public int zzj(int i2, int i3, boolean z2) {
        if (i3 == 0) {
            if (i2 == zzh(z2)) {
                return -1;
            }
            return i2 + 1;
        }
        if (i3 == 1) {
            return i2;
        }
        if (i3 == 2) {
            return i2 == zzh(z2) ? zzg(z2) : i2 + 1;
        }
        throw new IllegalStateException();
    }

    public int zzk(int i2, int i3, boolean z2) {
        if (i2 == zzg(false)) {
            return -1;
        }
        return i2 - 1;
    }

    public final Pair zzl(zzcb zzcbVar, zzca zzcaVar, int i2, long j2) {
        Pair zzm = zzm(zzcbVar, zzcaVar, i2, j2, 0L);
        zzm.getClass();
        return zzm;
    }

    @Nullable
    public final Pair zzm(zzcb zzcbVar, zzca zzcaVar, int i2, long j2, long j3) {
        zzdi.zza(i2, 0, zzc());
        zze(i2, zzcbVar, j3);
        if (j2 == -9223372036854775807L) {
            long j4 = zzcbVar.zzl;
            j2 = 0;
        }
        int i3 = zzcbVar.zzn;
        zzd(i3, zzcaVar, false);
        while (i3 < zzcbVar.zzo) {
            long j5 = zzcaVar.zze;
            if (j2 == 0) {
                break;
            }
            int i4 = i3 + 1;
            long j6 = zzd(i4, zzcaVar, false).zze;
            if (j2 < 0) {
                break;
            }
            i3 = i4;
        }
        zzd(i3, zzcaVar, true);
        long j7 = zzcaVar.zze;
        long j8 = zzcaVar.zzd;
        if (j8 != -9223372036854775807L) {
            j2 = Math.min(j2, j8 - 1);
        }
        long max = Math.max(0L, j2);
        Object obj = zzcaVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzca zzn(Object obj, zzca zzcaVar) {
        return zzd(zza(obj), zzcaVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
