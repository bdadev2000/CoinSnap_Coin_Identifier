package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcix {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcix(int i9, int i10, int i11) {
        this.zzc = i9;
        this.zzb = i10;
        this.zza = i11;
    }

    public static zzcix zza() {
        return new zzcix(0, 0, 0);
    }

    public static zzcix zzb(int i9, int i10) {
        return new zzcix(1, i9, i10);
    }

    public static zzcix zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        if (zzqVar.zzd) {
            return new zzcix(3, 0, 0);
        }
        if (zzqVar.zzi) {
            return new zzcix(2, 0, 0);
        }
        if (zzqVar.zzh) {
            return zza();
        }
        return zzb(zzqVar.zzf, zzqVar.zzc);
    }

    public static zzcix zzd() {
        return new zzcix(5, 0, 0);
    }

    public static zzcix zze() {
        return new zzcix(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
