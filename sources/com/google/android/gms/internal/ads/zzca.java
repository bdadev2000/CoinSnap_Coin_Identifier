package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzca {

    @Nullable
    public Object zza;

    @Nullable
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzb zzg = zzb.zza;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzca.class.equals(obj.getClass())) {
            zzca zzcaVar = (zzca) obj;
            if (Objects.equals(this.zza, zzcaVar.zza) && Objects.equals(this.zzb, zzcaVar.zzb) && this.zzc == zzcaVar.zzc && this.zzd == zzcaVar.zzd && this.zzf == zzcaVar.zzf && Objects.equals(this.zzg, zzcaVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j2 = this.zzd;
        return this.zzg.hashCode() + (((((hashCode2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31);
    }

    public final int zza(int i2) {
        return this.zzg.zza(i2).zzb;
    }

    public final int zzb() {
        int i2 = this.zzg.zzb;
        return 0;
    }

    public final int zzc(long j2) {
        return -1;
    }

    public final int zzd(long j2) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zze(int i2) {
        return this.zzg.zza(i2).zza(-1);
    }

    public final long zzf(int i2, int i3) {
        zza zza = this.zzg.zza(i2);
        if (zza.zzb != -1) {
            return zza.zzf[i3];
        }
        return -9223372036854775807L;
    }

    public final long zzg(int i2) {
        long j2 = this.zzg.zza(i2).zza;
        return 0L;
    }

    public final long zzh() {
        long j2 = this.zzg.zzc;
        return 0L;
    }

    public final zzca zzi(@Nullable Object obj, @Nullable Object obj2, int i2, long j2, long j3, zzb zzbVar, boolean z2) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i2;
        this.zzd = j2;
        this.zze = 0L;
        this.zzg = zzbVar;
        this.zzf = z2;
        return this;
    }

    public final boolean zzj(int i2) {
        zzb();
        if (i2 != -1) {
            return false;
        }
        this.zzg.zzb(-1);
        return false;
    }

    public final boolean zzk(int i2) {
        boolean z2 = this.zzg.zza(i2).zzh;
        return false;
    }
}
