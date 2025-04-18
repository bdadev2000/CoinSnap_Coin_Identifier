package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzghg {
    public static final zzghg zza = new zzghg("SHA1");
    public static final zzghg zzb = new zzghg("SHA224");
    public static final zzghg zzc = new zzghg("SHA256");
    public static final zzghg zzd = new zzghg("SHA384");
    public static final zzghg zze = new zzghg("SHA512");
    private final String zzf;

    private zzghg(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
