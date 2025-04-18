package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import com.applovin.exoplayer2.common.base.Ascii;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Rb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0880Rb {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{4, Ascii.RS, 0, Ascii.RS, 3, 60, 39, 46, 66, 94, Ascii.VT, 48, 63, 60, 50, 59, 126, 42, 49, 126, 56, 55, 48, 58, 126, 40, 63, 50, 55, 58, 126, Base64.padSymbol, 59, 44, 42, 55, 56, 55, Base64.padSymbol, 63, 42, 59, 126, 49, 44, 126, 46, 43, 60, 50, 55, Base64.padSymbol, 126, 53, 59, 39, 112};
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
        String A002 = A00(5, 5, 110);
        if (Build.VERSION.SDK_INT == 15) {
            if (A00(0, 5, 49).equals(Build.VERSION.RELEASE)) {
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
            throw new CertificateException(A00(10, 47, 95));
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static String A01(byte[] bArr, String str) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance(str);
        digest.reset();
        return android.util.Base64.encodeToString(digest.digest(bArr), 0);
    }
}
