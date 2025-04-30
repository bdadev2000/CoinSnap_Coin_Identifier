package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class LB {
    public static byte[] A00;
    public static String[] A01 = {"Fo6fOQ0HsfRCx9yL67VckHygYzLCvQ6y", "riZa98GPY3AWbvMANKZcBcQCalEMJFPN", "xF93Q6Q84wP28NgbQeYEf1tSiFipj5la", "S1Y1MsvNK5D8hutCnbiwxRc7t2kGsxbE", "4KEw8B1iO7iJz6LKFlaUEil7rK", "9ZIqru89IY59Cmn5xddtyFRfmlsWf5Vx", "UXJRrEbADYCqrbNeMotiPdb4vjzmnMhB", "uyLj4bmIt"};
    public static final String A02;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 47);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-76, -8, -2, -8, -7, -22, -14, -76, -26, -11, -11, -76, -40, -6, -11, -22, -9, -6, -8, -22, -9, -77, -26, -11, -16, -109, -96, -2, -17, 2, -10, -52, -63, -70, -86, -89, 125, -124, Ascii.DEL, -120, -105, -107, -98, -107, -94, -103, -109, 5, 7, -30, -45, -31, -30, -101, -39, -45, -25, -31};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A08(String str) {
        File[] listFiles;
        for (String str2 : System.getenv(A01(27, 4, 127)).split(A01(25, 1, 42))) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.getName().equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static {
        A05();
        A02 = LB.class.getSimpleName();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:11:0x0021, B:14:0x0024), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:11:0x0021, B:14:0x0024), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.meta.analytics.dsp.uinode.LA A00(com.meta.analytics.dsp.uinode.C09647f r5) {
        /*
            boolean r0 = A07()     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L1e
            boolean r0 = A06()     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L1e
            r2 = 47
            r1 = 2
            r0 = 99
            java.lang.String r0 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> L27
            boolean r0 = A08(r0)     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            if (r0 == 0) goto L24
            com.facebook.ads.redexgen.X.LA r0 = com.meta.analytics.dsp.uinode.LA.A04     // Catch: java.lang.Throwable -> L27
            goto L26
        L24:
            com.facebook.ads.redexgen.X.LA r0 = com.meta.analytics.dsp.uinode.LA.A06     // Catch: java.lang.Throwable -> L27
        L26:
            return r0
        L27:
            r0 = move-exception
            com.facebook.ads.redexgen.X.89 r5 = r5.A07()
            int r4 = com.meta.analytics.dsp.uinode.C8A.A1M
            com.facebook.ads.redexgen.X.8B r3 = new com.facebook.ads.redexgen.X.8B
            r3.<init>(r0)
            r2 = 40
            r1 = 7
            r0 = 1
            java.lang.String r0 = A01(r2, r1, r0)
            r5.A9a(r0, r4, r3)
            com.facebook.ads.redexgen.X.LA r0 = com.meta.analytics.dsp.uinode.LA.A05
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.LB.A00(com.facebook.ads.redexgen.X.7f):com.facebook.ads.redexgen.X.LA");
    }

    public static String A02(Context context, String str) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, CertificateException {
        StringBuilder sb = new StringBuilder();
        PackageManager pm = context.getPackageManager();
        if (pm == null) {
            return A01(0, 0, 21);
        }
        for (Signature signature : pm.getPackageInfo(str, 64).signatures) {
            String[] strArr = A01;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            A01[0] = "2riYAheGk3Amb0xMR1UIKZqnGyXb5VAT";
            sb.append(LG.A04(MessageDigest.getInstance(A01(31, 4, 74)).digest(A04(signature).getEncoded())));
            sb.append(A01(26, 1, 54));
        }
        return sb.toString();
    }

    public static String A03(C09647f c09647f, String str) {
        try {
            return A02(c09647f, str);
        } catch (Exception e4) {
            c09647f.A07().A9a(A01(40, 7, 1), C8A.A1M, new C8B(e4));
            return null;
        }
    }

    public static PublicKey A04(Signature signature) throws CertificateException {
        return CertificateFactory.getInstance(A01(35, 5, 32)).generateCertificate(new ByteArrayInputStream(signature.toByteArray())).getPublicKey();
    }

    public static boolean A06() {
        String str = Build.TAGS;
        if (str != null) {
            String buildTags = A01(49, 9, 63);
            if (str.contains(buildTags)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A07() {
        File superUserApk = new File(A01(0, 25, 86));
        return superUserApk.exists();
    }
}
