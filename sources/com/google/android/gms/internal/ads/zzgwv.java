package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgwv {
    private final zzgwu zza;

    private zzgwv(zzgwu zzgwuVar) {
        this.zza = zzgwuVar;
    }

    public static zzgwv zzb(byte[] bArr, zzggn zzggnVar) {
        return new zzgwv(zzgwu.zzb(bArr));
    }

    public static zzgwv zzc(int i10) {
        return new zzgwv(zzgwu.zzb(zzgoz.zzb(i10)));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(zzggn zzggnVar) {
        return this.zza.zzc();
    }
}
