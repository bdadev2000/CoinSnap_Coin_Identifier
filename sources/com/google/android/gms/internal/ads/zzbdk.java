package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzbdk {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbdk(InputStream inputStream, boolean z8, boolean z9, long j7, boolean z10) {
        this.zza = inputStream;
        this.zzb = z8;
        this.zzc = z9;
        this.zzd = j7;
        this.zze = z10;
    }

    public static zzbdk zzb(InputStream inputStream, boolean z8, boolean z9, long j7, boolean z10) {
        return new zzbdk(inputStream, z8, z9, j7, z10);
    }

    public final long zza() {
        return this.zzd;
    }

    public final InputStream zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
