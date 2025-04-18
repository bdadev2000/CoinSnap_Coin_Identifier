package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1173b5 extends C1F implements Serializable {
    public static JSONObject A0F = null;
    public static byte[] A0G = null;
    public static String[] A0H = {"1gqRR9im7tmNjhPy8NnQpjCX4rd8Ielc", "ZkOx7RNEMabKvQ7fgN15WIbWDw11JZFu", "ifeh8sROmLFDdOYqa0sy0eFfj5RHH1gU", "fnDzwAhU6GMUs0cCq2fTQuWEzv5lBJki", "OVtNfYqIZ80xqW4zrHdkYxbTKYgYXHc", "chIpxbYwiAOd1RIHlv8aEwW7ihQHRwI", "GnSiEcQE", "uApEYGhuY9oy1RN675k2bDQ9FUD4oA7y"};
    public static final LinkedHashMap<String, String> A0I;
    public static final long serialVersionUID = -5352540727250859603L;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C1C A05;
    public C1U A06;
    public C1X A07;
    public C02451a A08;
    public C02511g A09;
    public String A0A;
    public final List<C1G> A0D;
    public boolean A0B = false;
    public boolean A0C = false;
    public final Map<String, String> A0E = new HashMap();

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        String[] strArr = A0H;
        if (strArr[2].charAt(14) == strArr[1].charAt(14)) {
            throw new RuntimeException();
        }
        A0H[5] = "bfB1pGz3pHLReaUGKuLSmGsyYLYBAtW";
        A0G = new byte[]{40, 45, Ascii.SYN, 42, 33, 38, 32, 42, 44, 58, Ascii.SYN, 37, 32, 39, 34, Ascii.SYN, 60, 59, 37, 118, 121, 72, 123, 120, 112, 120, 72, 99, 110, 103, 114, 81, 69, 68, 95, 83, 92, 89, 83, 91, 111, 83, 95, 69, 94, 68, 84, 95, 71, 94, 111, 68, 89, 93, 85, 89, 77, 76, 87, 91, 84, 81, 91, 83, 103, 91, 76, 89, 103, 76, 81, 85, 93, 37, 49, 48, 43, 39, 40, 45, 39, 47, Ascii.ESC, 34, 40, 37, 50, 43, 54, 0, 2, 0, Ascii.VT, 6, 60, 2, Ascii.DLE, Ascii.DLE, 6, Ascii.ETB, Ascii.DLE, 34, 32, 51, 46, 52, 50, 36, 45, 9, 2, Ascii.VT, 3, 4, 53, Ascii.VT, Ascii.SO, Ascii.EM, 53, Ascii.FF, Ascii.CAN, Ascii.SI, Ascii.ESC, Ascii.US, Ascii.SI, 4, 9, 19, 102, 106, 104, 43, 99, 100, 102, 96, 103, 106, 106, 110, 43, 100, 97, 118, 43, 108, 107, 113, 96, 119, 118, 113, 108, 113, 108, 100, 105, 43, 99, 108, 107, 108, 118, 109, 90, 100, 102, 113, 108, 115, 108, 113, 124, 81, 70, 35, 52, 43, Ascii.CAN, 38, 55, 55, Ascii.CAN, 37, 40, 50, 41, 35, Ascii.CAN, 50, 53, 43, 52, 82, 86, 0, 85, 107, 83, 68, 107, 91, 66, 81, 70, 88, 85, 77, 107, 71, 81, 87, 65, 70, 81, 107, 64, 91, 95, 81, 90, 10, 0, Ascii.FF, Ascii.CR, 45, 42, 55, 48, 37, 40, 40, Ascii.ESC, 54, 33, 34, 33, 54, 54, 33, 54, 91, 92, 70, 87, 64, 65, 70, 91, 70, 91, 83, 94, 78, 67, 76, 70, 81, 65, 67, 82, 71, 73, 68, 92, 74, 80, 81, 108, 115, 110, 104, 110, 125, 117, 104, 50, 37, 55, 33, 50, 36, 37, 36, Ascii.US, 54, 41, 36, 37, 47, 59, 32, 39, Base64.padSymbol, 36, 44, Ascii.ETB, 36, 39, 47, Ascii.ETB, 41, 38, 49, Ascii.ETB, 33, 41, 42, Ascii.ETB, 43, 36, 33, 43, 35, Ascii.ETB, 39, 38, 43, 45, 112, 109, 112, 104, 97, Ascii.EM, Ascii.RS, 0};
    }

    static {
        A09();
        A0I = new LinkedHashMap<>(10, 0.75f, false);
    }

    public AbstractC1173b5(List<C1G> list) {
        this.A0D = list;
    }

    public static String A06(String str) {
        return A0I.get(str);
    }

    private HashMap<String, String> A07(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A05(175, 18, 123));
        HashMap<String, String> hashMap = new HashMap<>();
        if (optJSONObject == null) {
            return hashMap;
        }
        Iterator<String> nameItr = optJSONObject.keys();
        while (nameItr.hasNext()) {
            try {
                String next = nameItr.next();
                hashMap.put(next, optJSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    public static List<C1G> A08(JSONObject jSONObject, C1070Yn c1070Yn, C1S c1s) {
        JSONArray optJSONArray = jSONObject.optJSONArray(A05(101, 8, 125));
        if (optJSONArray != null && optJSONArray.length() > 0) {
            return C1O.A01(optJSONArray, jSONObject, c1070Yn, c1s);
        }
        List<AdInfo> adInfoList = new ArrayList<>();
        C1G A00 = C1G.A00(jSONObject);
        c1s.A3N(A00, jSONObject);
        adInfoList.add(A00);
        return adInfoList;
    }

    private void A0A(int i10) {
        this.A00 = i10;
    }

    private final void A0B(int i10) {
        this.A04 = i10;
    }

    private void A0C(C1C c1c) {
        this.A05 = c1c;
    }

    private final void A0D(C1U c1u) {
        this.A06 = c1u;
    }

    private void A0E(C1X c1x) {
        this.A07 = c1x;
    }

    private final void A0F(C02451a c02451a) {
        this.A08 = c02451a;
    }

    private void A0G(C02511g c02511g) {
        this.A09 = c02511g;
    }

    private void A0H(String str) {
        this.A0A = str;
    }

    public final int A0r() {
        return this.A00;
    }

    public final int A0s() {
        return this.A01;
    }

    public final int A0t() {
        return this.A02;
    }

    public final int A0u() {
        return this.A03;
    }

    public final int A0v() {
        return this.A04;
    }

    public final C1C A0w() {
        return this.A05;
    }

    public final C1G A0x() {
        return this.A0D.get(0);
    }

    public final C1U A0y() {
        return this.A06;
    }

    public final C1X A0z() {
        return this.A07;
    }

    public final C02451a A10() {
        return this.A08;
    }

    public final C02511g A11() {
        return this.A09;
    }

    public final String A12() {
        return this.A0A;
    }

    public final String A13(String str) {
        return this.A0E.get(str);
    }

    public final List<C1G> A14() {
        return Collections.unmodifiableList(this.A0D);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A15(com.facebook.ads.redexgen.uinode.MC r8) {
        /*
            r7 = this;
            java.lang.String r5 = r7.A0P()
            int r0 = r5.hashCode()
            switch(r0) {
                case -1364000502: goto L39;
                case 604727084: goto L27;
                default: goto Lb;
            }
        Lb:
            r0 = -1
        Lc:
            switch(r0) {
                case 0: goto L10;
                case 1: goto L1d;
                default: goto Lf;
            }
        Lf:
            return
        L10:
            r2 = 128(0x80, float:1.8E-43)
            r1 = 45
            r0 = 57
            java.lang.String r0 = A05(r2, r1, r0)
            r8.A43(r0)
        L1d:
            com.facebook.ads.redexgen.X.QP r0 = com.facebook.ads.redexgen.uinode.QP.A08
            java.lang.String r0 = r0.A02()
            r8.A43(r0)
            goto Lf
        L27:
            r2 = 241(0xf1, float:3.38E-43)
            r1 = 12
            r0 = 14
            java.lang.String r0 = A05(r2, r1, r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb
            r0 = 0
            goto Lc
        L39:
            r6 = 276(0x114, float:3.87E-43)
            r4 = 14
            r3 = 124(0x7c, float:1.74E-43)
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.AbstractC1173b5.A0H
            r0 = 2
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L6b
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.AbstractC1173b5.A0H
            java.lang.String r1 = "ynfghRupyY8lJ5WDqUPqAC0JO3E4ojqs"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "OEwRxUcpVPGJQFz3LRrAkRkf0LWdVsmf"
            r0 = 0
            r2[r0] = r1
            java.lang.String r0 = A05(r6, r4, r3)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        L6b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.AbstractC1173b5.A15(com.facebook.ads.redexgen.X.MC):void");
    }

    public final void A16(JSONObject jSONObject) {
        String A05;
        JSONObject layoutObject;
        A0D(C1U.A00(jSONObject.optJSONObject(A05(225, 16, 120))));
        A0F = jSONObject.optJSONObject(A05(89, 12, 95));
        C1Z A06 = new C1Z().A06(jSONObject.optString(A05(319, 5, 56)));
        String A052 = A05(221, 4, 95);
        if (jSONObject.optJSONObject(A052) != null) {
            A05 = jSONObject.optJSONObject(A052).optString(A05(324, 3, 80));
        } else {
            A05 = A05(0, 0, 70);
        }
        A0F(A06.A05(A05).A04(jSONObject.optString(A05(0, 19, 117))).A07(AbstractC02461b.A03(jSONObject)).A08());
        JSONObject optJSONObject = jSONObject.optJSONObject(A05(262, 6, 25));
        if (optJSONObject != null) {
            String A053 = A05(268, 8, 32);
            if (A0H[5].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[2] = "L9OC0yGJthGch16tOTqUcqcE9MnsMaz6";
            strArr[1] = "n6CgIEssquLp46jPM2UWfBhL1rINMjIc";
            layoutObject = optJSONObject.optJSONObject(A053);
        } else {
            layoutObject = null;
        }
        A0C(new C1C(C1P.A01(layoutObject), C1P.A01(optJSONObject != null ? optJSONObject.optJSONObject(A05(253, 9, 30)) : null)));
        A0G(AbstractC02461b.A01(jSONObject));
        A0E(AbstractC02461b.A00(jSONObject));
        A0A(jSONObject.optInt(A05(19, 12, 43), 0));
        A0B(jSONObject.optInt(A05(109, 19, 86), -1));
        this.A0E.putAll(A07(jSONObject));
        this.A03 = jSONObject.optInt(A05(55, 18, 4), 0);
        this.A01 = jSONObject.optInt(A05(73, 16, 120), 1);
        this.A0C = jSONObject.optBoolean(A05(290, 29, 116), false);
        this.A02 = jSONObject.optInt(A05(31, 24, 12), this.A03);
        String optString = jSONObject.optString(A05(173, 2, 14));
        A0H(optString);
        A0I.put(optString, jSONObject.optString(A05(193, 28, 8)));
        A0d(jSONObject);
    }

    public final void A17(boolean z10) {
        this.A0B = z10;
    }

    public final boolean A18() {
        return this.A0B;
    }

    public final boolean A19() {
        return this.A0C;
    }
}
