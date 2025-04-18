package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzche {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzche(int i10, int i11, int i12) {
        this.zzc = i10;
        this.zzb = i11;
        this.zza = i12;
    }

    public static zzche zza() {
        return new zzche(0, 0, 0);
    }

    public static zzche zzb(int i10, int i11) {
        return new zzche(1, i10, i11);
    }

    public static zzche zzc(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        if (zzsVar.zzd) {
            return new zzche(3, 0, 0);
        }
        if (zzsVar.zzi) {
            return new zzche(2, 0, 0);
        }
        if (zzsVar.zzh) {
            return new zzche(0, 0, 0);
        }
        return new zzche(1, zzsVar.zzf, zzsVar.zzc);
    }

    public static zzche zzd() {
        return new zzche(5, 0, 0);
    }

    public static zzche zze() {
        return new zzche(4, 0, 0);
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
