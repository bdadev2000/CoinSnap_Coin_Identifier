package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfot implements T0.d {
    final /* synthetic */ zzfou zza;

    public zzfot(zzfou zzfouVar) {
        this.zza = zzfouVar;
    }

    @Override // T0.d
    public final void onPostMessage(WebView webView, T0.c cVar, Uri uri, boolean z8, T0.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(cVar.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA).getString("adSessionId");
            if (!string.equals("startSession")) {
                if (!string.equals("finishSession")) {
                    zzfog.zza.getClass();
                    return;
                } else {
                    zzfou.zzb(this.zza, string2);
                    return;
                }
            }
            zzfou.zzd(this.zza, string2);
        } catch (JSONException e4) {
            zzfpz.zza("Error parsing JS message in JavaScriptSessionService.", e4);
        }
    }
}
