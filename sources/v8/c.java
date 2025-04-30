package v8;

import G7.j;
import Q7.n0;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import u7.AbstractC2822m;
import u7.C2824o;

/* loaded from: classes3.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f23646a = new Object();

    public static ArrayList a(X509Certificate x509Certificate) {
        List b = b(x509Certificate, 7);
        List b8 = b(x509Certificate, 2);
        if (b8 instanceof Collection) {
            List list = b8;
            ArrayList arrayList = new ArrayList(list.size() + b.size());
            arrayList.addAll(b);
            arrayList.addAll(list);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(b);
        AbstractC2822m.G(b8, arrayList2);
        return arrayList2;
    }

    public static List b(X509Certificate x509Certificate, int i9) {
        Object obj;
        C2824o c2824o = C2824o.b;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return c2824o;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && j.a(list.get(0), Integer.valueOf(i9)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return c2824o;
        }
    }

    public static boolean c(String str) {
        int i9;
        char c9;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            if (length2 <= str.length()) {
                long j7 = 0;
                int i10 = 0;
                while (i10 < length2) {
                    char charAt = str.charAt(i10);
                    if (charAt < 128) {
                        j7++;
                    } else {
                        if (charAt < 2048) {
                            i9 = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i11 = i10 + 1;
                            if (i11 < length2) {
                                c9 = str.charAt(i11);
                            } else {
                                c9 = 0;
                            }
                            if (charAt <= 56319 && c9 >= 56320 && c9 <= 57343) {
                                j7 += 4;
                                i10 += 2;
                            } else {
                                j7++;
                                i10 = i11;
                            }
                        } else {
                            i9 = 3;
                        }
                        j7 += i9;
                    }
                    i10++;
                }
                if (length != ((int) j7)) {
                    return false;
                }
                return true;
            }
            StringBuilder p2 = n0.p(length2, "endIndex > string.length: ", " > ");
            p2.append(str.length());
            throw new IllegalArgumentException(p2.toString().toString());
        }
        throw new IllegalArgumentException(n0.f(length2, "endIndex < beginIndex: ", " < 0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[LOOP:1: B:27:0x0085->B:58:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.c.d(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        j.e(str, "host");
        j.e(sSLSession, "session");
        if (c(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return d(str, (X509Certificate) certificate);
    }
}
