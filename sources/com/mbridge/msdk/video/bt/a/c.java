package com.mbridge.msdk.video.bt.a;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.mbsignalcommon.windvane.g;
import com.mbridge.msdk.video.bt.a.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {
    int a;

    /* renamed from: b, reason: collision with root package name */
    int f15596b;

    /* renamed from: c, reason: collision with root package name */
    private String f15597c;

    /* loaded from: classes4.dex */
    public static final class a {
        private static c a = new c();
    }

    public static c a() {
        return a.a;
    }

    private c() {
        this.f15597c = "handlerNativeResult";
        this.a = 0;
        this.f15596b = 1;
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
                        int i10 = 0;
                        if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.toString())) {
                            i10 = optJSONObject.optInt("type", 0);
                        }
                        a(this.a, "receivedMessage", obj);
                        if (optString.equalsIgnoreCase("reporter")) {
                            com.mbridge.msdk.mbsignalcommon.a.a.a().a(obj, optString2, optJSONArray, i10);
                            return;
                        } else {
                            if (optString.equalsIgnoreCase("MediaPlayer")) {
                                unused = b.a.a;
                                return;
                            }
                            return;
                        }
                    }
                    a(this.f15596b, "module or method is null", obj);
                    return;
                }
            } catch (Exception e2) {
                ad.a("HandlerH5MessageManager", e2.getMessage());
                a(this.f15596b, e2.getMessage(), obj);
                return;
            } catch (Throwable th2) {
                ad.a("HandlerH5MessageManager", th2.getMessage());
                a(this.f15596b, th2.getMessage(), obj);
                return;
            }
        }
        a(this.f15596b, "params is null", obj);
    }

    private void a(int i10, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            g.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e2) {
            ad.a("HandlerH5MessageManager", e2.getMessage());
        } catch (Throwable th2) {
            ad.a("HandlerH5MessageManager", th2.getMessage());
        }
    }
}
