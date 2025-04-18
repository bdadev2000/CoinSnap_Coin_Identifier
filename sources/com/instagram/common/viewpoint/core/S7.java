package com.instagram.common.viewpoint.core;

import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: assets/audience_network.dex */
public abstract class S7 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{77, 87, 73, 87, 74, 41, 50, 59, 87, 75, 62, 5, 10, 9, 7, 14, 75, 31, 4, 75, 13, 2, 5, 15, 75, 29, 10, 7, 2, 15, 75, 8, 14, 25, 31, 2, 13, 2, 8, 10, 31, 14, 75, 4, 25, 75, 27, 30, 9, 7, 2, 8, 75, 0, 14, 18, 69};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A03(HttpsURLConnection httpsURLConnection, Set<String> set, Set<String> set2) throws Exception {
        String A002 = A00(5, 5, 16);
        if (Build.VERSION.SDK_INT == 15) {
            if (A00(0, 5, 19).equals(Build.VERSION.RELEASE)) {
                return;
            }
        }
        try {
            for (Certificate certificate : httpsURLConnection.getServerCertificates()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                String A01 = A01(x509Certificate.getEncoded(), A002);
                if (set != null && set.contains(A01)) {
                    return;
                }
                String A012 = A01(x509Certificate.getPublicKey().getEncoded(), A002);
                if (set2 != null && set2.contains(A012)) {
                    return;
                }
            }
            throw new CertificateException(A00(10, 47, 1));
        } catch (Exception e) {
            throw e;
        }
    }

    public static String A01(byte[] bArr, String str) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance(str);
        digest.reset();
        return Base64.encodeToString(digest.digest(bArr), 0);
    }
}
