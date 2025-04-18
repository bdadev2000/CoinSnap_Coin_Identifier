package com.instagram.common.viewpoint.core;

import android.util.Log;
import android.util.Pair;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class WU implements J5 {
    public static byte[] A02;
    public static String[] A03 = {"PqRb8CfCWHA5EhrxcZ9mRPllTh3oOSUW", "Zl9oGp2Iez0jLvuEYbnxsntptMxGBM4l", "l9LBk", "jZa6p3ci91eTCo5R2EOP7xEtghieA3uB", "FSDG0GiI6cZANIzlwvsJdjGaYqMqroq5", "1sDItVUeKrx9RbYz", "1qorAXgeX39shBtffGMCszMJDt6RFPN7", "u6hSYDgbJvcFisLakSyhfwTjAFON3iEs"};
    public static final String A04;
    public C1044Zr A00;
    public ZM A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 3);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A02 = new byte[]{85, -101, -92, -89, 85, -102, -85, -102, -93, -87, 126, -103, 85, -127, -44, -42, -60, -60, -58, -44, -44, -57, -42, -51, -51, -38, -113, 97, -123, -90, -83, -90, -75, -90, -91, 97, -90, -73, -90, -81, -75, -76, 97, -90, -71, -92, -90, -90, -91, -90, -91, 97, -77, -90, -75, -77, -70, 97, -83, -86, -82, -86, -75, 111, 97, -124, -80, -74, -81, -75, 123, 97, -80, -31, -48, -39, -33, -117, -33, -28, -37, -48, -117, -37, -35, -38, -50, -48, -34, -34, -48, -49, -117, -51, -28, -117, -33, -45, -48, -117, -34, -48, -35, -31, -48, -35, -91, -117, -81, -54, -46, -43, -50, -51, -119, -35, -40, -119, -39, -54, -37, -36, -50, -119, -54, -41, -119, -50, -33, -50, -41, -35, -119, -46, -41, -119, -50, -33, -50, -41, -35, -36, -119, -54, -37, -37, -54, -30, -119, -49, -40, -37, -119, -51, -46, -36, -39, -54, -35, -52, -47, -119, -49, -54, -46, -43, -34, -37, -50, -105, -102, -84, -71, -67, -84, -71, 103, -73, -71, -74, -86, -84, -70, -70, -84, -85, 103, -84, -67, -84, -75, -69, -112, -85, 103, -67, -49, -36, -32, -49, -36, -118, -36, -49, -34, -33, -36, -40, -49, -50, -118, -40, -39, -40, -105, -36, -49, -34, -36, -29, -53, -52, -42, -49, -118, -49, -36, -36, -39, -36, -118, -51, -39, -50, -49, -118, -101, -83, -70, -66, -83, -70, 104, -70, -83, -68, -67, -70, -74, -83, -84, 104, -70, -83, -68, -70, -63, -87, -86, -76, -83, 104, -83, -70, -70, -73, -70, 104, -85, -73, -84, -83, 104, -61, -36, -49, -48, -38, -45, -114, -30, -35, -114, -34, -49, -32, -31, -45, -114, -46, -45, -48, -29, -43, -70, -35, -43, -77, -28, -45, -36, -30, -114, -49, -30, -114, -82, -57, -70, -69, -59, -66, 121, -51, -56, 121, -55, -70, -53, -52, -66, 121, -66, -49, -66, -57, -51, 121, -70, -51, 121, 102, Byte.MAX_VALUE, 114, 115, 125, 118, 49, -123, UnsignedBytes.MAX_POWER_OF_TWO, 49, -127, 114, -125, -124, 118, 49, -124, 118, -125, -121, 118, -125, 49, -125, 118, -124, -127, UnsignedBytes.MAX_POWER_OF_TWO, Byte.MAX_VALUE, -124, 118, 49, 114, -123, 49, -127, UnsignedBytes.MAX_POWER_OF_TWO, -124, 122, -123, 122, UnsignedBytes.MAX_POWER_OF_TWO, Byte.MAX_VALUE, 49, -34, -22, -33, -32, -116, -119, -100, -119, -118, -119, -101, -115, -105, -88, -105, -96, -90, -91, -112, -113, -117, -98, -97, -100, -113, 87, -115, -103, -104, -112, -109, -111, 87, -113, -96, -113, -104, -98, 87, -105, -117, -111, -109, -115, 121, 120, 116, -121, -120, -123, 120, 114, 118, -126, -127, 121, 124, 122, 123, 118, -82, -93, -89, -97, 121, 116, 112, 106, 115, 120};
    }

    static {
        A05();
        A04 = WU.class.getSimpleName();
    }

    public WU(C1044Zr c1044Zr, ZM zm) {
        this.A00 = c1044Zr;
        this.A01 = zm;
    }

    public static JSONArray A01(C1044Zr c1044Zr, JSONArray jSONArray, JSONArray jSONArray2) {
        int i2 = 0;
        if (jSONArray != null) {
            int limit = jSONArray.length();
            i2 = 0 + limit;
        }
        if (jSONArray2 != null) {
            int limit2 = jSONArray2.length();
            i2 += limit2;
        }
        return A02(c1044Zr, jSONArray, jSONArray2, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00fa, code lost:
    
        if (r22 <= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fc, code lost:
    
        if (r4 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00fe, code lost:
    
        r7.put(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0102, code lost:
    
        if (r3 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0104, code lost:
    
        r7.put(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0101, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONArray A02(com.instagram.common.viewpoint.core.C1044Zr r19, org.json.JSONArray r20, org.json.JSONArray r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.WU.A02(com.facebook.ads.redexgen.X.Zr, org.json.JSONArray, org.json.JSONArray, int):org.json.JSONArray");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r3 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        r5 = new org.json.JSONObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        r5.put(A00(439, 6, 2), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        r5.put(A00(387, 6, 47), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r3 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject A03() {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.ZM r0 = r7.A01
            org.json.JSONObject r4 = r0.A6N()
            com.facebook.ads.redexgen.X.ZM r0 = r7.A01
            org.json.JSONArray r3 = r0.A6M()
            com.facebook.ads.redexgen.X.Zr r0 = r7.A00
            boolean r0 = com.instagram.common.viewpoint.core.Io.A0P(r0)
            if (r0 == 0) goto L46
            com.facebook.ads.redexgen.X.Zr r0 = r7.A00
            org.json.JSONArray r6 = com.instagram.common.viewpoint.core.C8G.A03(r0)
            if (r6 == 0) goto L46
            int r0 = r6.length()
            if (r0 <= 0) goto L46
            com.facebook.ads.redexgen.X.Zr r5 = r7.A00
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.WU.A03
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 5
            if (r1 == r0) goto L36
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L36:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.WU.A03
            java.lang.String r1 = "qUVNbNwZZvYyuSz0SsvSYTyRsw3xu0Du"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "WlKgM87vtUujDuDqlOM5717cU9PyRF7c"
            r0 = 7
            r2[r0] = r1
            org.json.JSONArray r3 = A01(r5, r6, r3)
        L46:
            r5 = 0
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.WU.A03
            r0 = 4
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 22
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L6a
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.WU.A03
            java.lang.String r1 = "QvYFeqMEyu4I6p0dgxwwBO2xjkm9NvyV"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "HjcWCrOu2PXb4iuKPAXMC032aGUytbXM"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto L8d
            goto L6c
        L6a:
            if (r3 == 0) goto L8d
        L6c:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8b
            r5.<init>()     // Catch: org.json.JSONException -> L8b
            if (r4 == 0) goto L7e
            r2 = 439(0x1b7, float:6.15E-43)
            r1 = 6
            r0 = 2
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: org.json.JSONException -> L8b
            r5.put(r0, r4)     // Catch: org.json.JSONException -> L8b
        L7e:
            r2 = 387(0x183, float:5.42E-43)
            r1 = 6
            r0 = 47
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: org.json.JSONException -> L8b
            r5.put(r0, r3)     // Catch: org.json.JSONException -> L8b
            goto L8d
        L8b:
            r0 = 0
            return r0
        L8d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.WU.A03():org.json.JSONObject");
    }

    private JSONObject A04(int i2) {
        int A08;
        JSONArray A042;
        Pair<JSONObject, JSONArray> tokensAndEvents = this.A01.A8X(i2);
        JSONObject jSONObject = (JSONObject) tokensAndEvents.first;
        JSONArray jSONArray = (JSONArray) tokensAndEvents.second;
        if (Io.A0P(this.A00) && (A042 = C8G.A04(this.A00, (A08 = Io.A08(this.A00)))) != null && A042.length() > 0) {
            jSONArray = A02(this.A00, A042, jSONArray, i2 + A08);
        }
        JSONObject jSONObject2 = null;
        String[] strArr = A03;
        if (strArr[4].charAt(22) == strArr[7].charAt(22)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "feKb1r4kRW7gDKlD5BEzQjo0jh9TPYxK";
        strArr2[3] = "s9YNb4XbEbjpB7B5leG71QtixhMBVNOA";
        if (jSONArray != null) {
            try {
                jSONObject2 = new JSONObject();
                if (jSONObject != null) {
                    jSONObject2.put(A00(439, 6, 2), jSONObject);
                }
                jSONObject2.put(A00(387, 6, 47), jSONArray);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject2;
    }

    private void A06(String str) {
        if (C8G.A0I(str)) {
            C1044Zr c1044Zr = this.A00;
            String[] strArr = A03;
            if (strArr[4].charAt(22) == strArr[7].charAt(22)) {
                throw new RuntimeException();
            }
            A03[2] = "U9Gor";
            C8G.A0B(c1044Zr, str);
            return;
        }
        this.A01.A9B(str);
    }

    @Override // com.instagram.common.viewpoint.core.J5
    public final JSONObject A4w() {
        int eventLimit = Io.A0F(this.A00);
        return eventLimit > 0 ? A04(eventLimit) : A03();
    }

    @Override // com.instagram.common.viewpoint.core.J5
    public final boolean A9Z() {
        int eventCount = Io.A0F(this.A00);
        if (eventCount < 1) {
            return false;
        }
        int A7N = this.A01.A7N();
        int eventLimit = C8G.A00(this.A00);
        return A7N + eventLimit > eventCount;
    }

    @Override // com.instagram.common.viewpoint.core.J5
    public final void AB8() {
        int A4e = this.A01.A4e(Io.A0G(this.A00));
        if (A4e > 0) {
            this.A00.A07().AA0(A00(379, 8, 37), C8E.A10, new C8F(A00(28, 44, 62) + A4e));
        }
        C8G.A0F(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.J5
    public final void ABj(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            try {
                A06(jSONArray.getJSONObject(i2).getString(A00(433, 2, 15)));
            } catch (JSONException e) {
                if (this.A00.A04().A9O()) {
                    String eventId = A04;
                    Log.e(eventId, A00(108, 62, 102), e);
                }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.J5
    public final boolean ABk(JSONArray jSONArray) {
        String A00 = A00(27, 1, 48);
        boolean z2 = true;
        boolean A0P = Io.A0P(this.A00);
        for (int errorCode = 0; errorCode < jSONArray.length(); errorCode++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(errorCode);
                String eventId = jSONObject.getString(A00(433, 2, 15));
                if (A00(393, 26, 39).equals(eventId)) {
                    C0608Im.A0T(this.A00).A2t(jSONObject.getString(A00(419, 14, 16)));
                    this.A00.A03().AAl();
                } else {
                    int i2 = jSONObject.getInt(A00(375, 4, 120));
                    if (i2 == 1) {
                        if (this.A00.A04().A9O()) {
                            String str = A00(Opcodes.TABLESWITCH, 25, 68) + eventId + A00(13, 14, 94);
                            String A7Q = this.A01.A7Q(eventId);
                            if (A7Q != null) {
                                String str2 = A00(72, 36, 104) + A7Q;
                            }
                        }
                        if (!this.A01.A5P(eventId) && A0P) {
                            C8G.A0D(eventId);
                        }
                    } else {
                        String[] strArr = A03;
                        if (strArr[6].charAt(2) == strArr[1].charAt(2)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A03;
                        strArr2[6] = "1LE9O0SwhMhMXUh2JQEpQ81OBnaONLaF";
                        strArr2[1] = "qI9w2PtHmRHMr9aKEOtTY0DScCfNQmEA";
                        String A002 = A00(0, 13, 50);
                        if (i2 >= 1000 && i2 < 2000) {
                            if (this.A00.A04().A9O()) {
                                Log.e(A04, A00(236, 37, 69) + i2 + A002 + eventId + A00);
                            }
                            A06(eventId);
                            z2 = false;
                        } else if (i2 >= 2000) {
                            if (A03[5].length() == 16) {
                                A03[5] = "Te73kS0enGf3eAU6";
                                if (i2 >= 3000) {
                                }
                            } else if (i2 >= 3000) {
                            }
                            if (this.A00.A04().A9O()) {
                                Log.e(A04, A00(Opcodes.MONITOREXIT, 41, 103) + i2 + A002 + eventId + A00);
                            }
                            if (!this.A01.A5P(eventId) && A0P) {
                                C8G.A0D(eventId);
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (this.A00.A04().A9O()) {
                    Log.e(A04, A00(331, 44, 14) + errorCode + A00, e);
                }
                z2 = false;
            }
        }
        return z2;
    }

    @Override // com.instagram.common.viewpoint.core.J5
    public final void ADH() {
        this.A01.A4f();
        C8G.A07(this.A00);
    }
}
