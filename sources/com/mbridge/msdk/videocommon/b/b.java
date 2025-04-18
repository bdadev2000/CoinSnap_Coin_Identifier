package com.mbridge.msdk.videocommon.b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private int f16337b;

    /* renamed from: c, reason: collision with root package name */
    private a f16338c;

    public b(int i10, int i11, a aVar) {
        this.a = i10;
        this.f16337b = i11;
        this.f16338c = aVar;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.f16337b;
    }

    public static List<b> a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    int optInt = optJSONObject.optInt("id");
                    int optInt2 = optJSONObject.optInt("timeout");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                    arrayList.add(new b(optInt, optInt2, optJSONObject2 != null ? a.a(optJSONObject2) : null));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }
}
