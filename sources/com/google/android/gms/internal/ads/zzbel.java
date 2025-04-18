package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbel {
    public static final zzbdx zza = zzbdx.zzd("gads:init:init_on_bg_thread", true);
    public static final zzbdx zzb = zzbdx.zzd("gads:init:init_on_single_bg_thread", false);
    public static final zzbdx zzc = zzbdx.zzd("gads:adloader_load_bg_thread", true);
    public static final zzbdx zzd = zzbdx.zzd("gads:appopen_load_on_bg_thread", true);
    public static final zzbdx zze = zzbdx.zzd("gads:banner_destroy_bg_thread", false);
    public static final zzbdx zzf = zzbdx.zzd("gads:banner_load_bg_thread", true);
    public static final zzbdx zzg = zzbdx.zzd("gads:banner_pause_bg_thread", false);
    public static final zzbdx zzh = zzbdx.zzd("gads:banner_resume_bg_thread", false);
    public static final zzbdx zzi = zzbdx.zzd("gads:interstitial_load_on_bg_thread", true);
    public static final zzbdx zzj;
    public static final zzbdx zzk;

    static {
        zzbdx.zzd("gads:persist_flags_on_bg_thread", true);
        zzj = zzbdx.zzd("gads:query_info_bg_thread", true);
        zzk = zzbdx.zzd("gads:rewarded_load_bg_thread", true);
    }
}
