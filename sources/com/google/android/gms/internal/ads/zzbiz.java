package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzbiz implements zzbjr {
    @Override // com.google.android.gms.internal.ads.zzbjr
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfk zzcfkVar = (zzcfk) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfve zzl = zzfvf.zzl();
        zzl.zzb((String) map.get("appId"));
        zzl.zzh(zzcfkVar.getWidth());
        zzl.zzg(zzcfkVar.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzl.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzl.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzl.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzl.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzl.zza((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzv.zzk().zzj(zzcfkVar, zzl.zzi());
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
