package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public abstract class zzdc {
    public static final zzdc zza = new zzcx();
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(2, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcw
    };

    public final boolean equals(@Nullable Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdc)) {
            return false;
        }
        zzdc zzdcVar = (zzdc) obj;
        if (zzdcVar.zzc() == zzc() && zzdcVar.zzb() == zzb()) {
            zzdb zzdbVar = new zzdb();
            zzcz zzczVar = new zzcz();
            zzdb zzdbVar2 = new zzdb();
            zzcz zzczVar2 = new zzcz();
            for (int i9 = 0; i9 < zzc(); i9++) {
                if (!zze(i9, zzdbVar, 0L).equals(zzdcVar.zze(i9, zzdbVar2, 0L))) {
                    return false;
                }
            }
            for (int i10 = 0; i10 < zzb(); i10++) {
                if (!zzd(i10, zzczVar, true).equals(zzdcVar.zzd(i10, zzczVar2, true))) {
                    return false;
                }
            }
            int zzg = zzg(true);
            if (zzg == zzdcVar.zzg(true) && (zzh = zzh(true)) == zzdcVar.zzh(true)) {
                while (zzg != zzh) {
                    int zzj = zzj(zzg, 0, true);
                    if (zzj != zzdcVar.zzj(zzg, 0, true)) {
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
        int i9;
        zzdb zzdbVar = new zzdb();
        zzcz zzczVar = new zzcz();
        int zzc2 = zzc() + 217;
        int i10 = 0;
        while (true) {
            i9 = zzc2 * 31;
            if (i10 >= zzc()) {
                break;
            }
            zzc2 = i9 + zze(i10, zzdbVar, 0L).hashCode();
            i10++;
        }
        int zzb2 = zzb() + i9;
        for (int i11 = 0; i11 < zzb(); i11++) {
            zzb2 = (zzb2 * 31) + zzd(i11, zzczVar, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb2 = (zzb2 * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb2;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzcz zzd(int i9, zzcz zzczVar, boolean z8);

    public abstract zzdb zze(int i9, zzdb zzdbVar, long j7);

    public abstract Object zzf(int i9);

    public int zzg(boolean z8) {
        if (zzo()) {
            return -1;
        }
        return 0;
    }

    public int zzh(boolean z8) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i9, zzcz zzczVar, zzdb zzdbVar, int i10, boolean z8) {
        int i11 = zzd(i9, zzczVar, false).zzd;
        if (zze(i11, zzdbVar, 0L).zzq == i9) {
            int zzj = zzj(i11, i10, z8);
            if (zzj == -1) {
                return -1;
            }
            return zze(zzj, zzdbVar, 0L).zzp;
        }
        return i9 + 1;
    }

    public int zzj(int i9, int i10, boolean z8) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i9 == zzh(z8)) {
                        return zzg(z8);
                    }
                    return i9 + 1;
                }
                throw new IllegalStateException();
            }
            return i9;
        }
        if (i9 == zzh(z8)) {
            return -1;
        }
        return i9 + 1;
    }

    public int zzk(int i9, int i10, boolean z8) {
        if (i9 == zzg(false)) {
            return -1;
        }
        return i9 - 1;
    }

    public final Pair zzl(zzdb zzdbVar, zzcz zzczVar, int i9, long j7) {
        Pair zzm = zzm(zzdbVar, zzczVar, i9, j7, 0L);
        zzm.getClass();
        return zzm;
    }

    @Nullable
    public final Pair zzm(zzdb zzdbVar, zzcz zzczVar, int i9, long j7, long j9) {
        zzeq.zza(i9, 0, zzc());
        zze(i9, zzdbVar, j9);
        if (j7 == C.TIME_UNSET) {
            long j10 = zzdbVar.zzn;
            j7 = 0;
        }
        int i10 = zzdbVar.zzp;
        zzd(i10, zzczVar, false);
        while (i10 < zzdbVar.zzq) {
            long j11 = zzczVar.zzf;
            if (j7 == 0) {
                break;
            }
            int i11 = i10 + 1;
            long j12 = zzd(i11, zzczVar, false).zzf;
            if (j7 < 0) {
                break;
            }
            i10 = i11;
        }
        zzd(i10, zzczVar, true);
        long j13 = zzczVar.zzf;
        long j14 = zzczVar.zze;
        if (j14 != C.TIME_UNSET) {
            j7 = Math.min(j7, j14 - 1);
        }
        long max = Math.max(0L, j7);
        Object obj = zzczVar.zzc;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzcz zzn(Object obj, zzcz zzczVar) {
        return zzd(zza(obj), zzczVar, true);
    }

    public final boolean zzo() {
        if (zzc() == 0) {
            return true;
        }
        return false;
    }
}
