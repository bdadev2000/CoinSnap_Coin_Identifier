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

/* loaded from: classes3.dex */
public final class zzbvt extends zzbvr {
    private final Object zza = new Object();
    private final Context zzb;

    @Nullable
    private SharedPreferences zzc;
    private final zzbny zzd;
    private final VersionInfoParcel zze;

    public zzbvt(Context context, zzbny zzbnyVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbnyVar;
    }

    public static JSONObject zzc(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzben.zzb.zze()).booleanValue()) {
                jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", zzben.zzc.zze());
            jSONObject.put("cl", "685849915");
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

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final ua.b zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        long j3 = 0;
        if (sharedPreferences != null) {
            j3 = sharedPreferences.getLong("js_last_update", 0L);
        }
        if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - j3 < ((Long) zzben.zzd.zze()).longValue()) {
            return zzgei.zzh(null);
        }
        return zzgei.zzm(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbvs
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                zzbvt.this.zzb((JSONObject) obj);
                return null;
            }
        }, zzcaj.zzf);
    }

    public final /* synthetic */ Void zzb(JSONObject jSONObject) {
        zzbce zzbceVar = zzbcn.zza;
        com.google.android.gms.ads.internal.client.zzbe.zzb();
        SharedPreferences zza = zzbcg.zza(this.zzb);
        if (zza != null) {
            SharedPreferences.Editor edit = zza.edit();
            com.google.android.gms.ads.internal.client.zzbe.zza();
            int i10 = zzbed.zza;
            com.google.android.gms.ads.internal.client.zzbe.zza().zze(edit, 1, jSONObject);
            com.google.android.gms.ads.internal.client.zzbe.zzb();
            edit.commit();
            SharedPreferences sharedPreferences = this.zzc;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()).apply();
                return null;
            }
            return null;
        }
        return null;
    }
}
