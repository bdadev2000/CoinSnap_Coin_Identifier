package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbcb;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzfun;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.util.Features;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzcgn extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcfo {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcgq zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbfq zzE;
    private zzbfo zzF;
    private zzbai zzG;
    private int zzH;
    private int zzI;
    private zzbdh zzJ;
    private final zzbdh zzK;
    private zzbdh zzL;
    private final zzbdi zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzck zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbbu zzX;
    private boolean zzY;
    private final zzchh zzb;
    private final zzavn zzc;
    private final zzfhg zzd;
    private final zzbdy zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzm zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfgh zzk;
    private zzfgk zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcfw zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzegf zzq;
    private zzegd zzr;
    private zzchi zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    @VisibleForTesting
    public zzcgn(zzchh zzchhVar, zzchi zzchiVar, String str, boolean z2, boolean z3, zzavn zzavnVar, zzbdy zzbdyVar, VersionInfoParcel versionInfoParcel, zzbdk zzbdkVar, com.google.android.gms.ads.internal.zzm zzmVar, com.google.android.gms.ads.internal.zza zzaVar, zzbbu zzbbuVar, zzfgh zzfghVar, zzfgk zzfgkVar, zzfhg zzfhgVar) {
        super(zzchhVar);
        zzfgk zzfgkVar2;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzchhVar;
        this.zzs = zzchiVar;
        this.zzt = str;
        this.zzw = z2;
        this.zzc = zzavnVar;
        this.zzd = zzfhgVar;
        this.zze = zzbdyVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzmVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        com.google.android.gms.ads.internal.zzu.zzp();
        DisplayMetrics zzt = com.google.android.gms.ads.internal.util.zzt.zzt(windowManager);
        this.zzi = zzt;
        this.zzj = zzt.density;
        this.zzX = zzbbuVar;
        this.zzk = zzfghVar;
        this.zzl = zzfgkVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzck(zzchhVar.zza(), this, this, null);
        this.zzY = false;
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzll)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzu.zzp().zzc(zzchhVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzu.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcd.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfun zzfunVar = zzt.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzaP)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzba();
        AdMobNetworkBridge.onAddedJavascriptInterface(this, new zzcgu(this, new zzcgt(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        zzbdi zzbdiVar = new zzbdi(new zzbdk(true, "make_wv", this.zzt));
        this.zzM = zzbdiVar;
        zzbdiVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbT)).booleanValue() && (zzfgkVar2 = this.zzl) != null && zzfgkVar2.zzb != null) {
            zzbdiVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbdiVar.zza();
        zzbdh zzf = zzbdk.zzf();
        this.zzK = zzf;
        zzbdiVar.zzb("native:view_create", zzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzcg.zza().zzb(zzchhVar);
        com.google.android.gms.ads.internal.zzu.zzo().zzt();
    }

    private void safedk_webview_zzcgn_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(String p12, String p2, String p3, String p4, String p5) {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/google/android/gms/internal/ads/zzcgn;->safedk_webview_zzcgn_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: " + p12 + ", WebView address : " + toString() + ", isOnUiThread = " + k.c() + ", SDK_PACKAGE_NAME = " + g.f30053h);
            CreativeInfoManager.a(p12, p2, this, g.f30053h);
            SafeDKWebAppInterface.a(g.f30053h, this, p2);
        }
        super.loadDataWithBaseURL(p12, p2, p3, p4, p5);
    }

    private void safedk_webview_zzcgn_webviewLoadData_172d49d32092f6f80826f3dca3960029(String p12, String p2, String p3) {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/google/android/gms/internal/ads/zzcgn;->safedk_webview_zzcgn_webviewLoadData_172d49d32092f6f80826f3dca3960029(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        boolean z2 = SafeDK.getInstance() != null && SafeDK.getInstance().o();
        Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : " + this + ", isSafeDKInitialized = " + z2 + ", SDK_PACKAGE_NAME = " + g.f30053h);
        if (z2) {
            CreativeInfoManager.a((String) null, p12, this, g.f30053h);
            SafeDKWebAppInterface.a(g.f30053h, this, p12);
        }
        super.loadData(p12, p2, p3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: safedk_webview_zzcgn_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e, reason: merged with bridge method [inline-methods] */
    public void zzaV(String p12) {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/google/android/gms/internal/ads/zzcgn;->safedk_webview_zzcgn_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(Ljava/lang/String;)V");
        Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: " + p12 + ", WebView address : " + toString() + "  SDK_PACKAGE_NAME = " + g.f30053h);
        if (SafeDK.getInstance() != null && SafeDK.getInstance().o()) {
            if (TextUtils.isEmpty(p12) || p12.startsWith("javascript:")) {
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : " + p12);
            } else {
                NetworkBridge.logWebviewLoadURLRequest(g.f30053h, this, p12);
                AdNetworkDiscovery h2 = CreativeInfoManager.h(g.f30053h);
                if (h2 != null && h2.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                    CreativeInfoManager.a(p12, (String) null, this, g.f30053h);
                }
                SafeDKWebAppInterface.a(g.f30053h, this, p12);
            }
        }
        super.loadUrl(p12);
    }

    private final synchronized void zzba() {
        zzfgh zzfghVar = this.zzk;
        if (zzfghVar != null && zzfghVar.zzam) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Disabling hardware acceleration on an overlay.");
            zzbc();
            return;
        }
        if (!this.zzw && !this.zzs.zzi()) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbb() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzu.zzo().zzr();
    }

    private final synchronized void zzbc() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbd(boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z2 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, null);
            }
            this.zzx = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbf(String str) {
        final String str2 = "about:blank";
        try {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcgi
                public final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final void run() {
                    zzcgn.this.zzaW(this.zzb);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzbg() {
        zzbdc.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        try {
            Map map = this.zzV;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzcdv) it.next()).release();
                }
            }
            this.zzV = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbi() {
        zzbdi zzbdiVar = this.zzM;
        if (zzbdiVar == null) {
            return;
        }
        zzbdk zza2 = zzbdiVar.zza();
        zzbda zzg = com.google.android.gms.ads.internal.zzu.zzo().zzg();
        if (zzg != null) {
            zzg.zzf(zza2);
        }
    }

    private final synchronized void zzbj() {
        Boolean zzl = com.google.android.gms.ads.internal.zzu.zzo().zzl();
        this.zzy = zzl;
        if (zzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaY(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaY(Boolean.FALSE);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final synchronized void destroy() {
        try {
            zzbi();
            this.zzQ.zza();
            com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
            if (zzmVar != null) {
                zzmVar.zzb();
                this.zzp.zzm();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzh();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            com.google.android.gms.ads.internal.zzu.zzy().zzd(this);
            zzbh();
            this.zzv = true;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzks)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzX();
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
                zzbf("about:blank");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(g.f30053h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkt)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcan.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgh
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgn.this.zzaU(str, valueCallback);
                }
            });
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzh();
                        com.google.android.gms.ads.internal.zzu.zzy().zzd(this);
                        zzbh();
                        zzbb();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            safedk_webview_zzcgn_webviewLoadData_172d49d32092f6f80826f3dca3960029(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            safedk_webview_zzcgn_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final synchronized void loadUrl(final String str) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgk
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgn.this.zzaV(str);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "AdWebViewImpl.loadUrl");
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfw zzcfwVar = this.zzo;
        if (zzcfwVar != null) {
            zzcfwVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!zzaE()) {
                this.zzQ.zzc();
            }
            if (this.zzY) {
                onResume();
                this.zzY = false;
            }
            boolean z2 = this.zzC;
            zzcfw zzcfwVar = this.zzo;
            if (zzcfwVar != null && zzcfwVar.zzR()) {
                if (!this.zzD) {
                    this.zzo.zza();
                    this.zzo.zzb();
                    this.zzD = true;
                }
                zzaZ();
                z2 = true;
            }
            zzbd(z2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcfw zzcfwVar;
        synchronized (this) {
            try {
                if (!zzaE()) {
                    this.zzQ.zzd();
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzcfwVar = this.zzo) != null && zzcfwVar.zzR() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zza();
                    this.zzo.zzb();
                    this.zzD = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzbd(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkH)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzT(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (zzaE()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaZ = zzaZ();
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL == null || !zzaZ) {
            return;
        }
        zzL.zzn();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01bb A[Catch: all -> 0x000f, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:17:0x0026, B:19:0x002e, B:22:0x0033, B:24:0x003b, B:26:0x004d, B:29:0x0052, B:31:0x0059, B:34:0x0063, B:37:0x0068, B:40:0x0079, B:41:0x0091, B:45:0x0080, B:48:0x0085, B:52:0x009e, B:54:0x00a6, B:56:0x00b8, B:59:0x00bd, B:61:0x00d9, B:62:0x00e1, B:65:0x00dd, B:66:0x00e6, B:68:0x00ee, B:71:0x00f9, B:78:0x011d, B:80:0x0124, B:83:0x012b, B:85:0x013d, B:87:0x014b, B:90:0x0158, B:94:0x015d, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:116:0x01dc), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013d A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:17:0x0026, B:19:0x002e, B:22:0x0033, B:24:0x003b, B:26:0x004d, B:29:0x0052, B:31:0x0059, B:34:0x0063, B:37:0x0068, B:40:0x0079, B:41:0x0091, B:45:0x0080, B:48:0x0085, B:52:0x009e, B:54:0x00a6, B:56:0x00b8, B:59:0x00bd, B:61:0x00d9, B:62:0x00e1, B:65:0x00dd, B:66:0x00e6, B:68:0x00ee, B:71:0x00f9, B:78:0x011d, B:80:0x0124, B:83:0x012b, B:85:0x013d, B:87:0x014b, B:90:0x0158, B:94:0x015d, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:116:0x01dc), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015d A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:17:0x0026, B:19:0x002e, B:22:0x0033, B:24:0x003b, B:26:0x004d, B:29:0x0052, B:31:0x0059, B:34:0x0063, B:37:0x0068, B:40:0x0079, B:41:0x0091, B:45:0x0080, B:48:0x0085, B:52:0x009e, B:54:0x00a6, B:56:0x00b8, B:59:0x00bd, B:61:0x00d9, B:62:0x00e1, B:65:0x00dd, B:66:0x00e6, B:68:0x00ee, B:71:0x00f9, B:78:0x011d, B:80:0x0124, B:83:0x012b, B:85:0x013d, B:87:0x014b, B:90:0x0158, B:94:0x015d, B:96:0x01a3, B:97:0x01a7, B:99:0x01ae, B:104:0x01bb, B:106:0x01c1, B:107:0x01c4, B:109:0x01c8, B:110:0x01d1, B:116:0x01dc), top: B:3:0x0003 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgn.onMeasure(int, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, androidx.webkit.internal.WebViewProviderAdapter] */
    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final void onPause() {
        if (zzaE()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzmg)).booleanValue() && WebViewFeature.a(Features.MUTE_AUDIO)) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Muting webview");
                int i2 = WebViewCompat.f21802a;
                if (!WebViewFeatureInternal.f21831i.c()) {
                    throw WebViewFeatureInternal.a();
                }
                WebViewProviderBoundaryInterface createWebView = WebViewGlueCommunicator.b().createWebView(this);
                new Object().f21834a = createWebView;
                createWebView.setAudioMuted(true);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not pause webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzmj)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdWebViewImpl.onPause");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, androidx.webkit.internal.WebViewProviderAdapter] */
    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final void onResume() {
        if (zzaE()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzmg)).booleanValue() && WebViewFeature.a(Features.MUTE_AUDIO)) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Unmuting webview");
                int i2 = WebViewCompat.f21802a;
                if (!WebViewFeatureInternal.f21831i.c()) {
                    throw WebViewFeatureInternal.a();
                }
                WebViewProviderBoundaryInterface createWebView = WebViewGlueCommunicator.b().createWebView(this);
                new Object().f21834a = createWebView;
                createWebView.setAudioMuted(false);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not resume webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzmj)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzo.zzR() || this.zzo.zzP()) {
            zzavn zzavnVar = this.zzc;
            if (zzavnVar != null) {
                zzavnVar.zzd(motionEvent);
            }
            zzbdy zzbdyVar = this.zze;
            if (zzbdyVar != null) {
                zzbdyVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbfq zzbfqVar = this.zzE;
                    if (zzbfqVar != null) {
                        zzbfqVar.zzd(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfo
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcfw) {
            this.zzo = (zzcfw) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzA(int i2) {
        this.zzN = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzB(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzC(zzcgq zzcgqVar) {
        if (this.zzB != null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzB = zzcgqVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcff
    public final zzfgh zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzchd
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzchb
    public final zzavn zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized zzbai zzJ() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized zzbfq zzK() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final /* synthetic */ zzchg zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcha
    public final synchronized zzchi zzO() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized zzegd zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized zzegf zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcgr
    public final zzfgk zzR() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final zzfhg zzS() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final ListenableFuture zzT() {
        zzbdy zzbdyVar = this.zze;
        return zzbdyVar == null ? zzgfo.zzh(null) : zzbdyVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized String zzU() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final List zzV() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzW(zzfgh zzfghVar, zzfgk zzfgkVar) {
        this.zzk = zzfghVar;
        this.zzl = zzfgkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzX() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcgm(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzY() {
        zzbg();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzZ(int i2) {
        if (i2 == 0) {
            zzbdi zzbdiVar = this.zzM;
            zzbdc.zza(zzbdiVar.zza(), this.zzK, "aebb2");
        }
        zzbg();
        this.zzM.zza();
        this.zzM.zza().zzd("close_type", String.valueOf(i2));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i2));
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zza(String str) {
        zzaT(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaA(String str, Predicate predicate) {
        zzcfw zzcfwVar = this.zzo;
        if (zzcfwVar != null) {
            zzcfwVar.zzO(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized boolean zzaC() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaD(final boolean z2, final int i2) {
        destroy();
        this.zzX.zzb(new zzbbt() { // from class: com.google.android.gms.internal.ads.zzcgj
            @Override // com.google.android.gms.internal.ads.zzbbt
            public final void zza(zzbcb.zzt.zza zzaVar) {
                int i3 = zzcgn.zza;
                zzbcb.zzbl.zza zzc = zzbcb.zzbl.zzc();
                boolean zzf = zzc.zzf();
                boolean z3 = z2;
                if (zzf != z3) {
                    zzc.zzd(z3);
                }
                zzc.zze(i2);
                zzaVar.zzab(zzc.zzbr());
            }
        });
        this.zzX.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final boolean zzaG() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z2, boolean z3) {
        this.zzo.zzu(zzcVar, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaK(String str, String str2, int i2) {
        this.zzo.zzv(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaL(boolean z2, int i2, boolean z3) {
        this.zzo.zzw(z2, i2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaM(boolean z2, int i2, String str, String str2, boolean z3) {
        this.zzo.zzy(z2, i2, str, str2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaN(boolean z2, int i2, String str, boolean z3, boolean z4) {
        this.zzo.zzz(z2, i2, str, z3, z4);
    }

    public final zzcfw zzaO() {
        return this.zzo;
    }

    @VisibleForTesting
    public final synchronized Boolean zzaP() {
        return this.zzy;
    }

    public final synchronized void zzaS(String str, ValueCallback valueCallback) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    public final void zzaT(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaX("javascript:".concat(str));
            return;
        }
        if (zzaP() == null) {
            zzbj();
        }
        if (zzaP().booleanValue()) {
            zzaS(str, null);
        } else {
            zzaX("javascript:".concat(str));
        }
    }

    public final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final /* synthetic */ void zzaW(String str) {
        zzaV("about:blank");
    }

    public final synchronized void zzaX(String str) {
        if (zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @VisibleForTesting
    public final void zzaY(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzu.zzo().zzy(bool);
    }

    public final boolean zzaZ() {
        int i2;
        int i3;
        if (this.zzo.zzQ() || this.zzo.zzR()) {
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            DisplayMetrics displayMetrics = this.zzi;
            int zzw = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            DisplayMetrics displayMetrics2 = this.zzi;
            int zzw2 = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 == null || zza2.getWindow() == null) {
                i2 = zzw;
                i3 = zzw2;
            } else {
                com.google.android.gms.ads.internal.zzu.zzp();
                int[] zzQ = com.google.android.gms.ads.internal.util.zzt.zzQ(zza2);
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                int zzw3 = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zzi, zzQ[0]);
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                i3 = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zzi, zzQ[1]);
                i2 = zzw3;
            }
            int i4 = this.zzS;
            if (i4 != zzw || this.zzR != zzw2 || this.zzT != i2 || this.zzU != i3) {
                boolean z2 = (i4 == zzw && this.zzR == zzw2) ? false : true;
                this.zzS = zzw;
                this.zzR = zzw2;
                this.zzT = i2;
                this.zzU = i3;
                new zzbsp(this, "").zzj(zzw, zzw2, i2, i3, this.zzi.density, this.zzW.getDefaultDisplay().getRotation());
                return z2;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaa() {
        if (this.zzJ == null) {
            zzbdi zzbdiVar = this.zzM;
            zzbdc.zza(zzbdiVar.zza(), this.zzK, "aes2");
            this.zzM.zza();
            zzbdh zzf = zzbdk.zzf();
            this.zzJ = zzf;
            this.zzM.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzab() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzu.zzr().zze()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzu.zzr().zza()));
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzac.zzb(getContext())));
        zzd("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzac(boolean z2) {
        this.zzo.zzi(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzad() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzae(String str, String str2, String str3) {
        String str4;
        try {
            if (zzaE()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
                return;
            }
            String[] strArr = new String[1];
            String str5 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzV);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put(ServerProtocol.DIALOG_PARAM_SDK_VERSION, "Google Mobile Ads");
                jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            safedk_webview_zzcgn_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(str, zzcgz.zzb(str2, strArr), "text/html", "UTF-8", null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaf() {
        if (this.zzL == null) {
            this.zzM.zza();
            zzbdh zzf = zzbdk.zzf();
            this.zzL = zzf;
            this.zzM.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzag(String str, zzbjw zzbjwVar) {
        zzcfw zzcfwVar = this.zzo;
        if (zzcfwVar != null) {
            zzcfwVar.zzA(str, zzbjwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzah() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzaj(zzchi zzchiVar) {
        this.zzs = zzchiVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzak(zzbai zzbaiVar) {
        this.zzG = zzbaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzal(boolean z2) {
        this.zzz = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzan(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzao(boolean z2) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzy(this.zzo.zzQ(), z2);
        } else {
            this.zzu = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzap(zzbfo zzbfoVar) {
        this.zzF = zzbfoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzaq(boolean z2) {
        try {
            boolean z3 = this.zzw;
            this.zzw = z2;
            zzba();
            if (z2 != z3) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzW)).booleanValue()) {
                    if (!this.zzs.zzi()) {
                    }
                }
                new zzbsp(this, "").zzl(true != z2 ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzar(zzbfq zzbfqVar) {
        this.zzE = zzbfqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzas(zzegd zzegdVar) {
        this.zzr = zzegdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzat(zzegf zzegfVar) {
        this.zzq = zzegfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzau(int i2) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzA(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzav(boolean z2) {
        this.zzY = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzax(boolean z2) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i2 = this.zzH + (true != z2 ? -1 : 1);
        this.zzH = i2;
        if (i2 > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final synchronized void zzay(boolean z2) {
        if (z2) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzB(z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfo
    public final void zzaz(String str, zzbjw zzbjwVar) {
        zzcfw zzcfwVar = this.zzo;
        if (zzcfwVar != null) {
            zzcfwVar.zzN(str, zzbjwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzb(String str, String str2) {
        zzaT(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdG() {
        zzcfw zzcfwVar = this.zzo;
        if (zzcfwVar != null) {
            zzcfwVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdf() {
        zzcfw zzcfwVar = this.zzo;
        if (zzcfwVar != null) {
            zzcfwVar.zzdf();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final synchronized void zzdg() {
        com.google.android.gms.ads.internal.zzm zzmVar = this.zzg;
        if (zzmVar != null) {
            zzmVar.zzdg();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final synchronized void zzdh() {
        com.google.android.gms.ads.internal.zzm zzmVar = this.zzg;
        if (zzmVar != null) {
            zzmVar.zzdh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized String zzdi() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zzdp(zzayu zzayuVar) {
        boolean z2;
        synchronized (this) {
            z2 = zzayuVar.zzj;
            this.zzC = z2;
        }
        zzbd(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder t2 = androidx.compose.foundation.text.input.a.t("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Dispatching AFMA event: ".concat(t2.toString()));
        zzaT(t2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzccj
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzbdh zzk() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final zzbdi zzm() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzchc, com.google.android.gms.internal.ads.zzccj
    public final VersionInfoParcel zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzcby zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized zzcdv zzp(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzcdv) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final synchronized zzcgq zzq() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized String zzr() {
        zzfgk zzfgkVar = this.zzl;
        if (zzfgkVar == null) {
            return null;
        }
        return zzfgkVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcfo, com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzt(String str, zzcdv zzcdvVar) {
        try {
            if (this.zzV == null) {
                this.zzV = new HashMap();
            }
            this.zzV.put(str, zzcdvVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL != null) {
            zzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzv(boolean z2, long j2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z2 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        hashMap.put("duration", Long.toString(j2));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzw() {
        zzbfo zzbfoVar = this.zzF;
        if (zzbfoVar != null) {
            final zzdou zzdouVar = (zzdou) zzbfoVar;
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdos
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdou.this.zzd();
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzx(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzy(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzz(boolean z2) {
        this.zzo.zzD(false);
    }
}
