package com.google.android.gms.internal.ads;

import U0.l;
import U0.m;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
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
import com.facebook.appevents.g;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbdv;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzfuv;
import com.mbridge.msdk.foundation.entity.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class zzcic extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzchd {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcif zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbhj zzE;
    private zzbhh zzF;
    private zzbca zzG;
    private int zzH;
    private int zzI;
    private zzbfb zzJ;
    private final zzbfb zzK;
    private zzbfb zzL;
    private final zzbfc zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzco zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbdm zzX;
    private boolean zzY;
    private final zzciw zzb;
    private final zzaxd zzc;
    private final zzfhs zzd;
    private final zzbfs zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzm zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfgt zzk;
    private zzfgw zzl;
    private boolean zzm;
    private boolean zzn;
    private zzchl zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzehg zzq;
    private zzehe zzr;
    private zzcix zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    public zzcic(zzciw zzciwVar, zzcix zzcixVar, String str, boolean z8, boolean z9, zzaxd zzaxdVar, zzbfs zzbfsVar, VersionInfoParcel versionInfoParcel, zzbfe zzbfeVar, com.google.android.gms.ads.internal.zzm zzmVar, com.google.android.gms.ads.internal.zza zzaVar, zzbdm zzbdmVar, zzfgt zzfgtVar, zzfgw zzfgwVar, zzfhs zzfhsVar) {
        super(zzciwVar);
        zzfgw zzfgwVar2;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzciwVar;
        this.zzs = zzcixVar;
        this.zzt = str;
        this.zzw = z8;
        this.zzc = zzaxdVar;
        this.zzd = zzfhsVar;
        this.zze = zzbfsVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzmVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        com.google.android.gms.ads.internal.zzu.zzp();
        DisplayMetrics zzt = com.google.android.gms.ads.internal.util.zzt.zzt(windowManager);
        this.zzi = zzt;
        this.zzj = zzt.density;
        this.zzX = zzbdmVar;
        this.zzk = zzfgtVar;
        this.zzl = zzfgwVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzco(zzciwVar.zza(), this, this, null);
        this.zzY = false;
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to enable Javascript.", e4);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlF)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzu.zzp().zzc(zzciwVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzu.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzch.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfuv zzfuvVar = zzt.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaL)).booleanValue()) {
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
        addJavascriptInterface(new zzcij(this, new zzcii(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        zzbfc zzbfcVar = new zzbfc(new zzbfe(true, "make_wv", this.zzt));
        this.zzM = zzbfcVar;
        zzbfcVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue() && (zzfgwVar2 = this.zzl) != null && zzfgwVar2.zzb != null) {
            zzbfcVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbfcVar.zza();
        zzbfb zzf = zzbfe.zzf();
        this.zzK = zzf;
        zzbfcVar.zzb("native:view_create", zzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzck.zza().zzb(zzciwVar);
        com.google.android.gms.ads.internal.zzu.zzo().zzt();
    }

    private final synchronized void zzba() {
        zzfgt zzfgtVar = this.zzk;
        if (zzfgtVar != null && zzfgtVar.zzan) {
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
        if (!this.zzP) {
            this.zzP = true;
            com.google.android.gms.ads.internal.zzu.zzo().zzr();
        }
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

    private final void zzbd(boolean z8) {
        String str;
        HashMap hashMap = new HashMap();
        if (true != z8) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("isVisible", str);
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
        try {
            final String str2 = "about:blank";
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzll)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzchx
                    public final /* synthetic */ String zzb = "about:blank";

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcic.this.zzaW(this.zzb);
                    }
                });
            } else {
                super.loadUrl("about:blank");
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzbg() {
        zzbew.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        try {
            Map map = this.zzV;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzcfp) it.next()).release();
                }
            }
            this.zzV = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbi() {
        zzbfc zzbfcVar = this.zzM;
        if (zzbfcVar != null) {
            zzbfe zza2 = zzbfcVar.zza();
            zzbeu zzg = com.google.android.gms.ads.internal.zzu.zzo().zzg();
            if (zzg != null) {
                zzg.zzf(zza2);
            }
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

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzchd
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
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkN)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
                zzbf("about:blank");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzX();
            }
        } catch (Throwable th) {
            throw th;
        }
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkO)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
            zzcci.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchw
                @Override // java.lang.Runnable
                public final void run() {
                    zzcic.this.zzaU(str, valueCallback);
                }
            });
        } else {
            super.evaluateJavascript(str, valueCallback);
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

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzchd
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaE()) {
            super.loadData(str, str2, str3);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzchd
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzaE()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzchd
    public final synchronized void loadUrl(final String str) {
        if (!zzaE()) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzll)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcic.this.zzaV(str);
                        }
                    });
                    return;
                } else {
                    super.loadUrl(str);
                    return;
                }
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "AdWebViewImpl.loadUrl");
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not call loadUrl. ", th);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzchl zzchlVar = this.zzo;
        if (zzchlVar != null) {
            zzchlVar.onAdClicked();
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
            boolean z8 = this.zzC;
            zzchl zzchlVar = this.zzo;
            if (zzchlVar != null && zzchlVar.zzQ()) {
                if (!this.zzD) {
                    this.zzo.zza();
                    this.zzo.zzb();
                    this.zzD = true;
                }
                zzaZ();
                z8 = true;
            }
            zzbd(z8);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzchl zzchlVar;
        synchronized (this) {
            try {
                if (!zzaE()) {
                    this.zzQ.zzd();
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzchlVar = this.zzo) != null && zzchlVar.zzQ() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
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
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j7) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkZ)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzT(getContext(), intent);
        } catch (ActivityNotFoundException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
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
            if (axisValue <= 0.0f || canScrollVertically(-1)) {
                if (axisValue >= 0.0f || canScrollVertically(1)) {
                    if (axisValue2 <= 0.0f || canScrollHorizontally(-1)) {
                        if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaZ = zzaZ();
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL != null && zzaZ) {
            zzL.zzn();
        }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcic.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzchd
    public final void onPause() {
        if (!zzaE()) {
            try {
                super.onPause();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmz)).booleanValue() && g.r("MUTE_AUDIO")) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Muting webview");
                    int i9 = T0.e.f2954a;
                    if (l.f3111d.b()) {
                        m.f3112a.createWebView(this).setAudioMuted(true);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not pause webview.", e4);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmC)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "AdWebViewImpl.onPause");
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzchd
    public final void onResume() {
        if (!zzaE()) {
            try {
                super.onResume();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmz)).booleanValue() && g.r("MUTE_AUDIO")) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Unmuting webview");
                    int i9 = T0.e.f2954a;
                    if (l.f3111d.b()) {
                        m.f3112a.createWebView(this).setAudioMuted(false);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not resume webview.", e4);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmC)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "AdWebViewImpl.onResume");
                }
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.zzo.zzQ() && !this.zzo.zzO()) {
            synchronized (this) {
                try {
                    zzbhj zzbhjVar = this.zzE;
                    if (zzbhjVar != null) {
                        zzbhjVar.zzd(motionEvent);
                    }
                } finally {
                }
            }
        } else {
            zzaxd zzaxdVar = this.zzc;
            if (zzaxdVar != null) {
                zzaxdVar.zzd(motionEvent);
            }
            zzbfs zzbfsVar = this.zze;
            if (zzbfsVar != null) {
                zzbfsVar.zzb(motionEvent);
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzchd
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzchl) {
            this.zzo = (zzchl) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not stop loading webview.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final synchronized void zzA(int i9) {
        this.zzN = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzB(int i9) {
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcee
    public final synchronized void zzC(zzcif zzcifVar) {
        if (this.zzB != null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzB = zzcifVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcgu
    public final zzfgt zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcis
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzciq
    public final zzaxd zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized zzbca zzJ() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized zzbhj zzK() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final /* synthetic */ zzciv zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcip
    public final synchronized zzcix zzO() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized zzehe zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized zzehg zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcig
    public final zzfgw zzR() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final zzfhs zzS() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final f4.c zzT() {
        zzbfs zzbfsVar = this.zze;
        if (zzbfsVar == null) {
            return zzgft.zzh(null);
        }
        return zzbfsVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized String zzU() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final List zzV() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzW(zzfgt zzfgtVar, zzfgw zzfgwVar) {
        this.zzk = zzfgtVar;
        this.zzl = zzfgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzX() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcib(this));
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzY() {
        zzbg();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzZ(int i9) {
        if (i9 == 0) {
            zzbfc zzbfcVar = this.zzM;
            zzbew.zza(zzbfcVar.zza(), this.zzK, "aebb2");
        }
        zzbg();
        this.zzM.zza();
        this.zzM.zza().zzd("close_type", String.valueOf(i9));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i9));
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzaA(String str, Predicate predicate) {
        zzchl zzchlVar = this.zzo;
        if (zzchlVar != null) {
            zzchlVar.zzN(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized boolean zzaC() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final boolean zzaD(final boolean z8, final int i9) {
        destroy();
        this.zzX.zzc(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzchy
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbdv.zzt.zza zzaVar) {
                int i10 = zzcic.zza;
                zzbdv.zzbl.zza zzc = zzbdv.zzbl.zzc();
                boolean zzf = zzc.zzf();
                boolean z9 = z8;
                if (zzf != z9) {
                    zzc.zzd(z9);
                }
                zzc.zze(i9);
                zzaVar.zzab(zzc.zzbr());
            }
        });
        this.zzX.zzb(zzbdo.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final boolean zzaG() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z8, boolean z9) {
        this.zzo.zzu(zzcVar, z8, z9);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzaK(String str, String str2, int i9) {
        this.zzo.zzv(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzaL(boolean z8, int i9, boolean z9) {
        this.zzo.zzw(z8, i9, z9);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzaM(boolean z8, int i9, String str, String str2, boolean z9) {
        this.zzo.zzy(z8, i9, str, str2, z9);
    }

    @Override // com.google.android.gms.internal.ads.zzcin
    public final void zzaN(boolean z8, int i9, String str, boolean z9, boolean z10) {
        this.zzo.zzz(z8, i9, str, z9, z10);
    }

    public final zzchl zzaO() {
        return this.zzo;
    }

    public final synchronized Boolean zzaP() {
        return this.zzy;
    }

    public final synchronized void zzaS(String str, ValueCallback valueCallback) {
        if (!zzaE()) {
            evaluateJavascript(str, null);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaT(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzaP() == null) {
                zzbj();
            }
            if (zzaP().booleanValue()) {
                zzaS(str, null);
                return;
            } else {
                zzaX("javascript:".concat(str));
                return;
            }
        }
        zzaX("javascript:".concat(str));
    }

    public final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    public final /* synthetic */ void zzaW(String str) {
        super.loadUrl("about:blank");
    }

    public final synchronized void zzaX(String str) {
        if (!zzaE()) {
            loadUrl(str);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaY(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzu.zzo().zzy(bool);
    }

    public final boolean zzaZ() {
        int i9;
        int i10;
        boolean z8 = false;
        if (this.zzo.zzP() || this.zzo.zzQ()) {
            com.google.android.gms.ads.internal.client.zzay.zzb();
            DisplayMetrics displayMetrics = this.zzi;
            int zzw = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            DisplayMetrics displayMetrics2 = this.zzi;
            int zzw2 = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 != null && zza2.getWindow() != null) {
                com.google.android.gms.ads.internal.zzu.zzp();
                int[] zzQ = com.google.android.gms.ads.internal.util.zzt.zzQ(zza2);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int zzw3 = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zzi, zzQ[0]);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i10 = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zzi, zzQ[1]);
                i9 = zzw3;
            } else {
                i9 = zzw;
                i10 = zzw2;
            }
            int i11 = this.zzS;
            if (i11 != zzw || this.zzR != zzw2 || this.zzT != i9 || this.zzU != i10) {
                if (i11 != zzw || this.zzR != zzw2) {
                    z8 = true;
                }
                this.zzS = zzw;
                this.zzR = zzw2;
                this.zzT = i9;
                this.zzU = i10;
                new zzbuj(this, "").zzj(zzw, zzw2, i9, i10, this.zzi.density, this.zzW.getDefaultDisplay().getRotation());
                return z8;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzaa() {
        if (this.zzJ == null) {
            zzbfc zzbfcVar = this.zzM;
            zzbew.zza(zzbfcVar.zza(), this.zzK, "aes2");
            this.zzM.zza();
            zzbfb zzf = zzbfe.zzf();
            this.zzJ = zzf;
            this.zzM.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzab() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzac(boolean z8) {
        this.zzo.zzi(z8);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzad() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzae(String str, String str2, String str3) {
        String str4;
        try {
            if (!zzaE()) {
                String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzO);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("version", str5);
                    jSONObject.put("sdk", "Google Mobile Ads");
                    jSONObject.put("sdkVersion", "12.4.51-000");
                    str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to build MRAID_ENV", e4);
                    str4 = null;
                }
                super.loadDataWithBaseURL(str, zzcio.zzb(str2, str4), "text/html", "UTF-8", null);
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzaf() {
        if (this.zzL == null) {
            this.zzM.zza();
            zzbfb zzf = zzbfe.zzf();
            this.zzL = zzf;
            this.zzM.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzag(String str, zzblp zzblpVar) {
        zzchl zzchlVar = this.zzo;
        if (zzchlVar != null) {
            zzchlVar.zzA(str, zzblpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzah() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzaj(zzcix zzcixVar) {
        this.zzs = zzcixVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzak(zzbca zzbcaVar) {
        this.zzG = zzbcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzal(boolean z8) {
        this.zzz = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzan(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzao(boolean z8) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzy(this.zzo.zzP(), z8);
        } else {
            this.zzu = z8;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzap(zzbhh zzbhhVar) {
        this.zzF = zzbhhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzaq(boolean z8) {
        String str;
        try {
            boolean z9 = this.zzw;
            this.zzw = z8;
            zzba();
            if (z8 != z9) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzP)).booleanValue()) {
                    if (!this.zzs.zzi()) {
                    }
                }
                zzbuj zzbujVar = new zzbuj(this, "");
                if (true != z8) {
                    str = "default";
                } else {
                    str = "expanded";
                }
                zzbujVar.zzl(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzar(zzbhj zzbhjVar) {
        this.zzE = zzbhjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzas(zzehe zzeheVar) {
        this.zzr = zzeheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzat(zzehg zzehgVar) {
        this.zzq = zzehgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzau(int i9) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzA(i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzav(boolean z8) {
        this.zzY = true;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzax(boolean z8) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i9 = this.zzH;
        int i10 = 1;
        if (true != z8) {
            i10 = -1;
        }
        int i11 = i9 + i10;
        this.zzH = i11;
        if (i11 <= 0 && (zzmVar = this.zzp) != null) {
            zzmVar.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final synchronized void zzay(boolean z8) {
        if (z8) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzB(z8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchd
    public final void zzaz(String str, zzblp zzblpVar) {
        zzchl zzchlVar = this.zzo;
        if (zzchlVar != null) {
            zzchlVar.zzM(str, zzblpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzb(String str, String str2) {
        zzaT(AbstractC2914a.f(str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbok
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdG() {
        zzchl zzchlVar = this.zzo;
        if (zzchlVar != null) {
            zzchlVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdf() {
        zzchl zzchlVar = this.zzo;
        if (zzchlVar != null) {
            zzchlVar.zzdf();
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

    @Override // com.google.android.gms.internal.ads.zzcee
    public final synchronized String zzdi() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void zzdp(zzbam zzbamVar) {
        boolean z8;
        synchronized (this) {
            z8 = zzbamVar.zzj;
            this.zzC = z8;
        }
        zzbd(z8);
    }

    @Override // com.google.android.gms.internal.ads.zzbok
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder o3 = o.o("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Dispatching AFMA event: ".concat(o3.toString()));
        zzaT(o3.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final synchronized int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcik, com.google.android.gms.internal.ads.zzcee
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcee
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final zzbfb zzk() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcee
    public final zzbfc zzm() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcee
    public final VersionInfoParcel zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final zzcdt zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final synchronized zzcfp zzp(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzcfp) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcee
    public final synchronized zzcif zzq() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final synchronized String zzr() {
        zzfgw zzfgwVar = this.zzl;
        if (zzfgwVar == null) {
            return null;
        }
        return zzfgwVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzchd, com.google.android.gms.internal.ads.zzcee
    public final synchronized void zzt(String str, zzcfp zzcfpVar) {
        try {
            if (this.zzV == null) {
                this.zzV = new HashMap();
            }
            this.zzV.put(str, zzcfpVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL != null) {
            zzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzv(boolean z8, long j7) {
        String str;
        HashMap hashMap = new HashMap(2);
        if (true != z8) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("success", str);
        hashMap.put("duration", Long.toString(j7));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final synchronized void zzw() {
        zzbhh zzbhhVar = this.zzF;
        if (zzbhhVar != null) {
            final zzdpt zzdptVar = (zzdpt) zzbhhVar;
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpr
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdpt.this.zzd();
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzx(int i9) {
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzy(int i9) {
    }

    @Override // com.google.android.gms.internal.ads.zzcee
    public final void zzz(boolean z8) {
        this.zzo.zzD(false);
    }
}
