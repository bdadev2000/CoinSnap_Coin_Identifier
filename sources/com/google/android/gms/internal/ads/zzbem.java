package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* loaded from: classes3.dex */
public final class zzbem {
    public static final zzbdx zza = new zzbdx("gads:gma_attestation:click:macro_string", "@click_attok@", 4);
    public static final zzbdx zzb = new zzbdx("gads:gma_attestation:click:query_param", "attok", 4);
    public static final zzbdx zzc = zzbdx.zzb("gads:gma_attestation:click:timeout", AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    public static final zzbdx zzd = zzbdx.zzd("gads:gma_attestation:click:enable", false);
    public static final zzbdx zze = zzbdx.zzb("gads:gma_attestation:click:enable_dynamite_version", 213806100);
    public static final zzbdx zzf = zzbdx.zzd("gads:gma_attestation:click:qualification:enable", true);
    public static final zzbdx zzg = zzbdx.zzd("gads:gma_attestation:image_hash", false);
    public static final zzbdx zzh = zzbdx.zzd("gads:gma_attestation:impression:enable", true);
    public static final zzbdx zzi;

    static {
        zzbdx.zzd("gads:gma_attestation:request:enable_javascript", false);
        zzbdx.zzd("gads:gma_attestation:request:enable", true);
        zzi = zzbdx.zzd("gads:gma_attestation:click:report_error", true);
    }
}
