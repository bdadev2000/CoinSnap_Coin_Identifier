package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzgfz;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zze extends zzbkr {
    private final WebView zza;
    private final zza zzb;
    private final Executor zzc;

    @Nullable
    private WebViewClient zzd;

    public zze(WebView webView, zza zzaVar, @UiThread zzgfz zzgfzVar) {
        this.zza = webView;
        this.zzb = zzaVar;
        this.zzc = zzgfzVar;
    }

    private final void zzc() {
        this.zza.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjp), this.zzb.zza()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    @Nullable
    public final WebViewClient getDelegate() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(g.f30053h, view, url);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nonagon/signalgeneration/zze;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(g.f30053h, webView, str);
        safedk_zze_onPageFinished_7e8dd4fb6903ada019c234d57da3e28b(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzc();
        super.onPageStarted(webView, str, bitmap);
    }

    public void safedk_zze_onPageFinished_7e8dd4fb6903ada019c234d57da3e28b(WebView p02, String p12) {
        zzc();
        super.onPageFinished(p02, p12);
    }

    public final void zza() {
        try {
            com.google.android.gms.ads.internal.zzu.zzp();
            WebViewClient webViewClient = this.zza.getWebViewClient();
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
