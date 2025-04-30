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
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgge;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzaxd zzc;
    private final zzfhs zzd;
    private final int zze;
    private final zzdvh zzf;
    private final boolean zzg;
    private final zzgge zzh = zzcci.zze;
    private final zzfoe zzi;
    private final zze zzj;

    public TaggingLibraryJsInterface(WebView webView, zzaxd zzaxdVar, zzdvh zzdvhVar, zzfoe zzfoeVar, zzfhs zzfhsVar, zze zzeVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzaxdVar;
        this.zzf = zzdvhVar;
        zzbep.zza(context);
        this.zze = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjC)).intValue();
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjD)).booleanValue();
        this.zzi = zzfoeVar;
        this.zzd = zzfhsVar;
        this.zzj = zzeVar;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            String zze = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzg) {
                zzp.zzd(this.zzf, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zze;
        } catch (RuntimeException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting click signals. ", e4);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i9) {
        if (i9 <= 0) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Invalid timeout for getting click signals. Timeout=" + i9);
            return "";
        }
        try {
            return (String) zzcci.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzba
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i9, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting click signals with timeout. ", e4);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            if (!(e4 instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzu.zzp();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbe zzbeVar = new zzbe(this, uuid);
        if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
            this.zzj.zzg(this.zzb, zzbeVar);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjF)).booleanValue()) {
                this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbb
                    @Override // java.lang.Runnable
                    public final void run() {
                        TaggingLibraryJsInterface.this.zzc(bundle, zzbeVar);
                    }
                });
            } else {
                QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbeVar);
            }
        }
        return uuid;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            String zzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (this.zzg) {
                zzp.zzd(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zzh;
        } catch (RuntimeException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting view signals. ", e4);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i9) {
        if (i9 <= 0) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Invalid timeout for getting view signals. Timeout=" + i9);
            return "";
        }
        try {
            return (String) zzcci.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzay
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i9, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting view signals with timeout. ", e4);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            if (!(e4 instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(final String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjH)).booleanValue() && !TextUtils.isEmpty(str)) {
            zzcci.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaz
                @Override // java.lang.Runnable
                public final void run() {
                    TaggingLibraryJsInterface.this.zzd(str);
                }
            });
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i9;
        int i10;
        int i11;
        float f9;
        int i12;
        int i13;
        int i14;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i9 = jSONObject.getInt("x");
            i10 = jSONObject.getInt("y");
            i11 = jSONObject.getInt("duration_ms");
            f9 = (float) jSONObject.getDouble("force");
            i12 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e4) {
            e = e4;
        }
        try {
            if (i12 != 0) {
                int i15 = 1;
                if (i12 != 1) {
                    i15 = 2;
                    if (i12 != 2) {
                        i15 = 3;
                        if (i12 != 3) {
                            i13 = -1;
                        }
                    }
                }
                i14 = i15;
                this.zzc.zzd(MotionEvent.obtain(0L, i11, i14, i9, i10, f9, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            }
            i13 = 0;
            this.zzc.zzd(MotionEvent.obtain(0L, i11, i14, i9, i10, f9, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            return;
        } catch (RuntimeException e9) {
            e = e9;
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        } catch (JSONException e10) {
            e = e10;
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        }
        i14 = i13;
    }

    public final /* synthetic */ void zzc(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        boolean z8;
        CookieManager zza = com.google.android.gms.ads.internal.zzu.zzq().zza(this.zza);
        if (zza != null) {
            z8 = zza.acceptThirdPartyCookies(this.zzb);
        } else {
            z8 = false;
        }
        bundle.putBoolean("accept_3p_cookie", z8);
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    public final /* synthetic */ void zzd(String str) {
        zzfhs zzfhsVar;
        Uri parse = Uri.parse(str);
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlW)).booleanValue() && (zzfhsVar = this.zzd) != null) {
                parse = zzfhsVar.zza(parse, this.zza, this.zzb, null);
            } else {
                parse = this.zzc.zza(parse, this.zza, this.zzb, null);
            }
        } catch (zzaxe e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to append the click signal to URL: ", e4);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzc(parse.toString(), null);
    }
}
