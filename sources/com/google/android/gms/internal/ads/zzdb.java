package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
public final class zzdb {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;

    @Deprecated
    public static final zzn zzb;
    private static final zzbu zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;

    @Nullable
    @Deprecated
    public Object zzd;
    public long zzf;
    public long zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;

    @Deprecated
    public boolean zzk;

    @Nullable
    public zzbk zzl;
    public boolean zzm;
    public long zzn;
    public long zzo;
    public int zzp;
    public int zzq;
    public static final Object zza = new Object();
    private static final Object zzr = new Object();
    public Object zzc = zza;
    public zzbu zze = zzs;

    static {
        zzaw zzawVar = new zzaw();
        zzawVar.zza("androidx.media3.common.Timeline");
        zzawVar.zzb(Uri.EMPTY);
        zzs = zzawVar.zzc();
        zzt = Integer.toString(1, 36);
        zzu = Integer.toString(2, 36);
        zzv = Integer.toString(3, 36);
        zzw = Integer.toString(4, 36);
        zzx = Integer.toString(5, 36);
        zzy = Integer.toString(6, 36);
        zzz = Integer.toString(7, 36);
        zzA = Integer.toString(8, 36);
        zzB = Integer.toString(9, 36);
        zzC = Integer.toString(10, 36);
        zzD = Integer.toString(11, 36);
        zzE = Integer.toString(12, 36);
        zzF = Integer.toString(13, 36);
        zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzda
        };
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdb.class.equals(obj.getClass())) {
            zzdb zzdbVar = (zzdb) obj;
            if (zzgd.zzG(this.zzc, zzdbVar.zzc) && zzgd.zzG(this.zze, zzdbVar.zze) && zzgd.zzG(null, null) && zzgd.zzG(this.zzl, zzdbVar.zzl) && this.zzf == zzdbVar.zzf && this.zzg == zzdbVar.zzg && this.zzh == zzdbVar.zzh && this.zzi == zzdbVar.zzi && this.zzj == zzdbVar.zzj && this.zzm == zzdbVar.zzm && this.zzo == zzdbVar.zzo && this.zzp == zzdbVar.zzp && this.zzq == zzdbVar.zzq) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.zzc.hashCode() + 217) * 31) + this.zze.hashCode();
        zzbk zzbkVar = this.zzl;
        if (zzbkVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzbkVar.hashCode();
        }
        int i9 = ((hashCode2 * 961) + hashCode) * 31;
        long j7 = this.zzf;
        int i10 = (i9 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j9 = this.zzg;
        int i11 = (i10 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.zzh;
        int i12 = ((((((i11 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0)) * 31) + (this.zzm ? 1 : 0);
        long j11 = this.zzo;
        return ((((((i12 * 961) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.zzp) * 31) + this.zzq) * 31;
    }

    public final zzdb zza(Object obj, @Nullable zzbu zzbuVar, @Nullable Object obj2, long j7, long j9, long j10, boolean z8, boolean z9, @Nullable zzbk zzbkVar, long j11, long j12, int i9, int i10, long j13) {
        this.zzc = obj;
        this.zze = zzbuVar == null ? zzs : zzbuVar;
        this.zzd = null;
        this.zzf = C.TIME_UNSET;
        this.zzg = C.TIME_UNSET;
        this.zzh = C.TIME_UNSET;
        this.zzi = z8;
        this.zzj = z9;
        this.zzk = zzbkVar != null;
        this.zzl = zzbkVar;
        this.zzn = 0L;
        this.zzo = j12;
        this.zzp = 0;
        this.zzq = 0;
        this.zzm = false;
        return this;
    }

    public final boolean zzb() {
        boolean z8;
        boolean z9;
        boolean z10 = this.zzk;
        if (this.zzl == null) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z10 == z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzeq.zzf(z9);
        if (this.zzl != null) {
            return true;
        }
        return false;
    }
}
