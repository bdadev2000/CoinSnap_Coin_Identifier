package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes3.dex */
public final class zzbfb {
    public static final zzbdx zza = zzbdx.zzd("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbdx zzb;

    static {
        zzbdx.zzd("gads:invalidate_token_at_refresh_start", true);
        zzbdx.zzd("gms:expose_token_for_gma:enabled", true);
        zzbdx.zzd("gads:referesh_rate_limit", false);
        zzb = zzbdx.zzb("gads:timeout_for_trustless_token:millis", AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        zzbdx.zzd("gads:token_anonymization:enabled", true);
        zzbdx.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
