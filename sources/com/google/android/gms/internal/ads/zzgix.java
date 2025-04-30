package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgix {
    public static final zzgix zza = new zzgix("SHA1");
    public static final zzgix zzb = new zzgix("SHA224");
    public static final zzgix zzc = new zzgix("SHA256");
    public static final zzgix zzd = new zzgix("SHA384");
    public static final zzgix zze = new zzgix("SHA512");
    private final String zzf;

    private zzgix(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
