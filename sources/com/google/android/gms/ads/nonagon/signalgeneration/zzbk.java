package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.WebView;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzgfz;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
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
        long j2;
        zzgfz zzgfzVar;
        zze zzeVar;
        WebView webView;
        zza zzaVar;
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        if (((Boolean) zzbew.zza.zze()).booleanValue()) {
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
        zzbeb zzbebVar = zzbew.zzb;
        if (((Boolean) zzbebVar.zze()).booleanValue()) {
            j2 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjx)).longValue();
        } else {
            j2 = 0;
        }
        objArr[2] = Long.valueOf(j2);
        objArr[3] = str2;
        final String format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        if (((Boolean) zzbebVar.zze()).booleanValue()) {
            try {
                zzgfzVar = this.zzb.zzh;
                zzgfzVar.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbi
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebView webView2;
                        webView2 = zzbk.this.zzb.zzb;
                        webView2.evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            webView = this.zzb.zzb;
            webView.evaluateJavascript(format, null);
        }
        if (((Boolean) zzbew.zza.zze()).booleanValue()) {
            zzeVar = this.zzb.zzl;
            zzeVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        final String format;
        zza zzaVar;
        zzgfz zzgfzVar;
        zze zzeVar;
        WebView webView;
        long j2;
        zza zzaVar2;
        String query = queryInfo.getQuery();
        long j3 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            jSONObject.put("signal", query);
            if (((Boolean) zzbew.zzb.zze()).booleanValue()) {
                j2 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjx)).longValue();
            } else {
                j2 = 0;
            }
            jSONObject.put("sdk_ttl_ms", j2);
            if (((Boolean) zzbew.zza.zze()).booleanValue()) {
                zzaVar2 = this.zzb.zzk;
                jSONObject.put("appLevelSignals", zzaVar2.zza());
            }
            format = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            if (((Boolean) zzbew.zza.zze()).booleanValue()) {
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
            if (((Boolean) zzbew.zzb.zze()).booleanValue()) {
                j3 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjx)).longValue();
            }
            objArr[2] = Long.valueOf(j3);
            objArr[3] = str;
            format = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", objArr);
        }
        if (((Boolean) zzbew.zzb.zze()).booleanValue()) {
            try {
                zzgfzVar = this.zzb.zzh;
                zzgfzVar.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbj
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebView webView2;
                        webView2 = zzbk.this.zzb.zzb;
                        webView2.evaluateJavascript(format, null);
                    }
                });
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            webView = this.zzb.zzb;
            webView.evaluateJavascript(format, null);
        }
        if (((Boolean) zzbew.zza.zze()).booleanValue()) {
            zzeVar = this.zzb.zzl;
            zzeVar.zzb();
        }
    }
}
