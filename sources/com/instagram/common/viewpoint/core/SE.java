package com.instagram.common.viewpoint.core;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public abstract class SE {
    public static String[] A00 = {"GvbI", "ZazQ", "jGVKLNF9IyZZC6yZD7vUdND", "cIibDuYBy4iZiWhBa7aDKVcHYQepg0dA", "kp8Ba6lLXDz7KYAXK4DvfF3NzckJKvFL", "SSvAaaHsDdE6RjWizyVCXkVcp0DozyD6", "SP8di31m2uLOcP53jnkdZfwtPUUyGlI0", "zoV6YIxZR0JxBorwnPIpT"};

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
            com.facebook.ads.redexgen.X.SD r1 = com.instagram.common.viewpoint.core.SD.A00(r4, r2)
            com.facebook.ads.redexgen.X.SD r0 = com.instagram.common.viewpoint.core.SD.A00(r5, r2)
            if (r1 == r0) goto L1e
            return r3
        L1e:
            boolean r0 = r1.A06(r4, r5, r2)
            if (r0 != 0) goto L25
            return r3
        L25:
            int r2 = r2 + 1
            goto Ld
        L28:
            r3 = 1
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.SE.A00
            r0 = 5
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 10
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L4a
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.SE.A00
            java.lang.String r1 = "kAUv4Go12E5I6bj9gVym2"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "RoQebNbND8hZkGW6Dl9KhdG"
            r0 = 2
            r2[r0] = r1
            return r3
        L4a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.SE.A00(org.json.JSONArray, org.json.JSONArray):boolean");
    }

    public static /* synthetic */ boolean A01(JSONArray jSONArray, JSONArray jSONArray2) {
        return A00(jSONArray, jSONArray2);
    }

    public static boolean A02(JSONObject jSONObject, JSONObject jSONObject2) {
        SD A01;
        if (jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (A00[3].charAt(27) != 'p') {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[1] = "ADTX";
            strArr[0] = "wJhB";
            String str = next;
            if (!jSONObject2.has(str) || (A01 = SD.A01(jSONObject, str)) != SD.A01(jSONObject2, str) || !A01.A08(jSONObject, jSONObject2, str)) {
                return false;
            }
        }
        String[] strArr2 = A00;
        String key = strArr2[7];
        if (key.length() == strArr2[2].length()) {
            throw new RuntimeException();
        }
        A00[4] = "f4NlNCElPjJB5pPYNhX2WTR6iFmKnfGM";
        return true;
    }
}
