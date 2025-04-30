package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzcil extends zzchl {
    public zzcil(zzchd zzchdVar, zzbdm zzbdmVar, boolean z8, @Nullable zzegk zzegkVar) {
        super(zzchdVar, zzbdmVar, z8, new zzbui(zzchdVar, zzchdVar.zzE(), new zzbdx(zzchdVar.getContext())), null, zzegkVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final WebResourceResponse zzS(WebView webView, String str, @Nullable Map map) {
        String str2;
        if (!(webView instanceof zzchd)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzchd zzchdVar = (zzchd) webView;
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            zzcafVar.zzd(str, map, 1);
        }
        zzftu.zza();
        zzftz zzftzVar = zzftz.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return zzc(str, map);
        }
        if (zzchdVar.zzN() != null) {
            zzchdVar.zzN().zzF();
        }
        if (zzchdVar.zzO().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzN);
        } else if (zzchdVar.zzaF()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzM);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzL);
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzx(zzchdVar.getContext(), zzchdVar.zzn().afmaVersion, str2);
    }
}
