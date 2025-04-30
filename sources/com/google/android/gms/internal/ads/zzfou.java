package com.google.android.gms.internal.ads;

import U0.l;
import U0.m;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.facebook.appevents.g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* loaded from: classes2.dex */
public final class zzfou {
    private static final zzfqf zza = new zzfqf();
    private final zzfow zzb;
    private final WebView zzc;
    private final HashMap zzd = new HashMap();
    private final zzfpi zze = new zzfpi();

    private zzfou(zzfow zzfowVar, WebView webView, boolean z8) {
        zzfqd.zza();
        this.zzb = zzfowVar;
        this.zzc = webView;
        if (g.r("WEB_MESSAGE_LISTENER")) {
            zzg();
            T0.e.a(webView, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfot(this));
            return;
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    public static zzfou zza(zzfow zzfowVar, WebView webView, boolean z8) {
        return new zzfou(zzfowVar, webView, true);
    }

    public static /* bridge */ /* synthetic */ void zzb(zzfou zzfouVar, String str) {
        zzfoj zzfojVar = (zzfoj) zzfouVar.zzd.get(str);
        if (zzfojVar != null) {
            zzfojVar.zzc();
            zzfouVar.zzd.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ void zzd(zzfou zzfouVar, String str) {
        zzfoo zzfooVar = zzfoo.DEFINED_BY_JAVASCRIPT;
        zzfor zzforVar = zzfor.DEFINED_BY_JAVASCRIPT;
        zzfov zzfovVar = zzfov.JAVASCRIPT;
        zzfon zzfonVar = new zzfon(zzfok.zza(zzfooVar, zzforVar, zzfovVar, zzfovVar, false), zzfol.zzb(zzfouVar.zzb, zzfouVar.zzc, null, null), str);
        zzfouVar.zzd.put(str, zzfonVar);
        zzfonVar.zzd(zzfouVar.zzc);
        for (zzfph zzfphVar : zzfouVar.zze.zza()) {
            zzfonVar.zzb((View) zzfphVar.zzb().get(), zzfphVar.zza(), zzfphVar.zzc());
        }
        zzfonVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        WebView webView = this.zzc;
        int i9 = T0.e.f2954a;
        if (l.f3110c.b()) {
            m.f3112a.createWebView(webView).removeWebMessageListener("omidJsSessionService");
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public final void zze(View view, zzfoq zzfoqVar, @Nullable String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfoj) it.next()).zzb(view, zzfoqVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfoqVar, "Ad overlay");
    }

    public final void zzf(zzchs zzchsVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfoj) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfos(this, zzchsVar, timer), 1000L);
    }
}
