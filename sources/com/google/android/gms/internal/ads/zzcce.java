package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcce {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final long zzm;
    public final long zzn;

    public zzcce(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", zzbcn.zzS);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", zzbcn.zzi);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", zzbcn.zzr);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", zzbcn.zze);
        zzbce zzbceVar = zzbcn.zzd;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.zze = zzb(jSONObject, "exo_read_timeout_millis", zzbcn.zzf);
            this.zzf = zzb(jSONObject, "load_check_interval_bytes", zzbcn.zzg);
            this.zzg = zzb(jSONObject, "player_precache_limit", zzbcn.zzh);
            this.zzh = zzb(jSONObject, "socket_receive_buffer_size", zzbcn.zzj);
            this.zzi = zza(jSONObject, "use_cache_data_source", zzbcn.zzeo);
            zzb(jSONObject, "min_retry_count", zzbcn.zzk);
            this.zzj = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbcn.zzm);
            this.zzk = zza(jSONObject, "enable_multiple_video_playback", zzbcn.zzbX);
            this.zzl = zza(jSONObject, "use_range_http_data_source", zzbcn.zzbZ);
            this.zzm = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbcn.zzca);
            this.zzn = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbcn.zzcb);
        }
        this.zze = zzb(jSONObject, "exo_read_timeout_millis", zzbcn.zzf);
        this.zzf = zzb(jSONObject, "load_check_interval_bytes", zzbcn.zzg);
        this.zzg = zzb(jSONObject, "player_precache_limit", zzbcn.zzh);
        this.zzh = zzb(jSONObject, "socket_receive_buffer_size", zzbcn.zzj);
        this.zzi = zza(jSONObject, "use_cache_data_source", zzbcn.zzeo);
        zzb(jSONObject, "min_retry_count", zzbcn.zzk);
        this.zzj = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbcn.zzm);
        this.zzk = zza(jSONObject, "enable_multiple_video_playback", zzbcn.zzbX);
        this.zzl = zza(jSONObject, "use_range_http_data_source", zzbcn.zzbZ);
        this.zzm = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbcn.zzca);
        this.zzn = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbcn.zzcb);
    }

    private static final boolean zza(JSONObject jSONObject, String str, zzbce zzbceVar) {
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return booleanValue;
            }
        }
        return booleanValue;
    }

    private static final int zzb(JSONObject jSONObject, String str, zzbce zzbceVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).intValue();
    }

    private static final long zzc(JSONObject jSONObject, String str, zzbce zzbceVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).longValue();
    }
}
