package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class zzcb {
    public final zzfzr zzA;
    public final zzfzt zzB;
    public final int zzi;
    public final int zzj;
    public final boolean zzk;
    public final zzfzo zzl;
    public final zzfzo zzn;
    public final zzfzo zzr;
    public final zzbz zzs;
    public final zzfzo zzt;
    public final int zzu;
    public final int zza = Integer.MAX_VALUE;
    public final int zzb = Integer.MAX_VALUE;
    public final int zzc = Integer.MAX_VALUE;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = 0;
    public final int zzf = 0;
    public final int zzg = 0;
    public final int zzh = 0;
    public final int zzm = 0;
    public final int zzo = 0;
    public final int zzp = Integer.MAX_VALUE;
    public final int zzq = Integer.MAX_VALUE;
    public final int zzv = 0;
    public final boolean zzw = false;
    public final boolean zzx = false;
    public final boolean zzy = false;
    public final boolean zzz = false;

    static {
        new zzcb(new zzca());
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
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
    }

    public zzcb(zzca zzcaVar) {
        this.zzi = zzca.zzc(zzcaVar);
        this.zzj = zzca.zzb(zzcaVar);
        this.zzk = zzca.zzm(zzcaVar);
        this.zzl = zzca.zzj(zzcaVar);
        this.zzn = zzca.zzg(zzcaVar);
        this.zzr = zzca.zzh(zzcaVar);
        this.zzs = zzca.zzd(zzcaVar);
        this.zzt = zzca.zzi(zzcaVar);
        this.zzu = zzca.zza(zzcaVar);
        this.zzA = zzfzr.zzc(zzca.zzk(zzcaVar));
        this.zzB = zzfzt.zzl(zzca.zzl(zzcaVar));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcb zzcbVar = (zzcb) obj;
            if (this.zzk == zzcbVar.zzk && this.zzi == zzcbVar.zzi && this.zzj == zzcbVar.zzj && this.zzl.equals(zzcbVar.zzl) && this.zzn.equals(zzcbVar.zzn) && this.zzr.equals(zzcbVar.zzr) && this.zzs.equals(zzcbVar.zzs) && this.zzt.equals(zzcbVar.zzt) && this.zzu == zzcbVar.zzu && this.zzA.equals(zzcbVar.zzA) && this.zzB.equals(zzcbVar.zzB)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.zzk ? 1 : 0) - 1048002209;
        return this.zzB.hashCode() + ((this.zzA.hashCode() + ((((this.zzt.hashCode() + ((((this.zzr.hashCode() + ((((((this.zzn.hashCode() + ((this.zzl.hashCode() + (((((i10 * 31) + this.zzi) * 31) + this.zzj) * 31)) * 961)) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31)) * 31) + 29791) * 31)) * 31) + this.zzu) * 887503681)) * 31);
    }
}
