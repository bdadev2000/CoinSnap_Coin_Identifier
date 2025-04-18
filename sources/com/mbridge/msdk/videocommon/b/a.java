package com.mbridge.msdk.videocommon.b;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f16336b;

    private a(String str, String str2) {
        this.a = str;
        this.f16336b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return new a(jSONObject.optString("appId"), jSONObject.optString("placementId"));
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
