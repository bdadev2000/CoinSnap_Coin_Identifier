package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16645a = "a";

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void a(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void b(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void c(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void d(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void e(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void f(Object obj, String str) {
        try {
            if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
                g.a().a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b);
            }
        } catch (Throwable th) {
            ad.b(f16645a, "onSignalCommunication", th);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void g(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void h(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void i(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void j(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void k(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public final void l(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                d.a(obj, new JSONObject(str));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public final void m(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public final void n(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
            return;
        }
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (!TextUtils.isEmpty(str)) {
            if (c9 == null) {
                try {
                    if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b) != null) {
                        c9 = windVaneWebView.getContext();
                    }
                } catch (Exception unused) {
                }
            }
            if (c9 == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    com.mbridge.msdk.click.c.c(c9, optString);
                } else if (optInt == 2) {
                    com.mbridge.msdk.click.c.e(c9, optString);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public final void o(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
            return;
        }
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        if (!TextUtils.isEmpty(str)) {
            if (c9 == null) {
                try {
                    if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b) != null) {
                        c9 = windVaneWebView.getContext();
                    }
                } catch (Exception unused) {
                }
            }
            if (c9 == null) {
                g.a().a(obj, d.a(1));
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", z.l(c9));
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    jSONObject2 = Base64.encodeToString(jSONObject2.getBytes(), 2);
                }
                g.a().a(obj, jSONObject2);
            } catch (Throwable unused2) {
                g.a().a(obj, d.a(1));
            }
        }
    }
}
