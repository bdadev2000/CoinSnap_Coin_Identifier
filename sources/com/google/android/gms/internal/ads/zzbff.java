package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzbff {
    public static final zzbeb zza;

    static {
        zzbeb.zzd("gads:invalidate_token_at_refresh_start", true);
        zzbeb.zzd("gms:expose_token_for_gma:enabled", true);
        zzbeb.zzd("gads:referesh_rate_limit", false);
        zza = zzbeb.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbeb.zzd("gads:token_anonymization:enabled", false);
        zzbeb.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
