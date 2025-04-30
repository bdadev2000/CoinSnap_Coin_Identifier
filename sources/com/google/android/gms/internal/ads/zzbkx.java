package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbkx implements zzblp {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchd zzchdVar = (zzchd) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfwo zzl = zzfwp.zzl();
        zzl.zzb((String) map.get("appId"));
        zzl.zzh(zzchdVar.getWidth());
        zzl.zzg(zzchdVar.zzF().getWindowToken());
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
            com.google.android.gms.ads.internal.zzu.zzj().zzj(zzchdVar, zzl.zzi());
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
