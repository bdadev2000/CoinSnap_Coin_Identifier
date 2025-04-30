package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgzf {
    private final zzgze zza;

    private zzgzf(zzgze zzgzeVar) {
        this.zza = zzgzeVar;
    }

    public static zzgzf zzb(byte[] bArr, zzgic zzgicVar) {
        return new zzgzf(zzgze.zzb(bArr));
    }

    public static zzgzf zzc(int i9) {
        return new zzgzf(zzgze.zzb(zzgqo.zzb(i9)));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zzd(zzgic zzgicVar) {
        return this.zza.zzc();
    }
}
