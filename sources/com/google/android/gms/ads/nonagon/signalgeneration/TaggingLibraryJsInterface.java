package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzavd;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzffs;
import com.google.android.gms.internal.ads.zzflr;
import com.google.android.gms.internal.ads.zzges;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzavc zzc;
    private final zzffs zzd;
    private final int zze;
    private final zzdsr zzf;
    private final boolean zzg;
    private final zzges zzh = zzcaj.zze;
    private final zzflr zzi;
    private final zzj zzj;
    private final zza zzk;
    private final zze zzl;

    public TaggingLibraryJsInterface(WebView webView, zzavc zzavcVar, zzdsr zzdsrVar, zzflr zzflrVar, zzffs zzffsVar, zzj zzjVar, zza zzaVar, zze zzeVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzavcVar;
        this.zzf = zzdsrVar;
        zzbcn.zza(context);
        this.zze = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjh)).intValue();
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzji)).booleanValue();
        this.zzi = zzflrVar;
        this.zzd = zzffsVar;
        this.zzj = zzjVar;
        this.zzk = zzaVar;
        this.zzl = zzeVar;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            String zzd = this.zzc.zzc().zzd(this.zza, str, this.zzb);
            if (this.zzg) {
                zzv.zzd(this.zzf, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - currentTimeMillis)));
            }
            return zzd;
        } catch (RuntimeException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting click signals. ", e2);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i10) {
        if (i10 <= 0) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Invalid timeout for getting click signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) zzcaj.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i10, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting click signals with timeout. ", e2);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            if (!(e2 instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzv.zzq();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbk zzbkVar = new zzbk(this, uuid);
        if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
            this.zzj.zzg(this.zzb, zzbkVar);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjk)).booleanValue()) {
                this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
                    @Override // java.lang.Runnable
                    public final void run() {
                        TaggingLibraryJsInterface.this.zze(bundle, zzbkVar);
                    }
                });
            } else {
                QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbkVar);
            }
        }
        return uuid;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            String zzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (this.zzg) {
                zzv.zzd(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - currentTimeMillis)));
            }
            return zzh;
        } catch (RuntimeException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting view signals. ", e2);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Invalid timeout for getting view signals. Timeout=" + i10);
            return "";
        }
        try {
            return (String) zzcaj.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i10, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting view signals with timeout. ", e2);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            if (!(e2 instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(final String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjm)).booleanValue() && !TextUtils.isEmpty(str)) {
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbf
                @Override // java.lang.Runnable
                public final void run() {
                    TaggingLibraryJsInterface.this.zzf(str);
                }
            });
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        int i15;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i10 = jSONObject.getInt("x");
            i11 = jSONObject.getInt("y");
            i12 = jSONObject.getInt("duration_ms");
            f10 = (float) jSONObject.getDouble("force");
            i13 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e2) {
            e = e2;
        }
        try {
            if (i13 != 0) {
                int i16 = 1;
                if (i13 != 1) {
                    i16 = 2;
                    if (i13 != 2) {
                        i16 = 3;
                        if (i13 != 3) {
                            i14 = -1;
                        }
                    }
                }
                i15 = i16;
                this.zzc.zzd(MotionEvent.obtain(0L, i12, i15, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            }
            i14 = 0;
            this.zzc.zzd(MotionEvent.obtain(0L, i12, i15, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            return;
        } catch (RuntimeException e10) {
            e = e10;
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        } catch (JSONException e11) {
            e = e11;
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        }
        i15 = i14;
    }

    public final /* synthetic */ void zze(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        boolean z10;
        CookieManager zza = com.google.android.gms.ads.internal.zzv.zzr().zza(this.zza);
        if (zza != null) {
            z10 = zza.acceptThirdPartyCookies(this.zzb);
        } else {
            z10 = false;
        }
        bundle.putBoolean("accept_3p_cookie", z10);
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    public final /* synthetic */ void zzf(String str) {
        zzffs zzffsVar;
        Uri parse = Uri.parse(str);
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlI)).booleanValue() && (zzffsVar = this.zzd) != null) {
                parse = zzffsVar.zza(parse, this.zza, this.zzb, null);
            } else {
                parse = this.zzc.zza(parse, this.zza, this.zzb, null);
            }
        } catch (zzavd e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to append the click signal to URL: ", e2);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzc(parse.toString(), null);
    }
}
