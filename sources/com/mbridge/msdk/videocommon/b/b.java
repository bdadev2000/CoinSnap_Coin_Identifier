package com.mbridge.msdk.videocommon.b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f19325a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private a f19326c;

    public b(int i9, int i10, a aVar) {
        this.f19325a = i9;
        this.b = i10;
        this.f19326c = aVar;
    }

    public final int a() {
        return this.f19325a;
    }

    public final int b() {
        return this.b;
    }

    public static List<b> a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                    int optInt = optJSONObject.optInt("id");
                    int optInt2 = optJSONObject.optInt("timeout");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("params");
                    arrayList.add(new b(optInt, optInt2, optJSONObject2 != null ? a.a(optJSONObject2) : null));
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            return arrayList;
        }
        return null;
    }
}
