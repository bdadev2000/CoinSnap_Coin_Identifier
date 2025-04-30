package com.meta.analytics.dsp.uinode;

import android.util.Log;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class VP implements J0 {
    public static byte[] A02;
    public static String[] A03 = {"4VJF", "NMiFc9mQHDdEdTYDts8ebbMyjIljV2c0", "gJxI4lQggzgG7l1t48TOLBAVsZm4smpW", "RC", "7emK", "VnvWTQ3PSRLSSOUq71E5D", "jZ42e8scbVg896gjqaujwC7", "gj"};
    public static final String A04;
    public C1635Ym A00;
    public YH A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "6iaNxoAqzoeupDn53l2Cm";
            strArr2[6] = "N7vye13Dqewush4C3JTfsv4";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 104);
            i12++;
        }
    }

    public static void A05() {
        A02 = new byte[]{Ascii.NAK, 83, 90, 71, Ascii.NAK, 80, 67, 80, 91, 65, 124, 81, Ascii.NAK, 60, 111, 105, Ascii.DEL, Ascii.DEL, 121, 111, 111, 122, 105, 112, 112, 101, 50, 110, 101, 68, 77, 68, 85, 68, 69, 1, 68, 87, 68, 79, 85, 82, 1, 68, 89, 66, 68, 68, 69, 68, 69, 1, 83, 68, 85, 83, 88, 1, 77, 72, 76, 72, 85, Ascii.SI, 1, 98, 78, 84, 79, 85, Ascii.ESC, 1, 72, 123, 104, 99, 121, 45, 121, 116, 125, 104, 45, 125, Ascii.DEL, 98, 110, 104, 126, 126, 104, 105, 45, 111, 116, 45, 121, 101, 104, 45, 126, 104, Ascii.DEL, 123, 104, Ascii.DEL, 55, 45, 84, 115, 123, 126, 119, 118, 50, 102, 125, 50, 98, 115, 96, 97, 119, 50, 115, 124, 50, 119, 100, 119, 124, 102, 50, 123, 124, 50, 119, 100, 119, 124, 102, 97, 50, 115, 96, 96, 115, 107, 50, 116, 125, 96, 50, 118, 123, 97, 98, 115, 102, 113, 122, 50, 116, 115, 123, 126, 103, 96, 119, 60, 65, 119, 96, 100, 119, 96, 50, 98, 96, 125, 113, 119, 97, 97, 119, 118, 50, 119, 100, 119, 124, 102, 91, 118, 50, 50, 4, 19, Ascii.ETB, 4, 19, 65, 19, 4, Ascii.NAK, Ascii.DC4, 19, Ascii.SI, 4, 5, 65, Ascii.SI, Ascii.SO, Ascii.SI, 76, 19, 4, Ascii.NAK, 19, Ascii.CAN, 0, 3, Ascii.CR, 4, 65, 4, 19, 19, Ascii.SO, 19, 65, 2, Ascii.SO, 5, 4, 65, 42, Ascii.FS, Ascii.VT, Ascii.SI, Ascii.FS, Ascii.VT, 89, Ascii.VT, Ascii.FS, Ascii.CR, Ascii.FF, Ascii.VT, Ascii.ETB, Ascii.FS, Ascii.GS, 89, Ascii.VT, Ascii.FS, Ascii.CR, Ascii.VT, 0, Ascii.CAN, Ascii.ESC, Ascii.NAK, Ascii.FS, 89, Ascii.FS, Ascii.VT, Ascii.VT, Ascii.SYN, Ascii.VT, 89, Ascii.SUB, Ascii.SYN, Ascii.GS, Ascii.FS, 89, 86, 109, 98, 97, 111, 102, 35, 119, 108, 35, 115, 98, 113, 112, 102, 35, 103, 102, 97, 118, 100, 79, 108, 100, 70, 117, 102, 109, 119, 35, 98, 119, 35, 6, 61, 50, 49, 63, 54, 115, 39, 60, 115, 35, 50, 33, 32, 54, 115, 54, 37, 54, 61, 39, 115, 50, 39, 115, 111, 84, 91, 88, 86, 95, Ascii.SUB, 78, 85, Ascii.SUB, 74, 91, 72, 73, 95, Ascii.SUB, 73, 95, 72, 76, 95, 72, Ascii.SUB, 72, 95, 73, 74, 85, 84, 73, 95, Ascii.SUB, 91, 78, Ascii.SUB, 74, 85, 73, 83, 78, 83, 85, 84, Ascii.SUB, 80, 92, 87, 86, 104, 109, 120, 109, 110, 109, Ascii.DEL, 105, 17, 2, 17, Ascii.SUB, 0, 7, 6, 5, 1, Ascii.DC4, Ascii.NAK, Ascii.DC2, 5, 77, 3, Ascii.SI, Ascii.SO, 6, 9, 7, 77, 5, Ascii.SYN, 5, Ascii.SO, Ascii.DC4, 77, Ascii.CR, 1, 7, 9, 3, 33, 34, 38, 51, 50, 53, 34, Ascii.CAN, 36, 40, 41, 33, 46, 32, 44, 33, 71, 90, 94, 86, 60, 39, 35, 45, 38, 59};
    }

    static {
        A05();
        A04 = VP.class.getSimpleName();
    }

    public VP(C1635Ym c1635Ym, YH yh) {
        this.A00 = c1635Ym;
        this.A01 = yh;
    }

    public static JSONArray A01(C1635Ym c1635Ym, JSONArray jSONArray, JSONArray jSONArray2) {
        int i9 = 0;
        if (jSONArray != null) {
            int limit = jSONArray.length();
            i9 = 0 + limit;
        }
        if (jSONArray2 != null) {
            int limit2 = jSONArray2.length();
            i9 += limit2;
        }
        return A02(c1635Ym, jSONArray, jSONArray2, i9);
    }

    public static JSONArray A02(C1635Ym c1635Ym, JSONArray jSONArray, JSONArray jSONArray2, int i9) {
        if (jSONArray == null) {
            return jSONArray2;
        }
        if (jSONArray2 == null) {
            return jSONArray;
        }
        int length = jSONArray.length();
        int length2 = jSONArray2.length();
        JSONArray jSONArray3 = new JSONArray();
        int debugIdx = 0;
        int limit = 0;
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = null;
        double d2 = Double.MAX_VALUE;
        double d9 = Double.MAX_VALUE;
        while (true) {
            if ((debugIdx < length || limit < length2) && i9 > 0) {
                String[] strArr = A03;
                if (strArr[0].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A03;
                strArr2[7] = "aN";
                strArr2[3] = "P5";
                String A00 = A00(435, 4, 91);
                if (debugIdx < length && jSONObject == null) {
                    try {
                        jSONObject = jSONArray.getJSONObject(debugIdx);
                        d2 = jSONObject.getDouble(A00);
                    } catch (JSONException e4) {
                        if (c1635Ym.A04().A8z()) {
                            Log.e(A04, A00(273, 33, 107) + debugIdx, e4);
                        }
                        jSONObject = null;
                        d2 = Double.MAX_VALUE;
                    }
                    debugIdx++;
                }
                if (limit < length2 && jSONObject2 == null) {
                    try {
                        jSONObject2 = jSONArray2.getJSONObject(limit);
                        d9 = jSONObject2.getDouble(A00);
                    } catch (JSONException e9) {
                        if (c1635Ym.A04().A8z()) {
                            Log.e(A04, A00(306, 25, 59) + limit, e9);
                        }
                        jSONObject2 = null;
                        d9 = Double.MAX_VALUE;
                    }
                    limit++;
                }
                if (jSONObject != null || jSONObject2 != null) {
                    if (jSONObject == null || d9 < d2) {
                        jSONArray3.put(jSONObject2);
                        jSONObject2 = null;
                        d9 = Double.MAX_VALUE;
                    } else {
                        jSONArray3.put(jSONObject);
                        jSONObject = null;
                        d2 = Double.MAX_VALUE;
                    }
                    i9--;
                }
            }
        }
        if (i9 > 0) {
            if (jSONObject != null) {
                jSONArray3.put(jSONObject);
            } else if (jSONObject2 != null) {
                jSONArray3.put(jSONObject2);
            }
        }
        return jSONArray3;
    }

    private JSONObject A03() {
        JSONArray A032;
        JSONObject A5z = this.A01.A5z();
        JSONArray A5y = this.A01.A5y();
        if (Ij.A0P(this.A00) && (A032 = C8C.A03(this.A00)) != null && A032.length() > 0) {
            C1635Ym c1635Ym = this.A00;
            String[] strArr = A03;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "DqeH9SIpXFi3b8zfs8mhzwqF8zVFhPmm";
            strArr2[2] = "TV1z9woSYeZeWz7dxNs9KlrMFeTbS55S";
            A5y = A01(c1635Ym, A032, A5y);
        }
        JSONObject jSONObject = null;
        if (A5y != null) {
            try {
                jSONObject = new JSONObject();
                if (A5z != null) {
                    jSONObject.put(A00(439, 6, 32), A5z);
                }
                jSONObject.put(A00(387, 6, 28), A5y);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject;
    }

    private JSONObject A04(int i9) {
        int A08;
        JSONArray A042;
        Pair<JSONObject, JSONArray> tokensAndEvents = this.A01.A89(i9);
        JSONObject jSONObject = (JSONObject) tokensAndEvents.first;
        JSONArray debugLogEvents = (JSONArray) tokensAndEvents.second;
        if (Ij.A0P(this.A00) && (A042 = C8C.A04(this.A00, (A08 = Ij.A08(this.A00)))) != null && A042.length() > 0) {
            debugLogEvents = A02(this.A00, A042, debugLogEvents, i9 + A08);
        }
        JSONObject payload = null;
        if (debugLogEvents != null) {
            try {
                payload = new JSONObject();
                if (jSONObject != null) {
                    payload.put(A00(439, 6, 32), jSONObject);
                }
                payload.put(A00(387, 6, 28), debugLogEvents);
            } catch (JSONException unused) {
                return null;
            }
        }
        return payload;
    }

    private void A06(String str) {
        if (C8C.A0I(str)) {
            C8C.A0B(this.A00, str);
        } else {
            this.A01.A8m(str);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.J0
    public final JSONObject A4a() {
        int eventLimit = Ij.A0F(this.A00);
        return eventLimit > 0 ? A04(eventLimit) : A03();
    }

    @Override // com.meta.analytics.dsp.uinode.J0
    public final boolean A9A() {
        int eventCount = Ij.A0F(this.A00);
        if (eventCount < 1) {
            return false;
        }
        int A6z = this.A01.A6z();
        int eventLimit = C8C.A00(this.A00);
        return A6z + eventLimit > eventCount;
    }

    @Override // com.meta.analytics.dsp.uinode.J0
    public final void AAi() {
        int A4I = this.A01.A4I(Ij.A0G(this.A00));
        if (A4I > 0) {
            this.A00.A07().A9a(A00(379, 8, 100), C8A.A10, new C8B(A00(28, 44, 73) + A4I));
        }
        C1635Ym c1635Ym = this.A00;
        String[] strArr = A03;
        String str = strArr[5];
        String str2 = strArr[6];
        int attemptsExceededEventsCount = str.length();
        int retryLimit = str2.length();
        if (attemptsExceededEventsCount == retryLimit) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[5] = "bzDkK7DGlCk2AgYUikBmx";
        strArr2[6] = "oAHu9PBino36rPxONmBwiLk";
        C8C.A0F(c1635Ym);
    }

    @Override // com.meta.analytics.dsp.uinode.J0
    public final void ABI(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            try {
                A06(jSONArray.getJSONObject(i9).getString(A00(433, 2, 45)));
            } catch (JSONException e4) {
                if (this.A00.A04().A8z()) {
                    String str = A04;
                    String[] strArr = A03;
                    String str2 = strArr[5];
                    String str3 = strArr[6];
                    int i10 = str2.length();
                    int length2 = str3.length();
                    if (i10 == length2) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A03;
                    strArr2[1] = "UiT9WvgcUGvh4UJIWCcVV8uUv9KhPAuj";
                    strArr2[2] = "iCLGRVxWINjUDSHIa5c9b6YKh720uR79";
                    Log.e(str, A00(108, 62, 122), e4);
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.J0
    public final boolean ABJ(JSONArray jSONArray) {
        String A00 = A00(27, 1, 40);
        boolean z8 = true;
        boolean A0P = Ij.A0P(this.A00);
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i9);
                String string = jSONObject.getString(A00(433, 2, 45));
                if (A00(393, 26, 8).equals(string)) {
                    C1225Ih.A0R(this.A00).A2X(jSONObject.getString(A00(419, 14, 47)));
                    this.A00.A03().AAL();
                } else {
                    int i10 = jSONObject.getInt(A00(375, 4, 91));
                    if (i10 == 1) {
                        if (this.A00.A04().A8z()) {
                            String str = A00(170, 25, 122) + string + A00(13, 14, 116);
                            String A72 = this.A01.A72(string);
                            if (A72 != null) {
                                String str2 = A00(72, 36, 101) + A72;
                            }
                        }
                        if (!this.A01.A53(string) && A0P) {
                            C8C.A0D(string);
                        }
                    } else {
                        String A002 = A00(0, 13, 93);
                        if (i10 >= 1000 && i10 < 2000) {
                            if (this.A00.A04().A8z()) {
                                Log.e(A04, A00(236, 37, 17) + i10 + A002 + string + A00);
                            }
                            A06(string);
                            z8 = false;
                        } else if (i10 >= 2000 && i10 < 3000) {
                            if (this.A00.A04().A8z()) {
                                Log.e(A04, A00(195, 41, 9) + i10 + A002 + string + A00);
                            }
                            if (!this.A01.A53(string) && A0P) {
                                C8C.A0D(string);
                            }
                        }
                    }
                }
            } catch (JSONException e4) {
                if (this.A00.A04().A8z()) {
                    Log.e(A04, A00(331, 44, 82) + i9 + A00, e4);
                }
                z8 = false;
            }
        }
        return z8;
    }

    @Override // com.meta.analytics.dsp.uinode.J0
    public final void ACo() {
        this.A01.A4J();
        C8C.A07(this.A00);
    }
}
