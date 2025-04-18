package okhttp3.internal.tls;

import e0.u;
import e0.w;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import p0.a;
import z0.m;

/* loaded from: classes4.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;

    @NotNull
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        a.r(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        a.r(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i2) {
        Object obj;
        w wVar = w.f30218a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return wVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && a.g(list.get(0), Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return wVar;
        }
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(asciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (a.g(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<String> allSubjectAltNames(@NotNull X509Certificate x509Certificate) {
        a.s(x509Certificate, "certificate");
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        return u.P0(getSubjectAltNames(x509Certificate, 2), subjectAltNames);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String str, @NotNull SSLSession sSLSession) {
        Certificate certificate;
        a.s(str, "host");
        a.s(sSLSession, "session");
        if (isAscii(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                a.q(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
                return false;
            }
        }
        return verify(str, (X509Certificate) certificate);
    }

    public final boolean verify(@NotNull String str, @NotNull X509Certificate x509Certificate) {
        a.s(str, "host");
        a.s(x509Certificate, "certificate");
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        if (str != null && str.length() != 0 && !m.q1(str, ".", false) && !m.P0(str, "..", false) && str2 != null && str2.length() != 0 && !m.q1(str2, ".", false) && !m.P0(str2, "..", false)) {
            if (!m.P0(str, ".", false)) {
                str = str.concat(".");
            }
            if (!m.P0(str2, ".", false)) {
                str2 = str2.concat(".");
            }
            String asciiToLowercase = asciiToLowercase(str2);
            if (!m.M0(asciiToLowercase, "*", false)) {
                return a.g(str, asciiToLowercase);
            }
            if (!m.q1(asciiToLowercase, "*.", false) || m.W0(asciiToLowercase, '*', 1, false, 4) != -1 || str.length() < asciiToLowercase.length() || a.g("*.", asciiToLowercase)) {
                return false;
            }
            String substring = asciiToLowercase.substring(1);
            a.r(substring, "this as java.lang.String).substring(startIndex)");
            if (!m.P0(str, substring, false)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || m.a1(str, '.', length - 1, 4) == -1;
        }
        return false;
    }
}
