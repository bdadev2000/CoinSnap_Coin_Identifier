package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.internal.ads.zzfie;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzn extends WebViewClient {
    final /* synthetic */ zzt zza;

    public zzn(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(g.f30053h, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        CreativeInfoManager.onWebViewPageFinished(g.f30053h, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzbl zzblVar;
        zzbl zzblVar2;
        zzbl zzblVar3;
        zzbl zzblVar4;
        zzt zztVar = this.zza;
        zzblVar = zztVar.zzg;
        if (zzblVar != null) {
            try {
                zzblVar2 = zztVar.zzg;
                zzblVar2.zzf(zzfie.zzd(1, null, null));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            }
        }
        zzt zztVar2 = this.zza;
        zzblVar3 = zztVar2.zzg;
        if (zzblVar3 != null) {
            try {
                zzblVar4 = zztVar2.zzg;
                zzblVar4.zze(0);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    public boolean safedk_zzn_shouldOverrideUrlLoading_eb2f2a707b4534736f2dfeca71296647(WebView p02, String p12) {
        zzbl zzblVar;
        zzbl zzblVar2;
        zzbl zzblVar3;
        zzbl zzblVar4;
        zzbl zzblVar5;
        zzbl zzblVar6;
        zzbl zzblVar7;
        zzbl zzblVar8;
        zzbl zzblVar9;
        zzbl zzblVar10;
        zzbl zzblVar11;
        zzbl zzblVar12;
        zzbl zzblVar13;
        if (p12.startsWith(this.zza.zzq())) {
            return false;
        }
        if (p12.startsWith("gmsg://noAdLoaded")) {
            zzt zztVar = this.zza;
            zzblVar10 = zztVar.zzg;
            if (zzblVar10 != null) {
                try {
                    zzblVar11 = zztVar.zzg;
                    zzblVar11.zzf(zzfie.zzd(3, null, null));
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                }
            }
            zzt zztVar2 = this.zza;
            zzblVar12 = zztVar2.zzg;
            if (zzblVar12 != null) {
                try {
                    zzblVar13 = zztVar2.zzg;
                    zzblVar13.zze(3);
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if (p12.startsWith("gmsg://scriptLoadFailed")) {
            zzt zztVar3 = this.zza;
            zzblVar6 = zztVar3.zzg;
            if (zzblVar6 != null) {
                try {
                    zzblVar7 = zztVar3.zzg;
                    zzblVar7.zzf(zzfie.zzd(1, null, null));
                } catch (RemoteException e3) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e3);
                }
            }
            zzt zztVar4 = this.zza;
            zzblVar8 = zztVar4.zzg;
            if (zzblVar8 != null) {
                try {
                    zzblVar9 = zztVar4.zzg;
                    zzblVar9.zze(0);
                } catch (RemoteException e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if (p12.startsWith("gmsg://adResized")) {
            zzt zztVar5 = this.zza;
            zzblVar4 = zztVar5.zzg;
            if (zzblVar4 != null) {
                try {
                    zzblVar5 = zztVar5.zzg;
                    zzblVar5.zzi();
                } catch (RemoteException e5) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e5);
                }
            }
            this.zza.zzV(this.zza.zzb(p12));
            return true;
        }
        if (p12.startsWith("gmsg://")) {
            return true;
        }
        zzt zztVar6 = this.zza;
        zzblVar = zztVar6.zzg;
        if (zzblVar != null) {
            try {
                zzblVar2 = zztVar6.zzg;
                zzblVar2.zzc();
                zzblVar3 = this.zza.zzg;
                zzblVar3.zzh();
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e6);
            }
        }
        zzt.zzw(this.zza, zzt.zzo(this.zza, p12));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f30053h, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        return CreativeInfoManager.onWebViewResponse(g.f30053h, view, url, super.shouldInterceptRequest(view, url));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/internal/zzn;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zzn_shouldOverrideUrlLoading_eb2f2a707b4534736f2dfeca71296647 = safedk_zzn_shouldOverrideUrlLoading_eb2f2a707b4534736f2dfeca71296647(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f30053h, webView, str, safedk_zzn_shouldOverrideUrlLoading_eb2f2a707b4534736f2dfeca71296647);
        return safedk_zzn_shouldOverrideUrlLoading_eb2f2a707b4534736f2dfeca71296647;
    }
}
