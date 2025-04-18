package com.instagram.common.viewpoint.core;

import com.facebook.internal.FacebookRequestErrorClassification;
import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;
import okhttp3.internal.http.StatusLine;
import okio.Utf8;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.1b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01901b implements Serializable {
    public static byte[] A0I = null;
    public static final EnumC01911c A0J;
    public static final OC A0K;
    public static final long serialVersionUID = -5352540123250859603L;
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final EnumC01911c A08;
    public final OC A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0I = new byte[]{95, 99, 110, 118, 47, 92, 123, 96, 125, 106, 47, 120, 102, 99, 99, 47, 110, 122, 123, 96, 98, 110, 123, 102, 108, 110, 99, 99, 118, 47, 96, Byte.MAX_VALUE, 106, 97, 47, 102, 97, 47, 84, 124, 106, 108, 124, 82, 124, 34, 30, 19, 11, 19, 16, 30, 23, 82, 19, 22, 89, 110, 124, 106, 121, 111, 110, 111, 43, 91, 103, 106, 114, 49, 62, 59, 55, 60, 38, 13, 38, 61, 57, 55, 60, 28, 11, 90, 91, 82, 95, 71, 97, 93, 82, 87, 93, 85, 97, 74, 91, 70, 74, 124, 119, 120, 123, 117, 124, 70, 124, 119, 125, 70, 122, 120, 107, 125, 20, 31, 16, 19, 29, 20, 46, 24, 31, 5, 3, 30, 46, 18, 16, 3, 21, 56, 58, 49, 58, 45, 54, 60, 0, 43, 58, 39, 43, 4, 3, 30, 25, 12, 3, 14, 8, 50, 4, 9, 23, 16, 10, 12, 17, 33, 29, 31, 12, 26, 33, 23, 29, 17, 16, 33, 11, 12, 18, 66, 88, 116, 91, 71, 74, 82, 74, 73, 71, 78, 116, 89, 78, 70, 68, 95, 78, 116, 77, 68, 89, 70, 74, 95, 109, 112, 107, 103, 108, 118, 99, 118, 107, 109, 108, 99, Byte.MAX_VALUE, 114, 106, 61, 116, 124, 124, 116, Byte.MAX_VALUE, 118, 61, 112, 124, 126, 14, 18, 31, 7, 31, 28, 18, 27, 33, 26, 31, 10, 31, 93, 65, 76, 84, 76, 79, 65, 72, 114, 72, 67, 73, 114, 78, 76, 95, 73, 114, 73, 72, 94, 78, 105, 117, 120, 96, 120, 123, 117, 124, 70, 112, 119, 109, 107, 118, 70, 122, 120, 107, 125, 70, 125, 124, 106, 122, 92, 64, 77, 85, 77, 78, 64, 73, 115, 94, 73, 72, 73, 95, 69, 75, 66, 115, 73, 66, 77, 78, 64, 73, 72, 83, 81, 70, 64, 66, 64, 75, 74, 77, 68, 124, 78, 70, 87, 75, 76, 71, 123, 108, 126, 104, 123, 109, 108, 109, 86, 121, 101, 104, 112, 86, 125, 108, 113, 125, 20, 12, 14, 23, 23, 6, 5, 11, 2, 56, 20, 2, 4, 8, 9, 3, 20, 54, 45, 48, 40, 42, 51, 51, 34, 33, 47, 38, 28, 48, 38, 32, 44, 45, 39, 48, 47, 40, 51, 49, 46, 35, 34, 40, 24, 43, 34, 38, 35, 46, 41, 32, 24, 55, 43, 38, 62, 38, 37, 43, 34, 24, 34, 41, 38, 37, 43, 34, 35, 32, Utf8.REPLACEMENT_BYTE, 50, 51, 57, 9, 58, 51, 55, 50, Utf8.REPLACEMENT_BYTE, 56, 49, 9, 38, 58, 55, 47, 55, 52, 58, 51, 9, 35, 56, 37, 61, Utf8.REPLACEMENT_BYTE, 38, 38, 55, 52, 58, 51, 9, 34, Utf8.REPLACEMENT_BYTE, 59, 51, 84, 70, 65, 124, 85, 74, 70, 84, 124, 87, 74, 78, 70, 76, 86, 87, 124, 74, 77, 124, 78, 74, 79, 79, 74, 80, 70, 64, 76, 77, 71, 80};
    }

    static {
        A06();
        A0K = OC.A04;
        A0J = EnumC01911c.A03;
    }

    public C01901b(String str, String str2, int i2, String str3, String str4, OC oc, int i3, boolean z2, boolean z3, EnumC01911c enumC01911c, boolean z4, String str5, boolean z5, boolean z6, int i4, String str6, String str7) {
        if (z4) {
            this.A0D = UUID.randomUUID().toString();
            this.A0C = L5.A00(str).buildUpon().appendQueryParameter(A03(Opcodes.D2L, 11, 90), this.A0D).appendQueryParameter(A03(69, 12, 101), str5).build().toString();
        } else {
            this.A0C = str;
            this.A0D = null;
        }
        this.A0B = str2;
        this.A06 = i2;
        this.A0E = str3;
        this.A0A = str4;
        this.A09 = oc;
        this.A07 = i3;
        this.A0G = z2;
        this.A0F = z3;
        this.A08 = enumC01911c;
        this.A0H = z4;
        this.A05 = z5;
        this.A04 = z6;
        this.A00 = i4;
        this.A03 = str6;
        this.A02 = str7;
    }

    public static int A00(JSONObject jSONObject) {
        String A03 = A03(343, 17, 80);
        if (jSONObject.has(A03)) {
            return jSONObject.optInt(A03);
        }
        return jSONObject.optInt(A03(360, 19, 116), 0);
    }

    public static C01901b A01(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A03(224, 13, 73));
        if (optJSONObject == null) {
            return null;
        }
        EnumC01911c A00 = EnumC01911c.A00(optJSONObject.optString(A03(StatusLine.HTTP_PERM_REDIRECT, 17, 20), A0J.name()));
        String precachingMethodStr = A03(382, 30, 112);
        boolean optBoolean = optJSONObject.optBoolean(precachingMethodStr, false);
        String precachingMethodStr2 = A03(379, 3, 109);
        String optString = optJSONObject.optString(precachingMethodStr2);
        String precachingMethodStr3 = A03(154, 19, 73);
        String optString2 = optJSONObject.optString(precachingMethodStr3);
        int A002 = A00(jSONObject);
        String A05 = A05(optJSONObject);
        String A04 = A04(optJSONObject);
        OC A02 = A02(optJSONObject);
        int optInt = optJSONObject.optInt(A03(451, 32, 20), 5000);
        boolean z2 = !optBoolean && optJSONObject.optBoolean(A03(Opcodes.FREM, 17, 70), true);
        String precachingMethodStr4 = A03(99, 15, 46);
        boolean optBoolean2 = optJSONObject.optBoolean(precachingMethodStr4);
        String precachingMethodStr5 = A03(Opcodes.LRETURN, 25, 28);
        boolean optBoolean3 = optJSONObject.optBoolean(precachingMethodStr5);
        String precachingMethodStr6 = A03(81, 2, 72);
        String optString3 = jSONObject.optString(precachingMethodStr6);
        String precachingMethodStr7 = A03(283, 25, 27);
        boolean optBoolean4 = optJSONObject.optBoolean(precachingMethodStr7, false);
        String precachingMethodStr8 = A03(FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED, 39, 97);
        return new C01901b(optString, optString2, A002, A05, A04, A02, optInt, z2, optBoolean2, A00, optBoolean3, optString3, optBoolean, optBoolean4, optJSONObject.optInt(precachingMethodStr8, 5), jSONObject.optString(A03(259, 24, 46), A03(45, 11, 69)), jSONObject.optString(A03(237, 22, 26), A03(209, 15, 36)));
    }

    public static OC A02(JSONObject jSONObject) {
        int orientation = jSONObject.optInt(A03(Opcodes.IFNULL, 11, 53), A0K.A04());
        return OC.A00(orientation);
    }

    public static String A04(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A03(Opcodes.LXOR, 12, 104));
        String A03 = A03(0, 45, 56);
        return optJSONObject == null ? A03 : optJSONObject.optString(A03(83, 16, 9), A03);
    }

    public static String A05(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(A03(Opcodes.LXOR, 12, 104));
        String A03 = A03(56, 13, 60);
        return optJSONObject == null ? A03 : optJSONObject.optString(A03(325, 18, 62), A03);
    }

    public final int A07() {
        return this.A06;
    }

    public final int A08() {
        return this.A00;
    }

    public final int A09() {
        return this.A07;
    }

    public final EnumC01911c A0A() {
        return this.A08;
    }

    public final OC A0B() {
        return this.A09;
    }

    public final String A0C() {
        return this.A01;
    }

    public final String A0D() {
        return this.A0A;
    }

    public final String A0E() {
        return this.A0B;
    }

    public final String A0F() {
        return this.A0C;
    }

    public final String A0G() {
        return this.A02;
    }

    public final String A0H() {
        return this.A03;
    }

    public final String A0I() {
        return this.A0D;
    }

    public final String A0J() {
        return this.A0E;
    }

    public final void A0K(String str) {
        this.A01 = str;
    }

    public final boolean A0L() {
        return this.A0G;
    }

    public final boolean A0M() {
        return this.A04;
    }

    public final boolean A0N() {
        return this.A0H;
    }

    public final boolean A0O() {
        return this.A05;
    }
}
