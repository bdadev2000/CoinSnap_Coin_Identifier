package com.mbridge.msdk.video.signal.a;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i extends b {

    /* renamed from: a, reason: collision with root package name */
    private WebView f19075a;
    private int b = 0;

    public i(WebView webView) {
        this.f19075a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void a() {
        super.a();
        this.b = 1;
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f19075a, "onSystemPause", "");
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void b() {
        super.b();
        this.b = 0;
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f19075a, "onSystemResume", "");
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void c() {
        super.c();
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f19075a, "onSystemDestory", "");
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void g() {
        super.g();
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f19075a, "onSystemBackPressed", "");
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final int h() {
        return this.b;
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void a(Configuration configuration) {
        super.a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.f19075a, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void a(int i9) {
        super.a(i9);
        this.b = i9;
    }
}
