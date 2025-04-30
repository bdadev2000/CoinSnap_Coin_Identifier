package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzfyv;
import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
    }

    public void set(@NonNull Map<String, String> map) {
        String str;
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzu.zzp();
        map.put("device", zzt.zzr());
        map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.zzb);
        zzu.zzp();
        String str2 = "1";
        if (true == zzt.zzE(this.zza)) {
            str = "1";
        } else {
            str = "0";
        }
        map.put("is_lite_sdk", str);
        zzbeg zzbegVar = zzbep.zza;
        List zzb = zzba.zza().zzb();
        if (((Boolean) zzba.zzc().zza(zzbep.zzhd)).booleanValue()) {
            zzb.addAll(zzu.zzo().zzi().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzba.zzc().zza(zzbep.zzlp)).booleanValue()) {
            zzu.zzp();
            if (true != zzt.zzB(this.zza)) {
                str2 = "0";
            }
            map.put("is_bstar", str2);
        }
        if (((Boolean) zzba.zzc().zza(zzbep.zzju)).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbep.zzck)).booleanValue()) {
                map.put("plugin", zzfyv.zzc(zzu.zzo().zzn()));
            }
        }
    }
}
