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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public class zzcfs extends WebViewClient implements zzchc {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private boolean zzB;
    private int zzC;
    private boolean zzD;

    @Nullable
    private final zzeea zzF;
    private View.OnAttachStateChangeListener zzG;

    @Nullable
    protected zzbyh zza;
    private final zzcfk zzc;

    @Nullable
    private final zzbbl zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzcha zzi;
    private zzchb zzj;
    private zzbih zzk;
    private zzbij zzl;
    private zzdel zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzac zzw;

    @Nullable
    private zzbsj zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbse zzz = null;
    private final HashSet zzE = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfD)).split(",")));

    public zzcfs(zzcfk zzcfkVar, @Nullable zzbbl zzbblVar, boolean z10, zzbsj zzbsjVar, @Nullable zzbse zzbseVar, @Nullable zzeea zzeeaVar) {
        this.zzd = zzbblVar;
        this.zzc = zzcfkVar;
        this.zzs = z10;
        this.zzx = zzbsjVar;
        this.zzF = zzeeaVar;
    }

    @Nullable
    private static WebResourceResponse zzV() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaR)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    @Nullable
    private final WebResourceResponse zzW(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        WebResourceResponse webResourceResponse;
        String trim;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = 0;
            while (true) {
                i10++;
                if (i10 <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        com.google.android.gms.ads.internal.zzv.zzq().zzf(this.zzc.getContext(), this.zzc.zzn().afmaVersion, false, httpURLConnection, false, 60000);
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
                            if (headerField.startsWith("tel:")) {
                                break;
                            }
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Protocol is null");
                                webResourceResponse = zzV();
                                break;
                            }
                            if (!protocol.equals("http") && !protocol.equals(Constants.SCHEME)) {
                                com.google.android.gms.ads.internal.util.client.zzm.zzj("Unsupported scheme: " + protocol);
                                webResourceResponse = zzV();
                                break;
                            }
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Redirecting to " + headerField);
                            httpURLConnection.disconnect();
                            url = url2;
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
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.zzv.zzq();
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            if (TextUtils.isEmpty(contentType)) {
                trim = "";
            } else {
                trim = contentType.split(";")[0].trim();
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i11 = 1;
                    while (true) {
                        if (i11 >= split.length) {
                            break;
                        }
                        if (split[i11].trim().startsWith("charset")) {
                            String[] split2 = split[i11].trim().split("=");
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i11++;
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
            webResourceResponse = com.google.android.gms.ads.internal.zzv.zzr().zzb(trim, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            return webResourceResponse;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzX(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbjr) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzY() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzG;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzZ(final View view, final zzbyh zzbyhVar, final int i10) {
        if (zzbyhVar.zzi() && i10 > 0) {
            zzbyhVar.zzg(view);
            if (zzbyhVar.zzi()) {
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcfs.this.zzp(view, zzbyhVar, i10);
                    }
                }, 100L);
            }
        }
    }

    private static final boolean zzaa(zzcfk zzcfkVar) {
        if (zzcfkVar.zzD() != null) {
            return zzcfkVar.zzD().zzai;
        }
        return false;
    }

    private static final boolean zzab(boolean z10, zzcfk zzcfkVar) {
        if (z10 && !zzcfkVar.zzO().zzi() && !zzcfkVar.zzU().equals("interstitial_mb")) {
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
            if (this.zzc.zzaE()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzX();
                return;
            }
            this.zzA = true;
            zzchb zzchbVar = this.zzj;
            if (zzchbVar != null) {
                zzchbVar.zza();
                this.zzj = null;
            }
            zzg();
            if (this.zzc.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlD)).booleanValue()) {
                    this.zzc.zzL().zzG(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zzo = true;
        this.zzp = i10;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        zzcfk zzcfkVar = this.zzc;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        return zzcfkVar.zzaD(didCrash, rendererPriorityAtExit);
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
                        zzbyh zzbyhVar = this.zza;
                        if (zzbyhVar != null) {
                            zzbyhVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdel zzdelVar = this.zzm;
                    if (zzdelVar != null) {
                        zzdelVar.zzdG();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzG().willNotDraw()) {
                try {
                    zzavc zzI = this.zzc.zzI();
                    zzffs zzS = this.zzc.zzS();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlI)).booleanValue() && zzS != null) {
                        if (zzI != null && zzI.zzf(parse)) {
                            Context context = this.zzc.getContext();
                            zzcfk zzcfkVar = this.zzc;
                            parse = zzS.zza(parse, context, (View) zzcfkVar, zzcfkVar.zzi());
                        }
                    } else if (zzI != null && zzI.zzf(parse)) {
                        Context context2 = this.zzc.getContext();
                        zzcfk zzcfkVar2 = this.zzc;
                        parse = zzI.zza(parse, context2, (View) zzcfkVar2, zzcfkVar2.zzi());
                    }
                } catch (zzavd unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar != null && !zzbVar.zzc()) {
                    zzbVar.zzb(str);
                } else {
                    zzu(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true, false);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        }
        return true;
    }

    public final void zzA(String str, zzbjr zzbjrVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbjrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzB(zzcha zzchaVar) {
        this.zzi = zzchaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzC(int i10, int i11) {
        zzbse zzbseVar = this.zzz;
        if (zzbseVar != null) {
            zzbseVar.zze(i10, i11);
        }
    }

    public final void zzD(boolean z10) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzE(boolean z10) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzF(boolean z10) {
        synchronized (this.zzf) {
            this.zzv = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzG() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfm
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfs.this.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzH(boolean z10) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzI(zzchb zzchbVar) {
        this.zzj = zzchbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzJ(zzcnb zzcnbVar, @Nullable zzedp zzedpVar, @Nullable zzflr zzflrVar) {
        zzN("/click");
        if (zzedpVar != null && zzflrVar != null) {
            zzA("/click", new zzffw(this.zzm, zzcnbVar, zzflrVar, zzedpVar));
        } else {
            zzA("/click", new zzbip(this.zzm, zzcnbVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzK(zzcnb zzcnbVar) {
        zzN("/click");
        zzA("/click", new zzbip(this.zzm, zzcnbVar));
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzL(zzcnb zzcnbVar, @Nullable zzedp zzedpVar, @Nullable zzdsm zzdsmVar) {
        zzN("/open");
        zzA("/open", new zzbkd(this.zzy, this.zzz, zzedpVar, zzdsmVar, zzcnbVar));
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzM(zzfet zzfetVar) {
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zzc.getContext())) {
            zzN("/logScionEvent");
            new HashMap();
            zzA("/logScionEvent", new zzbjx(this.zzc.getContext(), zzfetVar.zzaw));
        }
    }

    public final void zzN(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzO(String str, zzbjr zzbjrVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbjrVar);
        }
    }

    public final void zzP(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbjr> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbjr zzbjrVar : list) {
                if (predicate.apply(zzbjrVar)) {
                    arrayList.add(zzbjrVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzQ() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzu;
        }
        return z10;
    }

    public final boolean zzR() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzv;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final boolean zzS() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzs;
        }
        return z10;
    }

    public final boolean zzT() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzt;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzU(@Nullable com.google.android.gms.ads.internal.client.zza zzaVar, @Nullable zzbih zzbihVar, @Nullable com.google.android.gms.ads.internal.overlay.zzr zzrVar, @Nullable zzbij zzbijVar, @Nullable com.google.android.gms.ads.internal.overlay.zzac zzacVar, boolean z10, @Nullable zzbju zzbjuVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbsl zzbslVar, @Nullable zzbyh zzbyhVar, @Nullable final zzedp zzedpVar, @Nullable final zzflr zzflrVar, @Nullable zzdsm zzdsmVar, @Nullable zzbkl zzbklVar, @Nullable zzdel zzdelVar, @Nullable zzbkk zzbkkVar, @Nullable zzbke zzbkeVar, @Nullable zzbjs zzbjsVar, @Nullable zzcnb zzcnbVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbyhVar, null) : zzbVar;
        this.zzz = new zzbse(this.zzc, zzbslVar);
        this.zza = zzbyhVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaY)).booleanValue()) {
            zzA("/adMetadata", new zzbig(zzbihVar));
        }
        if (zzbijVar != null) {
            zzA("/appEvent", new zzbii(zzbijVar));
        }
        zzA("/backButton", zzbjq.zzj);
        zzA("/refresh", zzbjq.zzk);
        zzA("/canOpenApp", zzbjq.zzb);
        zzA("/canOpenURLs", zzbjq.zza);
        zzA("/canOpenIntents", zzbjq.zzc);
        zzA("/close", zzbjq.zzd);
        zzA("/customClose", zzbjq.zze);
        zzA("/instrument", zzbjq.zzn);
        zzA("/delayPageLoaded", zzbjq.zzp);
        zzA("/delayPageClosed", zzbjq.zzq);
        zzA("/getLocationInfo", zzbjq.zzr);
        zzA("/log", zzbjq.zzg);
        zzA("/mraid", new zzbjy(zzbVar2, this.zzz, zzbslVar));
        zzbsj zzbsjVar = this.zzx;
        if (zzbsjVar != null) {
            zzA("/mraidLoaded", zzbsjVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzA("/open", new zzbkd(zzbVar2, this.zzz, zzedpVar, zzdsmVar, zzcnbVar));
        zzA("/precache", new zzcds());
        zzA("/touch", zzbjq.zzi);
        zzA("/video", zzbjq.zzl);
        zzA("/videoMeta", zzbjq.zzm);
        if (zzedpVar != null && zzflrVar != null) {
            zzA("/click", new zzffw(zzdelVar, zzcnbVar, zzflrVar, zzedpVar));
            zzA("/httpTrack", new zzbjr() { // from class: com.google.android.gms.internal.ads.zzffx
                @Override // com.google.android.gms.internal.ads.zzbjr
                public final void zza(Object obj, Map map) {
                    zzcfb zzcfbVar = (zzcfb) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from httpTrack GMSG.");
                    } else if (!zzcfbVar.zzD().zzai) {
                        zzflr.this.zzc(str, null);
                    } else {
                        zzedpVar.zzd(new zzedr(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis(), ((zzcgn) zzcfbVar).zzR().zzb, str, 2));
                    }
                }
            });
        } else {
            zzA("/click", new zzbip(zzdelVar, zzcnbVar));
            zzA("/httpTrack", zzbjq.zzf);
        }
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zzc.getContext())) {
            Map hashMap = new HashMap();
            if (this.zzc.zzD() != null) {
                hashMap = this.zzc.zzD().zzaw;
            }
            zzA("/logScionEvent", new zzbjx(this.zzc.getContext(), hashMap));
        }
        if (zzbjuVar != null) {
            zzA("/setInterstitialProperties", new zzbjt(zzbjuVar));
        }
        if (zzbklVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue()) {
                zzA("/inspectorNetworkExtras", zzbklVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziS)).booleanValue() && zzbkkVar != null) {
            zzA("/shareSheet", zzbkkVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziX)).booleanValue() && zzbkeVar != null) {
            zzA("/inspectorOutOfContextTest", zzbkeVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjb)).booleanValue() && zzbjsVar != null) {
            zzA("/inspectorStorage", zzbjsVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlg)).booleanValue()) {
            zzA("/bindPlayStoreOverlay", zzbjq.zzu);
            zzA("/presentPlayStoreOverlay", zzbjq.zzv);
            zzA("/expandPlayStoreOverlay", zzbjq.zzw);
            zzA("/collapsePlayStoreOverlay", zzbjq.zzx);
            zzA("/closePlayStoreOverlay", zzbjq.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdq)).booleanValue()) {
            zzA("/setPAIDPersonalizationEnabled", zzbjq.zzA);
            zzA("/resetPAID", zzbjq.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlC)).booleanValue()) {
            zzcfk zzcfkVar = this.zzc;
            if (zzcfkVar.zzD() != null && zzcfkVar.zzD().zzar) {
                zzA("/writeToLocalStorage", zzbjq.zzB);
                zzA("/clearLocalStorageKeys", zzbjq.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbihVar;
        this.zzl = zzbijVar;
        this.zzw = zzacVar;
        this.zzy = zzbVar3;
        this.zzm = zzdelVar;
        this.zzn = z10;
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TRY_ENTER, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:11:0x003a, B:13:0x0046, B:15:0x0062, B:17:0x007b, B:19:0x0092, B:20:0x0095, B:21:0x0098, B:24:0x00b2, B:26:0x00ca, B:28:0x00e3, B:45:0x01a1, B:46:0x01c4, B:49:0x0289, B:63:0x0213, B:64:0x0239, B:57:0x01ec, B:59:0x0143, B:79:0x00d7, B:80:0x023a, B:82:0x0244, B:84:0x024a, B:86:0x027d, B:90:0x0298, B:92:0x029e, B:94:0x02ac), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0289 A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:11:0x003a, B:13:0x0046, B:15:0x0062, B:17:0x007b, B:19:0x0092, B:20:0x0095, B:21:0x0098, B:24:0x00b2, B:26:0x00ca, B:28:0x00e3, B:45:0x01a1, B:46:0x01c4, B:49:0x0289, B:63:0x0213, B:64:0x0239, B:57:0x01ec, B:59:0x0143, B:79:0x00d7, B:80:0x023a, B:82:0x0244, B:84:0x024a, B:86:0x027d, B:90:0x0298, B:92:0x029e, B:94:0x02ac), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e1 A[Catch: all -> 0x01c8, TryCatch #0 {all -> 0x01c8, blocks: (B:41:0x017d, B:43:0x018f, B:44:0x0196, B:53:0x01cf, B:55:0x01e1, B:56:0x01e8), top: B:27:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023a A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:11:0x003a, B:13:0x0046, B:15:0x0062, B:17:0x007b, B:19:0x0092, B:20:0x0095, B:21:0x0098, B:24:0x00b2, B:26:0x00ca, B:28:0x00e3, B:45:0x01a1, B:46:0x01c4, B:49:0x0289, B:63:0x0213, B:64:0x0239, B:57:0x01ec, B:59:0x0143, B:79:0x00d7, B:80:0x023a, B:82:0x0244, B:84:0x024a, B:86:0x027d, B:90:0x0298, B:92:0x029e, B:94:0x02ac), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029e A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:11:0x003a, B:13:0x0046, B:15:0x0062, B:17:0x007b, B:19:0x0092, B:20:0x0095, B:21:0x0098, B:24:0x00b2, B:26:0x00ca, B:28:0x00e3, B:45:0x01a1, B:46:0x01c4, B:49:0x0289, B:63:0x0213, B:64:0x0239, B:57:0x01ec, B:59:0x0143, B:79:0x00d7, B:80:0x023a, B:82:0x0244, B:84:0x024a, B:86:0x027d, B:90:0x0298, B:92:0x029e, B:94:0x02ac), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b1 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5 */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse zzc(java.lang.String r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfs.zzc(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdG() {
        zzdel zzdelVar = this.zzm;
        if (zzdelVar != null) {
            zzdelVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdf() {
        zzdel zzdelVar = this.zzm;
        if (zzdelVar != null) {
            zzdelVar.zzdf();
        }
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzA && this.zzC <= 0) || this.zzB || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbW)).booleanValue() && this.zzc.zzm() != null) {
                zzbcu.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcha zzchaVar = this.zzi;
            boolean z10 = false;
            if (!this.zzB && !this.zzo) {
                z10 = true;
            }
            zzchaVar.zza(z10, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzh() {
        zzbyh zzbyhVar = this.zza;
        if (zzbyhVar != null) {
            zzbyhVar.zze();
            this.zza = null;
        }
        zzY();
        synchronized (this.zzf) {
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
            this.zzu = false;
            this.zzw = null;
            this.zzy = null;
            this.zzx = null;
            zzbse zzbseVar = this.zzz;
            if (zzbseVar != null) {
                zzbseVar.zza(true);
                this.zzz = null;
            }
        }
    }

    public final void zzi(boolean z10) {
        this.zzD = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzj(Uri uri) {
        final String str;
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfC)).booleanValue() && this.zzE.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfE)).intValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                    zzgei.zzr(com.google.android.gms.ads.internal.zzv.zzq().zzb(uri), new zzcfq(this, list, path, uri), zzcaj.zze);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            zzX(com.google.android.gms.ads.internal.util.zzs.zzP(uri), list, path);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgC)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().zzg() != null) {
            if (path != null && path.length() >= 2) {
                str = path.substring(1);
            } else {
                str = AbstractJsonLexerKt.NULL;
            }
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfn
                @Override // java.lang.Runnable
                public final void run() {
                    int i10 = zzcfs.zzb;
                    com.google.android.gms.ads.internal.zzv.zzp().zzg().zze(str);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzk() {
        zzbbl zzbblVar = this.zzd;
        if (zzbblVar != null) {
            zzbblVar.zzc(10005);
        }
        this.zzB = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzC++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzm() {
        this.zzC--;
        zzg();
    }

    public final /* synthetic */ void zzn() {
        this.zzc.zzad();
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.zzc.zzL();
        if (zzL != null) {
            zzL.zzz();
        }
    }

    public final /* synthetic */ void zzo(boolean z10, long j3) {
        this.zzc.zzv(z10, j3);
    }

    public final /* synthetic */ void zzp(View view, zzbyh zzbyhVar, int i10) {
        zzZ(view, zzbyhVar, i10 - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzq(int i10, int i11, boolean z10) {
        zzbsj zzbsjVar = this.zzx;
        if (zzbsjVar != null) {
            zzbsjVar.zzb(i10, i11);
        }
        zzbse zzbseVar = this.zzz;
        if (zzbseVar != null) {
            zzbseVar.zzd(i10, i11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchc
    public final void zzr() {
        zzbyh zzbyhVar = this.zza;
        if (zzbyhVar != null) {
            WebView zzG = this.zzc.zzG();
            if (ViewCompat.isAttachedToWindow(zzG)) {
                zzZ(zzG, zzbyhVar, 10);
                return;
            }
            zzY();
            zzcfp zzcfpVar = new zzcfp(this, zzbyhVar);
            this.zzG = zzcfpVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcfpVar);
        }
    }

    public final void zzu(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11) {
        boolean z12;
        com.google.android.gms.ads.internal.client.zza zzaVar;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar;
        zzdel zzdelVar;
        zzcfk zzcfkVar = this.zzc;
        boolean zzaF = zzcfkVar.zzaF();
        boolean z13 = false;
        if (!zzab(zzaF, zzcfkVar) && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12 || !z10) {
            z13 = true;
        }
        if (z12) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaF) {
            zzrVar = null;
        } else {
            zzrVar = this.zzh;
        }
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        zzcfk zzcfkVar2 = this.zzc;
        VersionInfoParcel zzn = zzcfkVar2.zzn();
        if (z13) {
            zzdelVar = null;
        } else {
            zzdelVar = this.zzm;
        }
        zzx(new AdOverlayInfoParcel(zzcVar, zzaVar, zzrVar, zzacVar, zzn, zzcfkVar2, zzdelVar));
    }

    public final void zzv(String str, String str2, int i10) {
        zzeea zzeeaVar = this.zzF;
        zzcfk zzcfkVar = this.zzc;
        zzx(new AdOverlayInfoParcel(zzcfkVar, zzcfkVar.zzn(), str, str2, 14, zzeeaVar));
    }

    public final void zzw(boolean z10, int i10, boolean z11) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzdel zzdelVar;
        zzeea zzeeaVar;
        zzcfk zzcfkVar = this.zzc;
        boolean zzab = zzab(zzcfkVar.zzaF(), zzcfkVar);
        boolean z12 = true;
        if (!zzab && z11) {
            z12 = false;
        }
        if (zzab) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        zzcfk zzcfkVar2 = this.zzc;
        VersionInfoParcel zzn = zzcfkVar2.zzn();
        if (z12) {
            zzdelVar = null;
        } else {
            zzdelVar = this.zzm;
        }
        if (zzaa(this.zzc)) {
            zzeeaVar = this.zzF;
        } else {
            zzeeaVar = null;
        }
        zzx(new AdOverlayInfoParcel(zzaVar, zzrVar, zzacVar, zzcfkVar2, z10, i10, zzn, zzdelVar, zzeeaVar));
    }

    public final void zzx(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z10;
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbse zzbseVar = this.zzz;
        if (zzbseVar != null) {
            z10 = zzbseVar.zzf();
        } else {
            z10 = false;
        }
        com.google.android.gms.ads.internal.zzv.zzj();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzc.getContext(), adOverlayInfoParcel, !z10);
        zzbyh zzbyhVar = this.zza;
        if (zzbyhVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbyhVar.zzh(str);
        }
    }

    public final void zzy(boolean z10, int i10, String str, String str2, boolean z11) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzcfr zzcfrVar;
        zzdel zzdelVar;
        zzeea zzeeaVar;
        zzcfk zzcfkVar = this.zzc;
        boolean zzaF = zzcfkVar.zzaF();
        boolean zzab = zzab(zzaF, zzcfkVar);
        boolean z12 = true;
        if (!zzab && z11) {
            z12 = false;
        }
        if (zzab) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaF) {
            zzcfrVar = null;
        } else {
            zzcfrVar = new zzcfr(this.zzc, this.zzh);
        }
        zzbih zzbihVar = this.zzk;
        zzbij zzbijVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        zzcfk zzcfkVar2 = this.zzc;
        VersionInfoParcel zzn = zzcfkVar2.zzn();
        if (z12) {
            zzdelVar = null;
        } else {
            zzdelVar = this.zzm;
        }
        if (zzaa(this.zzc)) {
            zzeeaVar = this.zzF;
        } else {
            zzeeaVar = null;
        }
        zzx(new AdOverlayInfoParcel(zzaVar, zzcfrVar, zzbihVar, zzbijVar, zzacVar, zzcfkVar2, z10, i10, str, str2, zzn, zzdelVar, zzeeaVar));
    }

    public final void zzz(boolean z10, int i10, String str, boolean z11, boolean z12) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzcfr zzcfrVar;
        zzdel zzdelVar;
        zzeea zzeeaVar;
        zzcfk zzcfkVar = this.zzc;
        boolean zzaF = zzcfkVar.zzaF();
        boolean zzab = zzab(zzaF, zzcfkVar);
        boolean z13 = true;
        if (!zzab && z11) {
            z13 = false;
        }
        if (zzab) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaF) {
            zzcfrVar = null;
        } else {
            zzcfrVar = new zzcfr(this.zzc, this.zzh);
        }
        zzbih zzbihVar = this.zzk;
        zzbij zzbijVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        zzcfk zzcfkVar2 = this.zzc;
        VersionInfoParcel zzn = zzcfkVar2.zzn();
        if (z13) {
            zzdelVar = null;
        } else {
            zzdelVar = this.zzm;
        }
        if (zzaa(this.zzc)) {
            zzeeaVar = this.zzF;
        } else {
            zzeeaVar = null;
        }
        zzx(new AdOverlayInfoParcel(zzaVar, zzcfrVar, zzbihVar, zzbijVar, zzacVar, zzcfkVar2, z10, i10, str, zzn, zzdelVar, zzeeaVar, z12));
    }
}
