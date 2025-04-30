package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbll implements zzblp {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        String str = (String) map.get("action");
        if (CampaignEx.JSON_NATIVE_VIDEO_PAUSE.equals(str)) {
            zzchdVar.zzdg();
        } else if (CampaignEx.JSON_NATIVE_VIDEO_RESUME.equals(str)) {
            zzchdVar.zzdh();
        }
    }
}
