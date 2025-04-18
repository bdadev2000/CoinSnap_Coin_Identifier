package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import d6.g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import k2.e;
import l2.n;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes3.dex */
public final class zzfnh {
    private final zzfnj zza;
    private final WebView zzb;
    private final HashMap zzc = new HashMap();
    private final zzfnv zzd = new zzfnv();

    private zzfnh(zzfnj zzfnjVar, WebView webView, boolean z10) {
        zzfor.zza();
        this.zza = zzfnjVar;
        this.zzb = webView;
        if (g.s("WEB_MESSAGE_LISTENER")) {
            zzg();
            e.a(webView, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfng(this));
            return;
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    public static zzfnh zza(zzfnj zzfnjVar, WebView webView, boolean z10) {
        return new zzfnh(zzfnjVar, webView, true);
    }

    public static /* bridge */ /* synthetic */ void zzb(zzfnh zzfnhVar, String str) {
        zzfmw zzfmwVar = (zzfmw) zzfnhVar.zzc.get(str);
        if (zzfmwVar != null) {
            zzfmwVar.zzc();
            zzfnhVar.zzc.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ void zzd(zzfnh zzfnhVar, String str) {
        zzfnb zzfnbVar = zzfnb.DEFINED_BY_JAVASCRIPT;
        zzfne zzfneVar = zzfne.DEFINED_BY_JAVASCRIPT;
        zzfni zzfniVar = zzfni.JAVASCRIPT;
        zzfna zzfnaVar = new zzfna(zzfmx.zza(zzfnbVar, zzfneVar, zzfniVar, zzfniVar, false), zzfmy.zzb(zzfnhVar.zza, zzfnhVar.zzb, null, null), str);
        zzfnhVar.zzc.put(str, zzfnaVar);
        zzfnaVar.zzd(zzfnhVar.zzb);
        for (zzfnu zzfnuVar : zzfnhVar.zzd.zza()) {
            zzfnaVar.zzb((View) zzfnuVar.zzb().get(), zzfnuVar.zza(), zzfnuVar.zzc());
        }
        zzfnaVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        WebView webView = this.zzb;
        int i10 = e.a;
        if (n.f21120d.b()) {
            ((WebViewProviderBoundaryInterface) e.c(webView).f26021c).removeWebMessageListener("omidJsSessionService");
            return;
        }
        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public final void zze(View view, zzfnd zzfndVar, @Nullable String str) {
        Iterator it = this.zzc.values().iterator();
        while (it.hasNext()) {
            ((zzfmw) it.next()).zzb(view, zzfndVar, "Ad overlay");
        }
        this.zzd.zzb(view, zzfndVar, "Ad overlay");
    }

    public final void zzf(zzcfz zzcfzVar) {
        Iterator it = this.zzc.values().iterator();
        while (it.hasNext()) {
            ((zzfmw) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfnf(this, zzcfzVar, timer), 1000L);
    }
}
