package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzfxf;
import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
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
        zzv.zzq();
        map.put("device", zzs.zzr());
        map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.zzb);
        zzv.zzq();
        String str2 = "0";
        if (true != zzs.zzE(this.zza)) {
            str = "0";
        } else {
            str = "1";
        }
        map.put("is_lite_sdk", str);
        zzbce zzbceVar = zzbcn.zza;
        List zzb = zzbe.zza().zzb();
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzgK)).booleanValue()) {
            zzb.addAll(zzv.zzp().zzi().zzg().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzkX)).booleanValue()) {
            zzv.zzq();
            if (true == zzs.zzB(this.zza)) {
                str2 = "1";
            }
            map.put("is_bstar", str2);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcn.zziZ)).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcn.zzcs)).booleanValue()) {
                map.put("plugin", zzfxf.zzc(zzv.zzp().zzn()));
            }
        }
    }
}
