package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfpw extends zzfps {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfpw(String str, Map map, String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final void zzc() {
        long convert;
        super.zzc();
        if (this.zzb == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzfpv(this), Math.max(4000 - convert, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final void zzi(zzfon zzfonVar, zzfol zzfolVar) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfolVar.zzi();
        Iterator it = zzi.keySet().iterator();
        if (!it.hasNext()) {
            zzj(zzfonVar, zzfolVar, jSONObject);
        } else {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final void zzn() {
        WebView webView = new WebView(zzfpj.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfpu(this));
        zzm(this.zza);
        zzfpl.zzj(this.zza, null);
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }
}
