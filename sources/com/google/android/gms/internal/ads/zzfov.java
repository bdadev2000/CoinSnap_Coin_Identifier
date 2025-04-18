package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzfov {
    private final String zza;
    private final String zzb;

    private zzfov(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfov zza(String str, String str2) {
        zzfqb.zzb(str, "Name is null or empty");
        zzfqb.zzb(str2, "Version is null or empty");
        return new zzfov(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
