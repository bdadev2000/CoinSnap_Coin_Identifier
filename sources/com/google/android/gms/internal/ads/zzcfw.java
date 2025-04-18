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
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.net.HttpHeaders;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.e;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
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
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.objectweb.asm.Opcodes;

@VisibleForTesting
/* loaded from: classes3.dex */
public class zzcfw extends WebViewClient implements zzchg {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;

    @Nullable
    private final zzefj zzE;
    private View.OnAttachStateChangeListener zzF;

    @Nullable
    protected zzbyk zza;
    private final zzcfo zzc;

    @Nullable
    private final zzbbu zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzche zzi;
    private zzchf zzj;
    private zzbim zzk;
    private zzbio zzl;
    private zzdga zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private com.google.android.gms.ads.internal.overlay.zzac zzv;

    @Nullable
    private zzbso zzw;
    private com.google.android.gms.ads.internal.zzb zzx;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbsj zzy = null;
    private final HashSet zzD = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfx)).split(",")));

    @VisibleForTesting
    public zzcfw(zzcfo zzcfoVar, @Nullable zzbbu zzbbuVar, boolean z2, zzbso zzbsoVar, @Nullable zzbsj zzbsjVar, @Nullable zzefj zzefjVar) {
        this.zzd = zzbbuVar;
        this.zzc = zzcfoVar;
        this.zzs = z2;
        this.zzw = zzbsoVar;
        this.zzE = zzefjVar;
    }

    @Nullable
    private static WebResourceResponse zzT() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzaO)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    @Nullable
    private final WebResourceResponse zzU(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        WebResourceResponse webResourceResponse;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i2 = 0;
            while (true) {
                i2++;
                if (i2 > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                com.google.android.gms.ads.internal.zzu.zzp().zzf(this.zzc.getContext(), this.zzc.zzn().afmaVersion, false, httpURLConnection, false, 60000);
                webResourceResponse = null;
                com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                zzlVar.zzc(httpURLConnection, null);
                int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                zzlVar.zze(httpURLConnection, httpUrlConnectionGetResponseCode);
                if (httpUrlConnectionGetResponseCode < 300 || httpUrlConnectionGetResponseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (!headerField.startsWith("tel:")) {
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Protocol is null");
                        webResourceResponse = zzT();
                        break;
                    }
                    if (!protocol.equals(e.e) && !protocol.equals(TournamentShareDialogURIBuilder.scheme)) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Unsupported scheme: " + protocol);
                        webResourceResponse = zzT();
                        break;
                    }
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Redirecting to " + headerField);
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    url = url2;
                }
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.zzu.zzp();
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
            com.google.android.gms.ads.internal.zzu.zzp();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i3 = 1;
                    while (true) {
                        if (i3 >= split.length) {
                            break;
                        }
                        if (split[i3].trim().startsWith("charset")) {
                            String[] split2 = split[i3].trim().split(ImpressionLog.R);
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i3++;
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
            webResourceResponse = com.google.android.gms.ads.internal.zzu.zzq().zzb(trim, str3, AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection), httpURLConnection.getResponseMessage(), hashMap, AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection));
            return webResourceResponse;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzV(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbjw) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzW() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzX(final View view, final zzbyk zzbykVar, final int i2) {
        if (!zzbykVar.zzi() || i2 <= 0) {
            return;
        }
        zzbykVar.zzg(view);
        if (zzbykVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfp
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfw.this.zzp(view, zzbykVar, i2);
                }
            }, 100L);
        }
    }

    private static final boolean zzY(zzcfo zzcfoVar) {
        if (zzcfoVar.zzD() != null) {
            return zzcfoVar.zzD().zzai;
        }
        return false;
    }

    private static final boolean zzZ(boolean z2, zzcfo zzcfoVar) {
        return (!z2 || zzcfoVar.zzO().zzi() || zzcfoVar.zzU().equals("interstitial_mb")) ? false : true;
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
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcfw;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(g.f30053h, webView, str);
        safedk_zzcfw_onLoadResource_fa90aff6e4c308385a4ee2e42e35c4ee(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcfw;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(g.f30053h, webView, str);
        safedk_zzcfw_onPageFinished_eedbd03611fff587d086575f0efdbb9e(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        this.zzo = true;
        this.zzp = i2;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaD(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public void safedk_zzcfw_onLoadResource_fa90aff6e4c308385a4ee2e42e35c4ee(WebView p02, String p12) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(p12)));
        Uri parse = Uri.parse(p12);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        }
    }

    public void safedk_zzcfw_onPageFinished_eedbd03611fff587d086575f0efdbb9e(WebView p02, String p12) {
        synchronized (this.zzf) {
            try {
                if (this.zzc.zzaE()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                    this.zzc.zzX();
                    return;
                }
                this.zzz = true;
                zzchf zzchfVar = this.zzj;
                if (zzchfVar != null) {
                    zzchfVar.zza();
                    this.zzj = null;
                }
                zzg();
                if (this.zzc.zzL() != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlx)).booleanValue()) {
                        this.zzc.zzL().zzG(p12);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public WebResourceResponse safedk_zzcfw_shouldInterceptRequest_76469cb841a32960fa3ffe50715d5e43(WebView p02, String p12) {
        return zzc(p12, Collections.emptyMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean safedk_zzcfw_shouldOverrideUrlLoading_4f95321d1fb73144846869c3ae236597(WebView p02, String p12) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(p12)));
        Uri parse = Uri.parse(p12);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        } else {
            if (this.zzn && p02 == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if (e.e.equalsIgnoreCase(scheme) || TournamentShareDialogURIBuilder.scheme.equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbyk zzbykVar = this.zza;
                        if (zzbykVar != null) {
                            zzbykVar.zzh(p12);
                        }
                        this.zzg = null;
                    }
                    zzdga zzdgaVar = this.zzm;
                    if (zzdgaVar != null) {
                        zzdgaVar.zzdG();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(p02, p12);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(p12)));
            } else {
                try {
                    zzavn zzI = this.zzc.zzI();
                    zzfhg zzS = this.zzc.zzS();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlC)).booleanValue() || zzS == null) {
                        if (zzI != null && zzI.zzf(parse)) {
                            Context context = this.zzc.getContext();
                            zzcfo zzcfoVar = this.zzc;
                            parse = zzI.zza(parse, context, (View) zzcfoVar, zzcfoVar.zzi());
                        }
                    } else if (zzI != null && zzI.zzf(parse)) {
                        Context context2 = this.zzc.getContext();
                        zzcfo zzcfoVar2 = this.zzc;
                        parse = zzS.zza(parse, context2, (View) zzcfoVar2, zzcfoVar2.zzi());
                    }
                } catch (zzavo unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to append parameter to URL: ".concat(String.valueOf(p12)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzx;
                if (zzbVar == null || zzbVar.zzc()) {
                    zzu(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true, false);
                } else {
                    zzbVar.zzb(p12);
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f30053h, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcfw;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(g.f30053h, webView, str, safedk_zzcfw_shouldInterceptRequest_76469cb841a32960fa3ffe50715d5e43(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case Opcodes.CASTORE /* 85 */:
            case Opcodes.SASTORE /* 86 */:
            case Opcodes.POP /* 87 */:
            case Opcodes.POP2 /* 88 */:
            case Opcodes.DUP /* 89 */:
            case 90:
            case Opcodes.DUP_X2 /* 91 */:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case Opcodes.LOR /* 129 */:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcfw;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zzcfw_shouldOverrideUrlLoading_4f95321d1fb73144846869c3ae236597 = safedk_zzcfw_shouldOverrideUrlLoading_4f95321d1fb73144846869c3ae236597(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f30053h, webView, str, safedk_zzcfw_shouldOverrideUrlLoading_4f95321d1fb73144846869c3ae236597);
        return safedk_zzcfw_shouldOverrideUrlLoading_4f95321d1fb73144846869c3ae236597;
    }

    public final void zzA(String str, zzbjw zzbjwVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    this.zze.put(str, list);
                }
                list.add(zzbjwVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzB(zzche zzcheVar) {
        this.zzi = zzcheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzC(int i2, int i3) {
        zzbsj zzbsjVar = this.zzy;
        if (zzbsjVar != null) {
            zzbsjVar.zze(i2, i3);
        }
    }

    public final void zzD(boolean z2) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzE(boolean z2) {
        synchronized (this.zzf) {
            this.zzu = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzF() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfq
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfw.this.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzG(boolean z2) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzH(zzchf zzchfVar) {
        this.zzj = zzchfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzI(zzcop zzcopVar, @Nullable zzeey zzeeyVar, @Nullable zzfng zzfngVar) {
        zzM("/click");
        if (zzeeyVar == null || zzfngVar == null) {
            zzA("/click", new zzbiu(this.zzm, zzcopVar));
        } else {
            zzA("/click", new zzfhk(this.zzm, zzcopVar, zzfngVar, zzeeyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzJ(zzcop zzcopVar) {
        zzM("/click");
        zzA("/click", new zzbiu(this.zzm, zzcopVar));
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzK(zzcop zzcopVar, @Nullable zzeey zzeeyVar, @Nullable zzdud zzdudVar) {
        zzM("/open");
        zzA("/open", new zzbki(this.zzx, this.zzy, zzeeyVar, zzdudVar, zzcopVar));
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzL(zzfgh zzfghVar) {
        if (com.google.android.gms.ads.internal.zzu.zzn().zzp(this.zzc.getContext())) {
            zzM("/logScionEvent");
            new HashMap();
            zzA("/logScionEvent", new zzbkc(this.zzc.getContext(), zzfghVar.zzaw));
        }
    }

    public final void zzM(String str) {
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

    public final void zzN(String str, zzbjw zzbjwVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbjwVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzO(String str, Predicate predicate) {
        synchronized (this.zzf) {
            try {
                List<zzbjw> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzbjw zzbjwVar : list) {
                    if (predicate.apply(zzbjwVar)) {
                        arrayList.add(zzbjwVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzP() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzu;
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final boolean zzQ() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzs;
        }
        return z2;
    }

    public final boolean zzR() {
        boolean z2;
        synchronized (this.zzf) {
            z2 = this.zzt;
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzS(@Nullable com.google.android.gms.ads.internal.client.zza zzaVar, @Nullable zzbim zzbimVar, @Nullable com.google.android.gms.ads.internal.overlay.zzr zzrVar, @Nullable zzbio zzbioVar, @Nullable com.google.android.gms.ads.internal.overlay.zzac zzacVar, boolean z2, @Nullable zzbjz zzbjzVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbsq zzbsqVar, @Nullable zzbyk zzbykVar, @Nullable final zzeey zzeeyVar, @Nullable final zzfng zzfngVar, @Nullable zzdud zzdudVar, @Nullable zzbkq zzbkqVar, @Nullable zzdga zzdgaVar, @Nullable zzbkp zzbkpVar, @Nullable zzbkj zzbkjVar, @Nullable zzbjx zzbjxVar, @Nullable zzcop zzcopVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbykVar, null) : zzbVar;
        this.zzy = new zzbsj(this.zzc, zzbsqVar);
        this.zza = zzbykVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzaV)).booleanValue()) {
            zzA("/adMetadata", new zzbil(zzbimVar));
        }
        if (zzbioVar != null) {
            zzA("/appEvent", new zzbin(zzbioVar));
        }
        zzA("/backButton", zzbjv.zzj);
        zzA("/refresh", zzbjv.zzk);
        zzA("/canOpenApp", zzbjv.zzb);
        zzA("/canOpenURLs", zzbjv.zza);
        zzA("/canOpenIntents", zzbjv.zzc);
        zzA("/close", zzbjv.zzd);
        zzA("/customClose", zzbjv.zze);
        zzA("/instrument", zzbjv.zzn);
        zzA("/delayPageLoaded", zzbjv.zzp);
        zzA("/delayPageClosed", zzbjv.zzq);
        zzA("/getLocationInfo", zzbjv.zzr);
        zzA("/log", zzbjv.zzg);
        zzA("/mraid", new zzbkd(zzbVar2, this.zzy, zzbsqVar));
        zzbso zzbsoVar = this.zzw;
        if (zzbsoVar != null) {
            zzA("/mraidLoaded", zzbsoVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzA("/open", new zzbki(zzbVar2, this.zzy, zzeeyVar, zzdudVar, zzcopVar));
        zzA("/precache", new zzcdw());
        zzA("/touch", zzbjv.zzi);
        zzA("/video", zzbjv.zzl);
        zzA("/videoMeta", zzbjv.zzm);
        if (zzeeyVar == null || zzfngVar == null) {
            zzA("/click", new zzbiu(zzdgaVar, zzcopVar));
            zzA("/httpTrack", zzbjv.zzf);
        } else {
            zzA("/click", new zzfhk(zzdgaVar, zzcopVar, zzfngVar, zzeeyVar));
            zzA("/httpTrack", new zzbjw() { // from class: com.google.android.gms.internal.ads.zzfhl
                @Override // com.google.android.gms.internal.ads.zzbjw
                public final void zza(Object obj, Map map) {
                    zzcff zzcffVar = (zzcff) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from httpTrack GMSG.");
                    } else if (zzcffVar.zzD().zzai) {
                        zzeeyVar.zzd(new zzefa(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), ((zzcgr) zzcffVar).zzR().zzb, str, 2));
                    } else {
                        zzfng.this.zzc(str, null);
                    }
                }
            });
        }
        if (com.google.android.gms.ads.internal.zzu.zzn().zzp(this.zzc.getContext())) {
            Map hashMap = new HashMap();
            if (this.zzc.zzD() != null) {
                hashMap = this.zzc.zzD().zzaw;
            }
            zzA("/logScionEvent", new zzbkc(this.zzc.getContext(), hashMap));
        }
        if (zzbjzVar != null) {
            zzA("/setInterstitialProperties", new zzbjy(zzbjzVar));
        }
        if (zzbkqVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzix)).booleanValue()) {
                zzA("/inspectorNetworkExtras", zzbkqVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zziQ)).booleanValue() && zzbkpVar != null) {
            zzA("/shareSheet", zzbkpVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zziV)).booleanValue() && zzbkjVar != null) {
            zzA("/inspectorOutOfContextTest", zzbkjVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zziZ)).booleanValue() && zzbjxVar != null) {
            zzA("/inspectorStorage", zzbjxVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlf)).booleanValue()) {
            zzA("/bindPlayStoreOverlay", zzbjv.zzu);
            zzA("/presentPlayStoreOverlay", zzbjv.zzv);
            zzA("/expandPlayStoreOverlay", zzbjv.zzw);
            zzA("/collapsePlayStoreOverlay", zzbjv.zzx);
            zzA("/closePlayStoreOverlay", zzbjv.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdk)).booleanValue()) {
            zzA("/setPAIDPersonalizationEnabled", zzbjv.zzA);
            zzA("/resetPAID", zzbjv.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlw)).booleanValue()) {
            zzcfo zzcfoVar = this.zzc;
            if (zzcfoVar.zzD() != null && zzcfoVar.zzD().zzar) {
                zzA("/writeToLocalStorage", zzbjv.zzB);
                zzA("/clearLocalStorageKeys", zzbjv.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbimVar;
        this.zzl = zzbioVar;
        this.zzv = zzacVar;
        this.zzx = zzbVar3;
        this.zzm = zzdgaVar;
        this.zzn = z2;
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9 A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TRY_ENTER, TryCatch #13 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0028, B:8:0x003a, B:11:0x0041, B:13:0x004d, B:15:0x0069, B:17:0x0082, B:19:0x0099, B:20:0x009c, B:21:0x009f, B:24:0x00b9, B:26:0x00d1, B:28:0x00ea, B:46:0x01ba, B:47:0x0173, B:50:0x0298, B:64:0x0222, B:65:0x0248, B:58:0x01fd, B:60:0x014f, B:81:0x00de, B:82:0x0249, B:84:0x0253, B:86:0x0259, B:88:0x028c, B:92:0x02a7, B:94:0x02ad, B:96:0x02bb), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0298 A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #13 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0028, B:8:0x003a, B:11:0x0041, B:13:0x004d, B:15:0x0069, B:17:0x0082, B:19:0x0099, B:20:0x009c, B:21:0x009f, B:24:0x00b9, B:26:0x00d1, B:28:0x00ea, B:46:0x01ba, B:47:0x0173, B:50:0x0298, B:64:0x0222, B:65:0x0248, B:58:0x01fd, B:60:0x014f, B:81:0x00de, B:82:0x0249, B:84:0x0253, B:86:0x0259, B:88:0x028c, B:92:0x02a7, B:94:0x02ad, B:96:0x02bb), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f2 A[Catch: all -> 0x01ae, TryCatch #6 {all -> 0x01ae, blocks: (B:41:0x0193, B:43:0x01a5, B:45:0x01b0, B:54:0x01e0, B:56:0x01f2, B:57:0x01f9), top: B:27:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0249 A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #13 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0028, B:8:0x003a, B:11:0x0041, B:13:0x004d, B:15:0x0069, B:17:0x0082, B:19:0x0099, B:20:0x009c, B:21:0x009f, B:24:0x00b9, B:26:0x00d1, B:28:0x00ea, B:46:0x01ba, B:47:0x0173, B:50:0x0298, B:64:0x0222, B:65:0x0248, B:58:0x01fd, B:60:0x014f, B:81:0x00de, B:82:0x0249, B:84:0x0253, B:86:0x0259, B:88:0x028c, B:92:0x02a7, B:94:0x02ad, B:96:0x02bb), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ad A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #13 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0028, B:8:0x003a, B:11:0x0041, B:13:0x004d, B:15:0x0069, B:17:0x0082, B:19:0x0099, B:20:0x009c, B:21:0x009f, B:24:0x00b9, B:26:0x00d1, B:28:0x00ea, B:46:0x01ba, B:47:0x0173, B:50:0x0298, B:64:0x0222, B:65:0x0248, B:58:0x01fd, B:60:0x014f, B:81:0x00de, B:82:0x0249, B:84:0x0253, B:86:0x0259, B:88:0x028c, B:92:0x02a7, B:94:0x02ad, B:96:0x02bb), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c0 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse zzc(java.lang.String r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfw.zzc(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdG() {
        zzdga zzdgaVar = this.zzm;
        if (zzdgaVar != null) {
            zzdgaVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzdf() {
        zzdga zzdgaVar = this.zzm;
        if (zzdgaVar != null) {
            zzdgaVar.zzdf();
        }
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbT)).booleanValue() && this.zzc.zzm() != null) {
                zzbdc.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzche zzcheVar = this.zzi;
            boolean z2 = false;
            if (!this.zzA && !this.zzo) {
                z2 = true;
            }
            zzcheVar.zza(z2, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzh() {
        zzbyk zzbykVar = this.zza;
        if (zzbykVar != null) {
            zzbykVar.zze();
            this.zza = null;
        }
        zzW();
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
                zzbsj zzbsjVar = this.zzy;
                if (zzbsjVar != null) {
                    zzbsjVar.zza(true);
                    this.zzy = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi(boolean z2) {
        this.zzC = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzj(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgx)).booleanValue() || com.google.android.gms.ads.internal.zzu.zzo().zzg() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfr
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = zzcfw.zzb;
                    com.google.android.gms.ads.internal.zzu.zzo().zzg().zze(substring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfw)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfy)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgfo.zzr(com.google.android.gms.ads.internal.zzu.zzp().zzb(uri), new zzcfu(this, list, path, uri), zzcan.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        zzV(com.google.android.gms.ads.internal.util.zzt.zzP(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzk() {
        zzbbu zzbbuVar = this.zzd;
        if (zzbbuVar != null) {
            zzbbuVar.zzc(10005);
        }
        this.zzA = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzchg
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

    public final /* synthetic */ void zzo(boolean z2, long j2) {
        this.zzc.zzv(z2, j2);
    }

    public final /* synthetic */ void zzp(View view, zzbyk zzbykVar, int i2) {
        zzX(view, zzbykVar, i2 - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzq(int i2, int i3, boolean z2) {
        zzbso zzbsoVar = this.zzw;
        if (zzbsoVar != null) {
            zzbsoVar.zzb(i2, i3);
        }
        zzbsj zzbsjVar = this.zzy;
        if (zzbsjVar != null) {
            zzbsjVar.zzd(i2, i3, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchg
    public final void zzr() {
        zzbyk zzbykVar = this.zza;
        if (zzbykVar != null) {
            WebView zzG = this.zzc.zzG();
            WeakHashMap weakHashMap = ViewCompat.f18740a;
            if (zzG.isAttachedToWindow()) {
                zzX(zzG, zzbykVar, 10);
                return;
            }
            zzW();
            zzcft zzcftVar = new zzcft(this, zzbykVar);
            this.zzF = zzcftVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcftVar);
        }
    }

    public final void zzu(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z2, boolean z3) {
        zzcfo zzcfoVar = this.zzc;
        boolean zzaF = zzcfoVar.zzaF();
        boolean z4 = zzZ(zzaF, zzcfoVar) || z3;
        boolean z5 = z4 || !z2;
        com.google.android.gms.ads.internal.client.zza zzaVar = z4 ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = zzaF ? null : this.zzh;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzv;
        zzcfo zzcfoVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzcVar, zzaVar, zzrVar, zzacVar, zzcfoVar2.zzn(), zzcfoVar2, z5 ? null : this.zzm));
    }

    public final void zzv(String str, String str2, int i2) {
        zzefj zzefjVar = this.zzE;
        zzcfo zzcfoVar = this.zzc;
        zzx(new AdOverlayInfoParcel(zzcfoVar, zzcfoVar.zzn(), str, str2, 14, zzefjVar));
    }

    public final void zzw(boolean z2, int i2, boolean z3) {
        zzcfo zzcfoVar = this.zzc;
        boolean zzZ = zzZ(zzcfoVar.zzaF(), zzcfoVar);
        boolean z4 = true;
        if (!zzZ && z3) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzZ ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzv;
        zzcfo zzcfoVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzaVar, zzrVar, zzacVar, zzcfoVar2, z2, i2, zzcfoVar2.zzn(), z4 ? null : this.zzm, zzY(this.zzc) ? this.zzE : null));
    }

    public final void zzx(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbsj zzbsjVar = this.zzy;
        boolean zzf = zzbsjVar != null ? zzbsjVar.zzf() : false;
        com.google.android.gms.ads.internal.zzu.zzi();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzc.getContext(), adOverlayInfoParcel, !zzf);
        zzbyk zzbykVar = this.zza;
        if (zzbykVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbykVar.zzh(str);
        }
    }

    public final void zzy(boolean z2, int i2, String str, String str2, boolean z3) {
        zzcfo zzcfoVar = this.zzc;
        boolean zzaF = zzcfoVar.zzaF();
        boolean zzZ = zzZ(zzaF, zzcfoVar);
        boolean z4 = true;
        if (!zzZ && z3) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzZ ? null : this.zzg;
        zzcfv zzcfvVar = zzaF ? null : new zzcfv(this.zzc, this.zzh);
        zzbim zzbimVar = this.zzk;
        zzbio zzbioVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzv;
        zzcfo zzcfoVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzaVar, zzcfvVar, zzbimVar, zzbioVar, zzacVar, zzcfoVar2, z2, i2, str, str2, zzcfoVar2.zzn(), z4 ? null : this.zzm, zzY(this.zzc) ? this.zzE : null));
    }

    public final void zzz(boolean z2, int i2, String str, boolean z3, boolean z4) {
        zzcfo zzcfoVar = this.zzc;
        boolean zzaF = zzcfoVar.zzaF();
        boolean zzZ = zzZ(zzaF, zzcfoVar);
        boolean z5 = true;
        if (!zzZ && z3) {
            z5 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzZ ? null : this.zzg;
        zzcfv zzcfvVar = zzaF ? null : new zzcfv(this.zzc, this.zzh);
        zzbim zzbimVar = this.zzk;
        zzbio zzbioVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzv;
        zzcfo zzcfoVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzaVar, zzcfvVar, zzbimVar, zzbioVar, zzacVar, zzcfoVar2, z2, i2, str, zzcfoVar2.zzn(), z5 ? null : this.zzm, zzY(this.zzc) ? this.zzE : null, z4));
    }
}
