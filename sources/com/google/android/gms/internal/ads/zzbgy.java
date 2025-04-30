package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes2.dex */
public final class zzbgy {
    public static final zzbfv zza = zzbfv.zzd("gads:invalidate_token_at_refresh_start", true);
    public static final zzbfv zzb = zzbfv.zzd("gms:expose_token_for_gma:enabled", true);
    public static final zzbfv zzc = zzbfv.zzb("gads:timeout_for_trustless_token:millis", AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    public static final zzbfv zzd = zzbfv.zzb("gads:cached_token:ttl_millis", 10800000);
}
