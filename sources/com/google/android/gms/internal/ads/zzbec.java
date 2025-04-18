package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes3.dex */
public final class zzbec {
    public static final zzbdx zza = zzbdx.zzb("gads:app_permissions_caching_expiry_ms:expiry", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    public static final zzbdx zzb = zzbdx.zzb("gads:audio_caching_expiry_ms:expiry", DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    public static final zzbdx zzc = zzbdx.zzb("gads:battery_caching_expiry_ms:expiry", 10000);
    public static final zzbdx zzd = zzbdx.zzb("gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final zzbdx zze = zzbdx.zzb("gads:hsdp_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);
    public static final zzbdx zzf = zzbdx.zzb("gads:memory_caching_expiry_ms:expiry", DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
    public static final zzbdx zzg = zzbdx.zzb("gads:sdk_environment_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);
    public static final zzbdx zzh = zzbdx.zzb("gads:telephony_caching_expiry_ms:expiry", DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
}
