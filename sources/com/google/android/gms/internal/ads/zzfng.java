package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import k2.d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfng implements d {
    final /* synthetic */ zzfnh zza;

    public zzfng(zzfnh zzfnhVar) {
        this.zza = zzfnhVar;
    }

    @Override // k2.d
    public final void onPostMessage(WebView webView, k2.c cVar, Uri uri, boolean z10, k2.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(cVar.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA).getString("adSessionId");
            if (!string.equals("startSession")) {
                if (!string.equals("finishSession")) {
                    zzfmt.zza.booleanValue();
                    return;
                } else {
                    zzfnh.zzb(this.zza, string2);
                    return;
                }
            }
            zzfnh.zzd(this.zza, string2);
        } catch (JSONException e2) {
            zzfoo.zza("Error parsing JS message in JavaScriptSessionService.", e2);
        }
    }
}
