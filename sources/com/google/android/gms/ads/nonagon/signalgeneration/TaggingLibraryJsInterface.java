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
import androidx.compose.foundation.text.input.a;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzavn;
import com.google.android.gms.internal.ads.zzavo;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzdui;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfng;
import com.google.android.gms.internal.ads.zzgfz;
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
    private final zzavn zzc;
    private final zzfhg zzd;
    private final int zze;
    private final zzdui zzf;
    private final boolean zzg;
    private final zzgfz zzh = zzcan.zze;
    private final zzfng zzi;
    private final zzj zzj;
    private final zza zzk;
    private final zze zzl;

    public TaggingLibraryJsInterface(WebView webView, zzavn zzavnVar, zzdui zzduiVar, zzfng zzfngVar, zzfhg zzfhgVar, zzj zzjVar, zza zzaVar, zze zzeVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzavnVar;
        this.zzf = zzduiVar;
        zzbcv.zza(context);
        this.zze = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjf)).intValue();
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjg)).booleanValue();
        this.zzi = zzfngVar;
        this.zzd = zzfhgVar;
        this.zzj = zzjVar;
        this.zzk = zzaVar;
        this.zzl = zzeVar;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            String zze = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzg) {
                zzv.zzd(this.zzf, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zze;
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i2) {
        if (i2 <= 0) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Invalid timeout for getting click signals. Timeout=" + i2);
            return "";
        }
        try {
            return (String) zzcan.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i2, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzu.zzp();
        String uuid = UUID.randomUUID().toString();
        final Bundle c2 = a.c("query_info_type", "requester_type_6");
        final zzbk zzbkVar = new zzbk(this, uuid);
        if (((Boolean) zzbew.zzb.zze()).booleanValue()) {
            this.zzj.zzg(this.zzb, zzbkVar);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzji)).booleanValue()) {
                this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbh
                    @Override // java.lang.Runnable
                    public final void run() {
                        TaggingLibraryJsInterface.this.zze(c2, zzbkVar);
                    }
                });
            } else {
                QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, c2).build(), zzbkVar);
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
                zzv.zzd(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zzh;
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i2) {
        if (i2 <= 0) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Invalid timeout for getting view signals. Timeout=" + i2);
            return "";
        }
        try {
            return (String) zzcan.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i2, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjk)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbf
            @Override // java.lang.Runnable
            public final void run() {
                TaggingLibraryJsInterface.this.zzf(str);
            }
        });
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i2;
        int i3;
        int i4;
        float f2;
        int i5;
        int i6;
        int i7;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i2 = jSONObject.getInt("x");
            i3 = jSONObject.getInt("y");
            i4 = jSONObject.getInt("duration_ms");
            f2 = (float) jSONObject.getDouble("force");
            i5 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e) {
            e = e;
        }
        try {
            if (i5 != 0) {
                int i8 = 1;
                if (i5 != 1) {
                    i8 = 2;
                    if (i5 != 2) {
                        i8 = 3;
                        i7 = i5 != 3 ? -1 : 0;
                    }
                }
                i6 = i8;
                this.zzc.zzd(MotionEvent.obtain(0L, i4, i6, i2, i3, f2, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            }
            this.zzc.zzd(MotionEvent.obtain(0L, i4, i6, i2, i3, f2, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            return;
        } catch (RuntimeException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        } catch (JSONException e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            return;
        }
        i6 = i7;
    }

    public final /* synthetic */ void zze(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager zza = com.google.android.gms.ads.internal.zzu.zzq().zza(this.zza);
        bundle.putBoolean("accept_3p_cookie", zza != null ? zza.acceptThirdPartyCookies(this.zzb) : false);
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    public final /* synthetic */ void zzf(String str) {
        zzfhg zzfhgVar;
        Uri parse = Uri.parse(str);
        try {
            parse = (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlC)).booleanValue() || (zzfhgVar = this.zzd) == null) ? this.zzc.zza(parse, this.zza, this.zzb, null) : zzfhgVar.zza(parse, this.zza, this.zzb, null);
        } catch (zzavo e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to append the click signal to URL: ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzc(parse.toString(), null);
    }
}
