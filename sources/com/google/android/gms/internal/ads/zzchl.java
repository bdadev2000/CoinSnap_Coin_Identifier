package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class zzchl extends WebViewClient implements zzciv {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;

    @Nullable
    private final zzegk zzE;
    private View.OnAttachStateChangeListener zzF;

    @Nullable
    protected zzcaf zza;
    private final zzchd zzc;

    @Nullable
    private final zzbdm zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzp zzh;
    private zzcit zzi;
    private zzciu zzj;
    private zzbkf zzk;
    private zzbkh zzl;
    private zzdhi zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private com.google.android.gms.ads.internal.overlay.zzaa zzv;

    @Nullable
    private zzbui zzw;
    private com.google.android.gms.ads.internal.zzb zzx;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbud zzy = null;
    private final HashSet zzD = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfM)).split(",")));

    public zzchl(zzchd zzchdVar, @Nullable zzbdm zzbdmVar, boolean z8, zzbui zzbuiVar, @Nullable zzbud zzbudVar, @Nullable zzegk zzegkVar) {
        this.zzd = zzbdmVar;
        this.zzc = zzchdVar;
        this.zzs = z8;
        this.zzw = zzbuiVar;
        this.zzE = zzegkVar;
    }

    @Nullable
    private static WebResourceResponse zzS() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaK)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    @Nullable
    private final WebResourceResponse zzT(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        WebResourceResponse webResourceResponse;
        String trim;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i9 = 0;
            while (true) {
                i9++;
                if (i9 <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        com.google.android.gms.ads.internal.zzu.zzp().zzf(this.zzc.getContext(), this.zzc.zzn().afmaVersion, false, httpURLConnection, false, 60000);
                        webResourceResponse = null;
                        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                        zzlVar.zzc(httpURLConnection, null);
                        int responseCode = httpURLConnection.getResponseCode();
                        zzlVar.zze(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            if (!headerField.startsWith("tel:")) {
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Protocol is null");
                                    webResourceResponse = zzS();
                                    break;
                                }
                                if (!protocol.equals("http") && !protocol.equals(Constants.SCHEME)) {
                                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unsupported scheme: " + protocol);
                                    webResourceResponse = zzS();
                                    break;
                                }
                                com.google.android.gms.ads.internal.util.client.zzm.zze("Redirecting to " + headerField);
                                httpURLConnection.disconnect();
                                url = url2;
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.zzu.zzp();
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            if (TextUtils.isEmpty(contentType)) {
                trim = "";
            } else {
                trim = contentType.split(";")[0].trim();
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i10 = 1;
                    while (true) {
                        if (i10 >= split.length) {
                            break;
                        }
                        if (split[i10].trim().startsWith("charset")) {
                            String[] split2 = split[i10].trim().split("=");
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i10++;
                    }
                }
            }
            String str3 = str2;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            webResourceResponse = com.google.android.gms.ads.internal.zzu.zzq().zzb(trim, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            return webResourceResponse;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzblp) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzV() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzW(final View view, final zzcaf zzcafVar, final int i9) {
        if (zzcafVar.zzi() && i9 > 0) {
            zzcafVar.zzg(view);
            if (zzcafVar.zzi()) {
                com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzche
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzchl.this.zzp(view, zzcafVar, i9);
                    }
                }, 100L);
            }
        }
    }

    private static final boolean zzX(zzchd zzchdVar) {
        if (zzchdVar.zzD() != null) {
            return zzchdVar.zzD().zzaj;
        }
        return false;
    }

    private static final boolean zzY(boolean z8, zzchd zzchdVar) {
        if (z8 && !zzchdVar.zzO().zzi() && !zzchdVar.zzU().equals("interstitial_mb")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            try {
                if (this.zzc.zzaE()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                    this.zzc.zzX();
                    return;
                }
                this.zzz = true;
                zzciu zzciuVar = this.zzj;
                if (zzciuVar != null) {
                    zzciuVar.zza();
                    this.zzj = null;
                }
                zzg();
                if (this.zzc.zzL() != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlR)).booleanValue()) {
                        this.zzc.zzL().zzG(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i9, String str, String str2) {
        this.zzo = true;
        this.zzp = i9;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        zzchd zzchdVar = this.zzc;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        return zzchdVar.zzaD(didCrash, rendererPriorityAtExit);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || Constants.SCHEME.equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzcaf zzcafVar = this.zza;
                        if (zzcafVar != null) {
                            zzcafVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdhi zzdhiVar = this.zzm;
                    if (zzdhiVar != null) {
                        zzdhiVar.zzdG();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzG().willNotDraw()) {
                try {
                    zzaxd zzI = this.zzc.zzI();
                    zzfhs zzS = this.zzc.zzS();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlW)).booleanValue() && zzS != null) {
                        if (zzI != null && zzI.zzf(parse)) {
                            Context context = this.zzc.getContext();
                            zzchd zzchdVar = this.zzc;
                            parse = zzS.zza(parse, context, (View) zzchdVar, zzchdVar.zzi());
                        }
                    } else if (zzI != null && zzI.zzf(parse)) {
                        Context context2 = this.zzc.getContext();
                        zzchd zzchdVar2 = this.zzc;
                        parse = zzI.zza(parse, context2, (View) zzchdVar2, zzchdVar2.zzi());
                    }
                } catch (zzaxe unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzx;
                if (zzbVar != null && !zzbVar.zzc()) {
                    this.zzx.zzb(str);
                } else {
                    zzu(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true, false);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        }
        return true;
    }

    public final void zzA(String str, zzblp zzblpVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    this.zze.put(str, list);
                }
                list.add(zzblpVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzB(zzcit zzcitVar) {
        this.zzi = zzcitVar;
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzC(int i9, int i10) {
        zzbud zzbudVar = this.zzy;
        if (zzbudVar != null) {
            zzbudVar.zze(i9, i10);
        }
    }

    public final void zzD(boolean z8) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzE(boolean z8) {
        synchronized (this.zzf) {
            this.zzu = z8;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzF() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchf
                @Override // java.lang.Runnable
                public final void run() {
                    zzchl.this.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzG(boolean z8) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzH(zzciu zzciuVar) {
        this.zzj = zzciuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzI(zzcqd zzcqdVar, @Nullable zzefz zzefzVar, @Nullable zzfoe zzfoeVar) {
        zzL("/click");
        if (zzefzVar != null && zzfoeVar != null) {
            zzA("/click", new zzfhw(this.zzm, zzcqdVar, zzfoeVar, zzefzVar));
        } else {
            zzA("/click", new zzbkn(this.zzm, zzcqdVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzJ(zzcqd zzcqdVar) {
        zzL("/click");
        zzA("/click", new zzbkn(this.zzm, zzcqdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzK(zzcqd zzcqdVar, @Nullable zzefz zzefzVar, @Nullable zzdvc zzdvcVar) {
        zzL("/open");
        zzA("/open", new zzbmb(this.zzx, this.zzy, zzefzVar, zzdvcVar, zzcqdVar));
    }

    public final void zzL(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzM(String str, zzblp zzblpVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzblpVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzN(String str, Predicate predicate) {
        synchronized (this.zzf) {
            try {
                List<zzblp> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzblp zzblpVar : list) {
                    if (predicate.apply(zzblpVar)) {
                        arrayList.add(zzblpVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzO() {
        boolean z8;
        synchronized (this.zzf) {
            z8 = this.zzu;
        }
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final boolean zzP() {
        boolean z8;
        synchronized (this.zzf) {
            z8 = this.zzs;
        }
        return z8;
    }

    public final boolean zzQ() {
        boolean z8;
        synchronized (this.zzf) {
            z8 = this.zzt;
        }
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzR(@Nullable com.google.android.gms.ads.internal.client.zza zzaVar, @Nullable zzbkf zzbkfVar, @Nullable com.google.android.gms.ads.internal.overlay.zzp zzpVar, @Nullable zzbkh zzbkhVar, @Nullable com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, boolean z8, @Nullable zzbls zzblsVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbuk zzbukVar, @Nullable zzcaf zzcafVar, @Nullable final zzefz zzefzVar, @Nullable final zzfoe zzfoeVar, @Nullable zzdvc zzdvcVar, @Nullable zzbmj zzbmjVar, @Nullable zzdhi zzdhiVar, @Nullable zzbmi zzbmiVar, @Nullable zzbmc zzbmcVar, @Nullable zzblq zzblqVar, @Nullable zzcqd zzcqdVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzcafVar, null) : zzbVar;
        this.zzy = new zzbud(this.zzc, zzbukVar);
        this.zza = zzcafVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzaS)).booleanValue()) {
            zzA("/adMetadata", new zzbke(zzbkfVar));
        }
        if (zzbkhVar != null) {
            zzA("/appEvent", new zzbkg(zzbkhVar));
        }
        zzA("/backButton", zzblo.zzj);
        zzA("/refresh", zzblo.zzk);
        zzA("/canOpenApp", zzblo.zzb);
        zzA("/canOpenURLs", zzblo.zza);
        zzA("/canOpenIntents", zzblo.zzc);
        zzA("/close", zzblo.zzd);
        zzA("/customClose", zzblo.zze);
        zzA("/instrument", zzblo.zzn);
        zzA("/delayPageLoaded", zzblo.zzp);
        zzA("/delayPageClosed", zzblo.zzq);
        zzA("/getLocationInfo", zzblo.zzr);
        zzA("/log", zzblo.zzg);
        zzA("/mraid", new zzblw(zzbVar2, this.zzy, zzbukVar));
        zzbui zzbuiVar = this.zzw;
        if (zzbuiVar != null) {
            zzA("/mraidLoaded", zzbuiVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzA("/open", new zzbmb(zzbVar2, this.zzy, zzefzVar, zzdvcVar, zzcqdVar));
        zzA("/precache", new zzcfq());
        zzA("/touch", zzblo.zzi);
        zzA("/video", zzblo.zzl);
        zzA("/videoMeta", zzblo.zzm);
        if (zzefzVar != null && zzfoeVar != null) {
            zzA("/click", new zzfhw(zzdhiVar, zzcqdVar, zzfoeVar, zzefzVar));
            zzA("/httpTrack", new zzblp() { // from class: com.google.android.gms.internal.ads.zzfhx
                @Override // com.google.android.gms.internal.ads.zzblp
                public final void zza(Object obj, Map map) {
                    zzcgu zzcguVar = (zzcgu) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from httpTrack GMSG.");
                    } else if (!zzcguVar.zzD().zzaj) {
                        zzfoe.this.zzc(str, null);
                    } else {
                        zzefzVar.zzd(new zzegb(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), ((zzcig) zzcguVar).zzR().zzb, str, 2));
                    }
                }
            });
        } else {
            zzA("/click", new zzbkn(zzdhiVar, zzcqdVar));
            zzA("/httpTrack", zzblo.zzf);
        }
        if (com.google.android.gms.ads.internal.zzu.zzn().zzp(this.zzc.getContext())) {
            Map hashMap = new HashMap();
            if (this.zzc.zzD() != null) {
                hashMap = this.zzc.zzD().zzax;
            }
            zzA("/logScionEvent", new zzblv(this.zzc.getContext(), hashMap));
        }
        if (zzblsVar != null) {
            zzA("/setInterstitialProperties", new zzblr(zzblsVar));
        }
        if (zzbmjVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue()) {
                zzA("/inspectorNetworkExtras", zzbmjVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjn)).booleanValue() && zzbmiVar != null) {
            zzA("/shareSheet", zzbmiVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjs)).booleanValue() && zzbmcVar != null) {
            zzA("/inspectorOutOfContextTest", zzbmcVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjw)).booleanValue() && zzblqVar != null) {
            zzA("/inspectorStorage", zzblqVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlz)).booleanValue()) {
            zzA("/bindPlayStoreOverlay", zzblo.zzu);
            zzA("/presentPlayStoreOverlay", zzblo.zzv);
            zzA("/expandPlayStoreOverlay", zzblo.zzw);
            zzA("/collapsePlayStoreOverlay", zzblo.zzx);
            zzA("/closePlayStoreOverlay", zzblo.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdi)).booleanValue()) {
            zzA("/setPAIDPersonalizationEnabled", zzblo.zzA);
            zzA("/resetPAID", zzblo.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlQ)).booleanValue()) {
            zzchd zzchdVar = this.zzc;
            if (zzchdVar.zzD() != null && zzchdVar.zzD().zzas) {
                zzA("/writeToLocalStorage", zzblo.zzB);
                zzA("/clearLocalStorageKeys", zzblo.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzpVar;
        this.zzk = zzbkfVar;
        this.zzl = zzbkhVar;
        this.zzv = zzaaVar;
        this.zzx = zzbVar3;
        this.zzm = zzdhiVar;
        this.zzn = z8;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TRY_ENTER, TryCatch #9 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x0026, B:8:0x0038, B:11:0x003f, B:13:0x004b, B:15:0x0068, B:17:0x0081, B:19:0x0098, B:20:0x009b, B:21:0x009e, B:24:0x00b8, B:26:0x00d0, B:28:0x00e9, B:41:0x018c, B:43:0x016e, B:46:0x0251, B:57:0x01dc, B:58:0x0202, B:52:0x01b8, B:53:0x014a, B:67:0x00dd, B:68:0x0203, B:70:0x020d, B:72:0x0213, B:74:0x0245, B:78:0x0260, B:80:0x0266, B:82:0x0274), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0251 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #9 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x0026, B:8:0x0038, B:11:0x003f, B:13:0x004b, B:15:0x0068, B:17:0x0081, B:19:0x0098, B:20:0x009b, B:21:0x009e, B:24:0x00b8, B:26:0x00d0, B:28:0x00e9, B:41:0x018c, B:43:0x016e, B:46:0x0251, B:57:0x01dc, B:58:0x0202, B:52:0x01b8, B:53:0x014a, B:67:0x00dd, B:68:0x0203, B:70:0x020d, B:72:0x0213, B:74:0x0245, B:78:0x0260, B:80:0x0266, B:82:0x0274), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0203 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #9 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x0026, B:8:0x0038, B:11:0x003f, B:13:0x004b, B:15:0x0068, B:17:0x0081, B:19:0x0098, B:20:0x009b, B:21:0x009e, B:24:0x00b8, B:26:0x00d0, B:28:0x00e9, B:41:0x018c, B:43:0x016e, B:46:0x0251, B:57:0x01dc, B:58:0x0202, B:52:0x01b8, B:53:0x014a, B:67:0x00dd, B:68:0x0203, B:70:0x020d, B:72:0x0213, B:74:0x0245, B:78:0x0260, B:80:0x0266, B:82:0x0274), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0266 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #9 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x0026, B:8:0x0038, B:11:0x003f, B:13:0x004b, B:15:0x0068, B:17:0x0081, B:19:0x0098, B:20:0x009b, B:21:0x009e, B:24:0x00b8, B:26:0x00d0, B:28:0x00e9, B:41:0x018c, B:43:0x016e, B:46:0x0251, B:57:0x01dc, B:58:0x0202, B:52:0x01b8, B:53:0x014a, B:67:0x00dd, B:68:0x0203, B:70:0x020d, B:72:0x0213, B:74:0x0245, B:78:0x0260, B:80:0x0266, B:82:0x0274), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0279 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v9 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse zzc(java.lang.String r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchl.zzc(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdG() {
        zzdhi zzdhiVar = this.zzm;
        if (zzdhiVar != null) {
            zzdhiVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhi
    public final void zzdf() {
        zzdhi zzdhiVar = this.zzm;
        if (zzdhiVar != null) {
            zzdhiVar.zzdf();
        }
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue() && this.zzc.zzm() != null) {
                zzbew.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcit zzcitVar = this.zzi;
            boolean z8 = false;
            if (!this.zzA && !this.zzo) {
                z8 = true;
            }
            zzcitVar.zza(z8, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzh() {
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            zzcafVar.zze();
            this.zza = null;
        }
        zzV();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzv = null;
                this.zzx = null;
                this.zzw = null;
                zzbud zzbudVar = this.zzy;
                if (zzbudVar != null) {
                    zzbudVar.zza(true);
                    this.zzy = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi(boolean z8) {
        this.zzC = z8;
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzj(Uri uri) {
        final String str;
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfL)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzfN)).intValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                    zzgft.zzr(com.google.android.gms.ads.internal.zzu.zzp().zzb(uri), new zzchj(this, list, path, uri), zzcci.zze);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            zzU(com.google.android.gms.ads.internal.util.zzt.zzP(uri), list, path);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgV)).booleanValue() && com.google.android.gms.ads.internal.zzu.zzo().zzg() != null) {
            if (path != null && path.length() >= 2) {
                str = path.substring(1);
            } else {
                str = "null";
            }
            zzcci.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchg
                @Override // java.lang.Runnable
                public final void run() {
                    int i9 = zzchl.zzb;
                    com.google.android.gms.ads.internal.zzu.zzo().zzg().zze(str);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzk() {
        zzbdm zzbdmVar = this.zzd;
        if (zzbdmVar != null) {
            zzbdmVar.zzb(zzbdo.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.zzA = true;
        this.zzp = zzbdo.DELAY_PAGE_LOAD_CANCELLED_AD.zza();
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzm() {
        this.zzB--;
        zzg();
    }

    public final /* synthetic */ void zzn() {
        this.zzc.zzad();
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.zzc.zzL();
        if (zzL != null) {
            zzL.zzz();
        }
    }

    public final /* synthetic */ void zzo(boolean z8, long j7) {
        this.zzc.zzv(z8, j7);
    }

    public final /* synthetic */ void zzp(View view, zzcaf zzcafVar, int i9) {
        zzW(view, zzcafVar, i9 - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzq(int i9, int i10, boolean z8) {
        zzbui zzbuiVar = this.zzw;
        if (zzbuiVar != null) {
            zzbuiVar.zzb(i9, i10);
        }
        zzbud zzbudVar = this.zzy;
        if (zzbudVar != null) {
            zzbudVar.zzd(i9, i10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciv
    public final void zzr() {
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            WebView zzG = this.zzc.zzG();
            if (ViewCompat.isAttachedToWindow(zzG)) {
                zzW(zzG, zzcafVar, 10);
                return;
            }
            zzV();
            zzchi zzchiVar = new zzchi(this, zzcafVar);
            this.zzF = zzchiVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzchiVar);
        }
    }

    public final void zzu(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z8, boolean z9) {
        boolean z10;
        com.google.android.gms.ads.internal.client.zza zzaVar;
        com.google.android.gms.ads.internal.overlay.zzp zzpVar;
        zzdhi zzdhiVar;
        zzchd zzchdVar = this.zzc;
        boolean zzaF = zzchdVar.zzaF();
        boolean z11 = false;
        if (zzY(zzaF, zzchdVar) || z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || !z8) {
            z11 = true;
        }
        if (z10) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaF) {
            zzpVar = null;
        } else {
            zzpVar = this.zzh;
        }
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzchd zzchdVar2 = this.zzc;
        VersionInfoParcel zzn = zzchdVar2.zzn();
        if (z11) {
            zzdhiVar = null;
        } else {
            zzdhiVar = this.zzm;
        }
        zzx(new AdOverlayInfoParcel(zzcVar, zzaVar, zzpVar, zzaaVar, zzn, zzchdVar2, zzdhiVar));
    }

    public final void zzv(String str, String str2, int i9) {
        zzegk zzegkVar = this.zzE;
        zzchd zzchdVar = this.zzc;
        zzx(new AdOverlayInfoParcel(zzchdVar, zzchdVar.zzn(), str, str2, 14, zzegkVar));
    }

    public final void zzw(boolean z8, int i9, boolean z9) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzdhi zzdhiVar;
        zzegk zzegkVar;
        zzchd zzchdVar = this.zzc;
        boolean zzY = zzY(zzchdVar.zzaF(), zzchdVar);
        boolean z10 = true;
        if (!zzY && z9) {
            z10 = false;
        }
        if (zzY) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzchd zzchdVar2 = this.zzc;
        VersionInfoParcel zzn = zzchdVar2.zzn();
        if (z10) {
            zzdhiVar = null;
        } else {
            zzdhiVar = this.zzm;
        }
        if (zzX(this.zzc)) {
            zzegkVar = this.zzE;
        } else {
            zzegkVar = null;
        }
        zzx(new AdOverlayInfoParcel(zzaVar, zzpVar, zzaaVar, zzchdVar2, z8, i9, zzn, zzdhiVar, zzegkVar));
    }

    public final void zzx(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z8;
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbud zzbudVar = this.zzy;
        if (zzbudVar != null) {
            z8 = zzbudVar.zzf();
        } else {
            z8 = false;
        }
        com.google.android.gms.ads.internal.zzu.zzi();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzc.getContext(), adOverlayInfoParcel, !z8);
        zzcaf zzcafVar = this.zza;
        if (zzcafVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcafVar.zzh(str);
        }
    }

    public final void zzy(boolean z8, int i9, String str, String str2, boolean z9) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzchk zzchkVar;
        zzdhi zzdhiVar;
        zzegk zzegkVar;
        zzchd zzchdVar = this.zzc;
        boolean zzaF = zzchdVar.zzaF();
        boolean zzY = zzY(zzaF, zzchdVar);
        boolean z10 = true;
        if (!zzY && z9) {
            z10 = false;
        }
        if (zzY) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaF) {
            zzchkVar = null;
        } else {
            zzchkVar = new zzchk(this.zzc, this.zzh);
        }
        zzbkf zzbkfVar = this.zzk;
        zzbkh zzbkhVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzchd zzchdVar2 = this.zzc;
        VersionInfoParcel zzn = zzchdVar2.zzn();
        if (z10) {
            zzdhiVar = null;
        } else {
            zzdhiVar = this.zzm;
        }
        if (zzX(this.zzc)) {
            zzegkVar = this.zzE;
        } else {
            zzegkVar = null;
        }
        zzx(new AdOverlayInfoParcel(zzaVar, zzchkVar, zzbkfVar, zzbkhVar, zzaaVar, zzchdVar2, z8, i9, str, str2, zzn, zzdhiVar, zzegkVar));
    }

    public final void zzz(boolean z8, int i9, String str, boolean z9, boolean z10) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzchk zzchkVar;
        zzdhi zzdhiVar;
        zzegk zzegkVar;
        zzchd zzchdVar = this.zzc;
        boolean zzaF = zzchdVar.zzaF();
        boolean zzY = zzY(zzaF, zzchdVar);
        boolean z11 = true;
        if (!zzY && z9) {
            z11 = false;
        }
        if (zzY) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaF) {
            zzchkVar = null;
        } else {
            zzchkVar = new zzchk(this.zzc, this.zzh);
        }
        zzbkf zzbkfVar = this.zzk;
        zzbkh zzbkhVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzchd zzchdVar2 = this.zzc;
        VersionInfoParcel zzn = zzchdVar2.zzn();
        if (z11) {
            zzdhiVar = null;
        } else {
            zzdhiVar = this.zzm;
        }
        if (zzX(this.zzc)) {
            zzegkVar = this.zzE;
        } else {
            zzegkVar = null;
        }
        zzx(new AdOverlayInfoParcel(zzaVar, zzchkVar, zzbkfVar, zzbkhVar, zzaaVar, zzchdVar2, z8, i9, str, zzn, zzdhiVar, zzegkVar, z10));
    }
}
