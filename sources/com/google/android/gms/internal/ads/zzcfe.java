package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcfe implements zzblp {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        float parseFloat;
        zzcee zzceeVar = (zzcee) obj;
        zzcif zzq = zzceeVar.zzq();
        if (zzq == null) {
            try {
                zzcif zzcifVar = new zzcif(zzceeVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzceeVar.zzC(zzcifVar);
                zzq = zzcifVar;
            } catch (NullPointerException e4) {
                e = e4;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e9) {
                e = e9;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "VideoMetaGmsgHandler.onGmsg");
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
