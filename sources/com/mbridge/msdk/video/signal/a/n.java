package com.mbridge.msdk.video.signal.a;

import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class n extends f {
    private WebView a;

    public n(WebView webView) {
        this.a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(int i10) {
        super.a(i10);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i10);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.a, "onVideoStatusNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(int i10, String str) {
        super.a(i10, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i10);
            jSONObject.put("pt", str);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.a, "onJSClick", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(MBridgeVideoView.b bVar) {
        super.a(bVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, a(bVar.a, bVar.f16009b));
            jSONObject.put("time", String.valueOf(bVar.a));
            jSONObject.put("duration", String.valueOf(bVar.f16009b));
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.a, "onVideoProgressNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private String a(int i10, int i11) {
        if (i11 != 0) {
            try {
                return ai.a(Double.valueOf(i10 / i11)) + "";
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return i11 + "";
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(Object obj) {
        super.a(obj);
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.a, "webviewshow", (obj == null || !(obj instanceof String)) ? "" : Base64.encodeToString(obj.toString().getBytes(), 2));
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(int i10, int i11, int i12, int i13) {
        super.a(i10, i11, i12, i13);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = "landscape";
            if (i10 != 2 ? i11 != 2 : i11 == 1) {
                str = "portrait";
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i12);
            jSONObject2.put("screen_height", i13);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.a, "showDataInfo", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }
}
