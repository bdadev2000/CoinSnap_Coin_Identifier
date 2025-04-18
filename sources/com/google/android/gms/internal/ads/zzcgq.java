package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* loaded from: classes3.dex */
public final class zzcgq {
    private final zzcgr zza;
    private final zzcgp zzb;

    public zzcgq(zzcgr zzcgrVar, zzcgp zzcgpVar) {
        this.zzb = zzcgpVar;
        this.zza = zzcgrVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzavc zzI = ((zzcgx) this.zza).zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaux zzc = zzI.zzc();
        if (zzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zza.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        zzcgr zzcgrVar = this.zza;
        return zzc.zze(zzcgrVar.getContext(), str, ((zzcgz) zzcgrVar).zzF(), this.zza.zzi());
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzavc zzI = ((zzcgx) this.zza).zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaux zzc = zzI.zzc();
        if (zzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zza.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        zzcgr zzcgrVar = this.zza;
        return zzc.zzh(zzcgrVar.getContext(), ((zzcgz) zzcgrVar).zzF(), this.zza.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgo
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgq.this.zza(str);
                }
            });
        }
    }

    public final /* synthetic */ void zza(String str) {
        Uri parse = Uri.parse(str);
        zzcfs zzaO = ((zzcgj) this.zzb.zza).zzaO();
        if (zzaO == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaO.zzj(parse);
        }
    }
}
