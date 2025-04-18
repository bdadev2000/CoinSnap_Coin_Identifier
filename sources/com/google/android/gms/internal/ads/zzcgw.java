package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public class zzcgw extends zzcfw {
    public zzcgw(zzcfo zzcfoVar, zzbbu zzbbuVar, boolean z2, @Nullable zzefj zzefjVar) {
        super(zzcfoVar, zzbbuVar, z2, new zzbso(zzcfoVar, zzcfoVar.zzE(), new zzbcd(zzcfoVar.getContext())), null, zzefjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final WebResourceResponse zzT(WebView webView, String str, @Nullable Map map) {
        String str2;
        if (!(webView instanceof zzcfo)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcfo zzcfoVar = (zzcfo) webView;
        zzbyk zzbykVar = this.zza;
        if (zzbykVar != null) {
            zzbykVar.zzd(str, map, 1);
        }
        zzftl.zza();
        zzftr zzftrVar = zzftr.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcfoVar.zzN() != null) {
            zzcfoVar.zzN().zzF();
        }
        if (zzcfoVar.zzO().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzU);
        } else if (zzcfoVar.zzaF()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzT);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzS);
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzx(zzcfoVar.getContext(), zzcfoVar.zzn().afmaVersion, str2);
    }
}
