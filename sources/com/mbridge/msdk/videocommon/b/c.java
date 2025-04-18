package com.mbridge.msdk.videocommon.b;

import a4.j;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private int f16339b;

    public c(String str, int i10) {
        this.a = str;
        this.f16339b = i10;
    }

    private static c c() {
        return new c("Virtual Item", 1);
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.f16339b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Reward{name='");
        sb2.append(this.a);
        sb2.append("', amount=");
        return j.i(sb2, this.f16339b, AbstractJsonLexerKt.END_OBJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a A[Catch: Exception -> 0x002f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0001, B:5:0x000f, B:8:0x002a, B:14:0x0017, B:16:0x001d), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.videocommon.b.c b(java.lang.String r3) {
        /*
            r0 = 0
            com.mbridge.msdk.videocommon.d.b r1 = com.mbridge.msdk.videocommon.d.b.a()     // Catch: java.lang.Exception -> L2f
            com.mbridge.msdk.videocommon.d.a r1 = r1.b()     // Catch: java.lang.Exception -> L2f
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L15
            com.mbridge.msdk.videocommon.b.c r3 = c()     // Catch: java.lang.Exception -> L2f
        L13:
            r0 = r3
            goto L28
        L15:
            if (r1 == 0) goto L28
            java.util.Map r2 = r1.j()     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L28
            java.util.Map r1 = r1.j()     // Catch: java.lang.Exception -> L2f
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Exception -> L2f
            com.mbridge.msdk.videocommon.b.c r3 = (com.mbridge.msdk.videocommon.b.c) r3     // Catch: java.lang.Exception -> L2f
            goto L13
        L28:
            if (r0 != 0) goto L33
            com.mbridge.msdk.videocommon.b.c r0 = c()     // Catch: java.lang.Exception -> L2f
            goto L33
        L2f:
            r3 = move-exception
            r3.printStackTrace()
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.b.c.b(java.lang.String):com.mbridge.msdk.videocommon.b.c");
    }

    public final void a(String str) {
        this.a = str;
    }

    public final void a(int i10) {
        this.f16339b = i10;
    }

    public static Map<String, c> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                hashMap.put(optJSONObject.optString("id"), new c(optJSONObject.optString("name"), optJSONObject.optInt("amount")));
            }
            return hashMap;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static c a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("name");
            int optInt = jSONObject.optInt("amount");
            jSONObject.optString("id");
            return new c(optString, optInt);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
