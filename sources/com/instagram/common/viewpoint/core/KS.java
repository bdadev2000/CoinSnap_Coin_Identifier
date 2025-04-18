package com.instagram.common.viewpoint.core;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class KS implements InterfaceC0839Rq {
    public static byte[] A07;
    public static String[] A08 = {"QhNFYJC9gEUd0JRpeTZcIYaCPwaofmcY", "H7lFuH2c6lRKE1KzrEc8woYXA3m4qwgD", "VasthUCsKtAfJQ49O69n9k2VDB8sk6Ry", "CLNAbcda3kskZ9l1P61KK9o7E81JDy0P", "FTSbac7VR6oRDuoXxASKkUBG2ay4Jl1O", "oDWQMCtwqliv6oQHoqRk4BTd2HTxQUcC", "maa7C87UpzAlS2qduOc8uqrscl2NkhxH", ""};
    public static final String A09;
    public C8D A00;
    public Executor A01;
    public boolean A02;
    public C0844Rv A03;
    public final S0 A04 = new L3();
    public final S5 A05;
    public final S6 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final InterfaceC0838Rp A01(S2 s2) throws S3 {
        S3 s3;
        String A072 = A07(220, 7, 86);
        HttpURLConnection httpURLConnection = null;
        KT kt = null;
        boolean z2 = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection A082 = A08(s2.A05(), L7.A04() ? A09() : null);
                A0H(A082, s2);
                A0G(A082, s2);
                if (this.A06.A9X()) {
                    this.A06.AAO(A082, s2.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean z3 = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z2 = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (z3 || z2)) {
                    try {
                        S7.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e) {
                        this.A00.AAS(A072, C8E.A1z, new C8F(e));
                    } catch (Exception e2) {
                        this.A00.AAS(A072, C8E.A1y, new C8F(e2));
                    }
                }
                if (A082.getDoOutput() && s2.A06() != null) {
                    A00(A082, s2.A06());
                }
                KT A06 = A082.getDoInput() ? A06(A082) : new KT(A082, null);
                if (this.A06.A9X()) {
                    this.A06.AAP(A06);
                }
                if (A082 != null) {
                    A082.disconnect();
                }
                return A06;
            } catch (Exception e3) {
                try {
                    try {
                        kt = A05(null);
                    } catch (Exception unused) {
                        Log.e(getClass().getSimpleName(), A07(Opcodes.LNEG, 13, 98), e3);
                        if (0 != 0 && kt.A8R() > 0) {
                            if (this.A06.A9X()) {
                                this.A06.AAP(null);
                            }
                            if (0 != 0) {
                                httpURLConnection.disconnect();
                            }
                            return null;
                        }
                        s3 = new S3(e3, null);
                    }
                    if (A08[7].length() == 19) {
                        throw new RuntimeException();
                    }
                    A08[5] = "6Q02gTcavt1J3D6llCgnQfsLExV7BLlB";
                    if (kt == null || kt.A8R() <= 0) {
                        s3 = new S3(e3, kt);
                        throw s3;
                    }
                    if (this.A06.A9X()) {
                        this.A06.AAP(kt);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return kt;
                } catch (Throwable unused2) {
                    if (kt == null || kt.A8R() <= 0) {
                        throw new S3(e3, kt);
                    }
                    if (this.A06.A9X()) {
                        this.A06.AAP(kt);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return kt;
                }
            }
        } catch (Throwable th) {
            if (this.A06.A9X()) {
                this.A06.AAP(kt);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static String A07(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 57, 102, 107, 14, 102, 100, 77, 64, 9, 77, 79, 30, 93, 75, 76, 82, 30, 42, 99, 121, 42, 100, 101, 126, 42, 107, 42, 124, 107, 102, 99, 110, 42, 95, 88, 70, 80, 31, 22, 80, 75, 120, 116, 23, 0, 116, 105, 116, 55, 59, 73, 79, 59, 38, 59, 38, 42, 126, 120, 115, 99, 100, 109, 42, 94, 4, 34, 43, 38, 55, 52, 34, 35, 71, 51, 46, 42, 34, 71, 90, 71, 71, 101, 116, 116, 105, 110, 103, 32, 116, 104, 101, 32, 104, 116, 116, 112, 32, 114, 101, 115, 112, 111, 110, 115, 101, 32, 116, 105, 109, 101, 100, 32, 111, 117, 116, 61, 22, 7, 4, 28, 1, 24, 83, 22, 1, 1, 28, 1, 23, 22, 4, 111, 122, 22, 7, 7, 27, 30, 20, 22, 3, 30, 24, 25, 88, 15, 90, 0, 0, 0, 90, 17, 24, 5, 26, 90, 2, 5, 27, 18, 25, 20, 24, 19, 18, 19, 76, 20, 31, 22, 5, 4, 18, 3, 74, 34, 35, 49, 90, 79, 89, 79, 72, 86, 26, 23, 81, 26, 23, 83, 120, 100, 100, 96, 62, 96, 98, Byte.MAX_VALUE, 104, 105, 88, Byte.MAX_VALUE, 99, 100, 27, 7, 7, 3, 93, 3, 1, 28, 11, 10, 35, 28, 1, 7, 41, 34, 51, 48, 40, 53, 44};
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:
    
        if (r9 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
    
        if (r9.A6W() != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        r3 = r9.A6W().length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0129, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0157, code lost:
    
        if (r9 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015a, code lost:
    
        r7 = r29.A00;
        r10 = java.lang.System.currentTimeMillis() - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0163, code lost:
    
        if (r30.A04 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0165, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0167, code lost:
    
        r7.AAJ(r0, r10, 0, r2, 0, new java.util.concurrent.TimeoutException(A07(82, 35, 17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0182, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        r2 = r30.A04.length;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 31
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.instagram.common.viewpoint.core.InterfaceC0838Rp A0J(com.instagram.common.viewpoint.core.S2 r30) throws com.instagram.common.viewpoint.core.S3 {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.KS.A0J(com.facebook.ads.redexgen.X.S2):com.facebook.ads.redexgen.X.Rp");
    }

    static {
        A0A();
        A09 = InterfaceC0839Rq.class.getSimpleName();
    }

    public KS(C0844Rv c0844Rv, C8D c8d, Executor executor) {
        A0B();
        this.A03 = c0844Rv;
        this.A06 = new KR(c0844Rv.A04());
        final S6 s6 = this.A06;
        this.A05 = new AbstractC0656Kn(s6) { // from class: com.facebook.ads.redexgen.X.7A
        };
        this.A01 = executor;
        this.A00 = c8d;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.AEJ(httpURLConnection);
            if (outputStream != null) {
                this.A05.AHj(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final InterfaceC0838Rp A02(S2 s2) {
        if (this.A03.A04()) {
            A0C(s2);
        }
        InterfaceC0838Rp interfaceC0838Rp = null;
        try {
            interfaceC0838Rp = A01(s2);
            return interfaceC0838Rp;
        } catch (S3 hre) {
            this.A05.ABv(hre);
            return interfaceC0838Rp;
        } catch (Exception e) {
            this.A05.ABv(new S3(e, interfaceC0838Rp));
            return interfaceC0838Rp;
        }
    }

    private final InterfaceC0838Rp A03(String str, S4 s4, C0847Ry c0847Ry) {
        return A02(new Ki(str, s4, c0847Ry));
    }

    private final InterfaceC0838Rp A04(String str, String str2, byte[] bArr, C0847Ry c0847Ry) {
        return A02(new KU(str, null, str2, bArr, c0847Ry));
    }

    private final KT A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                responseBody = this.A05.AEr(inputStream);
            }
            KT kt = new KT(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return kt;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final KT A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = this.A05.AEI(httpURLConnection);
            if (inputStream != null) {
                responseBody = this.A05.AEr(inputStream);
            }
            KT kt = new KT(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return kt;
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[3].charAt(2) != strArr[0].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "UXNjV4lzV2ywD4tdDbD0LjxSkhTqZWDx";
            strArr2[0] = "ckNMQEffDKJwLTwRJSWHE7UL6GsW6bMO";
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.AEH(str, proxy);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(18, 19, 27), e);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(Opcodes.CHECKCAST, 14, 1));
        String proxyAddress = System.getProperty(A07(206, 14, 98));
        int port = -1;
        if (proxyAddress != null) {
            try {
                port = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        if (!TextUtils.isEmpty(property) && port > 0 && port <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, port));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        synchronized (KS.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(S2 s2) {
        StringBuilder sb = new StringBuilder(A07(Opcodes.INVOKEVIRTUAL, 10, 43));
        boolean equals = s2.A03().equals(S1.A06);
        String A072 = A07(41, 1, 120);
        if (equals) {
            byte[] A06 = s2.A06();
            if (A08[1].charAt(0) == 'l') {
                throw new RuntimeException();
            }
            A08[4] = "MgpsgMtpOSh21D9UNcI3ZUtvoefc4JIC";
            if (A06 != null) {
                sb.append(A07(7, 5, 124));
                sb.append(new String(s2.A06(), Charset.forName(A07(130, 5, 83))));
                sb.append(A072);
            }
        }
        for (Map.Entry<String, String> entry : s2.A02().A06().entrySet()) {
            sb.append(A07(2, 5, 87));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 47));
            sb.append(entry.getValue());
            sb.append(A072);
        }
        sb.append(A07(0, 2, 10));
        sb.append(s2.A05());
        sb.append(A072);
        String sb2 = sb.toString();
        A0E(sb2, 1, (sb2.length() / 4000) + 1);
    }

    private void A0D(S2 s2, InterfaceC0840Rr interfaceC0840Rr) {
        this.A04.A6R(this, interfaceC0840Rr, this.A01).A04(s2);
        if (this.A03.A04()) {
            A0C(s2);
        }
    }

    private void A0E(String str, int i2, int i3) {
        String str2 = A09 + A07(12, 6, 47) + i2 + A07(65, 1, 96) + i3;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i2 + 1, i3);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC0840Rr interfaceC0840Rr, C0847Ry c0847Ry) {
        KU req = new KU(str, null, str2, bArr, c0847Ry);
        A0D(req, interfaceC0840Rr);
    }

    private void A0G(HttpURLConnection httpURLConnection, S2 s2) {
        Map<String, String> A06 = s2.A02().A06();
        InterfaceC0837Ro A05 = s2.A02().A05();
        for (String str : A06.keySet()) {
            httpURLConnection.setRequestProperty(str, A06.get(str));
        }
        if (A05 != null) {
            Map<String, String> A6A = A05.A6A(this.A03.A03());
            for (String str2 : A6A.keySet()) {
                httpURLConnection.setRequestProperty(str2, A6A.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, S2 s2) throws IOException {
        C0847Ry A02 = s2.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.AEZ(httpURLConnection, s2.A03(), s2.A04());
    }

    private final boolean A0I(Throwable th, long j2, S2 s2) {
        C0847Ry A02 = s2.A02();
        long currentTimeMillis = (System.currentTimeMillis() - j2) + 10;
        if (this.A06.A9X()) {
            String str = A07(67, 15, Opcodes.FNEG) + currentTimeMillis + A07(42, 7, 69) + A02.A00() + A07(49, 7, 10) + A02.A02();
        }
        if (this.A02) {
            long A022 = A02.A02();
            if (A08[4].charAt(1) == 'Y') {
                throw new RuntimeException();
            }
            A08[7] = "tgQXMymp9cIZW";
            return currentTimeMillis >= A022;
        }
        long elapsedTime = A02.A00();
        return currentTimeMillis >= elapsedTime;
    }

    public final C0844Rv A0K() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0839Rq
    @Deprecated
    public final InterfaceC0838Rp AER(String str, Map<String, String> parameters) {
        return A03(str, new S4(parameters), this.A03.A00());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0839Rq
    @Deprecated
    public final InterfaceC0838Rp AES(String str, byte[] bArr) {
        return A04(str, A07(Opcodes.I2D, 47, 102), bArr, this.A03.A00());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0839Rq
    public final void AET(String str, byte[] bArr, InterfaceC0840Rr interfaceC0840Rr) {
        A0F(str, A07(Opcodes.I2D, 47, 102), bArr, interfaceC0840Rr, this.A03.A00());
    }
}
