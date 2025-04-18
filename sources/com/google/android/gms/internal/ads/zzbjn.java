package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbjn implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        String str = (String) map.get("action");
        if (CampaignEx.JSON_NATIVE_VIDEO_PAUSE.equals(str)) {
            zzcfkVar.zzdg();
        } else if (CampaignEx.JSON_NATIVE_VIDEO_RESUME.equals(str)) {
            zzcfkVar.zzdh();
        }
    }
}
