package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.WebView;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzges;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbk extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ TaggingLibraryJsInterface zzb;

    public zzbk(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zza = str;
        this.zzb = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        String str2;
        long j3;
        zzges zzgesVar;
        zze zzeVar;
        WebView webView;
        zza zzaVar;
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            zzaVar = this.zzb.zzk;
            str2 = ",\"appLevelSignals\":".concat(zzaVar.zza().toString());
        } else {
            str2 = "";
        }
        String str3 = this.zza;
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[4];
        objArr[0] = str3;
        objArr[1] = str;
        zzbdx zzbdxVar = zzbes.zzb;
        if (((Boolean) zzbdxVar.zze()).booleanValue()) {
            j3 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjz)).longValue();
        } else {
            j3 = 0;
        }
        objArr[2] = Long.valueOf(j3);
        objArr[3] = str2;
        final String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        if (((Boolean) zzbdxVar.zze()).booleanValue()) {
            try {
                zzgesVar = this.zzb.zzh;
                zzgesVar.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbi
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebView webView2;
                        webView2 = zzbk.this.zzb.zzb;
                        webView2.evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e2) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e2, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            webView = this.zzb.zzb;
            webView.evaluateJavascript(format, null);
        }
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            zzeVar = this.zzb.zzl;
            zzeVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        final String format;
        zza zzaVar;
        zzges zzgesVar;
        zze zzeVar;
        WebView webView;
        long j3;
        zza zzaVar2;
        String query = queryInfo.getQuery();
        long j10 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            jSONObject.put("signal", query);
            if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
                j3 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjz)).longValue();
            } else {
                j3 = 0;
            }
            jSONObject.put("sdk_ttl_ms", j3);
            if (((Boolean) zzbes.zza.zze()).booleanValue()) {
                zzaVar2 = this.zzb.zzk;
                jSONObject.put("appLevelSignals", zzaVar2.zza());
            }
            format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            if (((Boolean) zzbes.zza.zze()).booleanValue()) {
                zzaVar = this.zzb.zzk;
                str = ",\"appLevelSignals\":".concat(zzaVar.zza().toString());
            } else {
                str = "";
            }
            String str2 = this.zza;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[4];
            objArr[0] = str2;
            objArr[1] = queryInfo.getQuery();
            if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
                j10 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjz)).longValue();
            }
            objArr[2] = Long.valueOf(j10);
            objArr[3] = str;
            format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        }
        if (((Boolean) zzbes.zzb.zze()).booleanValue()) {
            try {
                zzgesVar = this.zzb.zzh;
                zzgesVar.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbj
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebView webView2;
                        webView2 = zzbk.this.zzb.zzb;
                        webView2.evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e2) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e2, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            webView = this.zzb.zzb;
            webView.evaluateJavascript(format, null);
        }
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            zzeVar = this.zzb.zzl;
            zzeVar.zzb();
        }
    }
}
