package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzges;
import d6.g;
import java.util.Locale;
import java.util.concurrent.Executor;
import k2.e;
import l2.b;
import l2.n;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes3.dex */
public final class zze extends zzbkm {
    private final WebView zza;
    private final zza zzb;
    private final Executor zzc;

    @Nullable
    private WebViewClient zzd;

    public zze(WebView webView, zza zzaVar, zzges zzgesVar) {
        this.zza = webView;
        this.zzb = zzaVar;
        this.zzc = zzgesVar;
    }

    private final void zzc() {
        this.zza.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjr), this.zzb.zza()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzbkm
    @Nullable
    public final WebViewClient getDelegate() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbkm, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzc();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkm, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzc();
        super.onPageStarted(webView, str, bitmap);
    }

    public final void zza() {
        WebViewClient webViewClient;
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            WebView webView = this.zza;
            if (Build.VERSION.SDK_INT >= 26) {
                webViewClient = webView.getWebViewClient();
            } else {
                if (g.s("GET_WEB_VIEW_CLIENT")) {
                    try {
                        int i10 = e.a;
                        b bVar = n.f21118b;
                        if (bVar.a()) {
                            webViewClient = l2.e.d(webView);
                        } else if (bVar.b()) {
                            webViewClient = ((WebViewProviderBoundaryInterface) e.c(webView).f26021c).getWebViewClient();
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (RuntimeException e2) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            if (webViewClient == this) {
                return;
            }
            if (webViewClient != null) {
                this.zzd = webViewClient;
            }
            this.zza.setWebViewClient(this);
            zzc();
        } catch (IllegalStateException unused) {
        }
    }

    public final void zzb() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzc
            @Override // java.lang.Runnable
            public final void run() {
                zze.this.zza();
            }
        });
    }
}
