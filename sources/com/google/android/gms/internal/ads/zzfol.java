package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfol extends zzfoh {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfol(String str, Map map, String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfoh
    public final void zzc() {
        long convert;
        super.zzc();
        if (this.zzb == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzfok(this), Math.max(4000 - convert, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfoh
    public final void zzi(zzfna zzfnaVar, zzfmy zzfmyVar) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfmyVar.zzi();
        Iterator it = zzi.keySet().iterator();
        if (!it.hasNext()) {
            zzj(zzfnaVar, zzfmyVar, jSONObject);
        } else {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfoh
    public final void zzo() {
        WebView webView = new WebView(zzfnw.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfoj(this));
        zzn(this.zza);
        zzfny.zzk(this.zza, null);
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }
}
