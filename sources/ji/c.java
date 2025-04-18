package ji;

import a4.j;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements HostnameVerifier {
    public static final c a = new c();

    public static List a(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    public static boolean b(String str) {
        boolean z10;
        boolean z11;
        int i10;
        char c10;
        int length = str.length();
        int length2 = str.length();
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (length2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (length2 <= str.length()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long j3 = 0;
                int i11 = 0;
                while (i11 < length2) {
                    char charAt = str.charAt(i11);
                    if (charAt < 128) {
                        j3++;
                    } else {
                        if (charAt < 2048) {
                            i10 = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i12 = i11 + 1;
                            if (i12 < length2) {
                                c10 = str.charAt(i12);
                            } else {
                                c10 = 0;
                            }
                            if (charAt <= 56319 && c10 >= 56320 && c10 <= 57343) {
                                j3 += 4;
                                i11 += 2;
                            } else {
                                j3++;
                                i11 = i12;
                            }
                        } else {
                            i10 = 3;
                        }
                        j3 += i10;
                    }
                    i11++;
                }
                if (length != ((int) j3)) {
                    return false;
                }
                return true;
            }
            StringBuilder m10 = j.m("endIndex > string.length: ", length2, " > ");
            m10.append(str.length());
            throw new IllegalArgumentException(m10.toString().toString());
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.i("endIndex < beginIndex: ", length2, " < 0").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0146, code lost:
    
        if (r0 != (-1)) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[LOOP:1: B:27:0x0081->B:64:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ji.c.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        Certificate certificate;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (b(host)) {
            try {
                certificate = session.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return c(host, (X509Certificate) certificate);
    }
}
