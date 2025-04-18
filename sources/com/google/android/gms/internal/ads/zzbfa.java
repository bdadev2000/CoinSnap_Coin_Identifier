package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes3.dex */
public final class zzbfa {
    public static final zzbdx zza;

    static {
        zzbdx.zzb("gads:ad_loader:timeout_ms", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        zza = zzbdx.zzb("gads:rendering:timeout_ms", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        zzbdx.zzb("gads:resolve_future:default_timeout_ms", 30000L);
    }
}
