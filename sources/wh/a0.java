package wh;

import android.opengl.GLES20;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.google.firebase.components.ComponentRegistrar;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes5.dex */
public class a0 implements db.e, uc.n, ad.e, ed.b {

    /* renamed from: c, reason: collision with root package name */
    public static volatile a0 f27010c;

    /* renamed from: b, reason: collision with root package name */
    public final int f27011b;

    public /* synthetic */ a0() {
        this.f27011b = 9;
    }

    public static int A(int i10, int i11, int i12) {
        if ((i11 & 8) != 0) {
            i10--;
        }
        if (i12 <= i10) {
            return i10 - i12;
        }
        throw new IOException(a4.j.e("PROTOCOL_ERROR padding ", i12, " > remaining length ", i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ki.z B(ki.l... r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.a0.B(ki.l[]):ki.z");
    }

    public static ki.l C(byte[] bArr) {
        ki.l lVar = ki.l.f20996f;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        mi.a.c(bArr.length, 0, length);
        return new ki.l(ArraysKt.copyOfRange(bArr, 0, length + 0));
    }

    public static ci.h D(String statusLine) {
        boolean startsWith$default;
        boolean startsWith$default2;
        int i10;
        String str;
        Intrinsics.checkNotNullParameter(statusLine, "statusLine");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(statusLine, "HTTP/1.", false, 2, null);
        m0 m0Var = m0.HTTP_1_0;
        if (startsWith$default) {
            i10 = 9;
            if (statusLine.length() >= 9 && statusLine.charAt(8) == ' ') {
                int charAt = statusLine.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        m0Var = m0.HTTP_1_1;
                    } else {
                        throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
                    }
                }
            } else {
                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
            }
        } else {
            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(statusLine, "ICY ", false, 2, null);
            if (startsWith$default2) {
                i10 = 4;
            } else {
                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
            }
        }
        int i11 = i10 + 3;
        if (statusLine.length() >= i11) {
            try {
                String substring = statusLine.substring(i10, i11);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() > i11) {
                    if (statusLine.charAt(i11) == ' ') {
                        str = statusLine.substring(i10 + 4);
                        Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
                    }
                } else {
                    str = "";
                }
                return new ci.h(m0Var, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
            }
        }
        throw new ProtocolException(Intrinsics.stringPlus("Unexpected status line: ", statusLine));
    }

    public static g0 E(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return r(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String F(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        if (certificate instanceof X509Certificate) {
            Intrinsics.checkNotNullParameter(certificate, "<this>");
            ki.l lVar = ki.l.f20996f;
            byte[] encoded = certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return Intrinsics.stringPlus("sha256/", C(encoded).c(Constants.SHA256).a());
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
    }

    public static byte[][] G(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    public static void H(ed.c cVar, StringBuilder sb2) {
        int charAt = (sb2.charAt(1) * '(') + (sb2.charAt(0) * 1600) + sb2.charAt(2) + 1;
        cVar.f17307c.append(new String(new char[]{(char) (charAt / NotificationCompat.FLAG_LOCAL_ONLY), (char) (charAt % NotificationCompat.FLAG_LOCAL_ONLY)}));
        sb2.delete(0, 3);
    }

    public static final String f(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        byte[] bArr3 = PublicSuffixDatabase.f23341e;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    byte b3 = bArr2[i19][i20];
                    byte[] bArr4 = xh.b.a;
                    int i22 = b3 & UByte.MAX_VALUE;
                    z10 = z11;
                    i12 = i22;
                }
                byte b10 = bArr[i16 + i21];
                byte[] bArr5 = xh.b.a;
                i13 = i12 - (b10 & UByte.MAX_VALUE);
                if (i13 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                }
                if (bArr2[i19].length == i20) {
                    if (i19 == bArr2.length - 1) {
                        break;
                    }
                    i19++;
                    i20 = -1;
                    z11 = true;
                } else {
                    z11 = z10;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i23 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    int length3 = bArr2.length;
                    for (int i24 = i19 + 1; i24 < length3; i24++) {
                        length2 += bArr2[i24].length;
                    }
                    if (length2 >= i23) {
                        if (length2 <= i23) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                            return new String(bArr, i16, i18, UTF_8);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i16 - 1;
        }
        return null;
    }

    public static final u0 g(u0 u0Var) {
        y0 y0Var;
        int i10 = zh.b.f28771b;
        if (u0Var == null) {
            y0Var = null;
        } else {
            y0Var = u0Var.f27219i;
        }
        if (y0Var != null) {
            u0Var.getClass();
            t0 t0Var = new t0(u0Var);
            t0Var.f27205g = null;
            return t0Var.a();
        }
        return u0Var;
    }

    public static ArrayList h(List protocols) {
        int collectionSizeOrDefault;
        boolean z10;
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((m0) obj) != m0.HTTP_1_0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((m0) it.next()).f27143b);
        }
        return arrayList2;
    }

    public static cd.b i(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        int length = bArr[0].length + i11;
        int length2 = bArr.length + i11;
        cd.b bVar = new cd.b(length, length2);
        int[] iArr = bVar.f2786f;
        int length3 = iArr.length;
        for (int i12 = 0; i12 < length3; i12++) {
            iArr[i12] = 0;
        }
        int i13 = (length2 - i10) - 1;
        int i14 = 0;
        while (i14 < bArr.length) {
            byte[] bArr2 = bArr[i14];
            for (int i15 = 0; i15 < bArr[0].length; i15++) {
                if (bArr2[i15] == 1) {
                    bVar.b(i15 + i10, i13);
                }
            }
            i14++;
            i13--;
        }
        return bVar;
    }

    public static void j(long j3, ki.i iVar, int i10, List list, int i11, int i12, List list2) {
        int i13;
        int i14;
        int i15;
        int i16;
        ki.i iVar2;
        long j10;
        int i17 = i10;
        if (i11 < i12) {
            for (int i18 = i11; i18 < i12; i18++) {
                if (!(((ki.l) list.get(i18)).d() >= i17)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ki.l lVar = (ki.l) list.get(i11);
            ki.l lVar2 = (ki.l) list.get(i12 - 1);
            int i19 = -1;
            if (i17 == lVar.d()) {
                int intValue = ((Number) list2.get(i11)).intValue();
                int i20 = i11 + 1;
                ki.l lVar3 = (ki.l) list.get(i20);
                i13 = i20;
                i14 = intValue;
                lVar = lVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (lVar.i(i17) != lVar2.i(i17)) {
                int i21 = 1;
                for (int i22 = i13 + 1; i22 < i12; i22++) {
                    if (((ki.l) list.get(i22 - 1)).i(i17) != ((ki.l) list.get(i22)).i(i17)) {
                        i21++;
                    }
                }
                long j11 = 4;
                long j12 = (i21 * 2) + (iVar.f20994c / j11) + j3 + 2;
                iVar.U(i21);
                iVar.U(i14);
                for (int i23 = i13; i23 < i12; i23++) {
                    int i24 = ((ki.l) list.get(i23)).i(i17);
                    if (i23 == i13 || i24 != ((ki.l) list.get(i23 - 1)).i(i17)) {
                        iVar.U(i24 & 255);
                    }
                }
                ki.i iVar3 = new ki.i();
                while (i13 < i12) {
                    byte i25 = ((ki.l) list.get(i13)).i(i17);
                    int i26 = i13 + 1;
                    int i27 = i26;
                    while (true) {
                        if (i27 >= i12) {
                            i15 = i12;
                            break;
                        } else {
                            if (i25 != ((ki.l) list.get(i27)).i(i17)) {
                                i15 = i27;
                                break;
                            }
                            i27++;
                        }
                    }
                    if (i26 == i15 && i17 + 1 == ((ki.l) list.get(i13)).d()) {
                        iVar.U(((Number) list2.get(i13)).intValue());
                        i16 = i15;
                        iVar2 = iVar3;
                        j10 = j11;
                    } else {
                        iVar.U(((int) ((iVar3.f20994c / j11) + j12)) * i19);
                        i16 = i15;
                        iVar2 = iVar3;
                        j10 = j11;
                        j(j12, iVar3, i17 + 1, list, i13, i16, list2);
                    }
                    iVar3 = iVar2;
                    i13 = i16;
                    j11 = j10;
                    i19 = -1;
                }
                iVar.L(iVar3);
                return;
            }
            int min = Math.min(lVar.d(), lVar2.d());
            int i28 = 0;
            for (int i29 = i17; i29 < min && lVar.i(i29) == lVar2.i(i29); i29++) {
                i28++;
            }
            long j13 = 4;
            long j14 = (iVar.f20994c / j13) + j3 + 2 + i28 + 1;
            iVar.U(-i28);
            iVar.U(i14);
            int i30 = i17 + i28;
            while (i17 < i30) {
                iVar.U(lVar.i(i17) & 255);
                i17++;
            }
            if (i13 + 1 == i12) {
                if (i30 == ((ki.l) list.get(i13)).d()) {
                    iVar.U(((Number) list2.get(i13)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            ki.i iVar4 = new ki.i();
            iVar.U(((int) ((iVar4.f20994c / j13) + j14)) * (-1));
            j(j14, iVar4, i30, list, i13, i12, list2);
            iVar.L(iVar4);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static byte[] k(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ki.i iVar = new ki.i();
        Iterator it = h(protocols).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            iVar.w(str.length());
            iVar.Y(str);
        }
        return iVar.readByteArray();
    }

    public static i0 l(z zVar, s0 body) {
        String a;
        boolean z10;
        Intrinsics.checkNotNullParameter(body, "body");
        String str = null;
        if (zVar == null) {
            a = null;
        } else {
            a = zVar.a("Content-Type");
        }
        boolean z11 = true;
        if (a == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (zVar != null) {
                str = zVar.a("Content-Length");
            }
            if (str != null) {
                z11 = false;
            }
            if (z11) {
                return new i0(zVar, body);
            }
            throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
        }
        throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e8, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ki.l m(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.a0.m(java.lang.String):ki.l");
    }

    public static ki.l n(String str) {
        boolean z10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) (li.b.a(str.charAt(i11 + 1)) + (li.b.a(str.charAt(i11)) << 4));
            }
            return new ki.l(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static ki.l p(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        ki.l lVar = new ki.l(bytes);
        lVar.f20999d = str;
        return lVar;
    }

    public static y q(SSLSession sSLSession) {
        boolean areEqual;
        List emptyList;
        List emptyList2;
        Intrinsics.checkNotNullParameter(sSLSession, "<this>");
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            int i10 = 1;
            if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL")) {
                areEqual = true;
            } else {
                areEqual = Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL");
            }
            if (!areEqual) {
                p j3 = p.f27156b.j(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!Intrinsics.areEqual("NONE", protocol)) {
                        a1 g10 = c0.g(protocol);
                        try {
                            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                            if (peerCertificates != null) {
                                emptyList = xh.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length));
                            } else {
                                emptyList = CollectionsKt.emptyList();
                            }
                        } catch (SSLPeerUnverifiedException unused) {
                            emptyList = CollectionsKt.emptyList();
                        }
                        Certificate[] localCertificates = sSLSession.getLocalCertificates();
                        if (localCertificates != null) {
                            emptyList2 = xh.b.k(Arrays.copyOf(localCertificates, localCertificates.length));
                        } else {
                            emptyList2 = CollectionsKt.emptyList();
                        }
                        return new y(g10, j3, emptyList2, new x(emptyList, i10));
                    }
                    throw new IOException("tlsVersion == NONE");
                }
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            throw new IOException(Intrinsics.stringPlus("cipherSuite == ", cipherSuite));
        }
        throw new IllegalStateException("cipherSuite == null".toString());
    }

    public static g0 r(String str) {
        boolean startsWith$default;
        boolean endsWith$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Matcher matcher = g0.f27059d.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(group, "typeSubtype.group(1)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = group.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(group2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Intrinsics.checkNotNullExpressionValue(group2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = g0.f27060e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group3 = matcher2.group(1);
                    if (group3 == null) {
                        end = matcher2.end();
                    } else {
                        String group4 = matcher2.group(2);
                        if (group4 == null) {
                            group4 = matcher2.group(3);
                        } else {
                            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(group4, "'", false, 2, null);
                            if (startsWith$default) {
                                endsWith$default = StringsKt__StringsJVMKt.endsWith$default(group4, "'", false, 2, null);
                                if (endsWith$default && group4.length() > 2) {
                                    group4 = group4.substring(1, group4.length() - 1);
                                    Intrinsics.checkNotNullExpressionValue(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                                }
                            }
                        }
                        arrayList.add(group3);
                        arrayList.add(group4);
                        end = matcher2.end();
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(substring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new g0(str, lowerCase, (String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.l("No subtype found for: \"", str, '\"').toString());
    }

    public static m0 s(String protocol) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        m0 m0Var = m0.HTTP_1_0;
        if (!Intrinsics.areEqual(protocol, "http/1.0")) {
            m0Var = m0.HTTP_1_1;
            if (!Intrinsics.areEqual(protocol, "http/1.1")) {
                m0Var = m0.H2_PRIOR_KNOWLEDGE;
                if (!Intrinsics.areEqual(protocol, "h2_prior_knowledge")) {
                    m0Var = m0.HTTP_2;
                    if (!Intrinsics.areEqual(protocol, "h2")) {
                        m0Var = m0.SPDY_3;
                        if (!Intrinsics.areEqual(protocol, "spdy/3.1")) {
                            m0Var = m0.QUIC;
                            if (!Intrinsics.areEqual(protocol, "quic")) {
                                throw new IOException(Intrinsics.stringPlus("Unexpected protocol: ", protocol));
                            }
                        }
                    }
                }
            }
        }
        return m0Var;
    }

    public static qc.p0 v() {
        Object b3 = c6.c.n().b(qc.p0.class);
        Intrinsics.checkNotNullExpressionValue(b3, "Firebase.app[SessionGenerator::class.java]");
        return (qc.p0) b3;
    }

    public static boolean x() {
        return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
    }

    public static boolean y(String str) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean equals4;
        boolean equals5;
        boolean equals6;
        boolean equals7;
        boolean equals8;
        equals = StringsKt__StringsJVMKt.equals("Connection", str, true);
        if (!equals) {
            equals2 = StringsKt__StringsJVMKt.equals("Keep-Alive", str, true);
            if (!equals2) {
                equals3 = StringsKt__StringsJVMKt.equals("Proxy-Authenticate", str, true);
                if (!equals3) {
                    equals4 = StringsKt__StringsJVMKt.equals("Proxy-Authorization", str, true);
                    if (!equals4) {
                        equals5 = StringsKt__StringsJVMKt.equals("TE", str, true);
                        if (!equals5) {
                            equals6 = StringsKt__StringsJVMKt.equals("Trailers", str, true);
                            if (!equals6) {
                                equals7 = StringsKt__StringsJVMKt.equals("Transfer-Encoding", str, true);
                                if (!equals7) {
                                    equals8 = StringsKt__StringsJVMKt.equals("Upgrade", str, true);
                                    if (!equals8) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // db.e
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (db.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.a;
            if (str != null) {
                aVar = new db.a(str, aVar.f16939b, aVar.f16940c, aVar.f16941d, aVar.f16942e, new kc.d(str, aVar, 1), aVar.f16944g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // uc.n
    public Object b() {
        switch (this.f27011b) {
            case 5:
                return new LinkedHashSet();
            case 6:
                return new ArrayList();
            case 7:
                return new ConcurrentHashMap();
            default:
                return new LinkedHashMap();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0643 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x08b4 A[LOOP:12: B:230:0x08b2->B:231:0x08b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0646  */
    @Override // ad.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cd.b c(java.lang.String r20, ad.a r21, int r22, int r23, java.util.Map r24) {
        /*
            Method dump skipped, instructions count: 2440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.a0.c(java.lang.String, ad.a, int, int, java.util.Map):cd.b");
    }

    public void d(ed.c cVar) {
        int i10;
        boolean z10;
        boolean z11;
        String str = cVar.a;
        boolean z12 = false;
        switch (this.f27011b) {
            case 11:
                int i11 = cVar.f17308d;
                int length = str.length();
                if (i11 < length) {
                    char charAt = str.charAt(i11);
                    i10 = 0;
                    while (true) {
                        if (charAt >= '0' && charAt <= '9') {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11 && i11 < length) {
                            i10++;
                            i11++;
                            if (i11 < length) {
                                charAt = str.charAt(i11);
                            }
                        }
                    }
                } else {
                    i10 = 0;
                }
                if (i10 >= 2) {
                    char charAt2 = str.charAt(cVar.f17308d);
                    char charAt3 = str.charAt(cVar.f17308d + 1);
                    if (charAt2 >= '0' && charAt2 <= '9') {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (charAt3 >= '0' && charAt3 <= '9') {
                            z12 = true;
                        }
                        if (z12) {
                            cVar.e((char) a4.j.a(charAt3, -48, (charAt2 - '0') * 10, 130));
                            cVar.f17308d += 2;
                            return;
                        }
                    }
                    throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
                }
                char b3 = cVar.b();
                int A = com.facebook.appevents.g.A(str, cVar.f17308d, t());
                if (A != t()) {
                    if (A != 1) {
                        if (A != 2) {
                            if (A != 3) {
                                if (A != 4) {
                                    if (A == 5) {
                                        cVar.e((char) 231);
                                        cVar.f17309e = 5;
                                        return;
                                    }
                                    throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(A)));
                                }
                                cVar.e((char) 240);
                                cVar.f17309e = 4;
                                return;
                            }
                            cVar.e((char) 238);
                            cVar.f17309e = 3;
                            return;
                        }
                        cVar.e((char) 239);
                        cVar.f17309e = 2;
                        return;
                    }
                    cVar.e((char) 230);
                    cVar.f17309e = 1;
                    return;
                }
                if (com.facebook.appevents.g.u(b3)) {
                    cVar.e((char) 235);
                    cVar.e((char) ((b3 - 128) + 1));
                    cVar.f17308d++;
                    return;
                } else {
                    cVar.e((char) (b3 + 1));
                    cVar.f17308d++;
                    return;
                }
            default:
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    if (cVar.c()) {
                        char b10 = cVar.b();
                        cVar.f17308d++;
                        int o10 = o(sb2, b10);
                        int a = cVar.a() + ((sb2.length() / 3) << 1);
                        cVar.d(a);
                        int i12 = cVar.f17310f.f17316b - a;
                        if (!cVar.c()) {
                            StringBuilder sb3 = new StringBuilder();
                            if (sb2.length() % 3 == 2 && (i12 < 2 || i12 > 2)) {
                                int length2 = sb2.length();
                                sb2.delete(length2 - o10, length2);
                                cVar.f17308d--;
                                o10 = o(sb3, cVar.b());
                                cVar.f17310f = null;
                            }
                            while (sb2.length() % 3 == 1 && ((o10 <= 3 && i12 != 1) || o10 > 3)) {
                                int length3 = sb2.length();
                                sb2.delete(length3 - o10, length3);
                                cVar.f17308d--;
                                o10 = o(sb3, cVar.b());
                                cVar.f17310f = null;
                            }
                        } else if (sb2.length() % 3 == 0 && com.facebook.appevents.g.A(str, cVar.f17308d, t()) != t()) {
                            cVar.f17309e = 0;
                        }
                    }
                }
                w(cVar, sb2);
                return;
        }
    }

    public float e(int i10, int i11) {
        switch (this.f27011b) {
            case 14:
                if (i11 <= 0 || i10 <= 0) {
                    return 0.0f;
                }
                float f10 = i10 / i11;
                return f10 <= 1.0f ? f10 : 1.0f;
            default:
                if (i11 <= 0 || i10 <= 0) {
                    return 0.0f;
                }
                float f11 = i10 / i11;
                return f11 <= 1.0f ? f11 : 1.0f;
        }
    }

    public int o(StringBuilder sb2, char c10) {
        if (c10 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) ((c10 - '0') + 4));
            return 1;
        }
        if (c10 >= 'A' && c10 <= 'Z') {
            sb2.append((char) ((c10 - 'A') + 14));
            return 1;
        }
        if (c10 < ' ') {
            sb2.append((char) 0);
            sb2.append(c10);
            return 2;
        }
        if (c10 >= '!' && c10 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '!'));
            return 2;
        }
        if (c10 >= ':' && c10 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) ((c10 - AbstractJsonLexerKt.COLON) + 15));
            return 2;
        }
        if (c10 >= '[' && c10 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) ((c10 - AbstractJsonLexerKt.BEGIN_LIST) + 22));
            return 2;
        }
        if (c10 >= '`' && c10 <= 127) {
            sb2.append((char) 2);
            sb2.append((char) (c10 - '`'));
            return 2;
        }
        sb2.append("\u0001\u001e");
        return o(sb2, (char) (c10 - 128)) + 2;
    }

    public int t() {
        switch (this.f27011b) {
            case 11:
                return 0;
            default:
                return 1;
        }
    }

    public hi.g u() {
        switch (this.f27011b) {
            case 19:
                return hi.h.f19127b;
            default:
                return hi.j.f19130b;
        }
    }

    public void w(ed.c cVar, StringBuilder sb2) {
        int length = (sb2.length() / 3) << 1;
        int length2 = sb2.length() % 3;
        int a = cVar.a() + length;
        cVar.d(a);
        int i10 = cVar.f17310f.f17316b - a;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                H(cVar, sb2);
            }
            if (cVar.c()) {
                cVar.e((char) 254);
            }
        } else if (i10 == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                H(cVar, sb2);
            }
            if (cVar.c()) {
                cVar.e((char) 254);
            }
            cVar.f17308d--;
        } else if (length2 == 0) {
            while (sb2.length() >= 3) {
                H(cVar, sb2);
            }
            if (i10 > 0 || cVar.c()) {
                cVar.e((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        cVar.f17309e = 0;
    }

    public boolean z() {
        switch (this.f27011b) {
            case 14:
                return gi.a.f18486e;
            default:
                return gi.d.f18494e;
        }
    }

    public /* synthetic */ a0(int i10) {
        this.f27011b = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i10, int i11) {
        this(26);
        this.f27011b = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                return;
            default:
                this(0);
                return;
        }
    }

    public a0(int i10, String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int m240constructorimpl = UInt.m240constructorimpl(GLES20.glCreateShader(UInt.m240constructorimpl(i10)));
        bf.c.b(Intrinsics.stringPlus("glCreateShader type=", Integer.valueOf(i10)));
        GLES20.glShaderSource(m240constructorimpl, source);
        GLES20.glCompileShader(m240constructorimpl);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(m240constructorimpl, df.f.f17030k, iArr, 0);
        if (iArr[0] != 0) {
            this.f27011b = m240constructorimpl;
            return;
        }
        StringBuilder m10 = a4.j.m("Could not compile shader ", i10, ": '");
        m10.append((Object) GLES20.glGetShaderInfoLog(m240constructorimpl));
        m10.append("' source: ");
        m10.append(source);
        String sb2 = m10.toString();
        GLES20.glDeleteShader(m240constructorimpl);
        throw new RuntimeException(sb2);
    }
}
