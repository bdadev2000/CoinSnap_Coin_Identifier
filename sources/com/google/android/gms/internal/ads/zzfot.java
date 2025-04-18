package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.util.Features;

/* loaded from: classes4.dex */
public final class zzfot {
    private final zzfov zza;
    private final WebView zzb;
    private final HashMap zzc = new HashMap();
    private final zzfph zzd = new zzfph();

    private zzfot(zzfov zzfovVar, WebView webView, boolean z2) {
        zzfqb.zza();
        this.zza = zzfovVar;
        this.zzb = webView;
        if (!WebViewFeature.a(Features.WEB_MESSAGE_LISTENER)) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zzg();
        WebViewCompat.a(webView, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfos(this));
    }

    public static zzfot zza(zzfov zzfovVar, WebView webView, boolean z2) {
        return new zzfot(zzfovVar, webView, true);
    }

    public static /* bridge */ /* synthetic */ void zzb(zzfot zzfotVar, String str) {
        zzfoi zzfoiVar = (zzfoi) zzfotVar.zzc.get(str);
        if (zzfoiVar != null) {
            zzfoiVar.zzc();
            zzfotVar.zzc.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ void zzd(zzfot zzfotVar, String str) {
        zzfon zzfonVar = zzfon.DEFINED_BY_JAVASCRIPT;
        zzfoq zzfoqVar = zzfoq.DEFINED_BY_JAVASCRIPT;
        zzfou zzfouVar = zzfou.JAVASCRIPT;
        zzfom zzfomVar = new zzfom(zzfoj.zza(zzfonVar, zzfoqVar, zzfouVar, zzfouVar, false), zzfok.zzb(zzfotVar.zza, zzfotVar.zzb, null, null), str);
        zzfotVar.zzc.put(str, zzfomVar);
        zzfomVar.zzd(zzfotVar.zzb);
        for (zzfpg zzfpgVar : zzfotVar.zzd.zza()) {
            zzfomVar.zzb((View) zzfpgVar.zzb().get(), zzfpgVar.zza(), zzfpgVar.zzc());
        }
        zzfomVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, androidx.webkit.internal.WebViewProviderAdapter] */
    public final void zzg() {
        WebView webView = this.zzb;
        int i2 = WebViewCompat.f21802a;
        if (!WebViewFeatureInternal.f21830h.c()) {
            throw WebViewFeatureInternal.a();
        }
        WebViewProviderBoundaryInterface createWebView = WebViewGlueCommunicator.b().createWebView(webView);
        new Object().f21834a = createWebView;
        createWebView.removeWebMessageListener("omidJsSessionService");
    }

    public final void zze(View view, zzfop zzfopVar, @Nullable String str) {
        Iterator it = this.zzc.values().iterator();
        while (it.hasNext()) {
            ((zzfoi) it.next()).zzb(view, zzfopVar, "Ad overlay");
        }
        this.zzd.zzb(view, zzfopVar, "Ad overlay");
    }

    public final void zzf(zzcgd zzcgdVar) {
        Iterator it = this.zzc.values().iterator();
        while (it.hasNext()) {
            ((zzfoi) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfor(this, zzcgdVar, timer), 1000L);
    }
}
