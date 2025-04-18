package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class LN {
    public static byte[] A00;
    public static String[] A01 = {"5C7rQEQBWVsJnjqAAZN8QBBHoCwRHOvI", "Z88WY3x8uhcakMWroAcOyZwbMrMcyrD2", "GaS", "RG8mqKBY9oxpM4ff8ZCXkeRJBSL2fzwW", "fRGWN", "iBM9tWQPO6zus77B3DN", "tCaEdKrWlrqf6UeRmfN", "xklax2dJWvUCBWRx1N6eQvQBJ1IZxl6t"};
    public static final String A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-73, -5, 1, -5, -4, -19, -11, -73, -23, -8, -8, -73, -37, -3, -8, -19, -6, -3, -5, -19, -6, -74, -23, -8, -13, -99, -121, -1, -16, 3, -9, 13, 2, -5, -21, -77, -119, -112, -117, -108, 1, -1, 8, -1, 12, 3, -3, -1, 1, 42, 27, 41, 42, -29, 33, 27, 47, 41};
    }

    static {
        A05();
        A02 = LN.class.getSimpleName();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:11:0x0021, B:14:0x0024), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:11:0x0021, B:14:0x0024), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.instagram.common.viewpoint.core.LM A00(com.instagram.common.viewpoint.core.C7j r5) {
        /*
            boolean r0 = A07()     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L1e
            boolean r0 = A06()     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L1e
            r2 = 47
            r1 = 2
            r0 = 78
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
            com.facebook.ads.redexgen.X.LM r0 = com.instagram.common.viewpoint.core.LM.A03     // Catch: java.lang.Throwable -> L27
            goto L26
        L24:
            com.facebook.ads.redexgen.X.LM r0 = com.instagram.common.viewpoint.core.LM.A05     // Catch: java.lang.Throwable -> L27
        L26:
            return r0
        L27:
            r0 = move-exception
            com.facebook.ads.redexgen.X.8D r5 = r5.A07()
            int r4 = com.instagram.common.viewpoint.core.C8E.A1M
            com.facebook.ads.redexgen.X.8F r3 = new com.facebook.ads.redexgen.X.8F
            r3.<init>(r0)
            r2 = 40
            r1 = 7
            r0 = 92
            java.lang.String r0 = A01(r2, r1, r0)
            r5.AA0(r0, r4, r3)
            com.facebook.ads.redexgen.X.LM r0 = com.instagram.common.viewpoint.core.LM.A04
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.LN.A00(com.facebook.ads.redexgen.X.7j):com.facebook.ads.redexgen.X.LM");
    }

    public static String A02(Context context, String str) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, CertificateException {
        StringBuilder sb = new StringBuilder();
        PackageManager pm = context.getPackageManager();
        if (pm == null) {
            return A01(0, 0, 69);
        }
        Signature[] signatureArr = pm.getPackageInfo(str, 64).signatures;
        if (A01[7].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "ikpGaBwLfx1blWCv8PE";
        strArr[5] = "NCTJdZrpEYM5ZpFC5qB";
        for (Signature signature : signatureArr) {
            sb.append(LS.A04(MessageDigest.getInstance(A01(31, 4, 124)).digest(A04(signature).getEncoded())));
            sb.append(A01(26, 1, 14));
        }
        return sb.toString();
    }

    public static String A03(C7j c7j, String str) {
        try {
            return A02(c7j, str);
        } catch (Exception e) {
            c7j.A07().AA0(A01(40, 7, 92), C8E.A1M, new C8F(e));
            return null;
        }
    }

    public static PublicKey A04(Signature signature) throws CertificateException {
        return CertificateFactory.getInstance(A01(35, 5, 29)).generateCertificate(new ByteArrayInputStream(signature.toByteArray())).getPublicKey();
    }

    public static boolean A06() {
        String str = Build.TAGS;
        if (str != null) {
            String buildTags = A01(49, 9, 120);
            if (str.contains(buildTags)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A07() {
        File superUserApk = new File(A01(0, 25, 74));
        return superUserApk.exists();
    }

    public static boolean A08(String str) {
        for (String str2 : System.getenv(A01(27, 4, Opcodes.LREM)).split(A01(25, 1, 37))) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                String[] strArr = A01;
                if (strArr[1].charAt(17) != strArr[3].charAt(17)) {
                    String[] strArr2 = A01;
                    strArr2[6] = "JMsPqsjcaxLCD34xTC2";
                    strArr2[5] = "FbRxT8DL2tHORlKIcuM";
                    if (listFiles == null) {
                        continue;
                    } else {
                        for (File file2 : listFiles) {
                            boolean equals = file2.getName().equals(str);
                            if (A01[7].length() != 32) {
                                throw new RuntimeException();
                            }
                            String[] strArr3 = A01;
                            strArr3[1] = "YF7GaC3noAI93Jw6Jae3mccsHUmdiEJo";
                            strArr3[3] = "xQd2jFuSOpS96vzWuZJNzWBfXSKKA4my";
                            if (equals) {
                                return true;
                            }
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return false;
    }
}
