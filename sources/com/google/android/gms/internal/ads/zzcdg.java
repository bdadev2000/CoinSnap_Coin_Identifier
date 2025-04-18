package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcdg implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        float parseFloat;
        zzccf zzccfVar = (zzccf) obj;
        zzcgm zzq = zzccfVar.zzq();
        if (zzq == null) {
            try {
                zzcgm zzcgmVar = new zzcgm(zzccfVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzccfVar.zzC(zzcgmVar);
                zzq = zzcgmVar;
            } catch (NullPointerException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e10) {
                e = e10;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat2 = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat3 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || parseInt > 3) {
            parseInt = 0;
        }
        String str = (String) map.get("aspectRatio");
        if (TextUtils.isEmpty(str)) {
            parseFloat = 0.0f;
        } else {
            parseFloat = Float.parseFloat(str);
        }
        if (com.google.android.gms.ads.internal.util.client.zzm.zzm(3)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Video Meta GMSG: currentTime : " + parseFloat3 + " , duration : " + parseFloat2 + " , isMuted : " + equals + " , playbackState : " + parseInt + " , aspectRatio : " + str);
        }
        zzq.zzc(parseFloat3, parseFloat2, parseInt, equals, parseFloat);
    }
}
