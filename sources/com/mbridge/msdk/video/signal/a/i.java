package com.mbridge.msdk.video.signal.a;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class i extends b {
    private WebView a;

    /* renamed from: b, reason: collision with root package name */
    private int f16091b = 0;

    public i(WebView webView) {
        this.a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void a() {
        super.a();
        this.f16091b = 1;
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.a, "onSystemPause", "");
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void b() {
        super.b();
        this.f16091b = 0;
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.a, "onSystemResume", "");
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void c() {
        super.c();
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.a, "onSystemDestory", "");
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void g() {
        super.g();
        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.a, "onSystemBackPressed", "");
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final int h() {
        return this.f16091b;
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
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(this.a, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.a.b, com.mbridge.msdk.video.signal.b
    public final void a(int i10) {
        super.a(i10);
        this.f16091b = i10;
    }
}
