package com.meta.analytics.dsp.uinode;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class YI implements InterfaceC09908k {
    public static PackageInfo A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"rjWu3o3XUIKJimpXtRLH", "N3hUjd9gC1zTrolrzHWDwio6K0KaeF7v", "V8BOZxTrBek9nlJry76rEN1tEiA1lgnf", "2kaCuDD1e44XjFqxj97oS3bW7Y4jUXps", "VcJxC1jbHxk7XwGyeCWvHwY9E4qRcx1x", "dO6RHNbAuKw0kDbwpnJR", "8jPNINbp0cYAxxIn", "ugIdyp1aSJPFHYCiUHctz2XPYC5YD6Ud"};
    public static final C0V[] A06;
    public final C6S A00;
    public final C09647f A01;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "AJGqtkftO03LFXDJsHlFXR4ujVWNfKsn";
            strArr[7] = "0weTThgY8dzMPuXGgH30KJvXs1017h9U";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 73);
            i12++;
        }
    }

    public static void A02() {
        A04 = new byte[]{40, Ascii.CR, Ascii.NAK, Ascii.ETB, Ascii.ETB, 17, 7, 7, Ascii.GS, Ascii.SYN, Ascii.GS, Ascii.CAN, Ascii.GS, 0, Ascii.CR, Ascii.VT, 17, Ascii.SUB, Ascii.NAK, Ascii.SYN, Ascii.CAN, 17, Ascii.DLE, 41, 38, 41, 36, 39, 47, 45, 60, 60, 51, 33, 37, 34, 51, 63, 40, 39, 51, 58, 41, 62, 63, 37, 35, 34, 98, 112, 107, 98, 112, 85, 71, 93, 80, 78, 91, 91, 93, 70, 77, 90, 91, 70, 64, 65, 80, 70, 75, 47, 36, 41, 41, 40, 63, 50, 57, 34, 38, 40, 35, 50, 40, 53, 57, 63, 44, 62, 85, 66, 89, 83, 91, 82, 107, 105, 120, 120, 109, 108, 119, 97, 108, 123, 63, 61, 46, 46, 53, 57, 46, 72, 77, 88, 77, 83, 92, 94, 67, 79, 73, 95, 95, 69, 66, 75, 83, 67, 92, 88, 69, 67, 66, 95, Ascii.DC2, Ascii.ETB, 2, Ascii.ETB, 9, 6, 4, Ascii.EM, Ascii.NAK, 19, 5, 5, Ascii.US, Ascii.CAN, 17, 9, Ascii.EM, 6, 2, Ascii.US, Ascii.EM, Ascii.CAN, 5, 9, Ascii.NAK, Ascii.EM, 3, Ascii.CAN, 2, 4, Ascii.SI, 67, 70, 83, 70, 88, 87, 85, 72, 68, 66, 84, 84, 78, 73, 64, 88, 72, 87, 83, 78, 72, 73, 84, 88, 84, 83, 70, 83, 66, 92, 93, 86, 75, 81, 76, 65, 109, 126, 101, 101, 110, 103, 116, 104, 100, 121, 110, 116, 110, 125, 110, 101, Ascii.DEL, 120, Ascii.RS, Ascii.CR, Ascii.SYN, Ascii.SYN, Ascii.GS, Ascii.DC4, 7, Ascii.DC4, Ascii.ETB, Ascii.US, Ascii.US, Ascii.GS, Ascii.FS, Ascii.CR, 42, 34, 39, 46, 47, 107, 63, 36, 107, 41, 62, 34, 39, 47, 107, 62, 56, 46, 57, 107, 63, 36, 32, 46, 37, 62, 55, 37, 41, 51, 46, 57, 38, 58, 55, 47, 51, 36, 17, Ascii.FS, Ascii.RS, Ascii.EM, 94, 83, 72, 84, 86, 84, 95, 82, 72, 67, 68, 72, 90, 68, 52, 57, 34, 46, 50, 40, 47, 62, 56, 48, 55, 42, 45, 56, 53, 53, 60, 43, 32, 35, 47, 45, 32, 41, 43, 39, 45, 35, 74, 66, 67, 78, 70, 83, 78, 72, 73, 88, 84, 66, 85, 81, 78, 68, 66, 110, 101, 116, 119, 111, 114, 107, Ascii.DEL, 116, 121, 112, 101, 7, Ascii.VT, Ascii.GS, 4, Ascii.GS, Ascii.ESC, Ascii.ETB, Ascii.GS, Ascii.ESC, Ascii.CR, Ascii.SUB, Ascii.ETB, 1, Ascii.FF, 84, 73, 73, 82, 67, 66, 93, 93, 80, 76, 67, 70, 74, 65, 91, 80, 92, 75, 68, 80, 89, 74, 93, 92, 70, 64, 65, Ascii.SI, Ascii.SI, 2, Ascii.CAN, 5, 9, Ascii.SI, Ascii.FS, Ascii.SO, 96, 96, 109, 123, 97, 109, 116, 96, 125, Ascii.DEL, 109, 97, 119, 96, 100, 123, 113, 119, 96, 96, 109, 97, 119, 96, 100, 123, 113, 119, 109, 97, 118, 121, 109, 100, 119, 96, 97, 123, 125, 124, 62, 56, 42, 51, 42, 46, 51, 45, 60, 60, 51, 37, 34, 63, 56, 45, 32, 32, 41, 40, 126, 120, 106, 115, 106, 110, 115, 109, 124, 124, 115, 122, 105, 126, Ascii.DEL, 101, 99, 98, 53, 37, 52, 35, 35, 40, 57, 46, 35, 47, 33, 46, 50, Ascii.FS, Ascii.FF, Ascii.GS, 10, 10, 1, Ascii.DLE, Ascii.CAN, 6, Ascii.VT, Ascii.ESC, 7, 64, 87, 88, 76, 80, 82, 67, 82, 81, 90, 95, 90, 71, 74, 36, 50, 36, 36, 62, 56, 57, 40, 35, 62, 58, 50, 65, 90, 93, 64, 77, 77, 75, 93, 74, 71, 89, 95, 93, 86, 76, Ascii.CR, Ascii.SUB, Ascii.ETB, Ascii.VT, Ascii.SUB, 9, Ascii.SUB, Ascii.SYN, 8, Ascii.DEL, 100, 125, 125};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final String A04(InterfaceC09888i interfaceC09888i) {
        C09868g.A08(this.A01, true, null);
        ByteArrayOutputStream byteArrayOutputStream = null;
        Base64OutputStream base64OutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new DeflaterOutputStream(base64OutputStream);
                Map A052 = A05();
                if (TextUtils.isEmpty(C6E.A00().A03())) {
                    C6E.A07(this.A01);
                }
                A052.put(A01(273, 4, 17), C6E.A00().A03());
                A052.put(A01(532, 10, 81), AbstractC09948o.A06(new C8K(this.A01), this.A01, false));
                if (C1225Ih.A1Y(this.A01)) {
                    A052.put(A01(96, 10, 97), C08070w.A01(this.A01).A0K());
                }
                Iterator it = A052.entrySet().iterator();
                while (it.hasNext()) {
                    if (!interfaceC09888i.A2a((String) ((Map.Entry) it.next()).getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new JSONObject(A052).toString().getBytes());
                deflaterOutputStream.close();
                String replaceAll = byteArrayOutputStream.toString().replaceAll(A01(0, 1, 107), A01(0, 0, 37));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return replaceAll;
            } catch (IOException e4) {
                throw new RuntimeException(A01(234, 26, 2), e4);
            }
        } catch (Throwable th) {
            if (deflaterOutputStream != null) {
                try {
                    deflaterOutputStream.close();
                } catch (IOException unused2) {
                    throw th;
                }
            }
            if (base64OutputStream != null) {
                base64OutputStream.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
    }

    public final /* synthetic */ Map A05() {
        return AbstractC09878h.A00(this);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC09908k
    public final Map<String, String> A6w(C8Z c8z) {
        String A74;
        String A6E = c8z != null ? c8z.A6E() : null;
        String packageName = A6E != null ? A6E : this.A01.getPackageName();
        C09868g.A08(this.A01, ProcessUtils.isRemoteRenderingProcess() ? true : C1225Ih.A0i(this.A01), A6E);
        C8J.A0B(this.A01);
        C8J.A08(this.A01);
        HashMap hashMap = new HashMap();
        C09838d.A03(this.A01, hashMap, A6E);
        hashMap.put(A01(309, 6, 37), Locale.getDefault().toString());
        float f9 = LD.A02;
        int i9 = this.A01.getResources().getDisplayMetrics().widthPixels;
        int i10 = this.A01.getResources().getDisplayMetrics().heightPixels;
        hashMap.put(A01(196, 7, 81), String.valueOf(f9));
        hashMap.put(A01(489, 12, 6), String.valueOf((int) (i9 / f9)));
        hashMap.put(A01(476, 13, 47), String.valueOf((int) (i10 / f9)));
        hashMap.put(A01(57, 14, 70), C6E.A03());
        hashMap.put(A01(291, 9, 52), C6E.A00().A02().name());
        hashMap.put(A01(277, 14, 94), String.valueOf(C6E.A00().A01()));
        C8K c8k = new C8K(this.A01, A6E);
        hashMap.put(A01(90, 6, 94), AbstractC09948o.A03(this.A01, c8k));
        hashMap.put(A01(106, 7, 53), c8k.A08());
        hashMap.put(A01(315, 4, 47), c8k.A09());
        hashMap.put(A01(362, 6, 79), String.valueOf(C09868g.A00(this.A01).A00));
        hashMap.put(A01(300, 9, 48), c8k.A0B());
        hashMap.put(A01(501, 14, 90), L2.A01());
        hashMap.put(A01(336, 12, 105), String.valueOf(AbstractC1292Ld.A00(this.A01).A00));
        hashMap.put(A01(515, 12, 62), C1294Lf.A02(this.A01.A08().A01()));
        C09868g.A06(this.A01, packageName, hashMap);
        String A032 = LB.A03(this.A01, packageName);
        if (A032 != null) {
            hashMap.put(A01(48, 5, 106), A032);
        }
        String A01 = A01(527, 5, 93);
        if (c8z == null || c8z.A9J() == null) {
            boolean A052 = LE.A05(this.A01);
            String[] strArr = A05;
            if (strArr[4].charAt(13) != strArr[3].charAt(13)) {
                String[] strArr2 = A05;
                strArr2[0] = "QjWbpZqZ2FnOkDqqT2mF";
                strArr2[5] = "jLLt7Z5bJGK6A0Aog3pW";
                hashMap.put(A01, String.valueOf(A052));
            } else {
                A05[2] = "qediMiT4WavMJtrcq3vkVjRUgBtN4c7f";
                hashMap.put(A01, String.valueOf(A052));
            }
        } else {
            hashMap.put(A01, String.valueOf(c8z.A9J()));
        }
        String A7P = (c8z == null || c8z.A7Q() == null) ? this.A01.A04().A7P() : c8z.A7Q();
        if (A7P != null) {
            hashMap.put(A01(319, 17, 78), A7P);
        }
        hashMap.put(A01(2, 21, 29), String.valueOf(c8k.A0C()));
        if (c8k.A03() != -1) {
            hashMap.put(A01(29, 19, 37), String.valueOf(c8k.A03()));
        }
        hashMap.put(A01(542, 9, 18), C09808a.A05(this.A01, packageName));
        hashMap.put(A01(23, 6, 33), LJ.A01(C8J.A02()));
        if (AbstractC1224Ig.A05(this.A01) && (A74 = this.A01.A04().A74()) != null) {
            hashMap.put(A01(53, 4, 93), A74);
        }
        C7k A042 = this.A01.A04();
        if (A05[2].charAt(4) == '1') {
            throw new RuntimeException();
        }
        A05[2] = "Wn31NZtM2oeCISpfWM8NBUgIFylswktz";
        String A7V = A042.A7V();
        if (!TextUtils.isEmpty(A7V)) {
            hashMap.put(A01(348, 14, 1), A7V);
        }
        C09747t c09747t = null;
        if (c8z != null) {
            C09647f c09647f = this.A01;
            if (A05[2].charAt(4) == '1') {
                throw new RuntimeException();
            }
            A05[2] = "UkbZyMMn6UWteLCB6DOs48k1ItwI1bgo";
            c09747t = c8z.A6k(c09647f);
        }
        if (c09747t == null) {
            c09747t = this.A01.A06().A6i();
        }
        String A012 = A01(167, 29, 78);
        String A013 = A01(136, 31, 31);
        String A014 = A01(113, 23, 69);
        if (c09747t != null) {
            hashMap.put(A014, c09747t.A08());
            hashMap.put(A013, String.valueOf(c09747t.A05()));
            hashMap.put(A012, String.valueOf(c09747t.A06()));
        } else {
            String A015 = A01(551, 4, 88);
            hashMap.put(A014, A015);
            hashMap.put(A013, A015);
            hashMap.put(A012, A015);
        }
        hashMap.put(A01(96, 10, 97), C08070w.A01(this.A01).A0K());
        String A033 = this.A00.A03(this.A01);
        if (A033 != null && !TextUtils.isEmpty(A033)) {
            hashMap.put(A01(71, 19, 36), A033);
        }
        hashMap.put(A01(260, 13, 63), String.valueOf(this.A01.A03().A8Y()));
        hashMap.put(A01(221, 13, 17), String.valueOf(AnonymousClass84.A0H(this.A01)));
        StringBuilder sb = new StringBuilder();
        C0V[] c0vArr = A06;
        int i11 = 0;
        while (true) {
            if (i11 >= c0vArr.length) {
                break;
            }
            sb.append(c0vArr[i11].A02() + 4000);
            if (i11 != c0vArr.length - 1) {
                sb.append(A01(1, 1, 104));
            }
            i11++;
        }
        hashMap.put(A01(203, 18, 98), sb.toString());
        PackageInfo A00 = A00(this.A01);
        hashMap.put(A01(438, 20, 37), String.valueOf(A00 != null));
        if (A00 != null) {
            String valueOf = String.valueOf(A00.versionCode);
            String[] strArr3 = A05;
            if (strArr3[4].charAt(13) != strArr3[3].charAt(13)) {
                A05[6] = "xKGYwiP6FmOHB7jmGj6acD63E";
                hashMap.put(A01(458, 18, 101), valueOf);
            } else {
                hashMap.put(A01(458, 18, 101), valueOf);
            }
        }
        if (c8z != null && c8z.A9E()) {
            hashMap.put(A01(398, 18, 123), Boolean.TRUE.toString());
            if (c8z.A6S() != null) {
                hashMap.put(A01(368, 21, 70), c8z.A6S());
            }
        }
        if (AbstractC1227Ik.A07(this.A01)) {
            String A022 = AbstractC09818b.A02(this.A01.A01());
            if (A022 != null) {
                hashMap.put(A01(416, 22, 123), A022);
            }
            String A016 = AbstractC09818b.A01(this.A01.A01());
            if (A022 != null) {
                hashMap.put(A01(389, 9, 20), A016);
            }
        }
        return hashMap;
    }

    static {
        A02();
        A03 = false;
        A06 = new C0V[]{C0V.A16, C0V.A0k, C0V.A17, C0V.A1F, C0V.A11, C0V.A13, C0V.A2B, C0V.A2C, C0V.A2D};
    }

    public YI(C09647f c09647f, boolean z8, C6S c6s) {
        this.A01 = c09647f;
        this.A00 = c6s;
        C09868g.A08(c09647f, z8, null);
    }

    public static synchronized PackageInfo A00(C09647f c09647f) {
        PackageInfo packageInfo;
        synchronized (YI.class) {
            if (!A03) {
                A02 = LM.A00(c09647f);
                A03 = true;
            }
            packageInfo = A02;
        }
        return packageInfo;
    }

    public final String A03() {
        return A04(C09898j.A00());
    }
}
