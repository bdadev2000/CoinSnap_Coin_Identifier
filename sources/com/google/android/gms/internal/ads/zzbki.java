package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbki implements zzblp {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get(CampaignEx.JSON_KEY_TIMESTAMP);
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No timestamp given for CSI tick.");
                return;
            }
            try {
                long parseLong = (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()) + com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                zzchdVar.zzm().zzc(str2, str3, parseLong);
                return;
            } catch (NumberFormatException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Malformed timestamp for CSI tick.", e4);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str5)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No value given for CSI experiment.");
                return;
            } else {
                zzchdVar.zzm().zza().zzd("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (TextUtils.isEmpty(str7)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No name given for CSI extra.");
            } else {
                zzchdVar.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
