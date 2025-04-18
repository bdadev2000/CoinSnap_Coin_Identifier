package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbcm;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
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
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzu.zzp();
        map.put(DeviceRequestsHelper.DEVICE_INFO_DEVICE, zzt.zzr());
        map.put("app", this.zzb);
        zzu.zzp();
        boolean zzE = zzt.zzE(this.zza);
        String str = AppEventsConstants.EVENT_PARAM_VALUE_YES;
        map.put("is_lite_sdk", true != zzE ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zzbcm zzbcmVar = zzbcv.zza;
        List zzb = zzbe.zza().zzb();
        if (((Boolean) zzbe.zzc().zza(zzbcv.zzgF)).booleanValue()) {
            zzb.addAll(zzu.zzo().zzi().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.zzc);
        if (((Boolean) zzbe.zzc().zza(zzbcv.zzkW)).booleanValue()) {
            zzu.zzp();
            if (true != zzt.zzB(this.zza)) {
                str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            }
            map.put("is_bstar", str);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcv.zziX)).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcv.zzcp)).booleanValue()) {
                map.put("plugin", zzfyo.zzc(zzu.zzo().zzn()));
            }
        }
    }
}
