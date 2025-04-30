package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbxq extends zzbxo {
    private final Object zza = new Object();
    private final Context zzb;

    @Nullable
    private SharedPreferences zzc;
    private final zzbpx zzd;
    private final VersionInfoParcel zze;

    public zzbxq(Context context, zzbpx zzbpxVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbpxVar;
    }

    public static JSONObject zzc(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbgk.zzb.zze()).booleanValue()) {
                jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", zzbgk.zzc.zze());
            jSONObject.put("cl", "636244245");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbxo
    public final f4.c zza() {
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        long j7 = 0;
        if (sharedPreferences != null) {
            j7 = sharedPreferences.getLong("js_last_update", 0L);
        }
        if (com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - j7 < ((Long) zzbgk.zzd.zze()).longValue()) {
            return zzgft.zzh(null);
        }
        return zzgft.zzm(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzbxp
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                zzbxq.this.zzb((JSONObject) obj);
                return null;
            }
        }, zzcci.zzf);
    }

    public final /* synthetic */ Void zzb(JSONObject jSONObject) {
        zzbeg zzbegVar = zzbep.zza;
        com.google.android.gms.ads.internal.client.zzba.zzb();
        SharedPreferences zza = zzbei.zza(this.zzb);
        if (zza != null) {
            SharedPreferences.Editor edit = zza.edit();
            com.google.android.gms.ads.internal.client.zzba.zza();
            zzbfv zzbfvVar = zzbga.zza;
            com.google.android.gms.ads.internal.client.zzba.zza().zze(edit, 1, jSONObject);
            com.google.android.gms.ads.internal.client.zzba.zzb();
            edit.commit();
            SharedPreferences sharedPreferences = this.zzc;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()).apply();
                return null;
            }
            return null;
        }
        return null;
    }
}
