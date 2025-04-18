package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfnj {
    private final String zza;
    private final String zzb;

    private zzfnj(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfnj zza(String str, String str2) {
        zzfor.zzb(str, "Name is null or empty");
        zzfor.zzb(str2, "Version is null or empty");
        return new zzfnj(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
