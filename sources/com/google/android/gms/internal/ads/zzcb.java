package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzcb {
    public static final Object zza = new Object();
    private static final zzbc zzp;

    @Nullable
    @Deprecated
    public Object zzc;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;

    @Nullable
    public zzav zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;
    public Object zzb = zza;
    public zzbc zzd = zzp;

    static {
        zzam zzamVar = new zzam();
        zzamVar.zza("androidx.media3.common.Timeline");
        zzamVar.zzb(Uri.EMPTY);
        zzp = zzamVar.zzc();
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcb.class.equals(obj.getClass())) {
            zzcb zzcbVar = (zzcb) obj;
            if (Objects.equals(this.zzb, zzcbVar.zzb) && Objects.equals(this.zzd, zzcbVar.zzd) && Objects.equals(this.zzj, zzcbVar.zzj) && this.zze == zzcbVar.zze && this.zzf == zzcbVar.zzf && this.zzg == zzcbVar.zzg && this.zzh == zzcbVar.zzh && this.zzi == zzcbVar.zzi && this.zzk == zzcbVar.zzk && this.zzm == zzcbVar.zzm && this.zzn == zzcbVar.zzn && this.zzo == zzcbVar.zzo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.zzb.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzav zzavVar = this.zzj;
        int hashCode2 = ((hashCode * 961) + (zzavVar == null ? 0 : zzavVar.hashCode())) * 31;
        long j2 = this.zze;
        int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.zzf;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.zzg;
        int i4 = ((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
        long j5 = this.zzm;
        return ((((((i4 * 961) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.zzn) * 31) + this.zzo) * 31;
    }

    public final zzcb zza(Object obj, @Nullable zzbc zzbcVar, @Nullable Object obj2, long j2, long j3, long j4, boolean z2, boolean z3, @Nullable zzav zzavVar, long j5, long j6, int i2, int i3, long j7) {
        this.zzb = obj;
        this.zzd = zzbcVar == null ? zzp : zzbcVar;
        this.zzc = null;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = zzavVar;
        this.zzl = 0L;
        this.zzm = j6;
        this.zzn = 0;
        this.zzo = 0;
        this.zzk = false;
        return this;
    }

    public final boolean zzb() {
        return this.zzj != null;
    }
}
