package com.mbridge.msdk.video.signal.a;

import android.util.Base64;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n extends f {

    /* renamed from: a, reason: collision with root package name */
    private WebView f19094a;

    public n(WebView webView) {
        this.f19094a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(int i9) {
        super.a(i9);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, i9);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f19094a, "onVideoStatusNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(int i9, String str) {
        super.a(i9, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i9);
            jSONObject.put("pt", str);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f19094a, "onJSClick", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(MBridgeVideoView.b bVar) {
        super.a(bVar);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, a(bVar.f18996a, bVar.b));
            jSONObject.put("time", String.valueOf(bVar.f18996a));
            jSONObject.put("duration", String.valueOf(bVar.b));
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f19094a, "onVideoProgressNotify", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private String a(int i9, int i10) {
        if (i10 != 0) {
            try {
                return ai.a(Double.valueOf(i9 / i10)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i10 + "";
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(Object obj) {
        String str;
        super.a(obj);
        if (obj != null && (obj instanceof String)) {
            str = Base64.encodeToString(obj.toString().getBytes(), 2);
        } else {
            str = "";
        }
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f19094a, "webviewshow", str);
    }

    @Override // com.mbridge.msdk.video.signal.a.f, com.mbridge.msdk.video.signal.g
    public final void a(int i9, int i10, int i11, int i12) {
        super.a(i9, i10, i11, i12);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = "landscape";
            if (i9 != 2 ? i10 != 2 : i10 == 1) {
                str = "portrait";
            }
            jSONObject2.put("orientation", str);
            jSONObject2.put("screen_width", i11);
            jSONObject2.put("screen_height", i12);
            jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f19094a, "showDataInfo", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }
}
