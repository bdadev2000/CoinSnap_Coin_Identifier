package com.google.android.gms.internal.ads;

import a4.j;
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
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzftd;
import com.vungle.ads.n3;
import d6.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import k2.e;
import l2.n;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class zzcgj extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcfk {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcgm zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbfm zzE;
    private zzbfk zzF;
    private zzazz zzG;
    private int zzH;
    private int zzI;
    private zzbcz zzJ;
    private final zzbcz zzK;
    private zzbcz zzL;
    private final zzbda zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzcj zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private Map zzV;
    private final WindowManager zzW;
    private final zzbbl zzX;
    private boolean zzY;
    private final zzchd zzb;
    private final zzavc zzc;
    private final zzffs zzd;
    private final zzbdu zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfet zzk;
    private zzfew zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcfs zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzeew zzq;
    private zzeeu zzr;
    private zzche zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    public zzcgj(zzchd zzchdVar, zzche zzcheVar, String str, boolean z10, boolean z11, zzavc zzavcVar, zzbdu zzbduVar, VersionInfoParcel versionInfoParcel, zzbdc zzbdcVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbbl zzbblVar, zzfet zzfetVar, zzfew zzfewVar, zzffs zzffsVar) {
        super(zzchdVar);
        zzfew zzfewVar2;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzb = zzchdVar;
        this.zzs = zzcheVar;
        this.zzt = str;
        this.zzw = z10;
        this.zzc = zzavcVar;
        this.zzd = zzffsVar;
        this.zze = zzbduVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzW = windowManager;
        com.google.android.gms.ads.internal.zzv.zzq();
        DisplayMetrics zzt = com.google.android.gms.ads.internal.util.zzs.zzt(windowManager);
        this.zzi = zzt;
        this.zzj = zzt.density;
        this.zzX = zzbblVar;
        this.zzk = zzfetVar;
        this.zzl = zzfewVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzcj(zzchdVar.zza(), this, this, null);
        this.zzY = false;
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to enable Javascript.", e2);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlm)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzv.zzq().zzc(zzchdVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzv.zzq();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcc.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzftd zzftdVar = zzs.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaS)).booleanValue()) {
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
        addJavascriptInterface(new zzcgq(this, new zzcgp(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbi();
        zzbda zzbdaVar = new zzbda(new zzbdc(true, "make_wv", this.zzt));
        this.zzM = zzbdaVar;
        zzbdaVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbW)).booleanValue() && (zzfewVar2 = this.zzl) != null && zzfewVar2.zzb != null) {
            zzbdaVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbdaVar.zza();
        zzbcz zzf = zzbdc.zzf();
        this.zzK = zzf;
        zzbdaVar.zzb("native:view_create", zzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzcf.zza().zzb(zzchdVar);
        com.google.android.gms.ads.internal.zzv.zzp().zzt();
    }

    private final synchronized void zzba() {
        zzfet zzfetVar = this.zzk;
        if (zzfetVar != null && zzfetVar.zzam) {
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
            com.google.android.gms.ads.internal.zzv.zzp().zzr();
        }
    }

    private final synchronized void zzbc() {
        if (!this.zzx) {
            setLayerType(1, null);
        }
        this.zzx = true;
    }

    private final void zzbd(boolean z10) {
        String str;
        HashMap hashMap = new HashMap();
        if (true != z10) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("isVisible", str);
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzbe() {
        if (this.zzx) {
            setLayerType(0, null);
        }
        this.zzx = false;
    }

    private final synchronized void zzbf(String str) {
        final String str2 = "about:blank";
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcge
                public final /* synthetic */ String zzb = "about:blank";

                @Override // java.lang.Runnable
                public final void run() {
                    zzcgj.this.zzaW(this.zzb);
                }
            });
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "AdWebViewImpl.loadUrlUnsafe");
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not call loadUrl in destroy(). ", th2);
        }
    }

    private final void zzbg() {
        zzbcu.zza(this.zzM.zza(), this.zzK, "aeh2");
    }

    private final synchronized void zzbh() {
        Map map = this.zzV;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzcdr) it.next()).release();
            }
        }
        this.zzV = null;
    }

    private final void zzbi() {
        zzbda zzbdaVar = this.zzM;
        if (zzbdaVar != null) {
            zzbdc zza2 = zzbdaVar.zza();
            zzbcs zzg = com.google.android.gms.ads.internal.zzv.zzp().zzg();
            if (zzg != null) {
                zzg.zzf(zza2);
            }
        }
    }

    private final synchronized void zzbj() {
        Boolean zzl = com.google.android.gms.ads.internal.zzv.zzp().zzl();
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

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final synchronized void destroy() {
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
        com.google.android.gms.ads.internal.zzv.zzz().zzd(this);
        zzbh();
        this.zzv = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzku)).booleanValue()) {
            Activity zza2 = this.zzb.zza();
            if (zza2 != null && zza2.isDestroyed()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzX();
                return;
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
                zzbf("about:blank");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
        zzX();
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkv)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
            zzcaj.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgd
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgj.this.zzaU(str, valueCallback);
                }
            });
        } else {
            super.evaluateJavascript(str, valueCallback);
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzv) {
                    this.zzo.zzh();
                    com.google.android.gms.ads.internal.zzv.zzz().zzd(this);
                    zzbh();
                    zzbb();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaE()) {
            super.loadData(str, str2, str3);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzaE()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final synchronized void loadUrl(final String str) {
        if (!zzaE()) {
            try {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcgj.this.zzaV(str);
                    }
                });
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "AdWebViewImpl.loadUrl");
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not call loadUrl. ", th2);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfs zzcfsVar = this.zzo;
        if (zzcfsVar != null) {
            zzcfsVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaE()) {
            this.zzQ.zzc();
        }
        if (this.zzY) {
            onResume();
            this.zzY = false;
        }
        boolean z10 = this.zzC;
        zzcfs zzcfsVar = this.zzo;
        if (zzcfsVar != null && zzcfsVar.zzT()) {
            if (!this.zzD) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzD = true;
            }
            zzaZ();
            z10 = true;
        }
        zzbd(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzcfs zzcfsVar;
        synchronized (this) {
            if (!zzaE()) {
                this.zzQ.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzD && (zzcfsVar = this.zzo) != null && zzcfsVar.zzT() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzD = false;
            }
        }
        zzbd(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j3) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkJ)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzT(getContext(), intent);
        } catch (ActivityNotFoundException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
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

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b7 A[Catch: all -> 0x01dd, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x000f, B:12:0x0015, B:14:0x0019, B:17:0x0023, B:19:0x002b, B:22:0x0030, B:24:0x0038, B:26:0x004a, B:29:0x004f, B:31:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0076, B:41:0x008c, B:45:0x007d, B:48:0x0082, B:52:0x0099, B:54:0x00a1, B:56:0x00b3, B:59:0x00b8, B:61:0x00d4, B:62:0x00dc, B:65:0x00d8, B:66:0x00e1, B:68:0x00e9, B:71:0x00f4, B:78:0x0118, B:80:0x011f, B:84:0x0127, B:86:0x0139, B:88:0x0147, B:91:0x0154, B:95:0x0159, B:97:0x019f, B:98:0x01a3, B:100:0x01aa, B:105:0x01b7, B:107:0x01bd, B:108:0x01c0, B:110:0x01c4, B:111:0x01cd, B:117:0x01d8), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0139 A[Catch: all -> 0x01dd, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x000f, B:12:0x0015, B:14:0x0019, B:17:0x0023, B:19:0x002b, B:22:0x0030, B:24:0x0038, B:26:0x004a, B:29:0x004f, B:31:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0076, B:41:0x008c, B:45:0x007d, B:48:0x0082, B:52:0x0099, B:54:0x00a1, B:56:0x00b3, B:59:0x00b8, B:61:0x00d4, B:62:0x00dc, B:65:0x00d8, B:66:0x00e1, B:68:0x00e9, B:71:0x00f4, B:78:0x0118, B:80:0x011f, B:84:0x0127, B:86:0x0139, B:88:0x0147, B:91:0x0154, B:95:0x0159, B:97:0x019f, B:98:0x01a3, B:100:0x01aa, B:105:0x01b7, B:107:0x01bd, B:108:0x01c0, B:110:0x01c4, B:111:0x01cd, B:117:0x01d8), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0159 A[Catch: all -> 0x01dd, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x000f, B:12:0x0015, B:14:0x0019, B:17:0x0023, B:19:0x002b, B:22:0x0030, B:24:0x0038, B:26:0x004a, B:29:0x004f, B:31:0x0056, B:34:0x0060, B:37:0x0065, B:40:0x0076, B:41:0x008c, B:45:0x007d, B:48:0x0082, B:52:0x0099, B:54:0x00a1, B:56:0x00b3, B:59:0x00b8, B:61:0x00d4, B:62:0x00dc, B:65:0x00d8, B:66:0x00e1, B:68:0x00e9, B:71:0x00f4, B:78:0x0118, B:80:0x011f, B:84:0x0127, B:86:0x0139, B:88:0x0147, B:91:0x0154, B:95:0x0159, B:97:0x019f, B:98:0x01a3, B:100:0x01aa, B:105:0x01b7, B:107:0x01bd, B:108:0x01c0, B:110:0x01c4, B:111:0x01cd, B:117:0x01d8), top: B:3:0x0003 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgj.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final void onPause() {
        if (!zzaE()) {
            try {
                super.onPause();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzml)).booleanValue() && g.s("MUTE_AUDIO")) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Muting webview");
                    int i10 = e.a;
                    if (n.f21121e.b()) {
                        ((WebViewProviderBoundaryInterface) e.c(this).f26021c).setAudioMuted(true);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not pause webview.", e2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmo)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AdWebViewImpl.onPause");
                }
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final void onResume() {
        if (!zzaE()) {
            try {
                super.onResume();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzml)).booleanValue() && g.s("MUTE_AUDIO")) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Unmuting webview");
                    int i10 = e.a;
                    if (n.f21121e.b()) {
                        ((WebViewProviderBoundaryInterface) e.c(this).f26021c).setAudioMuted(false);
                        return;
                    }
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not resume webview.", e2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmo)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AdWebViewImpl.onResume");
                }
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdC)).booleanValue() && this.zzo.zzQ()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((this.zzo.zzT() && !this.zzo.zzR()) || z10) {
            synchronized (this) {
                zzbfm zzbfmVar = this.zzE;
                if (zzbfmVar != null) {
                    zzbfmVar.zzd(motionEvent);
                }
            }
        } else {
            zzavc zzavcVar = this.zzc;
            if (zzavcVar != null) {
                zzavcVar.zzd(motionEvent);
            }
            zzbdu zzbduVar = this.zze;
            if (zzbduVar != null) {
                zzbduVar.zzb(motionEvent);
            }
        }
        if (zzaE()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfk
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcfs) {
            this.zzo = (zzcfs) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaE()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not stop loading webview.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final synchronized void zzA(int i10) {
        this.zzN = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzB(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final synchronized void zzC(zzcgm zzcgmVar) {
        if (this.zzB != null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzB = zzcgmVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcfb
    public final zzfet zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgz
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgx
    public final zzavc zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized zzazz zzJ() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized zzbfm zzK() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final /* synthetic */ zzchc zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgw
    public final synchronized zzche zzO() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized zzeeu zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized zzeew zzQ() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgn
    public final zzfew zzR() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final zzffs zzS() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final ua.b zzT() {
        zzbdu zzbduVar = this.zze;
        if (zzbduVar == null) {
            return zzgei.zzh(null);
        }
        return zzbduVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized String zzU() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final List zzV() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzW(zzfet zzfetVar, zzfew zzfewVar) {
        this.zzk = zzfetVar;
        this.zzl = zzfewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzX() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgi(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzY() {
        zzbg();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzZ(int i10) {
        if (i10 == 0) {
            zzbda zzbdaVar = this.zzM;
            zzbcu.zza(zzbdaVar.zza(), this.zzK, "aebb2");
        }
        zzbg();
        this.zzM.zza();
        this.zzM.zza().zzd("close_type", String.valueOf(i10));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i10));
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zza(String str) {
        zzaT(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaA(String str, Predicate predicate) {
        zzcfs zzcfsVar = this.zzo;
        if (zzcfsVar != null) {
            zzcfsVar.zzP(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized boolean zzaC() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final boolean zzaD(final boolean z10, final int i10) {
        destroy();
        this.zzX.zzb(new zzbbk() { // from class: com.google.android.gms.internal.ads.zzcgf
            @Override // com.google.android.gms.internal.ads.zzbbk
            public final void zza(zzbbs.zzt.zza zzaVar) {
                int i11 = zzcgj.zza;
                zzbbs.zzbl.zza zzb = zzbbs.zzbl.zzb();
                boolean zzf = zzb.zzf();
                boolean z11 = z10;
                if (zzf != z11) {
                    zzb.zzd(z11);
                }
                zzb.zze(i10);
                zzaVar.zzab(zzb.zzbr());
            }
        });
        this.zzX.zzc(n3.CONFIGURATION_ERROR);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized boolean zzaE() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized boolean zzaF() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final boolean zzaG() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized boolean zzaH() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11) {
        this.zzo.zzu(zzcVar, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaK(String str, String str2, int i10) {
        this.zzo.zzv(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaL(boolean z10, int i10, boolean z11) {
        this.zzo.zzw(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaM(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zzo.zzy(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgu
    public final void zzaN(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.zzo.zzz(z10, i10, str, z11, z12);
    }

    public final zzcfs zzaO() {
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
        com.google.android.gms.ads.internal.zzv.zzp().zzy(bool);
    }

    public final boolean zzaZ() {
        int i10;
        int i11;
        boolean z10 = false;
        if (this.zzo.zzS() || this.zzo.zzT()) {
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            DisplayMetrics displayMetrics = this.zzi;
            int zzw = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            DisplayMetrics displayMetrics2 = this.zzi;
            int zzw2 = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics2, displayMetrics2.heightPixels);
            Activity zza2 = this.zzb.zza();
            if (zza2 != null && zza2.getWindow() != null) {
                com.google.android.gms.ads.internal.zzv.zzq();
                int[] zzQ = com.google.android.gms.ads.internal.util.zzs.zzQ(zza2);
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                int zzw3 = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zzi, zzQ[0]);
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                i11 = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zzi, zzQ[1]);
                i10 = zzw3;
            } else {
                i10 = zzw;
                i11 = zzw2;
            }
            int i12 = this.zzS;
            if (i12 != zzw || this.zzR != zzw2 || this.zzT != i10 || this.zzU != i11) {
                if (i12 != zzw || this.zzR != zzw2) {
                    z10 = true;
                }
                this.zzS = zzw;
                this.zzR = zzw2;
                this.zzT = i10;
                this.zzU = i11;
                new zzbsk(this, "").zzj(zzw, zzw2, i10, i11, this.zzi.density, this.zzW.getDefaultDisplay().getRotation());
                return z10;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaa() {
        if (this.zzJ == null) {
            zzbda zzbdaVar = this.zzM;
            zzbcu.zza(zzbdaVar.zza(), this.zzK, "aes2");
            this.zzM.zza();
            zzbcz zzf = zzbdc.zzf();
            this.zzJ = zzf;
            this.zzM.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzab() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzv.zzs().zze()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzv.zzs().zza()));
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzab.zzb(getContext())));
        zzd("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzac(boolean z10) {
        this.zzo.zzi(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzad() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzae(String str, String str2, String str3) {
        String str4;
        if (!zzaE()) {
            String[] strArr = new String[1];
            String str5 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzY);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to build MRAID_ENV", e2);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzcgv.zzb(str2, strArr), "text/html", "UTF-8", null);
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaf() {
        if (this.zzL == null) {
            this.zzM.zza();
            zzbcz zzf = zzbdc.zzf();
            this.zzL = zzf;
            this.zzM.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzag(String str, zzbjr zzbjrVar) {
        zzcfs zzcfsVar = this.zzo;
        if (zzcfsVar != null) {
            zzcfsVar.zzA(str, zzbjrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzah() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzaj(zzche zzcheVar) {
        this.zzs = zzcheVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzak(zzazz zzazzVar) {
        this.zzG = zzazzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzal(boolean z10) {
        this.zzz = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzam() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzan(Context context) {
        this.zzb.setBaseContext(context);
        this.zzQ.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzao(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzy(this.zzo.zzS(), z10);
        } else {
            this.zzu = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzap(zzbfk zzbfkVar) {
        this.zzF = zzbfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzaq(boolean z10) {
        String str;
        boolean z11 = this.zzw;
        this.zzw = z10;
        zzba();
        if (z10 != z11) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzZ)).booleanValue() || !this.zzs.zzi()) {
                zzbsk zzbskVar = new zzbsk(this, "");
                if (true != z10) {
                    str = "default";
                } else {
                    str = "expanded";
                }
                zzbskVar.zzl(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzar(zzbfm zzbfmVar) {
        this.zzE = zzbfmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzas(zzeeu zzeeuVar) {
        this.zzr = zzeeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzat(zzeew zzeewVar) {
        this.zzq = zzeewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzau(int i10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzA(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzav(boolean z10) {
        this.zzY = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzax(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i10 = this.zzH;
        int i11 = 1;
        if (true != z10) {
            i11 = -1;
        }
        int i12 = i10 + i11;
        this.zzH = i12;
        if (i12 <= 0 && (zzmVar = this.zzp) != null) {
            zzmVar.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final synchronized void zzay(boolean z10) {
        if (z10) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzB(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzaz(String str, zzbjr zzbjrVar) {
        zzcfs zzcfsVar = this.zzo;
        if (zzcfsVar != null) {
            zzcfsVar.zzO(str, zzbjrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzb(String str, String str2) {
        zzaT(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdG() {
        zzcfs zzcfsVar = this.zzo;
        if (zzcfsVar != null) {
            zzcfsVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdf() {
        zzcfs zzcfsVar = this.zzo;
        if (zzcfsVar != null) {
            zzcfsVar.zzdf();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdg() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdg();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdh() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final synchronized String zzdi() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzdp(zzayl zzaylVar) {
        boolean z10;
        synchronized (this) {
            z10 = zzaylVar.zzj;
            this.zzC = z10;
        }
        zzbd(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder p10 = j.p("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Dispatching AFMA event: ".concat(p10.toString()));
        zzaT(p10.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final synchronized int zzf() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgr, com.google.android.gms.internal.ads.zzccf
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final zzbcz zzk() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final zzbda zzm() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzccf
    public final VersionInfoParcel zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final zzcbu zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final synchronized zzcdr zzp(String str) {
        Map map = this.zzV;
        if (map == null) {
            return null;
        }
        return (zzcdr) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final synchronized zzcgm zzq() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final synchronized String zzr() {
        zzfew zzfewVar = this.zzl;
        if (zzfewVar == null) {
            return null;
        }
        return zzfewVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk, com.google.android.gms.internal.ads.zzccf
    public final synchronized void zzt(String str, zzcdr zzcdrVar) {
        if (this.zzV == null) {
            this.zzV = new HashMap();
        }
        this.zzV.put(str, zzcdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL != null) {
            zzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzv(boolean z10, long j3) {
        String str;
        HashMap hashMap = new HashMap(2);
        if (true != z10) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("success", str);
        hashMap.put("duration", Long.toString(j3));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final synchronized void zzw() {
        zzbfk zzbfkVar = this.zzF;
        if (zzbfkVar != null) {
            final zzdnd zzdndVar = (zzdnd) zzbfkVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdnb
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdnd.this.zzd();
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzx(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzy(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzccf
    public final void zzz(boolean z10) {
        this.zzo.zzD(false);
    }
}
