package com.mbridge.msdk.video.bt.a;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.bt.a.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    int f18361a;
    int b;

    /* renamed from: c, reason: collision with root package name */
    private String f18362c;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static c f18363a = new c();
    }

    public static c a() {
        return a.f18363a;
    }

    private c() {
        this.f18362c = "handlerNativeResult";
        this.f18361a = 0;
        this.b = 1;
    }

    public final void a(Object obj, JSONObject jSONObject) {
        b unused;
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String optString = jSONObject.optString("uniqueIdentifier");
                    String optString2 = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
                        JSONObject optJSONObject = jSONObject.optJSONObject("result");
                        int i9 = 0;
                        if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.toString())) {
                            i9 = optJSONObject.optInt("type", 0);
                        }
                        a(this.f18361a, "receivedMessage", obj);
                        if (optString.equalsIgnoreCase("reporter")) {
                            com.mbridge.msdk.mbsignalcommon.a.a.a().a(obj, optString2, optJSONArray, i9);
                            return;
                        } else {
                            if (optString.equalsIgnoreCase("MediaPlayer")) {
                                unused = b.a.f18360a;
                                return;
                            }
                            return;
                        }
                    }
                    a(this.b, "module or method is null", obj);
                    return;
                }
            } catch (Exception e4) {
                ad.a("HandlerH5MessageManager", e4.getMessage());
                a(this.b, e4.getMessage(), obj);
                return;
            } catch (Throwable th) {
                ad.a("HandlerH5MessageManager", th.getMessage());
                a(this.b, th.getMessage(), obj);
                return;
            }
        }
        a(this.b, "params is null", obj);
    }

    private void a(int i9, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i9);
            jSONObject.put("message", str);
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e4) {
            ad.a("HandlerH5MessageManager", e4.getMessage());
        } catch (Throwable th) {
            ad.a("HandlerH5MessageManager", th.getMessage());
        }
    }
}
