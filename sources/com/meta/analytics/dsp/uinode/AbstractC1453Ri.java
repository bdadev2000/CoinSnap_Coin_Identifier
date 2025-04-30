package com.meta.analytics.dsp.uinode;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ri */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1453Ri {
    /* JADX WARN: Incorrect condition in loop: B:7:0x0011 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(org.json.JSONArray r4, org.json.JSONArray r5) {
        /*
            int r1 = r4.length()
            int r0 = r5.length()
            r3 = 0
            if (r1 == r0) goto Lc
            return r3
        Lc:
            r2 = 0
        Ld:
            int r0 = r4.length()
            if (r2 >= r0) goto L28
            com.facebook.ads.redexgen.X.Rh r1 = com.meta.analytics.dsp.uinode.EnumC1452Rh.A00(r4, r2)
            com.facebook.ads.redexgen.X.Rh r0 = com.meta.analytics.dsp.uinode.EnumC1452Rh.A00(r5, r2)
            if (r1 == r0) goto L1e
            return r3
        L1e:
            boolean r0 = r1.A05(r4, r5, r2)
            if (r0 != 0) goto L25
            return r3
        L25:
            int r2 = r2 + 1
            goto Ld
        L28:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AbstractC1453Ri.A00(org.json.JSONArray, org.json.JSONArray):boolean");
    }

    public static /* synthetic */ boolean A01(JSONArray jSONArray, JSONArray jSONArray2) {
        return A00(jSONArray, jSONArray2);
    }

    public static boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        EnumC1452Rh A01;
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next) || (A01 = EnumC1452Rh.A01(jSONObject, next)) != EnumC1452Rh.A01(jSONObject2, next) || !A01.A07(jSONObject, jSONObject2, next)) {
                return false;
            }
        }
        return true;
    }
}
