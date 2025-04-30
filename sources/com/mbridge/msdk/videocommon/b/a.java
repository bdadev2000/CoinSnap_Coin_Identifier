package com.mbridge.msdk.videocommon.b;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f19324a;
    private String b;

    private a(String str, String str2) {
        this.f19324a = str;
        this.b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return new a(jSONObject.optString("appId"), jSONObject.optString("placementId"));
            } catch (Exception e4) {
                e4.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
