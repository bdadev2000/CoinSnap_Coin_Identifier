package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgyy {
    private final zzgyx zza;

    private zzgyy(zzgyx zzgyxVar) {
        this.zza = zzgyxVar;
    }

    public static zzgyy zzb(byte[] bArr, zzghw zzghwVar) {
        return new zzgyy(zzgyx.zzb(bArr));
    }

    public static zzgyy zzc(int i2) {
        return new zzgyy(zzgyx.zzb(zzgqu.zzb(i2)));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(zzghw zzghwVar) {
        return this.zza.zzc();
    }
}
