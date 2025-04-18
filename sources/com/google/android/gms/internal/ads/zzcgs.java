package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public class zzcgs extends zzcfs {
    public zzcgs(zzcfk zzcfkVar, zzbbl zzbblVar, boolean z10, @Nullable zzeea zzeeaVar) {
        super(zzcfkVar, zzbblVar, z10, new zzbsj(zzcfkVar, zzcfkVar.zzE(), new zzbbv(zzcfkVar.getContext())), null, zzeeaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final WebResourceResponse zzV(WebView webView, String str, @Nullable Map map) {
        String str2;
        if (!(webView instanceof zzcfk)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcfk zzcfkVar = (zzcfk) webView;
        zzbyh zzbyhVar = this.zza;
        if (zzbyhVar != null) {
            zzbyhVar.zzd(str, map, 1);
        }
        zzfsb.zza();
        zzfsh zzfshVar = zzfsh.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcfkVar.zzN() != null) {
            zzcfkVar.zzN().zzG();
        }
        if (zzcfkVar.zzO().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzX);
        } else if (zzcfkVar.zzaF()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzW);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzV);
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        return com.google.android.gms.ads.internal.util.zzs.zzx(zzcfkVar.getContext(), zzcfkVar.zzn().afmaVersion, str2);
    }
}
