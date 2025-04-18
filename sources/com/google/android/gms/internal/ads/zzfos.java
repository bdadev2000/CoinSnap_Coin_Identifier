package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzfos implements WebViewCompat.WebMessageListener {
    final /* synthetic */ zzfot zza;

    public zzfos(zzfot zzfotVar) {
        this.zza = zzfotVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z2, JavaScriptReplyProxy javaScriptReplyProxy) {
        webMessageCompat.a(0);
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.f21799b);
            String string = jSONObject.getString(FirebaseAnalytics.Param.METHOD);
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                zzfot.zzd(this.zza, string2);
            } else if (string.equals("finishSession")) {
                zzfot.zzb(this.zza, string2);
            } else {
                zzfof.zza.booleanValue();
            }
        } catch (JSONException e) {
            zzfpy.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
