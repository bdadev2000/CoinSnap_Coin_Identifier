package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzcz {

    @Nullable
    public Object zzb;

    @Nullable
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;
    private zzd zzm = zzd.zza;
    private static final String zzh = Integer.toString(0, 36);
    private static final String zzi = Integer.toString(1, 36);
    private static final String zzj = Integer.toString(2, 36);
    private static final String zzk = Integer.toString(3, 36);
    private static final String zzl = Integer.toString(4, 36);

    @Deprecated
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzcy
    };

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcz.class.equals(obj.getClass())) {
            zzcz zzczVar = (zzcz) obj;
            if (zzgd.zzG(this.zzb, zzczVar.zzb) && zzgd.zzG(this.zzc, zzczVar.zzc) && this.zzd == zzczVar.zzd && this.zze == zzczVar.zze && this.zzg == zzczVar.zzg && zzgd.zzG(this.zzm, zzczVar.zzm)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.zzb;
        int i9 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.zzc;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        }
        int i10 = ((((hashCode + 217) * 31) + i9) * 31) + this.zzd;
        long j7 = this.zze;
        return this.zzm.hashCode() + (((((i10 * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 961) + (this.zzg ? 1 : 0)) * 31);
    }

    public final int zza(int i9) {
        return this.zzm.zza(i9).zzd;
    }

    public final int zzb() {
        int i9 = this.zzm.zzc;
        return 0;
    }

    public final int zzc(long j7) {
        return -1;
    }

    public final int zzd(long j7) {
        this.zzm.zzb(-1);
        return -1;
    }

    public final int zze(int i9) {
        return this.zzm.zza(i9).zza(-1);
    }

    public final int zzf(int i9, int i10) {
        return this.zzm.zza(i9).zza(i10);
    }

    public final int zzg() {
        int i9 = this.zzm.zze;
        return 0;
    }

    public final long zzh(int i9, int i10) {
        zzc zza2 = this.zzm.zza(i9);
        if (zza2.zzd != -1) {
            return zza2.zzh[i10];
        }
        return C.TIME_UNSET;
    }

    public final long zzi(int i9) {
        long j7 = this.zzm.zza(i9).zzc;
        return 0L;
    }

    public final long zzj() {
        long j7 = this.zzm.zzd;
        return 0L;
    }

    public final long zzk(int i9) {
        long j7 = this.zzm.zza(i9).zzi;
        return 0L;
    }

    public final zzcz zzl(@Nullable Object obj, @Nullable Object obj2, int i9, long j7, long j9, zzd zzdVar, boolean z8) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = i9;
        this.zze = j7;
        this.zzf = 0L;
        this.zzm = zzdVar;
        this.zzg = z8;
        return this;
    }

    public final boolean zzm(int i9) {
        zzb();
        if (i9 == -1) {
            this.zzm.zzb(-1);
            return false;
        }
        return false;
    }

    public final boolean zzn(int i9) {
        boolean z8 = this.zzm.zza(i9).zzj;
        return false;
    }
}
