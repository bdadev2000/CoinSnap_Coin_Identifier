package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class L6 {
    public static int A00;
    public static byte[] A01;
    public static String[] A02 = {"W5GQ1A2ylrhjGcW6pMhO2KpBuuMbjdB5", "Zx6aawmOn04orHuEArp9Y", "DMoITyb3L57ZarlqFv80uTh", "nsJ3", "1RYBeERStpTg7BOn5NhEUzstvZKMnlwS", "VuYSQW8JaBTDlxPB8JxFHKy", "", "NX"};
    public static final AtomicReference<Boolean> A03;
    public static volatile L5 A04;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{60, 19, Ascii.EM, Ascii.SI, Ascii.DC2, Ascii.DC4, Ascii.EM, 48, Ascii.FS, 19, Ascii.DC4, Ascii.ESC, Ascii.CAN, Ascii.SO, 9, 83, 5, Ascii.DLE, 17, 123, 121, 110, 115, 108, 115, 110, 99, Ascii.SYN, 7, 7, Ascii.ESC, Ascii.RS, Ascii.DC4, Ascii.SYN, 3, Ascii.RS, Ascii.CAN, Ascii.EM, Ascii.CAN, Ascii.SUB, 17, Ascii.SUB, Ascii.CR, Ascii.SYN, Ascii.FS, 77, 73, 78, 115, 68, 75, 118, 69, 82, 83, 73, 79, 78, 17, 6, Ascii.DLE, 10, Ascii.EM, 6, 2, 1, Ascii.SI, 6, 34, 0, Ascii.ETB, 10, Ascii.NAK, 10, Ascii.ETB, Ascii.SUB, 122, 124, 106, 124, 34, 124, 107, 100};
    }

    static {
        A07();
        A00 = -1;
        A04 = L5.A04;
        A03 = new AtomicReference<>(null);
    }

    public static int A01(Context context) {
        if (A04 == L5.A04) {
            A08(context);
        }
        return A00;
    }

    public static int A02(Context context) {
        try {
            XmlResourceParser parser = context.getAssets().openXmlResourceParser(A06(0, 19, 71));
            return A05(parser);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int A03(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).minSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A05(org.xmlpull.v1.XmlPullParser r5) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
        L0:
            int r1 = r5.next()
            r0 = 1
            if (r1 == r0) goto L49
            int r1 = r5.getEventType()
            r0 = 2
            if (r1 != r0) goto L0
            java.lang.String r3 = r5.getName()
            r2 = 76
            r1 = 8
            r0 = 53
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L0
            r4 = 0
        L23:
            int r0 = r5.getAttributeCount()
            if (r4 >= r0) goto L0
            java.lang.String r3 = r5.getAttributeName(r4)
            r2 = 45
            r1 = 13
            r0 = 26
            java.lang.String r0 = A06(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L46
            java.lang.String r0 = r5.getAttributeValue(r4)
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
        L46:
            int r4 = r4 + 1
            goto L23
        L49:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.L6.A05(org.xmlpull.v1.XmlPullParser):int");
    }

    public static void A08(Context context) {
        if (A0B()) {
            return;
        }
        A09(context);
    }

    public static void A09(Context context) {
        if (A04 != L5.A04) {
            return;
        }
        A04 = L5.A03;
        Executors.newSingleThreadExecutor().execute(new C0967Uk(context));
    }

    public static void A0A(C03987f c03987f, Throwable th2) {
        c03987f.A07().A9a(A06(38, 7, 69), C8A.A1c, new C8B(th2));
    }

    public static boolean A0B() {
        return A04 == L5.A02;
    }

    public static boolean A0C(C03987f c03987f) {
        Boolean cachedValue = A03.get();
        if (cachedValue != null) {
            return cachedValue.booleanValue();
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z10 = true;
        try {
            xmlResourceParser = c03987f.getAssets().openXmlResourceParser(A06(0, 19, 71));
            loop0: while (true) {
                if (xmlResourceParser.next() == 1) {
                    break;
                }
                if (xmlResourceParser.getEventType() == 2 && (xmlResourceParser.getName().equals(A06(27, 11, 77)) || xmlResourceParser.getName().equals(A06(19, 8, 32)))) {
                    for (int i10 = 0; i10 < xmlResourceParser.getAttributeCount(); i10++) {
                        if (xmlResourceParser.getAttributeName(i10).equals(A06(58, 18, 89)) && !Boolean.parseBoolean(xmlResourceParser.getAttributeValue(i10))) {
                            z10 = false;
                            break loop0;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            A0A(c03987f, th2);
            String[] strArr = A02;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A02[0] = "eeMQW8Hjee4jIvBA7BhrF0CVQhVUWKRk";
            if (xmlResourceParser != null) {
                try {
                    xmlResourceParser.close();
                } catch (Exception e2) {
                    A0A(c03987f, e2);
                }
            }
        }
        A03.set(Boolean.valueOf(z10));
        return z10;
    }
}
