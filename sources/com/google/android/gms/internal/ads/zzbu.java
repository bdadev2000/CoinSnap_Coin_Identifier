package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzbu {
    public static final Object zza = new Object();
    private static final zzaw zzp;

    @Nullable
    @Deprecated
    public Object zzc;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;

    @Nullable
    public zzaq zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;
    public Object zzb = zza;
    public zzaw zzd = zzp;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zza("androidx.media3.common.Timeline");
        zzakVar.zzb(Uri.EMPTY);
        zzp = zzakVar.zzc();
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
        if (obj != null && zzbu.class.equals(obj.getClass())) {
            zzbu zzbuVar = (zzbu) obj;
            if (Objects.equals(this.zzb, zzbuVar.zzb) && Objects.equals(this.zzd, zzbuVar.zzd) && Objects.equals(this.zzj, zzbuVar.zzj) && this.zze == zzbuVar.zze && this.zzf == zzbuVar.zzf && this.zzg == zzbuVar.zzg && this.zzh == zzbuVar.zzh && this.zzi == zzbuVar.zzi && this.zzk == zzbuVar.zzk && this.zzm == zzbuVar.zzm && this.zzn == zzbuVar.zzn && this.zzo == zzbuVar.zzo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.zzb.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzaq zzaqVar = this.zzj;
        if (zzaqVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzaqVar.hashCode();
        }
        int i10 = ((hashCode2 * 961) + hashCode) * 31;
        long j3 = this.zze;
        int i11 = (i10 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.zzf;
        int i12 = (i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.zzg;
        int i13 = ((((((i12 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
        long j12 = this.zzm;
        return ((((((i13 * 961) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.zzn) * 31) + this.zzo) * 31;
    }

    public final zzbu zza(Object obj, @Nullable zzaw zzawVar, @Nullable Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, @Nullable zzaq zzaqVar, long j12, long j13, int i10, int i11, long j14) {
        this.zzb = obj;
        this.zzd = zzawVar == null ? zzp : zzawVar;
        this.zzc = null;
        this.zze = C.TIME_UNSET;
        this.zzf = C.TIME_UNSET;
        this.zzg = C.TIME_UNSET;
        this.zzh = z10;
        this.zzi = z11;
        this.zzj = zzaqVar;
        this.zzl = 0L;
        this.zzm = j13;
        this.zzn = 0;
        this.zzo = 0;
        this.zzk = false;
        return this;
    }

    public final boolean zzb() {
        return this.zzj != null;
    }
}
