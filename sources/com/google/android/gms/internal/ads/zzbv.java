package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public abstract class zzbv {
    public static final zzbv zza = new zzbs();

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
        if (!(obj instanceof zzbv)) {
            return false;
        }
        zzbv zzbvVar = (zzbv) obj;
        if (zzbvVar.zzc() == zzc() && zzbvVar.zzb() == zzb()) {
            zzbu zzbuVar = new zzbu();
            zzbt zzbtVar = new zzbt();
            zzbu zzbuVar2 = new zzbu();
            zzbt zzbtVar2 = new zzbt();
            for (int i10 = 0; i10 < zzc(); i10++) {
                if (!zze(i10, zzbuVar, 0L).equals(zzbvVar.zze(i10, zzbuVar2, 0L))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < zzb(); i11++) {
                if (!zzd(i11, zzbtVar, true).equals(zzbvVar.zzd(i11, zzbtVar2, true))) {
                    return false;
                }
            }
            int zzg = zzg(true);
            if (zzg == zzbvVar.zzg(true) && (zzh = zzh(true)) == zzbvVar.zzh(true)) {
                while (zzg != zzh) {
                    int zzj = zzj(zzg, 0, true);
                    if (zzj != zzbvVar.zzj(zzg, 0, true)) {
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
        int i10;
        zzbu zzbuVar = new zzbu();
        zzbt zzbtVar = new zzbt();
        int zzc = zzc() + 217;
        int i11 = 0;
        while (true) {
            i10 = zzc * 31;
            if (i11 >= zzc()) {
                break;
            }
            zzc = i10 + zze(i11, zzbuVar, 0L).hashCode();
            i11++;
        }
        int zzb = zzb() + i10;
        for (int i12 = 0; i12 < zzb(); i12++) {
            zzb = (zzb * 31) + zzd(i12, zzbtVar, true).hashCode();
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

    public abstract zzbt zzd(int i10, zzbt zzbtVar, boolean z10);

    public abstract zzbu zze(int i10, zzbu zzbuVar, long j3);

    public abstract Object zzf(int i10);

    public int zzg(boolean z10) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z10) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i10, zzbt zzbtVar, zzbu zzbuVar, int i11, boolean z10) {
        int i12 = zzd(i10, zzbtVar, false).zzc;
        if (zze(i12, zzbuVar, 0L).zzo == i10) {
            int zzj = zzj(i12, i11, z10);
            if (zzj == -1) {
                return -1;
            }
            return zze(zzj, zzbuVar, 0L).zzn;
        }
        return i10 + 1;
    }

    public int zzj(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == zzh(z10)) {
                        return zzg(z10);
                    }
                    return i10 + 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        }
        if (i10 == zzh(z10)) {
            return -1;
        }
        return i10 + 1;
    }

    public int zzk(int i10, int i11, boolean z10) {
        if (i10 == zzg(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public final Pair zzl(zzbu zzbuVar, zzbt zzbtVar, int i10, long j3) {
        Pair zzm = zzm(zzbuVar, zzbtVar, i10, j3, 0L);
        zzm.getClass();
        return zzm;
    }

    @Nullable
    public final Pair zzm(zzbu zzbuVar, zzbt zzbtVar, int i10, long j3, long j10) {
        zzdb.zza(i10, 0, zzc());
        zze(i10, zzbuVar, j10);
        if (j3 == C.TIME_UNSET) {
            long j11 = zzbuVar.zzl;
            j3 = 0;
        }
        int i11 = zzbuVar.zzn;
        zzd(i11, zzbtVar, false);
        while (i11 < zzbuVar.zzo) {
            long j12 = zzbtVar.zze;
            if (j3 == 0) {
                break;
            }
            int i12 = i11 + 1;
            long j13 = zzd(i12, zzbtVar, false).zze;
            if (j3 < 0) {
                break;
            }
            i11 = i12;
        }
        zzd(i11, zzbtVar, true);
        long j14 = zzbtVar.zze;
        long j15 = zzbtVar.zzd;
        if (j15 != C.TIME_UNSET) {
            j3 = Math.min(j3, j15 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = zzbtVar.zzb;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzbt zzn(Object obj, zzbt zzbtVar) {
        return zzd(zza(obj), zzbtVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
