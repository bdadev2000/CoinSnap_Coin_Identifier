package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.WebView;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzgge;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbe extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ TaggingLibraryJsInterface zzb;

    public zzbe(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zza = str;
        this.zzb = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        long j7;
        zzgge zzggeVar;
        WebView webView;
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        Locale locale = Locale.getDefault();
        String str2 = this.zza;
        zzbfv zzbfvVar = zzbgp.zza;
        if (((Boolean) zzbfvVar.zze()).booleanValue()) {
            j7 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjR)).longValue();
        } else {
            j7 = 0;
        }
        final String format = String.format(locale, "window.postMessage({'paw_id': '%1$s', 'error': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", str2, str, Long.valueOf(j7));
        if (((Boolean) zzbfvVar.zze()).booleanValue()) {
            try {
                zzggeVar = this.zzb.zzh;
                zzggeVar.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbc
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebView webView2;
                        webView2 = zzbe.this.zzb.zzb;
                        webView2.evaluateJavascript(format, null);
                    }
                });
                return;
            } catch (RuntimeException e4) {
                com.google.android.gms.ads.internal.zzu.zzo().zzv(e4, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
                return;
            }
        }
        webView = this.zzb.zzb;
        webView.evaluateJavascript(format, null);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        final String format;
        zzgge zzggeVar;
        WebView webView;
        long j7;
        String query = queryInfo.getQuery();
        long j9 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            jSONObject.put("signal", query);
            if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
                j7 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjR)).longValue();
            } else {
                j7 = 0;
            }
            jSONObject.put("sdk_ttl_ms", j7);
            format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            String str = this.zza;
            Locale locale = Locale.getDefault();
            String query2 = queryInfo.getQuery();
            if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
                j9 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjR)).longValue();
            }
            format = String.format(locale, "window.postMessage({'paw_id': '%1$s', 'signal': '%2$s', 'sdk_ttl_ms': %3$d}, '*');", str, query2, Long.valueOf(j9));
        }
        if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
            try {
                zzggeVar = this.zzb.zzh;
                zzggeVar.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbd
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebView webView2;
                        webView2 = zzbe.this.zzb.zzb;
                        webView2.evaluateJavascript(format, null);
                    }
                });
                return;
            } catch (RuntimeException e4) {
                com.google.android.gms.ads.internal.zzu.zzo().zzv(e4, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
                return;
            }
        }
        webView = this.zzb.zzb;
        webView.evaluateJavascript(format, null);
    }
}
